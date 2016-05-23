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

import com.db.NoSuchcfm_masterException;

import com.db.model.cfm_master;
import com.db.model.impl.cfm_masterImpl;
import com.db.model.impl.cfm_masterModelImpl;

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
 * The persistence implementation for the cfm_master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see cfm_masterPersistence
 * @see cfm_masterUtil
 * @generated
 */
public class cfm_masterPersistenceImpl extends BasePersistenceImpl<cfm_master>
	implements cfm_masterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link cfm_masterUtil} to access the cfm_master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = cfm_masterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(cfm_masterModelImpl.ENTITY_CACHE_ENABLED,
			cfm_masterModelImpl.FINDER_CACHE_ENABLED, cfm_masterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(cfm_masterModelImpl.ENTITY_CACHE_ENABLED,
			cfm_masterModelImpl.FINDER_CACHE_ENABLED, cfm_masterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(cfm_masterModelImpl.ENTITY_CACHE_ENABLED,
			cfm_masterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public cfm_masterPersistenceImpl() {
		setModelClass(cfm_master.class);
	}

	/**
	 * Caches the cfm_master in the entity cache if it is enabled.
	 *
	 * @param cfm_master the cfm_master
	 */
	@Override
	public void cacheResult(cfm_master cfm_master) {
		EntityCacheUtil.putResult(cfm_masterModelImpl.ENTITY_CACHE_ENABLED,
			cfm_masterImpl.class, cfm_master.getPrimaryKey(), cfm_master);

		cfm_master.resetOriginalValues();
	}

	/**
	 * Caches the cfm_masters in the entity cache if it is enabled.
	 *
	 * @param cfm_masters the cfm_masters
	 */
	@Override
	public void cacheResult(List<cfm_master> cfm_masters) {
		for (cfm_master cfm_master : cfm_masters) {
			if (EntityCacheUtil.getResult(
						cfm_masterModelImpl.ENTITY_CACHE_ENABLED,
						cfm_masterImpl.class, cfm_master.getPrimaryKey()) == null) {
				cacheResult(cfm_master);
			}
			else {
				cfm_master.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cfm_masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(cfm_masterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(cfm_masterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cfm_master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(cfm_master cfm_master) {
		EntityCacheUtil.removeResult(cfm_masterModelImpl.ENTITY_CACHE_ENABLED,
			cfm_masterImpl.class, cfm_master.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<cfm_master> cfm_masters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (cfm_master cfm_master : cfm_masters) {
			EntityCacheUtil.removeResult(cfm_masterModelImpl.ENTITY_CACHE_ENABLED,
				cfm_masterImpl.class, cfm_master.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cfm_master with the primary key. Does not add the cfm_master to the database.
	 *
	 * @param cid the primary key for the new cfm_master
	 * @return the new cfm_master
	 */
	@Override
	public cfm_master create(long cid) {
		cfm_master cfm_master = new cfm_masterImpl();

		cfm_master.setNew(true);
		cfm_master.setPrimaryKey(cid);

		return cfm_master;
	}

	/**
	 * Removes the cfm_master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the cfm_master
	 * @return the cfm_master that was removed
	 * @throws com.db.NoSuchcfm_masterException if a cfm_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cfm_master remove(long cid)
		throws NoSuchcfm_masterException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the cfm_master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cfm_master
	 * @return the cfm_master that was removed
	 * @throws com.db.NoSuchcfm_masterException if a cfm_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cfm_master remove(Serializable primaryKey)
		throws NoSuchcfm_masterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			cfm_master cfm_master = (cfm_master)session.get(cfm_masterImpl.class,
					primaryKey);

			if (cfm_master == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcfm_masterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cfm_master);
		}
		catch (NoSuchcfm_masterException nsee) {
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
	protected cfm_master removeImpl(cfm_master cfm_master)
		throws SystemException {
		cfm_master = toUnwrappedModel(cfm_master);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cfm_master)) {
				cfm_master = (cfm_master)session.get(cfm_masterImpl.class,
						cfm_master.getPrimaryKeyObj());
			}

			if (cfm_master != null) {
				session.delete(cfm_master);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cfm_master != null) {
			clearCache(cfm_master);
		}

		return cfm_master;
	}

	@Override
	public cfm_master updateImpl(com.db.model.cfm_master cfm_master)
		throws SystemException {
		cfm_master = toUnwrappedModel(cfm_master);

		boolean isNew = cfm_master.isNew();

		Session session = null;

		try {
			session = openSession();

			if (cfm_master.isNew()) {
				session.save(cfm_master);

				cfm_master.setNew(false);
			}
			else {
				session.merge(cfm_master);
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

		EntityCacheUtil.putResult(cfm_masterModelImpl.ENTITY_CACHE_ENABLED,
			cfm_masterImpl.class, cfm_master.getPrimaryKey(), cfm_master);

		return cfm_master;
	}

	protected cfm_master toUnwrappedModel(cfm_master cfm_master) {
		if (cfm_master instanceof cfm_masterImpl) {
			return cfm_master;
		}

		cfm_masterImpl cfm_masterImpl = new cfm_masterImpl();

		cfm_masterImpl.setNew(cfm_master.isNew());
		cfm_masterImpl.setPrimaryKey(cfm_master.getPrimaryKey());

		cfm_masterImpl.setCid(cfm_master.getCid());
		cfm_masterImpl.setName(cfm_master.getName());

		return cfm_masterImpl;
	}

	/**
	 * Returns the cfm_master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cfm_master
	 * @return the cfm_master
	 * @throws com.db.NoSuchcfm_masterException if a cfm_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cfm_master findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcfm_masterException, SystemException {
		cfm_master cfm_master = fetchByPrimaryKey(primaryKey);

		if (cfm_master == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcfm_masterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cfm_master;
	}

	/**
	 * Returns the cfm_master with the primary key or throws a {@link com.db.NoSuchcfm_masterException} if it could not be found.
	 *
	 * @param cid the primary key of the cfm_master
	 * @return the cfm_master
	 * @throws com.db.NoSuchcfm_masterException if a cfm_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cfm_master findByPrimaryKey(long cid)
		throws NoSuchcfm_masterException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the cfm_master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cfm_master
	 * @return the cfm_master, or <code>null</code> if a cfm_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cfm_master fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		cfm_master cfm_master = (cfm_master)EntityCacheUtil.getResult(cfm_masterModelImpl.ENTITY_CACHE_ENABLED,
				cfm_masterImpl.class, primaryKey);

		if (cfm_master == _nullcfm_master) {
			return null;
		}

		if (cfm_master == null) {
			Session session = null;

			try {
				session = openSession();

				cfm_master = (cfm_master)session.get(cfm_masterImpl.class,
						primaryKey);

				if (cfm_master != null) {
					cacheResult(cfm_master);
				}
				else {
					EntityCacheUtil.putResult(cfm_masterModelImpl.ENTITY_CACHE_ENABLED,
						cfm_masterImpl.class, primaryKey, _nullcfm_master);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(cfm_masterModelImpl.ENTITY_CACHE_ENABLED,
					cfm_masterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cfm_master;
	}

	/**
	 * Returns the cfm_master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the cfm_master
	 * @return the cfm_master, or <code>null</code> if a cfm_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cfm_master fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the cfm_masters.
	 *
	 * @return the cfm_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<cfm_master> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cfm_masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.cfm_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cfm_masters
	 * @param end the upper bound of the range of cfm_masters (not inclusive)
	 * @return the range of cfm_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<cfm_master> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cfm_masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.cfm_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cfm_masters
	 * @param end the upper bound of the range of cfm_masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cfm_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<cfm_master> findAll(int start, int end,
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

		List<cfm_master> list = (List<cfm_master>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CFM_MASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CFM_MASTER;

				if (pagination) {
					sql = sql.concat(cfm_masterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<cfm_master>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<cfm_master>(list);
				}
				else {
					list = (List<cfm_master>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the cfm_masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (cfm_master cfm_master : findAll()) {
			remove(cfm_master);
		}
	}

	/**
	 * Returns the number of cfm_masters.
	 *
	 * @return the number of cfm_masters
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

				Query q = session.createQuery(_SQL_COUNT_CFM_MASTER);

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
	 * Initializes the cfm_master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.cfm_master")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<cfm_master>> listenersList = new ArrayList<ModelListener<cfm_master>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<cfm_master>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(cfm_masterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CFM_MASTER = "SELECT cfm_master FROM cfm_master cfm_master";
	private static final String _SQL_COUNT_CFM_MASTER = "SELECT COUNT(cfm_master) FROM cfm_master cfm_master";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cfm_master.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No cfm_master exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(cfm_masterPersistenceImpl.class);
	private static cfm_master _nullcfm_master = new cfm_masterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<cfm_master> toCacheModel() {
				return _nullcfm_masterCacheModel;
			}
		};

	private static CacheModel<cfm_master> _nullcfm_masterCacheModel = new CacheModel<cfm_master>() {
			@Override
			public cfm_master toEntityModel() {
				return _nullcfm_master;
			}
		};
}