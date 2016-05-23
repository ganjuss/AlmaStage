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

import com.db.model.social_login;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the social_login service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see social_loginPersistenceImpl
 * @see social_loginUtil
 * @generated
 */
public interface social_loginPersistence extends BasePersistence<social_login> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link social_loginUtil} to access the social_login persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the social_login in the entity cache if it is enabled.
	*
	* @param social_login the social_login
	*/
	public void cacheResult(com.db.model.social_login social_login);

	/**
	* Caches the social_logins in the entity cache if it is enabled.
	*
	* @param social_logins the social_logins
	*/
	public void cacheResult(
		java.util.List<com.db.model.social_login> social_logins);

	/**
	* Creates a new social_login with the primary key. Does not add the social_login to the database.
	*
	* @param cid the primary key for the new social_login
	* @return the new social_login
	*/
	public com.db.model.social_login create(long cid);

	/**
	* Removes the social_login with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the social_login
	* @return the social_login that was removed
	* @throws com.db.NoSuchsocial_loginException if a social_login with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.social_login remove(long cid)
		throws com.db.NoSuchsocial_loginException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.db.model.social_login updateImpl(
		com.db.model.social_login social_login)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the social_login with the primary key or throws a {@link com.db.NoSuchsocial_loginException} if it could not be found.
	*
	* @param cid the primary key of the social_login
	* @return the social_login
	* @throws com.db.NoSuchsocial_loginException if a social_login with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.social_login findByPrimaryKey(long cid)
		throws com.db.NoSuchsocial_loginException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the social_login with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the social_login
	* @return the social_login, or <code>null</code> if a social_login with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.social_login fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the social_logins.
	*
	* @return the social_logins
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.social_login> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the social_logins.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.social_loginModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of social_logins
	* @param end the upper bound of the range of social_logins (not inclusive)
	* @return the range of social_logins
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.social_login> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the social_logins.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.social_loginModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of social_logins
	* @param end the upper bound of the range of social_logins (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of social_logins
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.social_login> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the social_logins from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of social_logins.
	*
	* @return the number of social_logins
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}