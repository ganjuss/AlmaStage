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

import com.db.model.genere_master;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the genere_master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see genere_masterPersistenceImpl
 * @see genere_masterUtil
 * @generated
 */
public interface genere_masterPersistence extends BasePersistence<genere_master> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link genere_masterUtil} to access the genere_master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the genere_master in the entity cache if it is enabled.
	*
	* @param genere_master the genere_master
	*/
	public void cacheResult(com.db.model.genere_master genere_master);

	/**
	* Caches the genere_masters in the entity cache if it is enabled.
	*
	* @param genere_masters the genere_masters
	*/
	public void cacheResult(
		java.util.List<com.db.model.genere_master> genere_masters);

	/**
	* Creates a new genere_master with the primary key. Does not add the genere_master to the database.
	*
	* @param cid the primary key for the new genere_master
	* @return the new genere_master
	*/
	public com.db.model.genere_master create(long cid);

	/**
	* Removes the genere_master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the genere_master
	* @return the genere_master that was removed
	* @throws com.db.NoSuchgenere_masterException if a genere_master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.genere_master remove(long cid)
		throws com.db.NoSuchgenere_masterException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.db.model.genere_master updateImpl(
		com.db.model.genere_master genere_master)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the genere_master with the primary key or throws a {@link com.db.NoSuchgenere_masterException} if it could not be found.
	*
	* @param cid the primary key of the genere_master
	* @return the genere_master
	* @throws com.db.NoSuchgenere_masterException if a genere_master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.genere_master findByPrimaryKey(long cid)
		throws com.db.NoSuchgenere_masterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the genere_master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the genere_master
	* @return the genere_master, or <code>null</code> if a genere_master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.genere_master fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the genere_masters.
	*
	* @return the genere_masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.genere_master> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the genere_masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.genere_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of genere_masters
	* @param end the upper bound of the range of genere_masters (not inclusive)
	* @return the range of genere_masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.genere_master> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the genere_masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.genere_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of genere_masters
	* @param end the upper bound of the range of genere_masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of genere_masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.genere_master> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the genere_masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of genere_masters.
	*
	* @return the number of genere_masters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}