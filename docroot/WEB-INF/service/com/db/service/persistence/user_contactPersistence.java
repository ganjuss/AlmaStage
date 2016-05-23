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

import com.db.model.user_contact;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the user_contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see user_contactPersistenceImpl
 * @see user_contactUtil
 * @generated
 */
public interface user_contactPersistence extends BasePersistence<user_contact> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link user_contactUtil} to access the user_contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the user_contact in the entity cache if it is enabled.
	*
	* @param user_contact the user_contact
	*/
	public void cacheResult(com.db.model.user_contact user_contact);

	/**
	* Caches the user_contacts in the entity cache if it is enabled.
	*
	* @param user_contacts the user_contacts
	*/
	public void cacheResult(
		java.util.List<com.db.model.user_contact> user_contacts);

	/**
	* Creates a new user_contact with the primary key. Does not add the user_contact to the database.
	*
	* @param cid the primary key for the new user_contact
	* @return the new user_contact
	*/
	public com.db.model.user_contact create(long cid);

	/**
	* Removes the user_contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the user_contact
	* @return the user_contact that was removed
	* @throws com.db.NoSuchuser_contactException if a user_contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.user_contact remove(long cid)
		throws com.db.NoSuchuser_contactException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.db.model.user_contact updateImpl(
		com.db.model.user_contact user_contact)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user_contact with the primary key or throws a {@link com.db.NoSuchuser_contactException} if it could not be found.
	*
	* @param cid the primary key of the user_contact
	* @return the user_contact
	* @throws com.db.NoSuchuser_contactException if a user_contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.user_contact findByPrimaryKey(long cid)
		throws com.db.NoSuchuser_contactException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user_contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the user_contact
	* @return the user_contact, or <code>null</code> if a user_contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.user_contact fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user_contacts.
	*
	* @return the user_contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.user_contact> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user_contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.user_contactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user_contacts
	* @param end the upper bound of the range of user_contacts (not inclusive)
	* @return the range of user_contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.user_contact> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user_contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.user_contactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user_contacts
	* @param end the upper bound of the range of user_contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user_contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.user_contact> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the user_contacts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user_contacts.
	*
	* @return the number of user_contacts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}