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
 * Provides a wrapper for {@link acheivementsLocalService}.
 *
 * @author ganjuss
 * @see acheivementsLocalService
 * @generated
 */
public class acheivementsLocalServiceWrapper implements acheivementsLocalService,
	ServiceWrapper<acheivementsLocalService> {
	public acheivementsLocalServiceWrapper(
		acheivementsLocalService acheivementsLocalService) {
		_acheivementsLocalService = acheivementsLocalService;
	}

	/**
	* Adds the acheivements to the database. Also notifies the appropriate model listeners.
	*
	* @param acheivements the acheivements
	* @return the acheivements that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.acheivements addacheivements(
		com.db.model.acheivements acheivements)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _acheivementsLocalService.addacheivements(acheivements);
	}

	/**
	* Creates a new acheivements with the primary key. Does not add the acheivements to the database.
	*
	* @param cid the primary key for the new acheivements
	* @return the new acheivements
	*/
	@Override
	public com.db.model.acheivements createacheivements(long cid) {
		return _acheivementsLocalService.createacheivements(cid);
	}

	/**
	* Deletes the acheivements with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the acheivements
	* @return the acheivements that was removed
	* @throws PortalException if a acheivements with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.acheivements deleteacheivements(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _acheivementsLocalService.deleteacheivements(cid);
	}

	/**
	* Deletes the acheivements from the database. Also notifies the appropriate model listeners.
	*
	* @param acheivements the acheivements
	* @return the acheivements that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.acheivements deleteacheivements(
		com.db.model.acheivements acheivements)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _acheivementsLocalService.deleteacheivements(acheivements);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acheivementsLocalService.dynamicQuery();
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
		return _acheivementsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.acheivementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _acheivementsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.acheivementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _acheivementsLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _acheivementsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _acheivementsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.db.model.acheivements fetchacheivements(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _acheivementsLocalService.fetchacheivements(cid);
	}

	/**
	* Returns the acheivements with the primary key.
	*
	* @param cid the primary key of the acheivements
	* @return the acheivements
	* @throws PortalException if a acheivements with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.acheivements getacheivements(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _acheivementsLocalService.getacheivements(cid);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _acheivementsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the acheivementses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.acheivementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of acheivementses
	* @param end the upper bound of the range of acheivementses (not inclusive)
	* @return the range of acheivementses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.db.model.acheivements> getacheivementses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _acheivementsLocalService.getacheivementses(start, end);
	}

	/**
	* Returns the number of acheivementses.
	*
	* @return the number of acheivementses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getacheivementsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _acheivementsLocalService.getacheivementsesCount();
	}

	/**
	* Updates the acheivements in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param acheivements the acheivements
	* @return the acheivements that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.acheivements updateacheivements(
		com.db.model.acheivements acheivements)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _acheivementsLocalService.updateacheivements(acheivements);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _acheivementsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_acheivementsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _acheivementsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public acheivementsLocalService getWrappedacheivementsLocalService() {
		return _acheivementsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedacheivementsLocalService(
		acheivementsLocalService acheivementsLocalService) {
		_acheivementsLocalService = acheivementsLocalService;
	}

	@Override
	public acheivementsLocalService getWrappedService() {
		return _acheivementsLocalService;
	}

	@Override
	public void setWrappedService(
		acheivementsLocalService acheivementsLocalService) {
		_acheivementsLocalService = acheivementsLocalService;
	}

	private acheivementsLocalService _acheivementsLocalService;
}