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

import com.db.model.clubs;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the clubs service. This utility wraps {@link clubsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see clubsPersistence
 * @see clubsPersistenceImpl
 * @generated
 */
public class clubsUtil {
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
	public static void clearCache(clubs clubs) {
		getPersistence().clearCache(clubs);
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
	public static List<clubs> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<clubs> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<clubs> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static clubs update(clubs clubs) throws SystemException {
		return getPersistence().update(clubs);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static clubs update(clubs clubs, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(clubs, serviceContext);
	}

	/**
	* Caches the clubs in the entity cache if it is enabled.
	*
	* @param clubs the clubs
	*/
	public static void cacheResult(com.db.model.clubs clubs) {
		getPersistence().cacheResult(clubs);
	}

	/**
	* Caches the clubses in the entity cache if it is enabled.
	*
	* @param clubses the clubses
	*/
	public static void cacheResult(java.util.List<com.db.model.clubs> clubses) {
		getPersistence().cacheResult(clubses);
	}

	/**
	* Creates a new clubs with the primary key. Does not add the clubs to the database.
	*
	* @param cid the primary key for the new clubs
	* @return the new clubs
	*/
	public static com.db.model.clubs create(long cid) {
		return getPersistence().create(cid);
	}

	/**
	* Removes the clubs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the clubs
	* @return the clubs that was removed
	* @throws com.db.NoSuchclubsException if a clubs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.clubs remove(long cid)
		throws com.db.NoSuchclubsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(cid);
	}

	public static com.db.model.clubs updateImpl(com.db.model.clubs clubs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(clubs);
	}

	/**
	* Returns the clubs with the primary key or throws a {@link com.db.NoSuchclubsException} if it could not be found.
	*
	* @param cid the primary key of the clubs
	* @return the clubs
	* @throws com.db.NoSuchclubsException if a clubs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.clubs findByPrimaryKey(long cid)
		throws com.db.NoSuchclubsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(cid);
	}

	/**
	* Returns the clubs with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the clubs
	* @return the clubs, or <code>null</code> if a clubs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.clubs fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(cid);
	}

	/**
	* Returns all the clubses.
	*
	* @return the clubses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.clubs> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the clubses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.clubsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clubses
	* @param end the upper bound of the range of clubses (not inclusive)
	* @return the range of clubses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.clubs> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the clubses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.clubsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clubses
	* @param end the upper bound of the range of clubses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of clubses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.clubs> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the clubses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of clubses.
	*
	* @return the number of clubses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static clubsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (clubsPersistence)PortletBeanLocatorUtil.locate(com.db.service.ClpSerializer.getServletContextName(),
					clubsPersistence.class.getName());

			ReferenceRegistry.registerReference(clubsUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(clubsPersistence persistence) {
	}

	private static clubsPersistence _persistence;
}