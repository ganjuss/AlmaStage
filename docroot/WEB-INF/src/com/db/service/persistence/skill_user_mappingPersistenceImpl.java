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

import com.db.NoSuchskill_user_mappingException;

import com.db.model.impl.skill_user_mappingImpl;
import com.db.model.impl.skill_user_mappingModelImpl;
import com.db.model.skill_user_mapping;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the skill_user_mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see skill_user_mappingPersistence
 * @see skill_user_mappingUtil
 * @generated
 */
public class skill_user_mappingPersistenceImpl extends BasePersistenceImpl<skill_user_mapping>
	implements skill_user_mappingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link skill_user_mappingUtil} to access the skill_user_mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = skill_user_mappingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(skill_user_mappingModelImpl.ENTITY_CACHE_ENABLED,
			skill_user_mappingModelImpl.FINDER_CACHE_ENABLED,
			skill_user_mappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(skill_user_mappingModelImpl.ENTITY_CACHE_ENABLED,
			skill_user_mappingModelImpl.FINDER_CACHE_ENABLED,
			skill_user_mappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(skill_user_mappingModelImpl.ENTITY_CACHE_ENABLED,
			skill_user_mappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public skill_user_mappingPersistenceImpl() {
		setModelClass(skill_user_mapping.class);
	}

	/**
	 * Caches the skill_user_mapping in the entity cache if it is enabled.
	 *
	 * @param skill_user_mapping the skill_user_mapping
	 */
	@Override
	public void cacheResult(skill_user_mapping skill_user_mapping) {
		EntityCacheUtil.putResult(skill_user_mappingModelImpl.ENTITY_CACHE_ENABLED,
			skill_user_mappingImpl.class, skill_user_mapping.getPrimaryKey(),
			skill_user_mapping);

		skill_user_mapping.resetOriginalValues();
	}

	/**
	 * Caches the skill_user_mappings in the entity cache if it is enabled.
	 *
	 * @param skill_user_mappings the skill_user_mappings
	 */
	@Override
	public void cacheResult(List<skill_user_mapping> skill_user_mappings) {
		for (skill_user_mapping skill_user_mapping : skill_user_mappings) {
			if (EntityCacheUtil.getResult(
						skill_user_mappingModelImpl.ENTITY_CACHE_ENABLED,
						skill_user_mappingImpl.class,
						skill_user_mapping.getPrimaryKey()) == null) {
				cacheResult(skill_user_mapping);
			}
			else {
				skill_user_mapping.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all skill_user_mappings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(skill_user_mappingImpl.class.getName());
		}

		EntityCacheUtil.clearCache(skill_user_mappingImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the skill_user_mapping.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(skill_user_mapping skill_user_mapping) {
		EntityCacheUtil.removeResult(skill_user_mappingModelImpl.ENTITY_CACHE_ENABLED,
			skill_user_mappingImpl.class, skill_user_mapping.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<skill_user_mapping> skill_user_mappings) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (skill_user_mapping skill_user_mapping : skill_user_mappings) {
			EntityCacheUtil.removeResult(skill_user_mappingModelImpl.ENTITY_CACHE_ENABLED,
				skill_user_mappingImpl.class, skill_user_mapping.getPrimaryKey());
		}
	}

	/**
	 * Creates a new skill_user_mapping with the primary key. Does not add the skill_user_mapping to the database.
	 *
	 * @param cid the primary key for the new skill_user_mapping
	 * @return the new skill_user_mapping
	 */
	@Override
	public skill_user_mapping create(long cid) {
		skill_user_mapping skill_user_mapping = new skill_user_mappingImpl();

		skill_user_mapping.setNew(true);
		skill_user_mapping.setPrimaryKey(cid);

		return skill_user_mapping;
	}

	/**
	 * Removes the skill_user_mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the skill_user_mapping
	 * @return the skill_user_mapping that was removed
	 * @throws com.db.NoSuchskill_user_mappingException if a skill_user_mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public skill_user_mapping remove(long cid)
		throws NoSuchskill_user_mappingException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the skill_user_mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the skill_user_mapping
	 * @return the skill_user_mapping that was removed
	 * @throws com.db.NoSuchskill_user_mappingException if a skill_user_mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public skill_user_mapping remove(Serializable primaryKey)
		throws NoSuchskill_user_mappingException, SystemException {
		Session session = null;

		try {
			session = openSession();

			skill_user_mapping skill_user_mapping = (skill_user_mapping)session.get(skill_user_mappingImpl.class,
					primaryKey);

			if (skill_user_mapping == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchskill_user_mappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(skill_user_mapping);
		}
		catch (NoSuchskill_user_mappingException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected skill_user_mapping removeImpl(
		skill_user_mapping skill_user_mapping) throws SystemException {
		skill_user_mapping = toUnwrappedModel(skill_user_mapping);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(skill_user_mapping)) {
				skill_user_mapping = (skill_user_mapping)session.get(skill_user_mappingImpl.class,
						skill_user_mapping.getPrimaryKeyObj());
			}

			if (skill_user_mapping != null) {
				session.delete(skill_user_mapping);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (skill_user_mapping != null) {
			clearCache(skill_user_mapping);
		}

		return skill_user_mapping;
	}

	@Override
	public skill_user_mapping updateImpl(
		com.db.model.skill_user_mapping skill_user_mapping)
		throws SystemException {
		skill_user_mapping = toUnwrappedModel(skill_user_mapping);

		boolean isNew = skill_user_mapping.isNew();

		Session session = null;

		try {
			session = openSession();

			if (skill_user_mapping.isNew()) {
				session.save(skill_user_mapping);

				skill_user_mapping.setNew(false);
			}
			else {
				session.merge(skill_user_mapping);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(skill_user_mappingModelImpl.ENTITY_CACHE_ENABLED,
			skill_user_mappingImpl.class, skill_user_mapping.getPrimaryKey(),
			skill_user_mapping);

		return skill_user_mapping;
	}

	protected skill_user_mapping toUnwrappedModel(
		skill_user_mapping skill_user_mapping) {
		if (skill_user_mapping instanceof skill_user_mappingImpl) {
			return skill_user_mapping;
		}

		skill_user_mappingImpl skill_user_mappingImpl = new skill_user_mappingImpl();

		skill_user_mappingImpl.setNew(skill_user_mapping.isNew());
		skill_user_mappingImpl.setPrimaryKey(skill_user_mapping.getPrimaryKey());

		skill_user_mappingImpl.setCid(skill_user_mapping.getCid());
		skill_user_mappingImpl.setSkill_id(skill_user_mapping.getSkill_id());
		skill_user_mappingImpl.setProfile_id(skill_user_mapping.getProfile_id());
		skill_user_mappingImpl.setType_id(skill_user_mapping.getType_id());

		return skill_user_mappingImpl;
	}

	/**
	 * Returns the skill_user_mapping with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the skill_user_mapping
	 * @return the skill_user_mapping
	 * @throws com.db.NoSuchskill_user_mappingException if a skill_user_mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public skill_user_mapping findByPrimaryKey(Serializable primaryKey)
		throws NoSuchskill_user_mappingException, SystemException {
		skill_user_mapping skill_user_mapping = fetchByPrimaryKey(primaryKey);

		if (skill_user_mapping == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchskill_user_mappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return skill_user_mapping;
	}

	/**
	 * Returns the skill_user_mapping with the primary key or throws a {@link com.db.NoSuchskill_user_mappingException} if it could not be found.
	 *
	 * @param cid the primary key of the skill_user_mapping
	 * @return the skill_user_mapping
	 * @throws com.db.NoSuchskill_user_mappingException if a skill_user_mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public skill_user_mapping findByPrimaryKey(long cid)
		throws NoSuchskill_user_mappingException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the skill_user_mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the skill_user_mapping
	 * @return the skill_user_mapping, or <code>null</code> if a skill_user_mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public skill_user_mapping fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		skill_user_mapping skill_user_mapping = (skill_user_mapping)EntityCacheUtil.getResult(skill_user_mappingModelImpl.ENTITY_CACHE_ENABLED,
				skill_user_mappingImpl.class, primaryKey);

		if (skill_user_mapping == _nullskill_user_mapping) {
			return null;
		}

		if (skill_user_mapping == null) {
			Session session = null;

			try {
				session = openSession();

				skill_user_mapping = (skill_user_mapping)session.get(skill_user_mappingImpl.class,
						primaryKey);

				if (skill_user_mapping != null) {
					cacheResult(skill_user_mapping);
				}
				else {
					EntityCacheUtil.putResult(skill_user_mappingModelImpl.ENTITY_CACHE_ENABLED,
						skill_user_mappingImpl.class, primaryKey,
						_nullskill_user_mapping);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(skill_user_mappingModelImpl.ENTITY_CACHE_ENABLED,
					skill_user_mappingImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return skill_user_mapping;
	}

	/**
	 * Returns the skill_user_mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the skill_user_mapping
	 * @return the skill_user_mapping, or <code>null</code> if a skill_user_mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public skill_user_mapping fetchByPrimaryKey(long cid)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the skill_user_mappings.
	 *
	 * @return the skill_user_mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<skill_user_mapping> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<skill_user_mapping> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<skill_user_mapping> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<skill_user_mapping> list = (List<skill_user_mapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SKILL_USER_MAPPING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SKILL_USER_MAPPING;

				if (pagination) {
					sql = sql.concat(skill_user_mappingModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<skill_user_mapping>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<skill_user_mapping>(list);
				}
				else {
					list = (List<skill_user_mapping>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the skill_user_mappings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (skill_user_mapping skill_user_mapping : findAll()) {
			remove(skill_user_mapping);
		}
	}

	/**
	 * Returns the number of skill_user_mappings.
	 *
	 * @return the number of skill_user_mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SKILL_USER_MAPPING);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the skill_user_mapping persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.skill_user_mapping")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<skill_user_mapping>> listenersList = new ArrayList<ModelListener<skill_user_mapping>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<skill_user_mapping>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(skill_user_mappingImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SKILL_USER_MAPPING = "SELECT skill_user_mapping FROM skill_user_mapping skill_user_mapping";
	private static final String _SQL_COUNT_SKILL_USER_MAPPING = "SELECT COUNT(skill_user_mapping) FROM skill_user_mapping skill_user_mapping";
	private static final String _ORDER_BY_ENTITY_ALIAS = "skill_user_mapping.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No skill_user_mapping exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(skill_user_mappingPersistenceImpl.class);
	private static skill_user_mapping _nullskill_user_mapping = new skill_user_mappingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<skill_user_mapping> toCacheModel() {
				return _nullskill_user_mappingCacheModel;
			}
		};

	private static CacheModel<skill_user_mapping> _nullskill_user_mappingCacheModel =
		new CacheModel<skill_user_mapping>() {
			@Override
			public skill_user_mapping toEntityModel() {
				return _nullskill_user_mapping;
			}
		};
}