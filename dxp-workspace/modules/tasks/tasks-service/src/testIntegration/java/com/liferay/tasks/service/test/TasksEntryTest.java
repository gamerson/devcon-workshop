
package com.liferay.tasks.service.test;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.tasks.model.TasksEntry;
import com.liferay.tasks.service.TasksEntryLocalServiceUtil;

import java.io.File;
import java.util.List;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import aQute.remote.util.JMXBundleDeployer;

@RunWith(Arquillian.class)
public class TasksEntryTest {

	@Deployment
	public static JavaArchive create() throws Exception {
		final File tasksApiJar = new File(System.getProperty("apiPath"));

		new JMXBundleDeployer().deploy(null, tasksApiJar);

		final File jarFile = new File(System.getProperty("jarFile"));

		return ShrinkWrap.createFromZipFile(JavaArchive.class, jarFile);
	}

	@Test
	public void testCreateTasksEntry() throws Exception {
		TasksEntry newEntry = TasksEntryLocalServiceUtil.createTasksEntry(CounterLocalServiceUtil.increment());

		newEntry.setTitle("New Task");

		TasksEntryLocalServiceUtil.addTasksEntry(newEntry);

		List<TasksEntry> entries = TasksEntryLocalServiceUtil.getTasksEntries(-1, -1);

		Assert.assertEquals(1,  entries.size());

		TasksEntry entry = entries.get(0);

		Assert.assertEquals("New Task", entry.getTitle());
	}
}