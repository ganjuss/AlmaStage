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
 * Provides a wrapper for {@link social_type_masterLocalService}.
 *
 * @author ganjuss
 * @see social_type_masterLocalService
 * @generated
 */
public class social_type_masterLocalServiceWrapper
	implements social_type_masterLocalService,
		ServiceWrapper<social_type_masterLocalService> {
	public social_type_masterLocalServiceWrapper(
		social_type_masterLocalService social_type_masterLocalService) {
		_social_type_masterLocalService = social_type_masterLocalService;
	}

	/**
	* Adds the social_type_master to the database. Also notifies the appropriate model listeners.
	*
	* @param social_type_master the social_type_master
	* @return the social_type_master that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.social_type_master addsocial_type_master(
		com.db.model.social_type_master social_type_master)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _social_type_masterLocalService.addsocial_type_master(social_type_master);
	}

	/**
	* Creates a new social_type_master with the primary key. Does not add the social_type_master to the database.
	*
	* @param cid the primary key for the new social_type_master
	* @return the new social_type_master
	*/
	@Override
	public com.db.model.social_type_master createsocial_type_master(long cid) {
		return _social_type_masterLocalService.createsocial_type_master(cid);
	}

	/**
	* Deletes the social_type_master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the social_type_master
	* @return the social_type_master that was removed
	* @throws PortalException if a social_type_master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.social_type_master deletesocial_type_master(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _social_type_masterLocalService.deletesocial_type_master(cid);
	}

	/**
	* Deletes the social_type_master from the database. Also notifies the appropriate model listeners.
	*
	* @param social_type_master the social_type_master
	* @return the social_type_master that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.social_type_master deletesocial_type_master(
		com.db.model.social_type_master social_type_master)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _social_type_masterLocalService.deletesocial_type_master(social_type_master);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _social_type_masterLocalService.dynamicQuery();
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
		return _social_type_masterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.social_type_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _social_type_masterLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.social_type_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _social_type_masterLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _social_type_masterLocalService.dynamicQueryCount(dynamicQuery);
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
		return _social_type_masterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.db.model.social_type_master fetchsocial_type_master(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _social_type_masterLocalService.fetchsocial_type_master(cid);
	}

	/**
	* Returns the social_type_master with the primary key.
	*
	* @param cid the primary key of the social_type_master
	* @return the social_type_master
	* @throws PortalException if a social_type_master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.social_type_master getsocial_type_master(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _social_type_masterLocalService.getsocial_type_master(cid);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _social_type_masterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the social_type_masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.social_type_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of social_type_masters
	* @param end the upper bound of the range of social_type_masters (not inclusive)
	* @return the range of social_type_masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.db.model.social_type_master> getsocial_type_masters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _social_type_masterLocalService.getsocial_type_masters(start, end);
	}

	/**
	* Returns the number of social_type_masters.
	*
	* @return the number of social_type_masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getsocial_type_mastersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _social_type_masterLocalService.getsocial_type_mastersCount();
	}

	/**
	* Updates the social_type_master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param social_type_master the social_type_master
	* @return the social_type_master that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.social_type_master updatesocial_type_master(
		com.db.model.social_type_master social_type_master)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _social_type_masterLocalService.updatesocial_type_master(social_type_master);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _social_type_masterLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_social_type_masterLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _social_type_masterLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public social_type_masterLocalService getWrappedsocial_type_masterLocalService() {
		return _social_type_masterLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedsocial_type_masterLocalService(
		social_type_masterLocalService social_type_masterLocalService) {
		_social_type_masterLocalService = social_type_masterLocalService;
	}

	@Override
	public social_type_masterLocalService getWrappedService() {
		return _social_type_masterLocalService;
	}

	@Override
	public void setWrappedService(
		social_type_masterLocalService social_type_masterLocalService) {
		_social_type_masterLocalService = social_type_masterLocalService;
	}

	private social_type_masterLocalService _social_type_masterLocalService;
}