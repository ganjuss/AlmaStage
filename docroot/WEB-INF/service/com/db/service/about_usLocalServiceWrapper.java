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
 * Provides a wrapper for {@link about_usLocalService}.
 *
 * @author ganjuss
 * @see about_usLocalService
 * @generated
 */
public class about_usLocalServiceWrapper implements about_usLocalService,
	ServiceWrapper<about_usLocalService> {
	public about_usLocalServiceWrapper(
		about_usLocalService about_usLocalService) {
		_about_usLocalService = about_usLocalService;
	}

	/**
	* Adds the about_us to the database. Also notifies the appropriate model listeners.
	*
	* @param about_us the about_us
	* @return the about_us that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.about_us addabout_us(com.db.model.about_us about_us)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _about_usLocalService.addabout_us(about_us);
	}

	/**
	* Creates a new about_us with the primary key. Does not add the about_us to the database.
	*
	* @param cid the primary key for the new about_us
	* @return the new about_us
	*/
	@Override
	public com.db.model.about_us createabout_us(long cid) {
		return _about_usLocalService.createabout_us(cid);
	}

	/**
	* Deletes the about_us with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the about_us
	* @return the about_us that was removed
	* @throws PortalException if a about_us with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.about_us deleteabout_us(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _about_usLocalService.deleteabout_us(cid);
	}

	/**
	* Deletes the about_us from the database. Also notifies the appropriate model listeners.
	*
	* @param about_us the about_us
	* @return the about_us that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.about_us deleteabout_us(com.db.model.about_us about_us)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _about_usLocalService.deleteabout_us(about_us);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _about_usLocalService.dynamicQuery();
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
		return _about_usLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.about_usModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _about_usLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.about_usModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _about_usLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _about_usLocalService.dynamicQueryCount(dynamicQuery);
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
		return _about_usLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.db.model.about_us fetchabout_us(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _about_usLocalService.fetchabout_us(cid);
	}

	/**
	* Returns the about_us with the primary key.
	*
	* @param cid the primary key of the about_us
	* @return the about_us
	* @throws PortalException if a about_us with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.about_us getabout_us(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _about_usLocalService.getabout_us(cid);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _about_usLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the about_uses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.about_usModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of about_uses
	* @param end the upper bound of the range of about_uses (not inclusive)
	* @return the range of about_uses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.db.model.about_us> getabout_uses(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _about_usLocalService.getabout_uses(start, end);
	}

	/**
	* Returns the number of about_uses.
	*
	* @return the number of about_uses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getabout_usesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _about_usLocalService.getabout_usesCount();
	}

	/**
	* Updates the about_us in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param about_us the about_us
	* @return the about_us that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.about_us updateabout_us(com.db.model.about_us about_us)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _about_usLocalService.updateabout_us(about_us);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _about_usLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_about_usLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _about_usLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public about_usLocalService getWrappedabout_usLocalService() {
		return _about_usLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedabout_usLocalService(
		about_usLocalService about_usLocalService) {
		_about_usLocalService = about_usLocalService;
	}

	@Override
	public about_usLocalService getWrappedService() {
		return _about_usLocalService;
	}

	@Override
	public void setWrappedService(about_usLocalService about_usLocalService) {
		_about_usLocalService = about_usLocalService;
	}

	private about_usLocalService _about_usLocalService;
}