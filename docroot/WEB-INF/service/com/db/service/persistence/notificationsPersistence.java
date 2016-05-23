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

import com.db.model.notifications;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the notifications service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see notificationsPersistenceImpl
 * @see notificationsUtil
 * @generated
 */
public interface notificationsPersistence extends BasePersistence<notifications> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link notificationsUtil} to access the notifications persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the notifications in the entity cache if it is enabled.
	*
	* @param notifications the notifications
	*/
	public void cacheResult(com.db.model.notifications notifications);

	/**
	* Caches the notificationses in the entity cache if it is enabled.
	*
	* @param notificationses the notificationses
	*/
	public void cacheResult(
		java.util.List<com.db.model.notifications> notificationses);

	/**
	* Creates a new notifications with the primary key. Does not add the notifications to the database.
	*
	* @param cid the primary key for the new notifications
	* @return the new notifications
	*/
	public com.db.model.notifications create(long cid);

	/**
	* Removes the notifications with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the notifications
	* @return the notifications that was removed
	* @throws com.db.NoSuchnotificationsException if a notifications with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.notifications remove(long cid)
		throws com.db.NoSuchnotificationsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.db.model.notifications updateImpl(
		com.db.model.notifications notifications)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the notifications with the primary key or throws a {@link com.db.NoSuchnotificationsException} if it could not be found.
	*
	* @param cid the primary key of the notifications
	* @return the notifications
	* @throws com.db.NoSuchnotificationsException if a notifications with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.notifications findByPrimaryKey(long cid)
		throws com.db.NoSuchnotificationsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the notifications with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the notifications
	* @return the notifications, or <code>null</code> if a notifications with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.notifications fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the notificationses.
	*
	* @return the notificationses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.notifications> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the notificationses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.notificationsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notificationses
	* @param end the upper bound of the range of notificationses (not inclusive)
	* @return the range of notificationses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.notifications> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the notificationses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.notificationsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notificationses
	* @param end the upper bound of the range of notificationses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of notificationses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.notifications> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the notificationses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of notificationses.
	*
	* @return the number of notificationses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}