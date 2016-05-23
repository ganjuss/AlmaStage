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
 * Provides a wrapper for {@link club_usersLocalService}.
 *
 * @author ganjuss
 * @see club_usersLocalService
 * @generated
 */
public class club_usersLocalServiceWrapper implements club_usersLocalService,
	ServiceWrapper<club_usersLocalService> {
	public club_usersLocalServiceWrapper(
		club_usersLocalService club_usersLocalService) {
		_club_usersLocalService = club_usersLocalService;
	}

	/**
	* Adds the club_users to the database. Also notifies the appropriate model listeners.
	*
	* @param club_users the club_users
	* @return the club_users that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.club_users addclub_users(
		com.db.model.club_users club_users)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _club_usersLocalService.addclub_users(club_users);
	}

	/**
	* Creates a new club_users with the primary key. Does not add the club_users to the database.
	*
	* @param cid the primary key for the new club_users
	* @return the new club_users
	*/
	@Override
	public com.db.model.club_users createclub_users(long cid) {
		return _club_usersLocalService.createclub_users(cid);
	}

	/**
	* Deletes the club_users with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the club_users
	* @return the club_users that was removed
	* @throws PortalException if a club_users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.club_users deleteclub_users(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _club_usersLocalService.deleteclub_users(cid);
	}

	/**
	* Deletes the club_users from the database. Also notifies the appropriate model listeners.
	*
	* @param club_users the club_users
	* @return the club_users that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.club_users deleteclub_users(
		com.db.model.club_users club_users)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _club_usersLocalService.deleteclub_users(club_users);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _club_usersLocalService.dynamicQuery();
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
		return _club_usersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.club_usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _club_usersLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.club_usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _club_usersLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _club_usersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _club_usersLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.db.model.club_users fetchclub_users(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _club_usersLocalService.fetchclub_users(cid);
	}

	/**
	* Returns the club_users with the primary key.
	*
	* @param cid the primary key of the club_users
	* @return the club_users
	* @throws PortalException if a club_users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.club_users getclub_users(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _club_usersLocalService.getclub_users(cid);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _club_usersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the club_userses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.club_usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of club_userses
	* @param end the upper bound of the range of club_userses (not inclusive)
	* @return the range of club_userses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.db.model.club_users> getclub_userses(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _club_usersLocalService.getclub_userses(start, end);
	}

	/**
	* Returns the number of club_userses.
	*
	* @return the number of club_userses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getclub_usersesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _club_usersLocalService.getclub_usersesCount();
	}

	/**
	* Updates the club_users in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param club_users the club_users
	* @return the club_users that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.club_users updateclub_users(
		com.db.model.club_users club_users)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _club_usersLocalService.updateclub_users(club_users);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _club_usersLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_club_usersLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _club_usersLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public club_usersLocalService getWrappedclub_usersLocalService() {
		return _club_usersLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedclub_usersLocalService(
		club_usersLocalService club_usersLocalService) {
		_club_usersLocalService = club_usersLocalService;
	}

	@Override
	public club_usersLocalService getWrappedService() {
		return _club_usersLocalService;
	}

	@Override
	public void setWrappedService(club_usersLocalService club_usersLocalService) {
		_club_usersLocalService = club_usersLocalService;
	}

	private club_usersLocalService _club_usersLocalService;
}