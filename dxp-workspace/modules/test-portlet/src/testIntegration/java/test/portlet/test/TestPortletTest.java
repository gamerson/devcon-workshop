package test.portlet.test;

import test.portlet.constants.TestPortletKeys;

import java.io.File;
import java.net.URL;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.liferay.arquillian.portal.annotation.PortalURL;
import com.liferay.tasks.util.TaskPortletKeys;

@RunAsClient
@RunWith(Arquillian.class)
public class TestPortletTest {

	@Deployment
	public static JavaArchive create() throws Exception {
		final File jarFile = new File(System.getProperty("jarFile"));

		return ShrinkWrap.createFromZipFile(JavaArchive.class, jarFile);
	}

	@Test
	public void testAddPortlet() throws Exception {
		_webDriver.get(_portletURL.toExternalForm());

		Assert.assertTrue(_testPortlet.isDisplayed());

		Assert.assertTrue(
			_message.getText(),
			_message.getText().contentEquals(
				"Hello from test-portlet JSP!"));
	}
	
	@Test
	public void testTasksPortlet() throws Exception {
		_webDriver.get(_tasksURL.toExternalForm());

		Assert.assertTrue(_tasksPortlet.isDisplayed());
	}

	@FindBy(xpath = "//div[@class='portlet-body']/p[1]")
	private WebElement _message;

	@FindBy(xpath = "//div[contains(@id,'" + TestPortletKeys.Test + "')]")
	private WebElement _testPortlet;

	@Drone
	private WebDriver _webDriver;

	@PortalURL(TestPortletKeys.Test)
	private URL _portletURL;
	
	@FindBy(xpath = "//div[contains(@id,'" + TaskPortletKeys.TASKS + "')]")
	private WebElement _tasksPortlet;
	
	@PortalURL(TaskPortletKeys.TASKS)
	private URL _tasksURL;
	
}
