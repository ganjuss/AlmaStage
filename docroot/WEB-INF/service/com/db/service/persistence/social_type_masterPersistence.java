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

import com.db.model.social_type_master;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the social_type_master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see social_type_masterPersistenceImpl
 * @see social_type_masterUtil
 * @generated
 */
public interface social_type_masterPersistence extends BasePersistence<social_type_master> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link social_type_masterUtil} to access the social_type_master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the social_type_master in the entity cache if it is enabled.
	*
	* @param social_type_master the social_type_master
	*/
	public void cacheResult(com.db.model.social_type_master social_type_master);

	/**
	* Caches the social_type_masters in the entity cache if it is enabled.
	*
	* @param social_type_masters the social_type_masters
	*/
	public void cacheResult(
		java.util.List<com.db.model.social_type_master> social_type_masters);

	/**
	* Creates a new social_type_master with the primary key. Does not add the social_type_master to the database.
	*
	* @param cid the primary key for the new social_type_master
	* @return the new social_type_master
	*/
	public com.db.model.social_type_master create(long cid);

	/**
	* Removes the social_type_master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the social_type_master
	* @return the social_type_master that was removed
	* @throws com.db.NoSuchsocial_type_masterException if a social_type_master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.social_type_master remove(long cid)
		throws com.db.NoSuchsocial_type_masterException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.db.model.social_type_master updateImpl(
		com.db.model.social_type_master social_type_master)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the social_type_master with the primary key or throws a {@link com.db.NoSuchsocial_type_masterException} if it could not be found.
	*
	* @param cid the primary key of the social_type_master
	* @return the social_type_master
	* @throws com.db.NoSuchsocial_type_masterException if a social_type_master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.social_type_master findByPrimaryKey(long cid)
		throws com.db.NoSuchsocial_type_masterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the social_type_master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the social_type_master
	* @return the social_type_master, or <code>null</code> if a social_type_master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.social_type_master fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the social_type_masters.
	*
	* @return the social_type_masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.social_type_master> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the social_type_masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.social_type_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of social_type_masters
	* @param end the upper bound of the range of social_type_masters (not inclusive)
	* @return the range of social_type_masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.social_type_master> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the social_type_masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.social_type_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of social_type_masters
	* @param end the upper bound of the range of social_type_masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of social_type_masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.social_type_master> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the social_type_masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of social_type_masters.
	*
	* @return the number of social_type_masters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}