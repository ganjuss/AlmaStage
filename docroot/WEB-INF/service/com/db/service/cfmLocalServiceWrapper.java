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
 * Provides a wrapper for {@link cfmLocalService}.
 *
 * @author ganjuss
 * @see cfmLocalService
 * @generated
 */
public class cfmLocalServiceWrapper implements cfmLocalService,
	ServiceWrapper<cfmLocalService> {
	public cfmLocalServiceWrapper(cfmLocalService cfmLocalService) {
		_cfmLocalService = cfmLocalService;
	}

	/**
	* Adds the cfm to the database. Also notifies the appropriate model listeners.
	*
	* @param cfm the cfm
	* @return the cfm that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.cfm addcfm(com.db.model.cfm cfm)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfmLocalService.addcfm(cfm);
	}

	/**
	* Creates a new cfm with the primary key. Does not add the cfm to the database.
	*
	* @param cid the primary key for the new cfm
	* @return the new cfm
	*/
	@Override
	public com.db.model.cfm createcfm(long cid) {
		return _cfmLocalService.createcfm(cid);
	}

	/**
	* Deletes the cfm with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the cfm
	* @return the cfm that was removed
	* @throws PortalException if a cfm with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.cfm deletecfm(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cfmLocalService.deletecfm(cid);
	}

	/**
	* Deletes the cfm from the database. Also notifies the appropriate model listeners.
	*
	* @param cfm the cfm
	* @return the cfm that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.cfm deletecfm(com.db.model.cfm cfm)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfmLocalService.deletecfm(cfm);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cfmLocalService.dynamicQuery();
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
		return _cfmLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.cfmModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cfmLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.cfmModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cfmLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _cfmLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cfmLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.db.model.cfm fetchcfm(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfmLocalService.fetchcfm(cid);
	}

	/**
	* Returns the cfm with the primary key.
	*
	* @param cid the primary key of the cfm
	* @return the cfm
	* @throws PortalException if a cfm with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.cfm getcfm(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cfmLocalService.getcfm(cid);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cfmLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the cfms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.cfmModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cfms
	* @param end the upper bound of the range of cfms (not inclusive)
	* @return the range of cfms
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.db.model.cfm> getcfms(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfmLocalService.getcfms(start, end);
	}

	/**
	* Returns the number of cfms.
	*
	* @return the number of cfms
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getcfmsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfmLocalService.getcfmsCount();
	}

	/**
	* Updates the cfm in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cfm the cfm
	* @return the cfm that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.cfm updatecfm(com.db.model.cfm cfm)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfmLocalService.updatecfm(cfm);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _cfmLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_cfmLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cfmLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public cfmLocalService getWrappedcfmLocalService() {
		return _cfmLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedcfmLocalService(cfmLocalService cfmLocalService) {
		_cfmLocalService = cfmLocalService;
	}

	@Override
	public cfmLocalService getWrappedService() {
		return _cfmLocalService;
	}

	@Override
	public void setWrappedService(cfmLocalService cfmLocalService) {
		_cfmLocalService = cfmLocalService;
	}

	private cfmLocalService _cfmLocalService;
}