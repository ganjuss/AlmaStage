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

import com.db.NoSuchtype_masterException;

import com.db.model.impl.type_masterImpl;
import com.db.model.impl.type_masterModelImpl;
import com.db.model.type_master;

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
 * The persistence implementation for the type_master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see type_masterPersistence
 * @see type_masterUtil
 * @generated
 */
public class type_masterPersistenceImpl extends BasePersistenceImpl<type_master>
	implements type_masterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link type_masterUtil} to access the type_master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = type_masterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(type_masterModelImpl.ENTITY_CACHE_ENABLED,
			type_masterModelImpl.FINDER_CACHE_ENABLED, type_masterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(type_masterModelImpl.ENTITY_CACHE_ENABLED,
			type_masterModelImpl.FINDER_CACHE_ENABLED, type_masterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(type_masterModelImpl.ENTITY_CACHE_ENABLED,
			type_masterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public type_masterPersistenceImpl() {
		setModelClass(type_master.class);
	}

	/**
	 * Caches the type_master in the entity cache if it is enabled.
	 *
	 * @param type_master the type_master
	 */
	@Override
	public void cacheResult(type_master type_master) {
		EntityCacheUtil.putResult(type_masterModelImpl.ENTITY_CACHE_ENABLED,
			type_masterImpl.class, type_master.getPrimaryKey(), type_master);

		type_master.resetOriginalValues();
	}

	/**
	 * Caches the type_masters in the entity cache if it is enabled.
	 *
	 * @param type_masters the type_masters
	 */
	@Override
	public void cacheResult(List<type_master> type_masters) {
		for (type_master type_master : type_masters) {
			if (EntityCacheUtil.getResult(
						type_masterModelImpl.ENTITY_CACHE_ENABLED,
						type_masterImpl.class, type_master.getPrimaryKey()) == null) {
				cacheResult(type_master);
			}
			else {
				type_master.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all type_masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(type_masterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(type_masterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the type_master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(type_master type_master) {
		EntityCacheUtil.removeResult(type_masterModelImpl.ENTITY_CACHE_ENABLED,
			type_masterImpl.class, type_master.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<type_master> type_masters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (type_master type_master : type_masters) {
			EntityCacheUtil.removeResult(type_masterModelImpl.ENTITY_CACHE_ENABLED,
				type_masterImpl.class, type_master.getPrimaryKey());
		}
	}

	/**
	 * Creates a new type_master with the primary key. Does not add the type_master to the database.
	 *
	 * @param cid the primary key for the new type_master
	 * @return the new type_master
	 */
	@Override
	public type_master create(long cid) {
		type_master type_master = new type_masterImpl();

		type_master.setNew(true);
		type_master.setPrimaryKey(cid);

		return type_master;
	}

	/**
	 * Removes the type_master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the type_master
	 * @return the type_master that was removed
	 * @throws com.db.NoSuchtype_masterException if a type_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public type_master remove(long cid)
		throws NoSuchtype_masterException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the type_master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the type_master
	 * @return the type_master that was removed
	 * @throws com.db.NoSuchtype_masterException if a type_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public type_master remove(Serializable primaryKey)
		throws NoSuchtype_masterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			type_master type_master = (type_master)session.get(type_masterImpl.class,
					primaryKey);

			if (type_master == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchtype_masterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(type_master);
		}
		catch (NoSuchtype_masterException nsee) {
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
	protected type_master removeImpl(type_master type_master)
		throws SystemException {
		type_master = toUnwrappedModel(type_master);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(type_master)) {
				type_master = (type_master)session.get(type_masterImpl.class,
						type_master.getPrimaryKeyObj());
			}

			if (type_master != null) {
				session.delete(type_master);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (type_master != null) {
			clearCache(type_master);
		}

		return type_master;
	}

	@Override
	public type_master updateImpl(com.db.model.type_master type_master)
		throws SystemException {
		type_master = toUnwrappedModel(type_master);

		boolean isNew = type_master.isNew();

		Session session = null;

		try {
			session = openSession();

			if (type_master.isNew()) {
				session.save(type_master);

				type_master.setNew(false);
			}
			else {
				session.merge(type_master);
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

		EntityCacheUtil.putResult(type_masterModelImpl.ENTITY_CACHE_ENABLED,
			type_masterImpl.class, type_master.getPrimaryKey(), type_master);

		return type_master;
	}

	protected type_master toUnwrappedModel(type_master type_master) {
		if (type_master instanceof type_masterImpl) {
			return type_master;
		}

		type_masterImpl type_masterImpl = new type_masterImpl();

		type_masterImpl.setNew(type_master.isNew());
		type_masterImpl.setPrimaryKey(type_master.getPrimaryKey());

		type_masterImpl.setCid(type_master.getCid());
		type_masterImpl.setName(type_master.getName());

		return type_masterImpl;
	}

	/**
	 * Returns the type_master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the type_master
	 * @return the type_master
	 * @throws com.db.NoSuchtype_masterException if a type_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public type_master findByPrimaryKey(Serializable primaryKey)
		throws NoSuchtype_masterException, SystemException {
		type_master type_master = fetchByPrimaryKey(primaryKey);

		if (type_master == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchtype_masterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return type_master;
	}

	/**
	 * Returns the type_master with the primary key or throws a {@link com.db.NoSuchtype_masterException} if it could not be found.
	 *
	 * @param cid the primary key of the type_master
	 * @return the type_master
	 * @throws com.db.NoSuchtype_masterException if a type_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public type_master findByPrimaryKey(long cid)
		throws NoSuchtype_masterException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the type_master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the type_master
	 * @return the type_master, or <code>null</code> if a type_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public type_master fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		type_master type_master = (type_master)EntityCacheUtil.getResult(type_masterModelImpl.ENTITY_CACHE_ENABLED,
				type_masterImpl.class, primaryKey);

		if (type_master == _nulltype_master) {
			return null;
		}

		if (type_master == null) {
			Session session = null;

			try {
				session = openSession();

				type_master = (type_master)session.get(type_masterImpl.class,
						primaryKey);

				if (type_master != null) {
					cacheResult(type_master);
				}
				else {
					EntityCacheUtil.putResult(type_masterModelImpl.ENTITY_CACHE_ENABLED,
						type_masterImpl.class, primaryKey, _nulltype_master);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(type_masterModelImpl.ENTITY_CACHE_ENABLED,
					type_masterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return type_master;
	}

	/**
	 * Returns the type_master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the type_master
	 * @return the type_master, or <code>null</code> if a type_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public type_master fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the type_masters.
	 *
	 * @return the type_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<type_master> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the type_masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.type_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of type_masters
	 * @param end the upper bound of the range of type_masters (not inclusive)
	 * @return the range of type_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<type_master> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the type_masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.type_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of type_masters
	 * @param end the upper bound of the range of type_masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of type_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<type_master> findAll(int start, int end,
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

		List<type_master> list = (List<type_master>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TYPE_MASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TYPE_MASTER;

				if (pagination) {
					sql = sql.concat(type_masterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<type_master>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<type_master>(list);
				}
				else {
					list = (List<type_master>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the type_masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (type_master type_master : findAll()) {
			remove(type_master);
		}
	}

	/**
	 * Returns the number of type_masters.
	 *
	 * @return the number of type_masters
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

				Query q = session.createQuery(_SQL_COUNT_TYPE_MASTER);

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
	 * Initializes the type_master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.type_master")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<type_master>> listenersList = new ArrayList<ModelListener<type_master>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<type_master>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(type_masterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TYPE_MASTER = "SELECT type_master FROM type_master type_master";
	private static final String _SQL_COUNT_TYPE_MASTER = "SELECT COUNT(type_master) FROM type_master type_master";
	private static final String _ORDER_BY_ENTITY_ALIAS = "type_master.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No type_master exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(type_masterPersistenceImpl.class);
	private static type_master _nulltype_master = new type_masterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<type_master> toCacheModel() {
				return _nulltype_masterCacheModel;
			}
		};

	private static CacheModel<type_master> _nulltype_masterCacheModel = new CacheModel<type_master>() {
			@Override
			public type_master toEntityModel() {
				return _nulltype_master;
			}
		};
}