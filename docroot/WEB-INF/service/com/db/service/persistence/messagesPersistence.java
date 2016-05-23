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

import com.db.model.messages;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the messages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see messagesPersistenceImpl
 * @see messagesUtil
 * @generated
 */
public interface messagesPersistence extends BasePersistence<messages> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link messagesUtil} to access the messages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the messages in the entity cache if it is enabled.
	*
	* @param messages the messages
	*/
	public void cacheResult(com.db.model.messages messages);

	/**
	* Caches the messageses in the entity cache if it is enabled.
	*
	* @param messageses the messageses
	*/
	public void cacheResult(java.util.List<com.db.model.messages> messageses);

	/**
	* Creates a new messages with the primary key. Does not add the messages to the database.
	*
	* @param cid the primary key for the new messages
	* @return the new messages
	*/
	public com.db.model.messages create(long cid);

	/**
	* Removes the messages with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the messages
	* @return the messages that was removed
	* @throws com.db.NoSuchmessagesException if a messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.messages remove(long cid)
		throws com.db.NoSuchmessagesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.db.model.messages updateImpl(com.db.model.messages messages)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the messages with the primary key or throws a {@link com.db.NoSuchmessagesException} if it could not be found.
	*
	* @param cid the primary key of the messages
	* @return the messages
	* @throws com.db.NoSuchmessagesException if a messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.messages findByPrimaryKey(long cid)
		throws com.db.NoSuchmessagesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the messages with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the messages
	* @return the messages, or <code>null</code> if a messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.messages fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the messageses.
	*
	* @return the messageses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.messages> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the messageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.messagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of messageses
	* @param end the upper bound of the range of messageses (not inclusive)
	* @return the range of messageses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.messages> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the messageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.messagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of messageses
	* @param end the upper bound of the range of messageses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of messageses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.messages> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the messageses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of messageses.
	*
	* @return the number of messageses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}