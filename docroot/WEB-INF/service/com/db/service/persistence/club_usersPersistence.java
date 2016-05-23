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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the club_users service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see club_usersPersistenceImpl
 * @see club_usersUtil
 * @generated
 */
public interface club_usersPersistence extends BasePersistence<club_users> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link club_usersUtil} to access the club_users persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the club_users in the entity cache if it is enabled.
	*
	* @param club_users the club_users
	*/
	public void cacheResult(com.db.model.club_users club_users);

	/**
	* Caches the club_userses in the entity cache if it is enabled.
	*
	* @param club_userses the club_userses
	*/
	public void cacheResult(
		java.util.List<com.db.model.club_users> club_userses);

	/**
	* Creates a new club_users with the primary key. Does not add the club_users to the database.
	*
	* @param cid the primary key for the new club_users
	* @return the new club_users
	*/
	public com.db.model.club_users create(long cid);

	/**
	* Removes the club_users with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the club_users
	* @return the club_users that was removed
	* @throws com.db.NoSuchclub_usersException if a club_users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.club_users remove(long cid)
		throws com.db.NoSuchclub_usersException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.db.model.club_users updateImpl(
		com.db.model.club_users club_users)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the club_users with the primary key or throws a {@link com.db.NoSuchclub_usersException} if it could not be found.
	*
	* @param cid the primary key of the club_users
	* @return the club_users
	* @throws com.db.NoSuchclub_usersException if a club_users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.club_users findByPrimaryKey(long cid)
		throws com.db.NoSuchclub_usersException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the club_users with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the club_users
	* @return the club_users, or <code>null</code> if a club_users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.club_users fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the club_userses.
	*
	* @return the club_userses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.club_users> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.db.model.club_users> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.db.model.club_users> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the club_userses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of club_userses.
	*
	* @return the number of club_userses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}