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

import com.db.NoSuchgenere_masterException;

import com.db.model.genere_master;
import com.db.model.impl.genere_masterImpl;
import com.db.model.impl.genere_masterModelImpl;

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
 * The persistence implementation for the genere_master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see genere_masterPersistence
 * @see genere_masterUtil
 * @generated
 */
public class genere_masterPersistenceImpl extends BasePersistenceImpl<genere_master>
	implements genere_masterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link genere_masterUtil} to access the genere_master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = genere_masterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(genere_masterModelImpl.ENTITY_CACHE_ENABLED,
			genere_masterModelImpl.FINDER_CACHE_ENABLED,
			genere_masterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(genere_masterModelImpl.ENTITY_CACHE_ENABLED,
			genere_masterModelImpl.FINDER_CACHE_ENABLED,
			genere_masterImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(genere_masterModelImpl.ENTITY_CACHE_ENABLED,
			genere_masterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public genere_masterPersistenceImpl() {
		setModelClass(genere_master.class);
	}

	/**
	 * Caches the genere_master in the entity cache if it is enabled.
	 *
	 * @param genere_master the genere_master
	 */
	@Override
	public void cacheResult(genere_master genere_master) {
		EntityCacheUtil.putResult(genere_masterModelImpl.ENTITY_CACHE_ENABLED,
			genere_masterImpl.class, genere_master.getPrimaryKey(),
			genere_master);

		genere_master.resetOriginalValues();
	}

	/**
	 * Caches the genere_masters in the entity cache if it is enabled.
	 *
	 * @param genere_masters the genere_masters
	 */
	@Override
	public void cacheResult(List<genere_master> genere_masters) {
		for (genere_master genere_master : genere_masters) {
			if (EntityCacheUtil.getResult(
						genere_masterModelImpl.ENTITY_CACHE_ENABLED,
						genere_masterImpl.class, genere_master.getPrimaryKey()) == null) {
				cacheResult(genere_master);
			}
			else {
				genere_master.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all genere_masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(genere_masterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(genere_masterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the genere_master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(genere_master genere_master) {
		EntityCacheUtil.removeResult(genere_masterModelImpl.ENTITY_CACHE_ENABLED,
			genere_masterImpl.class, genere_master.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<genere_master> genere_masters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (genere_master genere_master : genere_masters) {
			EntityCacheUtil.removeResult(genere_masterModelImpl.ENTITY_CACHE_ENABLED,
				genere_masterImpl.class, genere_master.getPrimaryKey());
		}
	}

	/**
	 * Creates a new genere_master with the primary key. Does not add the genere_master to the database.
	 *
	 * @param cid the primary key for the new genere_master
	 * @return the new genere_master
	 */
	@Override
	public genere_master create(long cid) {
		genere_master genere_master = new genere_masterImpl();

		genere_master.setNew(true);
		genere_master.setPrimaryKey(cid);

		return genere_master;
	}

	/**
	 * Removes the genere_master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the genere_master
	 * @return the genere_master that was removed
	 * @throws com.db.NoSuchgenere_masterException if a genere_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public genere_master remove(long cid)
		throws NoSuchgenere_masterException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the genere_master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the genere_master
	 * @return the genere_master that was removed
	 * @throws com.db.NoSuchgenere_masterException if a genere_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public genere_master remove(Serializable primaryKey)
		throws NoSuchgenere_masterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			genere_master genere_master = (genere_master)session.get(genere_masterImpl.class,
					primaryKey);

			if (genere_master == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchgenere_masterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(genere_master);
		}
		catch (NoSuchgenere_masterException nsee) {
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
	protected genere_master removeImpl(genere_master genere_master)
		throws SystemException {
		genere_master = toUnwrappedModel(genere_master);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(genere_master)) {
				genere_master = (genere_master)session.get(genere_masterImpl.class,
						genere_master.getPrimaryKeyObj());
			}

			if (genere_master != null) {
				session.delete(genere_master);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (genere_master != null) {
			clearCache(genere_master);
		}

		return genere_master;
	}

	@Override
	public genere_master updateImpl(com.db.model.genere_master genere_master)
		throws SystemException {
		genere_master = toUnwrappedModel(genere_master);

		boolean isNew = genere_master.isNew();

		Session session = null;

		try {
			session = openSession();

			if (genere_master.isNew()) {
				session.save(genere_master);

				genere_master.setNew(false);
			}
			else {
				session.merge(genere_master);
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

		EntityCacheUtil.putResult(genere_masterModelImpl.ENTITY_CACHE_ENABLED,
			genere_masterImpl.class, genere_master.getPrimaryKey(),
			genere_master);

		return genere_master;
	}

	protected genere_master toUnwrappedModel(genere_master genere_master) {
		if (genere_master instanceof genere_masterImpl) {
			return genere_master;
		}

		genere_masterImpl genere_masterImpl = new genere_masterImpl();

		genere_masterImpl.setNew(genere_master.isNew());
		genere_masterImpl.setPrimaryKey(genere_master.getPrimaryKey());

		genere_masterImpl.setCid(genere_master.getCid());
		genere_masterImpl.setName(genere_master.getName());

		return genere_masterImpl;
	}

	/**
	 * Returns the genere_master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the genere_master
	 * @return the genere_master
	 * @throws com.db.NoSuchgenere_masterException if a genere_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public genere_master findByPrimaryKey(Serializable primaryKey)
		throws NoSuchgenere_masterException, SystemException {
		genere_master genere_master = fetchByPrimaryKey(primaryKey);

		if (genere_master == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchgenere_masterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return genere_master;
	}

	/**
	 * Returns the genere_master with the primary key or throws a {@link com.db.NoSuchgenere_masterException} if it could not be found.
	 *
	 * @param cid the primary key of the genere_master
	 * @return the genere_master
	 * @throws com.db.NoSuchgenere_masterException if a genere_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public genere_master findByPrimaryKey(long cid)
		throws NoSuchgenere_masterException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the genere_master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the genere_master
	 * @return the genere_master, or <code>null</code> if a genere_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public genere_master fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		genere_master genere_master = (genere_master)EntityCacheUtil.getResult(genere_masterModelImpl.ENTITY_CACHE_ENABLED,
				genere_masterImpl.class, primaryKey);

		if (genere_master == _nullgenere_master) {
			return null;
		}

		if (genere_master == null) {
			Session session = null;

			try {
				session = openSession();

				genere_master = (genere_master)session.get(genere_masterImpl.class,
						primaryKey);

				if (genere_master != null) {
					cacheResult(genere_master);
				}
				else {
					EntityCacheUtil.putResult(genere_masterModelImpl.ENTITY_CACHE_ENABLED,
						genere_masterImpl.class, primaryKey, _nullgenere_master);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(genere_masterModelImpl.ENTITY_CACHE_ENABLED,
					genere_masterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return genere_master;
	}

	/**
	 * Returns the genere_master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the genere_master
	 * @return the genere_master, or <code>null</code> if a genere_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public genere_master fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the genere_masters.
	 *
	 * @return the genere_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<genere_master> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the genere_masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.genere_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of genere_masters
	 * @param end the upper bound of the range of genere_masters (not inclusive)
	 * @return the range of genere_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<genere_master> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the genere_masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.genere_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of genere_masters
	 * @param end the upper bound of the range of genere_masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of genere_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<genere_master> findAll(int start, int end,
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

		List<genere_master> list = (List<genere_master>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_GENERE_MASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_GENERE_MASTER;

				if (pagination) {
					sql = sql.concat(genere_masterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<genere_master>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<genere_master>(list);
				}
				else {
					list = (List<genere_master>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the genere_masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (genere_master genere_master : findAll()) {
			remove(genere_master);
		}
	}

	/**
	 * Returns the number of genere_masters.
	 *
	 * @return the number of genere_masters
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

				Query q = session.createQuery(_SQL_COUNT_GENERE_MASTER);

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
	 * Initializes the genere_master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.genere_master")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<genere_master>> listenersList = new ArrayList<ModelListener<genere_master>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<genere_master>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(genere_masterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_GENERE_MASTER = "SELECT genere_master FROM genere_master genere_master";
	private static final String _SQL_COUNT_GENERE_MASTER = "SELECT COUNT(genere_master) FROM genere_master genere_master";
	private static final String _ORDER_BY_ENTITY_ALIAS = "genere_master.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No genere_master exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(genere_masterPersistenceImpl.class);
	private static genere_master _nullgenere_master = new genere_masterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<genere_master> toCacheModel() {
				return _nullgenere_masterCacheModel;
			}
		};

	private static CacheModel<genere_master> _nullgenere_masterCacheModel = new CacheModel<genere_master>() {
			@Override
			public genere_master toEntityModel() {
				return _nullgenere_master;
			}
		};
}