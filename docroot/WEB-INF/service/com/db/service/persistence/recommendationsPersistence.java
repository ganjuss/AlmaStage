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

import com.db.model.recommendations;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the recommendations service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see recommendationsPersistenceImpl
 * @see recommendationsUtil
 * @generated
 */
public interface recommendationsPersistence extends BasePersistence<recommendations> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link recommendationsUtil} to access the recommendations persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the recommendations in the entity cache if it is enabled.
	*
	* @param recommendations the recommendations
	*/
	public void cacheResult(com.db.model.recommendations recommendations);

	/**
	* Caches the recommendationses in the entity cache if it is enabled.
	*
	* @param recommendationses the recommendationses
	*/
	public void cacheResult(
		java.util.List<com.db.model.recommendations> recommendationses);

	/**
	* Creates a new recommendations with the primary key. Does not add the recommendations to the database.
	*
	* @param cid the primary key for the new recommendations
	* @return the new recommendations
	*/
	public com.db.model.recommendations create(long cid);

	/**
	* Removes the recommendations with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the recommendations
	* @return the recommendations that was removed
	* @throws com.db.NoSuchrecommendationsException if a recommendations with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.recommendations remove(long cid)
		throws com.db.NoSuchrecommendationsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.db.model.recommendations updateImpl(
		com.db.model.recommendations recommendations)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the recommendations with the primary key or throws a {@link com.db.NoSuchrecommendationsException} if it could not be found.
	*
	* @param cid the primary key of the recommendations
	* @return the recommendations
	* @throws com.db.NoSuchrecommendationsException if a recommendations with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.recommendations findByPrimaryKey(long cid)
		throws com.db.NoSuchrecommendationsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the recommendations with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the recommendations
	* @return the recommendations, or <code>null</code> if a recommendations with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.recommendations fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the recommendationses.
	*
	* @return the recommendationses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.recommendations> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the recommendationses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.recommendationsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of recommendationses
	* @param end the upper bound of the range of recommendationses (not inclusive)
	* @return the range of recommendationses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.recommendations> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the recommendationses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.recommendationsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of recommendationses
	* @param end the upper bound of the range of recommendationses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of recommendationses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.recommendations> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the recommendationses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of recommendationses.
	*
	* @return the number of recommendationses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}