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

import com.db.NoSuchskillException;

import com.db.model.impl.skillImpl;
import com.db.model.impl.skillModelImpl;
import com.db.model.skill;

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
 * The persistence implementation for the skill service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see skillPersistence
 * @see skillUtil
 * @generated
 */
public class skillPersistenceImpl extends BasePersistenceImpl<skill>
	implements skillPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link skillUtil} to access the skill persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = skillImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(skillModelImpl.ENTITY_CACHE_ENABLED,
			skillModelImpl.FINDER_CACHE_ENABLED, skillImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(skillModelImpl.ENTITY_CACHE_ENABLED,
			skillModelImpl.FINDER_CACHE_ENABLED, skillImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(skillModelImpl.ENTITY_CACHE_ENABLED,
			skillModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public skillPersistenceImpl() {
		setModelClass(skill.class);
	}

	/**
	 * Caches the skill in the entity cache if it is enabled.
	 *
	 * @param skill the skill
	 */
	@Override
	public void cacheResult(skill skill) {
		EntityCacheUtil.putResult(skillModelImpl.ENTITY_CACHE_ENABLED,
			skillImpl.class, skill.getPrimaryKey(), skill);

		skill.resetOriginalValues();
	}

	/**
	 * Caches the skills in the entity cache if it is enabled.
	 *
	 * @param skills the skills
	 */
	@Override
	public void cacheResult(List<skill> skills) {
		for (skill skill : skills) {
			if (EntityCacheUtil.getResult(skillModelImpl.ENTITY_CACHE_ENABLED,
						skillImpl.class, skill.getPrimaryKey()) == null) {
				cacheResult(skill);
			}
			else {
				skill.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all skills.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(skillImpl.class.getName());
		}

		EntityCacheUtil.clearCache(skillImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the skill.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(skill skill) {
		EntityCacheUtil.removeResult(skillModelImpl.ENTITY_CACHE_ENABLED,
			skillImpl.class, skill.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<skill> skills) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (skill skill : skills) {
			EntityCacheUtil.removeResult(skillModelImpl.ENTITY_CACHE_ENABLED,
				skillImpl.class, skill.getPrimaryKey());
		}
	}

	/**
	 * Creates a new skill with the primary key. Does not add the skill to the database.
	 *
	 * @param cid the primary key for the new skill
	 * @return the new skill
	 */
	@Override
	public skill create(long cid) {
		skill skill = new skillImpl();

		skill.setNew(true);
		skill.setPrimaryKey(cid);

		return skill;
	}

	/**
	 * Removes the skill with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the skill
	 * @return the skill that was removed
	 * @throws com.db.NoSuchskillException if a skill with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public skill remove(long cid) throws NoSuchskillException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the skill with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the skill
	 * @return the skill that was removed
	 * @throws com.db.NoSuchskillException if a skill with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public skill remove(Serializable primaryKey)
		throws NoSuchskillException, SystemException {
		Session session = null;

		try {
			session = openSession();

			skill skill = (skill)session.get(skillImpl.class, primaryKey);

			if (skill == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchskillException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(skill);
		}
		catch (NoSuchskillException nsee) {
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
	protected skill removeImpl(skill skill) throws SystemException {
		skill = toUnwrappedModel(skill);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(skill)) {
				skill = (skill)session.get(skillImpl.class,
						skill.getPrimaryKeyObj());
			}

			if (skill != null) {
				session.delete(skill);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (skill != null) {
			clearCache(skill);
		}

		return skill;
	}

	@Override
	public skill updateImpl(com.db.model.skill skill) throws SystemException {
		skill = toUnwrappedModel(skill);

		boolean isNew = skill.isNew();

		Session session = null;

		try {
			session = openSession();

			if (skill.isNew()) {
				session.save(skill);

				skill.setNew(false);
			}
			else {
				session.merge(skill);
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

		EntityCacheUtil.putResult(skillModelImpl.ENTITY_CACHE_ENABLED,
			skillImpl.class, skill.getPrimaryKey(), skill);

		return skill;
	}

	protected skill toUnwrappedModel(skill skill) {
		if (skill instanceof skillImpl) {
			return skill;
		}

		skillImpl skillImpl = new skillImpl();

		skillImpl.setNew(skill.isNew());
		skillImpl.setPrimaryKey(skill.getPrimaryKey());

		skillImpl.setCid(skill.getCid());
		skillImpl.setName(skill.getName());

		return skillImpl;
	}

	/**
	 * Returns the skill with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the skill
	 * @return the skill
	 * @throws com.db.NoSuchskillException if a skill with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public skill findByPrimaryKey(Serializable primaryKey)
		throws NoSuchskillException, SystemException {
		skill skill = fetchByPrimaryKey(primaryKey);

		if (skill == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchskillException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return skill;
	}

	/**
	 * Returns the skill with the primary key or throws a {@link com.db.NoSuchskillException} if it could not be found.
	 *
	 * @param cid the primary key of the skill
	 * @return the skill
	 * @throws com.db.NoSuchskillException if a skill with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public skill findByPrimaryKey(long cid)
		throws NoSuchskillException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the skill with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the skill
	 * @return the skill, or <code>null</code> if a skill with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public skill fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		skill skill = (skill)EntityCacheUtil.getResult(skillModelImpl.ENTITY_CACHE_ENABLED,
				skillImpl.class, primaryKey);

		if (skill == _nullskill) {
			return null;
		}

		if (skill == null) {
			Session session = null;

			try {
				session = openSession();

				skill = (skill)session.get(skillImpl.class, primaryKey);

				if (skill != null) {
					cacheResult(skill);
				}
				else {
					EntityCacheUtil.putResult(skillModelImpl.ENTITY_CACHE_ENABLED,
						skillImpl.class, primaryKey, _nullskill);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(skillModelImpl.ENTITY_CACHE_ENABLED,
					skillImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return skill;
	}

	/**
	 * Returns the skill with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the skill
	 * @return the skill, or <code>null</code> if a skill with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public skill fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the skills.
	 *
	 * @return the skills
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<skill> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the skills.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.skillModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of skills
	 * @param end the upper bound of the range of skills (not inclusive)
	 * @return the range of skills
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<skill> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the skills.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.skillModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of skills
	 * @param end the upper bound of the range of skills (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of skills
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<skill> findAll(int start, int end,
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

		List<skill> list = (List<skill>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SKILL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SKILL;

				if (pagination) {
					sql = sql.concat(skillModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<skill>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<skill>(list);
				}
				else {
					list = (List<skill>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the skills from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (skill skill : findAll()) {
			remove(skill);
		}
	}

	/**
	 * Returns the number of skills.
	 *
	 * @return the number of skills
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

				Query q = session.createQuery(_SQL_COUNT_SKILL);

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
	 * Initializes the skill persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.skill")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<skill>> listenersList = new ArrayList<ModelListener<skill>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<skill>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(skillImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SKILL = "SELECT skill FROM skill skill";
	private static final String _SQL_COUNT_SKILL = "SELECT COUNT(skill) FROM skill skill";
	private static final String _ORDER_BY_ENTITY_ALIAS = "skill.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No skill exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(skillPersistenceImpl.class);
	private static skill _nullskill = new skillImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<skill> toCacheModel() {
				return _nullskillCacheModel;
			}
		};

	private static CacheModel<skill> _nullskillCacheModel = new CacheModel<skill>() {
			@Override
			public skill toEntityModel() {
				return _nullskill;
			}
		};
}