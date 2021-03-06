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

package com.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link messagesLocalService}.
 *
 * @author ganjuss
 * @see messagesLocalService
 * @generated
 */
public class messagesLocalServiceWrapper implements messagesLocalService,
	ServiceWrapper<messagesLocalService> {
	public messagesLocalServiceWrapper(
		messagesLocalService messagesLocalService) {
		_messagesLocalService = messagesLocalService;
	}

	/**
	* Adds the messages to the database. Also notifies the appropriate model listeners.
	*
	* @param messages the messages
	* @return the messages that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.messages addmessages(com.db.model.messages messages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messagesLocalService.addmessages(messages);
	}

	/**
	* Creates a new messages with the primary key. Does not add the messages to the database.
	*
	* @param cid the primary key for the new messages
	* @return the new messages
	*/
	@Override
	public com.db.model.messages createmessages(long cid) {
		return _messagesLocalService.createmessages(cid);
	}

	/**
	* Deletes the messages with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the messages
	* @return the messages that was removed
	* @throws PortalException if a messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.messages deletemessages(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _messagesLocalService.deletemessages(cid);
	}

	/**
	* Deletes the messages from the database. Also notifies the appropriate model listeners.
	*
	* @param messages the messages
	* @return the messages that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.messages deletemessages(com.db.model.messages messages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messagesLocalService.deletemessages(messages);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _messagesLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.messagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _messagesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.messagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messagesLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messagesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messagesLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.db.model.messages fetchmessages(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messagesLocalService.fetchmessages(cid);
	}

	/**
	* Returns the messages with the primary key.
	*
	* @param cid the primary key of the messages
	* @return the messages
	* @throws PortalException if a messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.messages getmessages(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _messagesLocalService.getmessages(cid);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _messagesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the messageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.messagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of messageses
	* @param end the upper bound of the range of messageses (not inclusive)
	* @return the range of messageses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.db.model.messages> getmessageses(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _messagesLocalService.getmessageses(start, end);
	}

	/**
	* Returns the number of messageses.
	*
	* @return the number of messageses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getmessagesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messagesLocalService.getmessagesesCount();
	}

	/**
	* Updates the messages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param messages the messages
	* @return the messages that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.messages updatemessages(com.db.model.messages messages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _messagesLocalService.updatemessages(messages);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _messagesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_messagesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _messagesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public messagesLocalService getWrappedmessagesLocalService() {
		return _messagesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedmessagesLocalService(
		messagesLocalService messagesLocalService) {
		_messagesLocalService = messagesLocalService;
	}

	@Override
	public messagesLocalService getWrappedService() {
		return _messagesLocalService;
	}

	@Override
	public void setWrappedService(messagesLocalService messagesLocalService) {
		_messagesLocalService = messagesLocalService;
	}

	private messagesLocalService _messagesLocalService;
}