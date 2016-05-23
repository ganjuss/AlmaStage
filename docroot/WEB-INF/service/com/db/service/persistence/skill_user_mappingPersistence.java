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

import com.db.model.skill_user_mapping;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the skill_user_mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see skill_user_mappingPersistenceImpl
 * @see skill_user_mappingUtil
 * @generated
 */
public interface skill_user_mappingPersistence extends BasePersistence<skill_user_mapping> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link skill_user_mappingUtil} to access the skill_user_mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the skill_user_mapping in the entity cache if it is enabled.
	*
	* @param skill_user_mapping the skill_user_mapping
	*/
	public void cacheResult(com.db.model.skill_user_mapping skill_user_mapping);

	/**
	* Caches the skill_user_mappings in the entity cache if it is enabled.
	*
	* @param skill_user_mappings the skill_user_mappings
	*/
	public void cacheResult(
		java.util.List<com.db.model.skill_user_mapping> skill_user_mappings);

	/**
	* Creates a new skill_user_mapping with the primary key. Does not add the skill_user_mapping to the database.
	*
	* @param cid the primary key for the new skill_user_mapping
	* @return the new skill_user_mapping
	*/
	public com.db.model.skill_user_mapping create(long cid);

	/**
	* Removes the skill_user_mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the skill_user_mapping
	* @return the skill_user_mapping that was removed
	* @throws com.db.NoSuchskill_user_mappingException if a skill_user_mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.skill_user_mapping remove(long cid)
		throws com.db.NoSuchskill_user_mappingException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.db.model.skill_user_mapping updateImpl(
		com.db.model.skill_user_mapping skill_user_mapping)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the skill_user_mapping with the primary key or throws a {@link com.db.NoSuchskill_user_mappingException} if it could not be found.
	*
	* @param cid the primary key of the skill_user_mapping
	* @return the skill_user_mapping
	* @throws com.db.NoSuchskill_user_mappingException if a skill_user_mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.skill_user_mapping findByPrimaryKey(long cid)
		throws com.db.NoSuchskill_user_mappingException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the skill_user_mapping with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the skill_user_mapping
	* @return the skill_user_mapping, or <code>null</code> if a skill_user_mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.db.model.skill_user_mapping fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the skill_user_mappings.
	*
	* @return the skill_user_mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.skill_user_mapping> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the skill_user_mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.skill_user_mappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of skill_user_mappings
	* @param end the upper bound of the range of skill_user_mappings (not inclusive)
	* @return the range of skill_user_mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.skill_user_mapping> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the skill_user_mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.skill_user_mappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of skill_user_mappings
	* @param end the upper bound of the range of skill_user_mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of skill_user_mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.db.model.skill_user_mapping> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the skill_user_mappings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of skill_user_mappings.
	*
	* @return the number of skill_user_mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}