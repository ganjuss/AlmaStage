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

import com.db.model.hit_count;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the hit_count service. This utility wraps {@link hit_countPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see hit_countPersistence
 * @see hit_countPersistenceImpl
 * @generated
 */
public class hit_countUtil {
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
	public static void clearCache(hit_count hit_count) {
		getPersistence().clearCache(hit_count);
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
	public static List<hit_count> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<hit_count> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<hit_count> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static hit_count update(hit_count hit_count)
		throws SystemException {
		return getPersistence().update(hit_count);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static hit_count update(hit_count hit_count,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(hit_count, serviceContext);
	}

	/**
	* Caches the hit_count in the entity cache if it is enabled.
	*
	* @param hit_count the hit_count
	*/
	public static void cacheResult(com.db.model.hit_count hit_count) {
		getPersistence().cacheResult(hit_count);
	}

	/**
	* Caches the hit_counts in the entity cache if it is enabled.
	*
	* @param hit_counts the hit_counts
	*/
	public static void cacheResult(
		java.util.List<com.db.model.hit_count> hit_counts) {
		getPersistence().cacheResult(hit_counts);
	}

	/**
	* Creates a new hit_count with the primary key. Does not add the hit_count to the database.
	*
	* @param cid the primary key for the new hit_count
	* @return the new hit_count
	*/
	public static com.db.model.hit_count create(long cid) {
		return getPersistence().create(cid);
	}

	/**
	* Removes the hit_count with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the hit_count
	* @return the hit_count that was removed
	* @throws com.db.NoSuchhit_countException if a hit_count with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.hit_count remove(long cid)
		throws com.db.NoSuchhit_countException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(cid);
	}

	public static com.db.model.hit_count updateImpl(
		com.db.model.hit_count hit_count)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(hit_count);
	}

	/**
	* Returns the hit_count with the primary key or throws a {@link com.db.NoSuchhit_countException} if it could not be found.
	*
	* @param cid the primary key of the hit_count
	* @return the hit_count
	* @throws com.db.NoSuchhit_countException if a hit_count with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.hit_count findByPrimaryKey(long cid)
		throws com.db.NoSuchhit_countException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(cid);
	}

	/**
	* Returns the hit_count with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the hit_count
	* @return the hit_count, or <code>null</code> if a hit_count with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.hit_count fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(cid);
	}

	/**
	* Returns all the hit_counts.
	*
	* @return the hit_counts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.hit_count> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the hit_counts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.hit_countModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hit_counts
	* @param end the upper bound of the range of hit_counts (not inclusive)
	* @return the range of hit_counts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.hit_count> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the hit_counts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.hit_countModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hit_counts
	* @param end the upper bound of the range of hit_counts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of hit_counts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.hit_count> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the hit_counts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of hit_counts.
	*
	* @return the number of hit_counts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static hit_countPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (hit_countPersistence)PortletBeanLocatorUtil.locate(com.db.service.ClpSerializer.getServletContextName(),
					hit_countPersistence.class.getName());

			ReferenceRegistry.registerReference(hit_countUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(hit_countPersistence persistence) {
	}

	private static hit_countPersistence _persistence;
}