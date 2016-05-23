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

import com.db.NoSuchhit_countException;

import com.db.model.hit_count;
import com.db.model.impl.hit_countImpl;
import com.db.model.impl.hit_countModelImpl;

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
 * The persistence implementation for the hit_count service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see hit_countPersistence
 * @see hit_countUtil
 * @generated
 */
public class hit_countPersistenceImpl extends BasePersistenceImpl<hit_count>
	implements hit_countPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link hit_countUtil} to access the hit_count persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = hit_countImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(hit_countModelImpl.ENTITY_CACHE_ENABLED,
			hit_countModelImpl.FINDER_CACHE_ENABLED, hit_countImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(hit_countModelImpl.ENTITY_CACHE_ENABLED,
			hit_countModelImpl.FINDER_CACHE_ENABLED, hit_countImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(hit_countModelImpl.ENTITY_CACHE_ENABLED,
			hit_countModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public hit_countPersistenceImpl() {
		setModelClass(hit_count.class);
	}

	/**
	 * Caches the hit_count in the entity cache if it is enabled.
	 *
	 * @param hit_count the hit_count
	 */
	@Override
	public void cacheResult(hit_count hit_count) {
		EntityCacheUtil.putResult(hit_countModelImpl.ENTITY_CACHE_ENABLED,
			hit_countImpl.class, hit_count.getPrimaryKey(), hit_count);

		hit_count.resetOriginalValues();
	}

	/**
	 * Caches the hit_counts in the entity cache if it is enabled.
	 *
	 * @param hit_counts the hit_counts
	 */
	@Override
	public void cacheResult(List<hit_count> hit_counts) {
		for (hit_count hit_count : hit_counts) {
			if (EntityCacheUtil.getResult(
						hit_countModelImpl.ENTITY_CACHE_ENABLED,
						hit_countImpl.class, hit_count.getPrimaryKey()) == null) {
				cacheResult(hit_count);
			}
			else {
				hit_count.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all hit_counts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(hit_countImpl.class.getName());
		}

		EntityCacheUtil.clearCache(hit_countImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the hit_count.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(hit_count hit_count) {
		EntityCacheUtil.removeResult(hit_countModelImpl.ENTITY_CACHE_ENABLED,
			hit_countImpl.class, hit_count.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<hit_count> hit_counts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (hit_count hit_count : hit_counts) {
			EntityCacheUtil.removeResult(hit_countModelImpl.ENTITY_CACHE_ENABLED,
				hit_countImpl.class, hit_count.getPrimaryKey());
		}
	}

	/**
	 * Creates a new hit_count with the primary key. Does not add the hit_count to the database.
	 *
	 * @param cid the primary key for the new hit_count
	 * @return the new hit_count
	 */
	@Override
	public hit_count create(long cid) {
		hit_count hit_count = new hit_countImpl();

		hit_count.setNew(true);
		hit_count.setPrimaryKey(cid);

		return hit_count;
	}

	/**
	 * Removes the hit_count with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the hit_count
	 * @return the hit_count that was removed
	 * @throws com.db.NoSuchhit_countException if a hit_count with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public hit_count remove(long cid)
		throws NoSuchhit_countException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the hit_count with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hit_count
	 * @return the hit_count that was removed
	 * @throws com.db.NoSuchhit_countException if a hit_count with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public hit_count remove(Serializable primaryKey)
		throws NoSuchhit_countException, SystemException {
		Session session = null;

		try {
			session = openSession();

			hit_count hit_count = (hit_count)session.get(hit_countImpl.class,
					primaryKey);

			if (hit_count == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchhit_countException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(hit_count);
		}
		catch (NoSuchhit_countException nsee) {
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
	protected hit_count removeImpl(hit_count hit_count)
		throws SystemException {
		hit_count = toUnwrappedModel(hit_count);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hit_count)) {
				hit_count = (hit_count)session.get(hit_countImpl.class,
						hit_count.getPrimaryKeyObj());
			}

			if (hit_count != null) {
				session.delete(hit_count);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (hit_count != null) {
			clearCache(hit_count);
		}

		return hit_count;
	}

	@Override
	public hit_count updateImpl(com.db.model.hit_count hit_count)
		throws SystemException {
		hit_count = toUnwrappedModel(hit_count);

		boolean isNew = hit_count.isNew();

		Session session = null;

		try {
			session = openSession();

			if (hit_count.isNew()) {
				session.save(hit_count);

				hit_count.setNew(false);
			}
			else {
				session.merge(hit_count);
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

		EntityCacheUtil.putResult(hit_countModelImpl.ENTITY_CACHE_ENABLED,
			hit_countImpl.class, hit_count.getPrimaryKey(), hit_count);

		return hit_count;
	}

	protected hit_count toUnwrappedModel(hit_count hit_count) {
		if (hit_count instanceof hit_countImpl) {
			return hit_count;
		}

		hit_countImpl hit_countImpl = new hit_countImpl();

		hit_countImpl.setNew(hit_count.isNew());
		hit_countImpl.setPrimaryKey(hit_count.getPrimaryKey());

		hit_countImpl.setCid(hit_count.getCid());
		hit_countImpl.setProfile_id(hit_count.getProfile_id());
		hit_countImpl.setUser_id(hit_count.getUser_id());
		hit_countImpl.setCounter(hit_count.getCounter());
		hit_countImpl.setHighfive(hit_count.getHighfive());

		return hit_countImpl;
	}

	/**
	 * Returns the hit_count with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the hit_count
	 * @return the hit_count
	 * @throws com.db.NoSuchhit_countException if a hit_count with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public hit_count findByPrimaryKey(Serializable primaryKey)
		throws NoSuchhit_countException, SystemException {
		hit_count hit_count = fetchByPrimaryKey(primaryKey);

		if (hit_count == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchhit_countException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return hit_count;
	}

	/**
	 * Returns the hit_count with the primary key or throws a {@link com.db.NoSuchhit_countException} if it could not be found.
	 *
	 * @param cid the primary key of the hit_count
	 * @return the hit_count
	 * @throws com.db.NoSuchhit_countException if a hit_count with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public hit_count findByPrimaryKey(long cid)
		throws NoSuchhit_countException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the hit_count with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hit_count
	 * @return the hit_count, or <code>null</code> if a hit_count with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public hit_count fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		hit_count hit_count = (hit_count)EntityCacheUtil.getResult(hit_countModelImpl.ENTITY_CACHE_ENABLED,
				hit_countImpl.class, primaryKey);

		if (hit_count == _nullhit_count) {
			return null;
		}

		if (hit_count == null) {
			Session session = null;

			try {
				session = openSession();

				hit_count = (hit_count)session.get(hit_countImpl.class,
						primaryKey);

				if (hit_count != null) {
					cacheResult(hit_count);
				}
				else {
					EntityCacheUtil.putResult(hit_countModelImpl.ENTITY_CACHE_ENABLED,
						hit_countImpl.class, primaryKey, _nullhit_count);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(hit_countModelImpl.ENTITY_CACHE_ENABLED,
					hit_countImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return hit_count;
	}

	/**
	 * Returns the hit_count with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the hit_count
	 * @return the hit_count, or <code>null</code> if a hit_count with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public hit_count fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the hit_counts.
	 *
	 * @return the hit_counts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<hit_count> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hit_counts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.hit_countModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of hit_counts
	 * @param end the upper bound of the range of hit_counts (not inclusive)
	 * @return the range of hit_counts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<hit_count> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the hit_counts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.hit_countModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of hit_counts
	 * @param end the upper bound of the range of hit_counts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hit_counts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<hit_count> findAll(int start, int end,
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

		List<hit_count> list = (List<hit_count>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_HIT_COUNT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HIT_COUNT;

				if (pagination) {
					sql = sql.concat(hit_countModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<hit_count>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<hit_count>(list);
				}
				else {
					list = (List<hit_count>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the hit_counts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (hit_count hit_count : findAll()) {
			remove(hit_count);
		}
	}

	/**
	 * Returns the number of hit_counts.
	 *
	 * @return the number of hit_counts
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

				Query q = session.createQuery(_SQL_COUNT_HIT_COUNT);

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
	 * Initializes the hit_count persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.hit_count")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<hit_count>> listenersList = new ArrayList<ModelListener<hit_count>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<hit_count>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(hit_countImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_HIT_COUNT = "SELECT hit_count FROM hit_count hit_count";
	private static final String _SQL_COUNT_HIT_COUNT = "SELECT COUNT(hit_count) FROM hit_count hit_count";
	private static final String _ORDER_BY_ENTITY_ALIAS = "hit_count.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No hit_count exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(hit_countPersistenceImpl.class);
	private static hit_count _nullhit_count = new hit_countImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<hit_count> toCacheModel() {
				return _nullhit_countCacheModel;
			}
		};

	private static CacheModel<hit_count> _nullhit_countCacheModel = new CacheModel<hit_count>() {
			@Override
			public hit_count toEntityModel() {
				return _nullhit_count;
			}
		};
}