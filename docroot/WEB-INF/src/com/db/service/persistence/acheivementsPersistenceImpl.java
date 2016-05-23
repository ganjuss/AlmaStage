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

import com.db.NoSuchacheivementsException;

import com.db.model.acheivements;
import com.db.model.impl.acheivementsImpl;
import com.db.model.impl.acheivementsModelImpl;

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
 * The persistence implementation for the acheivements service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see acheivementsPersistence
 * @see acheivementsUtil
 * @generated
 */
public class acheivementsPersistenceImpl extends BasePersistenceImpl<acheivements>
	implements acheivementsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link acheivementsUtil} to access the acheivements persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = acheivementsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(acheivementsModelImpl.ENTITY_CACHE_ENABLED,
			acheivementsModelImpl.FINDER_CACHE_ENABLED, acheivementsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(acheivementsModelImpl.ENTITY_CACHE_ENABLED,
			acheivementsModelImpl.FINDER_CACHE_ENABLED, acheivementsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(acheivementsModelImpl.ENTITY_CACHE_ENABLED,
			acheivementsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public acheivementsPersistenceImpl() {
		setModelClass(acheivements.class);
	}

	/**
	 * Caches the acheivements in the entity cache if it is enabled.
	 *
	 * @param acheivements the acheivements
	 */
	@Override
	public void cacheResult(acheivements acheivements) {
		EntityCacheUtil.putResult(acheivementsModelImpl.ENTITY_CACHE_ENABLED,
			acheivementsImpl.class, acheivements.getPrimaryKey(), acheivements);

		acheivements.resetOriginalValues();
	}

	/**
	 * Caches the acheivementses in the entity cache if it is enabled.
	 *
	 * @param acheivementses the acheivementses
	 */
	@Override
	public void cacheResult(List<acheivements> acheivementses) {
		for (acheivements acheivements : acheivementses) {
			if (EntityCacheUtil.getResult(
						acheivementsModelImpl.ENTITY_CACHE_ENABLED,
						acheivementsImpl.class, acheivements.getPrimaryKey()) == null) {
				cacheResult(acheivements);
			}
			else {
				acheivements.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all acheivementses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(acheivementsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(acheivementsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the acheivements.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(acheivements acheivements) {
		EntityCacheUtil.removeResult(acheivementsModelImpl.ENTITY_CACHE_ENABLED,
			acheivementsImpl.class, acheivements.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<acheivements> acheivementses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (acheivements acheivements : acheivementses) {
			EntityCacheUtil.removeResult(acheivementsModelImpl.ENTITY_CACHE_ENABLED,
				acheivementsImpl.class, acheivements.getPrimaryKey());
		}
	}

	/**
	 * Creates a new acheivements with the primary key. Does not add the acheivements to the database.
	 *
	 * @param cid the primary key for the new acheivements
	 * @return the new acheivements
	 */
	@Override
	public acheivements create(long cid) {
		acheivements acheivements = new acheivementsImpl();

		acheivements.setNew(true);
		acheivements.setPrimaryKey(cid);

		return acheivements;
	}

	/**
	 * Removes the acheivements with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the acheivements
	 * @return the acheivements that was removed
	 * @throws com.db.NoSuchacheivementsException if a acheivements with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public acheivements remove(long cid)
		throws NoSuchacheivementsException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the acheivements with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acheivements
	 * @return the acheivements that was removed
	 * @throws com.db.NoSuchacheivementsException if a acheivements with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public acheivements remove(Serializable primaryKey)
		throws NoSuchacheivementsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			acheivements acheivements = (acheivements)session.get(acheivementsImpl.class,
					primaryKey);

			if (acheivements == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchacheivementsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(acheivements);
		}
		catch (NoSuchacheivementsException nsee) {
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
	protected acheivements removeImpl(acheivements acheivements)
		throws SystemException {
		acheivements = toUnwrappedModel(acheivements);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acheivements)) {
				acheivements = (acheivements)session.get(acheivementsImpl.class,
						acheivements.getPrimaryKeyObj());
			}

			if (acheivements != null) {
				session.delete(acheivements);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (acheivements != null) {
			clearCache(acheivements);
		}

		return acheivements;
	}

	@Override
	public acheivements updateImpl(com.db.model.acheivements acheivements)
		throws SystemException {
		acheivements = toUnwrappedModel(acheivements);

		boolean isNew = acheivements.isNew();

		Session session = null;

		try {
			session = openSession();

			if (acheivements.isNew()) {
				session.save(acheivements);

				acheivements.setNew(false);
			}
			else {
				session.merge(acheivements);
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

		EntityCacheUtil.putResult(acheivementsModelImpl.ENTITY_CACHE_ENABLED,
			acheivementsImpl.class, acheivements.getPrimaryKey(), acheivements);

		return acheivements;
	}

	protected acheivements toUnwrappedModel(acheivements acheivements) {
		if (acheivements instanceof acheivementsImpl) {
			return acheivements;
		}

		acheivementsImpl acheivementsImpl = new acheivementsImpl();

		acheivementsImpl.setNew(acheivements.isNew());
		acheivementsImpl.setPrimaryKey(acheivements.getPrimaryKey());

		acheivementsImpl.setCid(acheivements.getCid());

		return acheivementsImpl;
	}

	/**
	 * Returns the acheivements with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the acheivements
	 * @return the acheivements
	 * @throws com.db.NoSuchacheivementsException if a acheivements with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public acheivements findByPrimaryKey(Serializable primaryKey)
		throws NoSuchacheivementsException, SystemException {
		acheivements acheivements = fetchByPrimaryKey(primaryKey);

		if (acheivements == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchacheivementsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return acheivements;
	}

	/**
	 * Returns the acheivements with the primary key or throws a {@link com.db.NoSuchacheivementsException} if it could not be found.
	 *
	 * @param cid the primary key of the acheivements
	 * @return the acheivements
	 * @throws com.db.NoSuchacheivementsException if a acheivements with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public acheivements findByPrimaryKey(long cid)
		throws NoSuchacheivementsException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the acheivements with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acheivements
	 * @return the acheivements, or <code>null</code> if a acheivements with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public acheivements fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		acheivements acheivements = (acheivements)EntityCacheUtil.getResult(acheivementsModelImpl.ENTITY_CACHE_ENABLED,
				acheivementsImpl.class, primaryKey);

		if (acheivements == _nullacheivements) {
			return null;
		}

		if (acheivements == null) {
			Session session = null;

			try {
				session = openSession();

				acheivements = (acheivements)session.get(acheivementsImpl.class,
						primaryKey);

				if (acheivements != null) {
					cacheResult(acheivements);
				}
				else {
					EntityCacheUtil.putResult(acheivementsModelImpl.ENTITY_CACHE_ENABLED,
						acheivementsImpl.class, primaryKey, _nullacheivements);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(acheivementsModelImpl.ENTITY_CACHE_ENABLED,
					acheivementsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return acheivements;
	}

	/**
	 * Returns the acheivements with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the acheivements
	 * @return the acheivements, or <code>null</code> if a acheivements with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public acheivements fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the acheivementses.
	 *
	 * @return the acheivementses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<acheivements> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acheivementses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.acheivementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of acheivementses
	 * @param end the upper bound of the range of acheivementses (not inclusive)
	 * @return the range of acheivementses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<acheivements> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acheivementses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.acheivementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of acheivementses
	 * @param end the upper bound of the range of acheivementses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acheivementses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<acheivements> findAll(int start, int end,
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

		List<acheivements> list = (List<acheivements>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACHEIVEMENTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACHEIVEMENTS;

				if (pagination) {
					sql = sql.concat(acheivementsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<acheivements>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<acheivements>(list);
				}
				else {
					list = (List<acheivements>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the acheivementses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (acheivements acheivements : findAll()) {
			remove(acheivements);
		}
	}

	/**
	 * Returns the number of acheivementses.
	 *
	 * @return the number of acheivementses
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

				Query q = session.createQuery(_SQL_COUNT_ACHEIVEMENTS);

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
	 * Initializes the acheivements persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.acheivements")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<acheivements>> listenersList = new ArrayList<ModelListener<acheivements>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<acheivements>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(acheivementsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ACHEIVEMENTS = "SELECT acheivements FROM acheivements acheivements";
	private static final String _SQL_COUNT_ACHEIVEMENTS = "SELECT COUNT(acheivements) FROM acheivements acheivements";
	private static final String _ORDER_BY_ENTITY_ALIAS = "acheivements.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No acheivements exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(acheivementsPersistenceImpl.class);
	private static acheivements _nullacheivements = new acheivementsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<acheivements> toCacheModel() {
				return _nullacheivementsCacheModel;
			}
		};

	private static CacheModel<acheivements> _nullacheivementsCacheModel = new CacheModel<acheivements>() {
			@Override
			public acheivements toEntityModel() {
				return _nullacheivements;
			}
		};
}