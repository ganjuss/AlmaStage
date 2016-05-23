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

import com.db.model.acheivements;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the acheivements service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see acheivementsPersistenceImpl
 * @see acheivementsUtil
 * @generated
 */
public interface acheivementsPersistence extends BasePersistence<acheivements> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link acheivementsUtil} to access the acheivements persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the acheivements in the entity cache if it is enabled.
	*
	* @param acheivements the acheivements
	*/
	public void cacheResult(com.db.model.acheivements acheivements);

	/**
	* Caches the acheivementses in the entity cache if it is enabled.
	*
	* @param acheivementses the acheivementses
	*/
	public void cacheResult(
		java.util.List<com.db.model.acheivements> acheivementses);

	/**
	* Creates a new acheivements with the primary key. Does not add the acheivements to the database.
	*
	* @param cid the primary key for the new acheivements
	* @return the new acheivements
	*/
	public com.db.model.acheivements create(long cid);

	/**
	* Removes the acheivements with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the acheivements
	* @return the acheivements that was removed
	* @throws com.db.NoSuchacheivementsException if a acheivements with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.acheivements remove(long cid)
		throws com.db.NoSuchacheivementsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.db.model.acheivements updateImpl(
		com.db.model.acheivements acheivements)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the acheivements with the primary key or throws a {@link com.db.NoSuchacheivementsException} if it could not be found.
	*
	* @param cid the primary key of the acheivements
	* @return the acheivements
	* @throws com.db.NoSuchacheivementsException if a acheivements with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.acheivements findByPrimaryKey(long cid)
		throws com.db.NoSuchacheivementsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the acheivements with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the acheivements
	* @return the acheivements, or <code>null</code> if a acheivements with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.acheivements fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the acheivementses.
	*
	* @return the acheivementses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.acheivements> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the acheivementses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.acheivementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of acheivementses
	* @param end the upper bound of the range of acheivementses (not inclusive)
	* @return the range of acheivementses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.acheivements> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the acheivementses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.acheivementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of acheivementses
	* @param end the upper bound of the range of acheivementses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of acheivementses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.acheivements> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the acheivementses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of acheivementses.
	*
	* @return the number of acheivementses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}