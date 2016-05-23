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

import com.db.model.media_links;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the media_links service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see media_linksPersistenceImpl
 * @see media_linksUtil
 * @generated
 */
public interface media_linksPersistence extends BasePersistence<media_links> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link media_linksUtil} to access the media_links persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the media_links in the entity cache if it is enabled.
	*
	* @param media_links the media_links
	*/
	public void cacheResult(com.db.model.media_links media_links);

	/**
	* Caches the media_linkses in the entity cache if it is enabled.
	*
	* @param media_linkses the media_linkses
	*/
	public void cacheResult(
		java.util.List<com.db.model.media_links> media_linkses);

	/**
	* Creates a new media_links with the primary key. Does not add the media_links to the database.
	*
	* @param cid the primary key for the new media_links
	* @return the new media_links
	*/
	public com.db.model.media_links create(long cid);

	/**
	* Removes the media_links with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the media_links
	* @return the media_links that was removed
	* @throws com.db.NoSuchmedia_linksException if a media_links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.media_links remove(long cid)
		throws com.db.NoSuchmedia_linksException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.db.model.media_links updateImpl(
		com.db.model.media_links media_links)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the media_links with the primary key or throws a {@link com.db.NoSuchmedia_linksException} if it could not be found.
	*
	* @param cid the primary key of the media_links
	* @return the media_links
	* @throws com.db.NoSuchmedia_linksException if a media_links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.media_links findByPrimaryKey(long cid)
		throws com.db.NoSuchmedia_linksException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the media_links with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the media_links
	* @return the media_links, or <code>null</code> if a media_links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.media_links fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the media_linkses.
	*
	* @return the media_linkses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.media_links> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the media_linkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.media_linksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of media_linkses
	* @param end the upper bound of the range of media_linkses (not inclusive)
	* @return the range of media_linkses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.media_links> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the media_linkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.media_linksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of media_linkses
	* @param end the upper bound of the range of media_linkses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of media_linkses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.media_links> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the media_linkses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of media_linkses.
	*
	* @return the number of media_linkses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}