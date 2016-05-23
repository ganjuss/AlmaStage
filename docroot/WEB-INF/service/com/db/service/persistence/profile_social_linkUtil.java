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

import com.db.model.profile_social_link;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the profile_social_link service. This utility wraps {@link profile_social_linkPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see profile_social_linkPersistence
 * @see profile_social_linkPersistenceImpl
 * @generated
 */
public class profile_social_linkUtil {
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
	public static void clearCache(profile_social_link profile_social_link) {
		getPersistence().clearCache(profile_social_link);
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
	public static List<profile_social_link> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<profile_social_link> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<profile_social_link> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static profile_social_link update(
		profile_social_link profile_social_link) throws SystemException {
		return getPersistence().update(profile_social_link);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static profile_social_link update(
		profile_social_link profile_social_link, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(profile_social_link, serviceContext);
	}

	/**
	* Caches the profile_social_link in the entity cache if it is enabled.
	*
	* @param profile_social_link the profile_social_link
	*/
	public static void cacheResult(
		com.db.model.profile_social_link profile_social_link) {
		getPersistence().cacheResult(profile_social_link);
	}

	/**
	* Caches the profile_social_links in the entity cache if it is enabled.
	*
	* @param profile_social_links the profile_social_links
	*/
	public static void cacheResult(
		java.util.List<com.db.model.profile_social_link> profile_social_links) {
		getPersistence().cacheResult(profile_social_links);
	}

	/**
	* Creates a new profile_social_link with the primary key. Does not add the profile_social_link to the database.
	*
	* @param cid the primary key for the new profile_social_link
	* @return the new profile_social_link
	*/
	public static com.db.model.profile_social_link create(long cid) {
		return getPersistence().create(cid);
	}

	/**
	* Removes the profile_social_link with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the profile_social_link
	* @return the profile_social_link that was removed
	* @throws com.db.NoSuchprofile_social_linkException if a profile_social_link with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.profile_social_link remove(long cid)
		throws com.db.NoSuchprofile_social_linkException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(cid);
	}

	public static com.db.model.profile_social_link updateImpl(
		com.db.model.profile_social_link profile_social_link)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(profile_social_link);
	}

	/**
	* Returns the profile_social_link with the primary key or throws a {@link com.db.NoSuchprofile_social_linkException} if it could not be found.
	*
	* @param cid the primary key of the profile_social_link
	* @return the profile_social_link
	* @throws com.db.NoSuchprofile_social_linkException if a profile_social_link with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.profile_social_link findByPrimaryKey(long cid)
		throws com.db.NoSuchprofile_social_linkException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(cid);
	}

	/**
	* Returns the profile_social_link with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the profile_social_link
	* @return the profile_social_link, or <code>null</code> if a profile_social_link with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.profile_social_link fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(cid);
	}

	/**
	* Returns all the profile_social_links.
	*
	* @return the profile_social_links
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.profile_social_link> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.db.model.profile_social_link> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the profile_social_links.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.profile_social_linkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profile_social_links
	* @param end the upper bound of the range of profile_social_links (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of profile_social_links
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.profile_social_link> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the profile_social_links from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of profile_social_links.
	*
	* @return the number of profile_social_links
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static profile_social_linkPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (profile_social_linkPersistence)PortletBeanLocatorUtil.locate(com.db.service.ClpSerializer.getServletContextName(),
					profile_social_linkPersistence.class.getName());

			ReferenceRegistry.registerReference(profile_social_linkUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(profile_social_linkPersistence persistence) {
	}

	private static profile_social_linkPersistence _persistence;
}