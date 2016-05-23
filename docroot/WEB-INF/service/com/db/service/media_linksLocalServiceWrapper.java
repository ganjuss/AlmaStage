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
 * Provides a wrapper for {@link media_linksLocalService}.
 *
 * @author ganjuss
 * @see media_linksLocalService
 * @generated
 */
public class media_linksLocalServiceWrapper implements media_linksLocalService,
	ServiceWrapper<media_linksLocalService> {
	public media_linksLocalServiceWrapper(
		media_linksLocalService media_linksLocalService) {
		_media_linksLocalService = media_linksLocalService;
	}

	/**
	* Adds the media_links to the database. Also notifies the appropriate model listeners.
	*
	* @param media_links the media_links
	* @return the media_links that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.media_links addmedia_links(
		com.db.model.media_links media_links)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _media_linksLocalService.addmedia_links(media_links);
	}

	/**
	* Creates a new media_links with the primary key. Does not add the media_links to the database.
	*
	* @param cid the primary key for the new media_links
	* @return the new media_links
	*/
	@Override
	public com.db.model.media_links createmedia_links(long cid) {
		return _media_linksLocalService.createmedia_links(cid);
	}

	/**
	* Deletes the media_links with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the media_links
	* @return the media_links that was removed
	* @throws PortalException if a media_links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.media_links deletemedia_links(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _media_linksLocalService.deletemedia_links(cid);
	}

	/**
	* Deletes the media_links from the database. Also notifies the appropriate model listeners.
	*
	* @param media_links the media_links
	* @return the media_links that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.media_links deletemedia_links(
		com.db.model.media_links media_links)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _media_linksLocalService.deletemedia_links(media_links);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _media_linksLocalService.dynamicQuery();
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
		return _media_linksLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.media_linksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _media_linksLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.media_linksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _media_linksLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _media_linksLocalService.dynamicQueryCount(dynamicQuery);
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
		return _media_linksLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.db.model.media_links fetchmedia_links(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _media_linksLocalService.fetchmedia_links(cid);
	}

	/**
	* Returns the media_links with the primary key.
	*
	* @param cid the primary key of the media_links
	* @return the media_links
	* @throws PortalException if a media_links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.media_links getmedia_links(long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _media_linksLocalService.getmedia_links(cid);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _media_linksLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the media_linkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.media_linksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of media_linkses
	* @param end the upper bound of the range of media_linkses (not inclusive)
	* @return the range of media_linkses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.db.model.media_links> getmedia_linkses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _media_linksLocalService.getmedia_linkses(start, end);
	}

	/**
	* Returns the number of media_linkses.
	*
	* @return the number of media_linkses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getmedia_linksesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _media_linksLocalService.getmedia_linksesCount();
	}

	/**
	* Updates the media_links in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param media_links the media_links
	* @return the media_links that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.db.model.media_links updatemedia_links(
		com.db.model.media_links media_links)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _media_linksLocalService.updatemedia_links(media_links);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _media_linksLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_media_linksLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _media_linksLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public media_linksLocalService getWrappedmedia_linksLocalService() {
		return _media_linksLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedmedia_linksLocalService(
		media_linksLocalService media_linksLocalService) {
		_media_linksLocalService = media_linksLocalService;
	}

	@Override
	public media_linksLocalService getWrappedService() {
		return _media_linksLocalService;
	}

	@Override
	public void setWrappedService(
		media_linksLocalService media_linksLocalService) {
		_media_linksLocalService = media_linksLocalService;
	}

	private media_linksLocalService _media_linksLocalService;
}