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
 * Provides a wrapper for {@link cfm_masterLocalService}.
 *
 * @author ganjuss
 * @see cfm_masterLocalService
 * @generated
 */
public class cfm_masterLocalServiceWrapper implements cfm_masterLocalService,
	ServiceWrapper<cfm_masterLocalService> {
	public cfm_masterLocalServiceWrapper(
		cfm_masterLocalService cfm_masterLocalService) {
		_cfm_masterLocalService = cfm_masterLocalService;
	}

	/**
	* Adds the cfm_master to the database. Also notifies the appropriate model listeners.
	*
	* @param cfm_master the cfm_master
	* @return the cfm_master that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.cfm_master addcfm_master(
		com.db.model.cfm_master cfm_master)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfm_masterLocalService.addcfm_master(cfm_master);
	}

	/**
	* Creates a new cfm_master with the primary key. Does not add the cfm_master to the database.
	*
	* @param cid the primary key for the new cfm_master
	* @return the new cfm_master
	*/
	@Override
	public com.db.model.cfm_master createcfm_master(long cid) {
		return _cfm_masterLocalService.createcfm_master(cid);
	}

	/**
	* Deletes the cfm_master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the cfm_master
	* @return the cfm_master that was removed
	* @throws PortalException if a cfm_master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.cfm_master deletecfm_master(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cfm_masterLocalService.deletecfm_master(cid);
	}

	/**
	* Deletes the cfm_master from the database. Also notifies the appropriate model listeners.
	*
	* @param cfm_master the cfm_master
	* @return the cfm_master that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.cfm_master deletecfm_master(
		com.db.model.cfm_master cfm_master)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfm_masterLocalService.deletecfm_master(cfm_master);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cfm_masterLocalService.dynamicQuery();
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
		return _cfm_masterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.cfm_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cfm_masterLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.cfm_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cfm_masterLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _cfm_masterLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cfm_masterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.db.model.cfm_master fetchcfm_master(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfm_masterLocalService.fetchcfm_master(cid);
	}

	/**
	* Returns the cfm_master with the primary key.
	*
	* @param cid the primary key of the cfm_master
	* @return the cfm_master
	* @throws PortalException if a cfm_master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.cfm_master getcfm_master(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cfm_masterLocalService.getcfm_master(cid);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cfm_masterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the cfm_masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.cfm_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cfm_masters
	* @param end the upper bound of the range of cfm_masters (not inclusive)
	* @return the range of cfm_masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.db.model.cfm_master> getcfm_masters(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _cfm_masterLocalService.getcfm_masters(start, end);
	}

	/**
	* Returns the number of cfm_masters.
	*
	* @return the number of cfm_masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getcfm_mastersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfm_masterLocalService.getcfm_mastersCount();
	}

	/**
	* Updates the cfm_master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cfm_master the cfm_master
	* @return the cfm_master that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.cfm_master updatecfm_master(
		com.db.model.cfm_master cfm_master)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfm_masterLocalService.updatecfm_master(cfm_master);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _cfm_masterLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_cfm_masterLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cfm_masterLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public cfm_masterLocalService getWrappedcfm_masterLocalService() {
		return _cfm_masterLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedcfm_masterLocalService(
		cfm_masterLocalService cfm_masterLocalService) {
		_cfm_masterLocalService = cfm_masterLocalService;
	}

	@Override
	public cfm_masterLocalService getWrappedService() {
		return _cfm_masterLocalService;
	}

	@Override
	public void setWrappedService(cfm_masterLocalService cfm_masterLocalService) {
		_cfm_masterLocalService = cfm_masterLocalService;
	}

	private cfm_masterLocalService _cfm_masterLocalService;
}