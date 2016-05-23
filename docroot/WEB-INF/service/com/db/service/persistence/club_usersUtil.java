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

import com.db.model.club_users;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the club_users service. This utility wraps {@link club_usersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see club_usersPersistence
 * @see club_usersPersistenceImpl
 * @generated
 */
public class club_usersUtil {
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
	public static void clearCache(club_users club_users) {
		getPersistence().clearCache(club_users);
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
	public static List<club_users> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<club_users> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<club_users> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static club_users update(club_users club_users)
		throws SystemException {
		return getPersistence().update(club_users);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static club_users update(club_users club_users,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(club_users, serviceContext);
	}

	/**
	* Caches the club_users in the entity cache if it is enabled.
	*
	* @param club_users the club_users
	*/
	public static void cacheResult(com.db.model.club_users club_users) {
		getPersistence().cacheResult(club_users);
	}

	/**
	* Caches the club_userses in the entity cache if it is enabled.
	*
	* @param club_userses the club_userses
	*/
	public static void cacheResult(
		java.util.List<com.db.model.club_users> club_userses) {
		getPersistence().cacheResult(club_userses);
	}

	/**
	* Creates a new club_users with the primary key. Does not add the club_users to the database.
	*
	* @param cid the primary key for the new club_users
	* @return the new club_users
	*/
	public static com.db.model.club_users create(long cid) {
		return getPersistence().create(cid);
	}

	/**
	* Removes the club_users with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the club_users
	* @return the club_users that was removed
	* @throws com.db.NoSuchclub_usersException if a club_users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.club_users remove(long cid)
		throws com.db.NoSuchclub_usersException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(cid);
	}

	public static com.db.model.club_users updateImpl(
		com.db.model.club_users club_users)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(club_users);
	}

	/**
	* Returns the club_users with the primary key or throws a {@link com.db.NoSuchclub_usersException} if it could not be found.
	*
	* @param cid the primary key of the club_users
	* @return the club_users
	* @throws com.db.NoSuchclub_usersException if a club_users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.club_users findByPrimaryKey(long cid)
		throws com.db.NoSuchclub_usersException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(cid);
	}

	/**
	* Returns the club_users with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the club_users
	* @return the club_users, or <code>null</code> if a club_users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.club_users fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(cid);
	}

	/**
	* Returns all the club_userses.
	*
	* @return the club_userses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.club_users> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the club_userses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.club_usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of club_userses
	* @param end the upper bound of the range of club_userses (not inclusive)
	* @return the range of club_userses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.club_users> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the club_userses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.club_usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of club_userses
	* @param end the upper bound of the range of club_userses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of club_userses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.club_users> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the club_userses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of club_userses.
	*
	* @return the number of club_userses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static club_usersPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (club_usersPersistence)PortletBeanLocatorUtil.locate(com.db.service.ClpSerializer.getServletContextName(),
					club_usersPersistence.class.getName());

			ReferenceRegistry.registerReference(club_usersUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(club_usersPersistence persistence) {
	}

	private static club_usersPersistence _persistence;
}