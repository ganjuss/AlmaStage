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
 * Provides a wrapper for {@link profile_social_linkLocalService}.
 *
 * @author ganjuss
 * @see profile_social_linkLocalService
 * @generated
 */
public class profile_social_linkLocalServiceWrapper
	implements profile_social_linkLocalService,
		ServiceWrapper<profile_social_linkLocalService> {
	public profile_social_linkLocalServiceWrapper(
		profile_social_linkLocalService profile_social_linkLocalService) {
		_profile_social_linkLocalService = profile_social_linkLocalService;
	}

	/**
	* Adds the profile_social_link to the database. Also notifies the appropriate model listeners.
	*
	* @param profile_social_link the profile_social_link
	* @return the profile_social_link that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.profile_social_link addprofile_social_link(
		com.db.model.profile_social_link profile_social_link)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profile_social_linkLocalService.addprofile_social_link(profile_social_link);
	}

	/**
	* Creates a new profile_social_link with the primary key. Does not add the profile_social_link to the database.
	*
	* @param cid the primary key for the new profile_social_link
	* @return the new profile_social_link
	*/
	@Override
	public com.db.model.profile_social_link createprofile_social_link(long cid) {
		return _profile_social_linkLocalService.createprofile_social_link(cid);
	}

	/**
	* Deletes the profile_social_link with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the profile_social_link
	* @return the profile_social_link that was removed
	* @throws PortalException if a profile_social_link with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.profile_social_link deleteprofile_social_link(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _profile_social_linkLocalService.deleteprofile_social_link(cid);
	}

	/**
	* Deletes the profile_social_link from the database. Also notifies the appropriate model listeners.
	*
	* @param profile_social_link the profile_social_link
	* @return the profile_social_link that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.profile_social_link deleteprofile_social_link(
		com.db.model.profile_social_link profile_social_link)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profile_social_linkLocalService.deleteprofile_social_link(profile_social_link);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _profile_social_linkLocalService.dynamicQuery();
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
		return _profile_social_linkLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.profile_social_linkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _profile_social_linkLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.profile_social_linkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _profile_social_linkLocalService.dynamicQuery(dynamicQuery,
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
		return _profile_social_linkLocalService.dynamicQueryCount(dynamicQuery);
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
		return _profile_social_linkLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.db.model.profile_social_link fetchprofile_social_link(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profile_social_linkLocalService.fetchprofile_social_link(cid);
	}

	/**
	* Returns the profile_social_link with the primary key.
	*
	* @param cid the primary key of the profile_social_link
	* @return the profile_social_link
	* @throws PortalException if a profile_social_link with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.profile_social_link getprofile_social_link(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _profile_social_linkLocalService.getprofile_social_link(cid);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _profile_social_linkLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the profile_social_links.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.profile_social_linkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profile_social_links
	* @param end the upper bound of the range of profile_social_links (not inclusive)
	* @return the range of profile_social_links
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.db.model.profile_social_link> getprofile_social_links(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profile_social_linkLocalService.getprofile_social_links(start,
			end);
	}

	/**
	* Returns the number of profile_social_links.
	*
	* @return the number of profile_social_links
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getprofile_social_linksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profile_social_linkLocalService.getprofile_social_linksCount();
	}

	/**
	* Updates the profile_social_link in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param profile_social_link the profile_social_link
	* @return the profile_social_link that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.profile_social_link updateprofile_social_link(
		com.db.model.profile_social_link profile_social_link)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _profile_social_linkLocalService.updateprofile_social_link(profile_social_link);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _profile_social_linkLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_profile_social_linkLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _profile_social_linkLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public profile_social_linkLocalService getWrappedprofile_social_linkLocalService() {
		return _profile_social_linkLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedprofile_social_linkLocalService(
		profile_social_linkLocalService profile_social_linkLocalService) {
		_profile_social_linkLocalService = profile_social_linkLocalService;
	}

	@Override
	public profile_social_linkLocalService getWrappedService() {
		return _profile_social_linkLocalService;
	}

	@Override
	public void setWrappedService(
		profile_social_linkLocalService profile_social_linkLocalService) {
		_profile_social_linkLocalService = profile_social_linkLocalService;
	}

	private profile_social_linkLocalService _profile_social_linkLocalService;
}