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

package com.db.service.persistence;

import com.db.model.media_links;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the media_links service. This utility wraps {@link media_linksPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see media_linksPersistence
 * @see media_linksPersistenceImpl
 * @generated
 */
public class media_linksUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(media_links media_links) {
		getPersistence().clearCache(media_links);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<media_links> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<media_links> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<media_links> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static media_links update(media_links media_links)
		throws SystemException {
		return getPersistence().update(media_links);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static media_links update(media_links media_links,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(media_links, serviceContext);
	}

	/**
	* Caches the media_links in the entity cache if it is enabled.
	*
	* @param media_links the media_links
	*/
	public static void cacheResult(com.db.model.media_links media_links) {
		getPersistence().cacheResult(media_links);
	}

	/**
	* Caches the media_linkses in the entity cache if it is enabled.
	*
	* @param media_linkses the media_linkses
	*/
	public static void cacheResult(
		java.util.List<com.db.model.media_links> media_linkses) {
		getPersistence().cacheResult(media_linkses);
	}

	/**
	* Creates a new media_links with the primary key. Does not add the media_links to the database.
	*
	* @param cid the primary key for the new media_links
	* @return the new media_links
	*/
	public static com.db.model.media_links create(long cid) {
		return getPersistence().create(cid);
	}

	/**
	* Removes the media_links with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the media_links
	* @return the media_links that was removed
	* @throws com.db.NoSuchmedia_linksException if a media_links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.media_links remove(long cid)
		throws com.db.NoSuchmedia_linksException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(cid);
	}

	public static com.db.model.media_links updateImpl(
		com.db.model.media_links media_links)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(media_links);
	}

	/**
	* Returns the media_links with the primary key or throws a {@link com.db.NoSuchmedia_linksException} if it could not be found.
	*
	* @param cid the primary key of the media_links
	* @return the media_links
	* @throws com.db.NoSuchmedia_linksException if a media_links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.media_links findByPrimaryKey(long cid)
		throws com.db.NoSuchmedia_linksException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(cid);
	}

	/**
	* Returns the media_links with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the media_links
	* @return the media_links, or <code>null</code> if a media_links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.media_links fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(cid);
	}

	/**
	* Returns all the media_linkses.
	*
	* @return the media_linkses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.media_links> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.db.model.media_links> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the media_linkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.media_linksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of media_linkses
	* @param end the upper bound of the range of media_linkses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of media_linkses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.media_links> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the media_linkses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of media_linkses.
	*
	* @return the number of media_linkses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static media_linksPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (media_linksPersistence)PortletBeanLocatorUtil.locate(com.db.service.ClpSerializer.getServletContextName(),
					media_linksPersistence.class.getName());

			ReferenceRegistry.registerReference(media_linksUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(media_linksPersistence persistence) {
	}

	private static media_linksPersistence _persistence;
}