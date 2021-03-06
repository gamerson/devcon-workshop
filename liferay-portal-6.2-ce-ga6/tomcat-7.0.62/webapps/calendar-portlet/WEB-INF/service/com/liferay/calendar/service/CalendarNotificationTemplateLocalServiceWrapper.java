/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.calendar.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CalendarNotificationTemplateLocalService}.
 *
 * @author Eduardo Lundgren
 * @see CalendarNotificationTemplateLocalService
 * @generated
 */
public class CalendarNotificationTemplateLocalServiceWrapper
	implements CalendarNotificationTemplateLocalService,
		ServiceWrapper<CalendarNotificationTemplateLocalService> {
	public CalendarNotificationTemplateLocalServiceWrapper(
		CalendarNotificationTemplateLocalService calendarNotificationTemplateLocalService) {
		_calendarNotificationTemplateLocalService = calendarNotificationTemplateLocalService;
	}

	/**
	* Adds the calendar notification template to the database. Also notifies the appropriate model listeners.
	*
	* @param calendarNotificationTemplate the calendar notification template
	* @return the calendar notification template that was added
	* @throws SystemException if a system exception occurred
	*/

	public com.liferay.calendar.model.CalendarNotificationTemplate addCalendarNotificationTemplate(
		com.liferay.calendar.model.CalendarNotificationTemplate calendarNotificationTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.addCalendarNotificationTemplate(calendarNotificationTemplate);
	}

	/**
	* Creates a new calendar notification template with the primary key. Does not add the calendar notification template to the database.
	*
	* @param calendarNotificationTemplateId the primary key for the new calendar notification template
	* @return the new calendar notification template
	*/

	public com.liferay.calendar.model.CalendarNotificationTemplate createCalendarNotificationTemplate(
		long calendarNotificationTemplateId) {
		return _calendarNotificationTemplateLocalService.createCalendarNotificationTemplate(calendarNotificationTemplateId);
	}

	/**
	* Deletes the calendar notification template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param calendarNotificationTemplateId the primary key of the calendar notification template
	* @return the calendar notification template that was removed
	* @throws PortalException if a calendar notification template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/

	public com.liferay.calendar.model.CalendarNotificationTemplate deleteCalendarNotificationTemplate(
		long calendarNotificationTemplateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.deleteCalendarNotificationTemplate(calendarNotificationTemplateId);
	}

	/**
	* Deletes the calendar notification template from the database. Also notifies the appropriate model listeners.
	*
	* @param calendarNotificationTemplate the calendar notification template
	* @return the calendar notification template that was removed
	* @throws SystemException if a system exception occurred
	*/

	public com.liferay.calendar.model.CalendarNotificationTemplate deleteCalendarNotificationTemplate(
		com.liferay.calendar.model.CalendarNotificationTemplate calendarNotificationTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.deleteCalendarNotificationTemplate(calendarNotificationTemplate);
	}


	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _calendarNotificationTemplateLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.calendar.model.impl.CalendarNotificationTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.calendar.model.impl.CalendarNotificationTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/

	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/

	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}


	public com.liferay.calendar.model.CalendarNotificationTemplate fetchCalendarNotificationTemplate(
		long calendarNotificationTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.fetchCalendarNotificationTemplate(calendarNotificationTemplateId);
	}

	/**
	* Returns the calendar notification template with the matching UUID and company.
	*
	* @param uuid the calendar notification template's UUID
	* @param companyId the primary key of the company
	* @return the matching calendar notification template, or <code>null</code> if a matching calendar notification template could not be found
	* @throws SystemException if a system exception occurred
	*/

	public com.liferay.calendar.model.CalendarNotificationTemplate fetchCalendarNotificationTemplateByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.fetchCalendarNotificationTemplateByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the calendar notification template matching the UUID and group.
	*
	* @param uuid the calendar notification template's UUID
	* @param groupId the primary key of the group
	* @return the matching calendar notification template, or <code>null</code> if a matching calendar notification template could not be found
	* @throws SystemException if a system exception occurred
	*/

	public com.liferay.calendar.model.CalendarNotificationTemplate fetchCalendarNotificationTemplateByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.fetchCalendarNotificationTemplateByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the calendar notification template with the primary key.
	*
	* @param calendarNotificationTemplateId the primary key of the calendar notification template
	* @return the calendar notification template
	* @throws PortalException if a calendar notification template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/

	public com.liferay.calendar.model.CalendarNotificationTemplate getCalendarNotificationTemplate(
		long calendarNotificationTemplateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.getCalendarNotificationTemplate(calendarNotificationTemplateId);
	}


	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the calendar notification template with the matching UUID and company.
	*
	* @param uuid the calendar notification template's UUID
	* @param companyId the primary key of the company
	* @return the matching calendar notification template
	* @throws PortalException if a matching calendar notification template could not be found
	* @throws SystemException if a system exception occurred
	*/

	public com.liferay.calendar.model.CalendarNotificationTemplate getCalendarNotificationTemplateByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.getCalendarNotificationTemplateByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the calendar notification template matching the UUID and group.
	*
	* @param uuid the calendar notification template's UUID
	* @param groupId the primary key of the group
	* @return the matching calendar notification template
	* @throws PortalException if a matching calendar notification template could not be found
	* @throws SystemException if a system exception occurred
	*/

	public com.liferay.calendar.model.CalendarNotificationTemplate getCalendarNotificationTemplateByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.getCalendarNotificationTemplateByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the calendar notification templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.calendar.model.impl.CalendarNotificationTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of calendar notification templates
	* @param end the upper bound of the range of calendar notification templates (not inclusive)
	* @return the range of calendar notification templates
	* @throws SystemException if a system exception occurred
	*/

	public java.util.List<com.liferay.calendar.model.CalendarNotificationTemplate> getCalendarNotificationTemplates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.getCalendarNotificationTemplates(start,
			end);
	}

	/**
	* Returns the number of calendar notification templates.
	*
	* @return the number of calendar notification templates
	* @throws SystemException if a system exception occurred
	*/

	public int getCalendarNotificationTemplatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.getCalendarNotificationTemplatesCount();
	}

	/**
	* Updates the calendar notification template in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param calendarNotificationTemplate the calendar notification template
	* @return the calendar notification template that was updated
	* @throws SystemException if a system exception occurred
	*/

	public com.liferay.calendar.model.CalendarNotificationTemplate updateCalendarNotificationTemplate(
		com.liferay.calendar.model.CalendarNotificationTemplate calendarNotificationTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.updateCalendarNotificationTemplate(calendarNotificationTemplate);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/

	public java.lang.String getBeanIdentifier() {
		return _calendarNotificationTemplateLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/

	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_calendarNotificationTemplateLocalService.setBeanIdentifier(beanIdentifier);
	}


	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _calendarNotificationTemplateLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}


	public com.liferay.calendar.model.CalendarNotificationTemplate addCalendarNotificationTemplate(
		long userId, long calendarId,
		com.liferay.calendar.notification.NotificationType notificationType,
		java.lang.String notificationTypeSettings,
		com.liferay.calendar.notification.NotificationTemplateType notificationTemplateType,
		java.lang.String subject, java.lang.String body,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.addCalendarNotificationTemplate(userId,
			calendarId, notificationType, notificationTypeSettings,
			notificationTemplateType, subject, body, serviceContext);
	}


	public void deleteCalendarNotificationTemplates(long calendarId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_calendarNotificationTemplateLocalService.deleteCalendarNotificationTemplates(calendarId);
	}


	public com.liferay.calendar.model.CalendarNotificationTemplate fetchCalendarNotificationTemplate(
		long calendarId,
		com.liferay.calendar.notification.NotificationType notificationType,
		com.liferay.calendar.notification.NotificationTemplateType notificationTemplateType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.fetchCalendarNotificationTemplate(calendarId,
			notificationType, notificationTemplateType);
	}


	public com.liferay.calendar.model.CalendarNotificationTemplate updateCalendarNotificationTemplate(
		long calendarNotificationTemplateId,
		java.lang.String notificationTypeSettings, java.lang.String subject,
		java.lang.String body,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _calendarNotificationTemplateLocalService.updateCalendarNotificationTemplate(calendarNotificationTemplateId,
			notificationTypeSettings, subject, body, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CalendarNotificationTemplateLocalService getWrappedCalendarNotificationTemplateLocalService() {
		return _calendarNotificationTemplateLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCalendarNotificationTemplateLocalService(
		CalendarNotificationTemplateLocalService calendarNotificationTemplateLocalService) {
		_calendarNotificationTemplateLocalService = calendarNotificationTemplateLocalService;
	}


	public CalendarNotificationTemplateLocalService getWrappedService() {
		return _calendarNotificationTemplateLocalService;
	}


	public void setWrappedService(
		CalendarNotificationTemplateLocalService calendarNotificationTemplateLocalService) {
		_calendarNotificationTemplateLocalService = calendarNotificationTemplateLocalService;
	}

	private CalendarNotificationTemplateLocalService _calendarNotificationTemplateLocalService;
}