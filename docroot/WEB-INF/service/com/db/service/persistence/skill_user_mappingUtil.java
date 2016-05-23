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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the skill_user_mapping service. This utility wraps {@link skill_user_mappingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see skill_user_mappingPersistence
 * @see skill_user_mappingPersistenceImpl
 * @generated
 */
public class skill_user_mappingUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(skill_user_mapping skill_user_mapping) {
		getPersistence().clearCache(skill_user_mapping);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<skill_user_mapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<skill_user_mapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<skill_user_mapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static skill_user_mapping update(
		skill_user_mapping skill_user_mapping) throws SystemException {
		return getPersistence().update(skill_user_mapping);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static skill_user_mapping update(
		skill_user_mapping skill_user_mapping, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(skill_user_mapping, serviceContext);
	}

	/**
	* Caches the skill_user_mapping in the entity cache if it is enabled.
	*
	* @param skill_user_mapping the skill_user_mapping
	*/
	public static void cacheResult(
		com.db.model.skill_user_mapping skill_user_mapping) {
		getPersistence().cacheResult(skill_user_mapping);
	}

	/**
	* Caches the skill_user_mappings in the entity cache if it is enabled.
	*
	* @param skill_user_mappings the skill_user_mappings
	*/
	public static void cacheResult(
		java.util.List<com.db.model.skill_user_mapping> skill_user_mappings) {
		getPersistence().cacheResult(skill_user_mappings);
	}

	/**
	* Creates a new skill_user_mapping with the primary key. Does not add the skill_user_mapping to the database.
	*
	* @param cid the primary key for the new skill_user_mapping
	* @return the new skill_user_mapping
	*/
	public static com.db.model.skill_user_mapping create(long cid) {
		return getPersistence().create(cid);
	}

	/**
	* Removes the skill_user_mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the skill_user_mapping
	* @return the skill_user_mapping that was removed
	* @throws com.db.NoSuchskill_user_mappingException if a skill_user_mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.skill_user_mapping remove(long cid)
		throws com.db.NoSuchskill_user_mappingException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(cid);
	}

	public static com.db.model.skill_user_mapping updateImpl(
		com.db.model.skill_user_mapping skill_user_mapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(skill_user_mapping);
	}

	/**
	* Returns the skill_user_mapping with the primary key or throws a {@link com.db.NoSuchskill_user_mappingException} if it could not be found.
	*
	* @param cid the primary key of the skill_user_mapping
	* @return the skill_user_mapping
	* @throws com.db.NoSuchskill_user_mappingException if a skill_user_mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.skill_user_mapping findByPrimaryKey(long cid)
		throws com.db.NoSuchskill_user_mappingException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(cid);
	}

	/**
	* Returns the skill_user_mapping with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cid the primary key of the skill_user_mapping
	* @return the skill_user_mapping, or <code>null</code> if a skill_user_mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.skill_user_mapping fetchByPrimaryKey(long cid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(cid);
	}

	/**
	* Returns all the skill_user_mappings.
	*
	* @return the skill_user_mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.skill_user_mapping> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.db.model.skill_user_mapping> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.db.model.skill_user_mapping> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the skill_user_mappings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of skill_user_mappings.
	*
	* @return the number of skill_user_mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static skill_user_mappingPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (skill_user_mappingPersistence)PortletBeanLocatorUtil.locate(com.db.service.ClpSerializer.getServletContextName(),
					skill_user_mappingPersistence.class.getName());

			ReferenceRegistry.registerReference(skill_user_mappingUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(skill_user_mappingPersistence persistence) {
	}

	private static skill_user_mappingPersistence _persistence;
}