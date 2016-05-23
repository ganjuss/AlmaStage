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
 * Provides a wrapper for {@link user_contactLocalService}.
 *
 * @author ganjuss
 * @see user_contactLocalService
 * @generated
 */
public class user_contactLocalServiceWrapper implements user_contactLocalService,
	ServiceWrapper<user_contactLocalService> {
	public user_contactLocalServiceWrapper(
		user_contactLocalService user_contactLocalService) {
		_user_contactLocalService = user_contactLocalService;
	}

	/**
	* Adds the user_contact to the database. Also notifies the appropriate model listeners.
	*
	* @param user_contact the user_contact
	* @return the user_contact that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.user_contact adduser_contact(
		com.db.model.user_contact user_contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _user_contactLocalService.adduser_contact(user_contact);
	}

	/**
	* Creates a new user_contact with the primary key. Does not add the user_contact to the database.
	*
	* @param cid the primary key for the new user_contact
	* @return the new user_contact
	*/
	@Override
	public com.db.model.user_contact createuser_contact(long cid) {
		return _user_contactLocalService.createuser_contact(cid);
	}

	/**
	* Deletes the user_contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the user_contact
	* @return the user_contact that was removed
	* @throws PortalException if a user_contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.user_contact deleteuser_contact(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _user_contactLocalService.deleteuser_contact(cid);
	}

	/**
	* Deletes the user_contact from the database. Also notifies the appropriate model listeners.
	*
	* @param user_contact the user_contact
	* @return the user_contact that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.user_contact deleteuser_contact(
		com.db.model.user_contact user_contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _user_contactLocalService.deleteuser_contact(user_contact);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _user_contactLocalService.dynamicQuery();
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
		return _user_contactLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.user_contactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _user_contactLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.user_contactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _user_contactLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _user_contactLocalService.dynamicQueryCount(dynamicQuery);
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
		return _user_contactLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.db.model.user_contact fetchuser_contact(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _user_contactLocalService.fetchuser_contact(cid);
	}

	/**
	* Returns the user_contact with the primary key.
	*
	* @param cid the primary key of the user_contact
	* @return the user_contact
	* @throws PortalException if a user_contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.user_contact getuser_contact(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _user_contactLocalService.getuser_contact(cid);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _user_contactLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user_contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.user_contactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user_contacts
	* @param end the upper bound of the range of user_contacts (not inclusive)
	* @return the range of user_contacts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.db.model.user_contact> getuser_contacts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _user_contactLocalService.getuser_contacts(start, end);
	}

	/**
	* Returns the number of user_contacts.
	*
	* @return the number of user_contacts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getuser_contactsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _user_contactLocalService.getuser_contactsCount();
	}

	/**
	* Updates the user_contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param user_contact the user_contact
	* @return the user_contact that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.user_contact updateuser_contact(
		com.db.model.user_contact user_contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _user_contactLocalService.updateuser_contact(user_contact);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _user_contactLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_user_contactLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _user_contactLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public user_contactLocalService getWrappeduser_contactLocalService() {
		return _user_contactLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappeduser_contactLocalService(
		user_contactLocalService user_contactLocalService) {
		_user_contactLocalService = user_contactLocalService;
	}

	@Override
	public user_contactLocalService getWrappedService() {
		return _user_contactLocalService;
	}

	@Override
	public void setWrappedService(
		user_contactLocalService user_contactLocalService) {
		_user_contactLocalService = user_contactLocalService;
	}

	private user_contactLocalService _user_contactLocalService;
}