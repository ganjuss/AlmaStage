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

import com.db.model.about_us;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the about_us service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see about_usPersistenceImpl
 * @see about_usUtil
 * @generated
 */
public interface about_usPersistence extends BasePersistence<about_us> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link about_usUtil} to access the about_us persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the about_us in the entity cache if it is enabled.
	*
	* @param about_us the about_us
	*/
	public void cacheResult(com.db.model.about_us about_us);

	/**
	* Caches the about_uses in the entity cache if it is enabled.
	*
	* @param about_uses the about_uses
	*/
	public void cacheResult(java.util.List<com.db.model.about_us> about_uses);

	/**
	* Creates a new about_us with the primary key. Does not add the about_us to the database.
	*
	* @param cid the primary key for the new about_us
	* @return the new about_us
	*/
	public com.db.model.about_us create(long cid);

	/**
	* Removes the about_us with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the about_us
	* @return the about_us that was removed
	* @throws com.db.NoSuchabout_usException if a about_us with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.about_us remove(long cid)
		throws com.db.NoSuchabout_usException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.db.model.about_us updateImpl(com.db.model.about_us about_us)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the about_us with the primary key or throws a {@link com.db.NoSuchabout_usException} if it could not be found.
	*
	* @param cid the primary key of the about_us
	* @return the about_us
	* @throws com.db.NoSuchabout_usException if a about_us with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.about_us findByPrimaryKey(long cid)
		throws com.db.NoSuchabout_usException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the about_us with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the about_us
	* @return the about_us, or <code>null</code> if a about_us with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.about_us fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the about_uses.
	*
	* @return the about_uses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.about_us> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the about_uses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.about_usModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of about_uses
	* @param end the upper bound of the range of about_uses (not inclusive)
	* @return the range of about_uses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.about_us> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the about_uses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.about_usModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of about_uses
	* @param end the upper bound of the range of about_uses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of about_uses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.about_us> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the about_uses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of about_uses.
	*
	* @return the number of about_uses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}