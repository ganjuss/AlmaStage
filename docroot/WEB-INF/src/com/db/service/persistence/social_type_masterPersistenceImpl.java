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

import com.db.NoSuchsocial_type_masterException;

import com.db.model.impl.social_type_masterImpl;
import com.db.model.impl.social_type_masterModelImpl;
import com.db.model.social_type_master;

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
 * The persistence implementation for the social_type_master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see social_type_masterPersistence
 * @see social_type_masterUtil
 * @generated
 */
public class social_type_masterPersistenceImpl extends BasePersistenceImpl<social_type_master>
	implements social_type_masterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link social_type_masterUtil} to access the social_type_master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = social_type_masterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(social_type_masterModelImpl.ENTITY_CACHE_ENABLED,
			social_type_masterModelImpl.FINDER_CACHE_ENABLED,
			social_type_masterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(social_type_masterModelImpl.ENTITY_CACHE_ENABLED,
			social_type_masterModelImpl.FINDER_CACHE_ENABLED,
			social_type_masterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(social_type_masterModelImpl.ENTITY_CACHE_ENABLED,
			social_type_masterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public social_type_masterPersistenceImpl() {
		setModelClass(social_type_master.class);
	}

	/**
	 * Caches the social_type_master in the entity cache if it is enabled.
	 *
	 * @param social_type_master the social_type_master
	 */
	@Override
	public void cacheResult(social_type_master social_type_master) {
		EntityCacheUtil.putResult(social_type_masterModelImpl.ENTITY_CACHE_ENABLED,
			social_type_masterImpl.class, social_type_master.getPrimaryKey(),
			social_type_master);

		social_type_master.resetOriginalValues();
	}

	/**
	 * Caches the social_type_masters in the entity cache if it is enabled.
	 *
	 * @param social_type_masters the social_type_masters
	 */
	@Override
	public void cacheResult(List<social_type_master> social_type_masters) {
		for (social_type_master social_type_master : social_type_masters) {
			if (EntityCacheUtil.getResult(
						social_type_masterModelImpl.ENTITY_CACHE_ENABLED,
						social_type_masterImpl.class,
						social_type_master.getPrimaryKey()) == null) {
				cacheResult(social_type_master);
			}
			else {
				social_type_master.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all social_type_masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(social_type_masterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(social_type_masterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the social_type_master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(social_type_master social_type_master) {
		EntityCacheUtil.removeResult(social_type_masterModelImpl.ENTITY_CACHE_ENABLED,
			social_type_masterImpl.class, social_type_master.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<social_type_master> social_type_masters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (social_type_master social_type_master : social_type_masters) {
			EntityCacheUtil.removeResult(social_type_masterModelImpl.ENTITY_CACHE_ENABLED,
				social_type_masterImpl.class, social_type_master.getPrimaryKey());
		}
	}

	/**
	 * Creates a new social_type_master with the primary key. Does not add the social_type_master to the database.
	 *
	 * @param cid the primary key for the new social_type_master
	 * @return the new social_type_master
	 */
	@Override
	public social_type_master create(long cid) {
		social_type_master social_type_master = new social_type_masterImpl();

		social_type_master.setNew(true);
		social_type_master.setPrimaryKey(cid);

		return social_type_master;
	}

	/**
	 * Removes the social_type_master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the social_type_master
	 * @return the social_type_master that was removed
	 * @throws com.db.NoSuchsocial_type_masterException if a social_type_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public social_type_master remove(long cid)
		throws NoSuchsocial_type_masterException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the social_type_master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the social_type_master
	 * @return the social_type_master that was removed
	 * @throws com.db.NoSuchsocial_type_masterException if a social_type_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public social_type_master remove(Serializable primaryKey)
		throws NoSuchsocial_type_masterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			social_type_master social_type_master = (social_type_master)session.get(social_type_masterImpl.class,
					primaryKey);

			if (social_type_master == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsocial_type_masterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(social_type_master);
		}
		catch (NoSuchsocial_type_masterException nsee) {
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
	protected social_type_master removeImpl(
		social_type_master social_type_master) throws SystemException {
		social_type_master = toUnwrappedModel(social_type_master);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(social_type_master)) {
				social_type_master = (social_type_master)session.get(social_type_masterImpl.class,
						social_type_master.getPrimaryKeyObj());
			}

			if (social_type_master != null) {
				session.delete(social_type_master);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (social_type_master != null) {
			clearCache(social_type_master);
		}

		return social_type_master;
	}

	@Override
	public social_type_master updateImpl(
		com.db.model.social_type_master social_type_master)
		throws SystemException {
		social_type_master = toUnwrappedModel(social_type_master);

		boolean isNew = social_type_master.isNew();

		Session session = null;

		try {
			session = openSession();

			if (social_type_master.isNew()) {
				session.save(social_type_master);

				social_type_master.setNew(false);
			}
			else {
				session.merge(social_type_master);
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

		EntityCacheUtil.putResult(social_type_masterModelImpl.ENTITY_CACHE_ENABLED,
			social_type_masterImpl.class, social_type_master.getPrimaryKey(),
			social_type_master);

		return social_type_master;
	}

	protected social_type_master toUnwrappedModel(
		social_type_master social_type_master) {
		if (social_type_master instanceof social_type_masterImpl) {
			return social_type_master;
		}

		social_type_masterImpl social_type_masterImpl = new social_type_masterImpl();

		social_type_masterImpl.setNew(social_type_master.isNew());
		social_type_masterImpl.setPrimaryKey(social_type_master.getPrimaryKey());

		social_type_masterImpl.setCid(social_type_master.getCid());
		social_type_masterImpl.setName(social_type_master.getName());

		return social_type_masterImpl;
	}

	/**
	 * Returns the social_type_master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the social_type_master
	 * @return the social_type_master
	 * @throws com.db.NoSuchsocial_type_masterException if a social_type_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public social_type_master findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsocial_type_masterException, SystemException {
		social_type_master social_type_master = fetchByPrimaryKey(primaryKey);

		if (social_type_master == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsocial_type_masterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return social_type_master;
	}

	/**
	 * Returns the social_type_master with the primary key or throws a {@link com.db.NoSuchsocial_type_masterException} if it could not be found.
	 *
	 * @param cid the primary key of the social_type_master
	 * @return the social_type_master
	 * @throws com.db.NoSuchsocial_type_masterException if a social_type_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public social_type_master findByPrimaryKey(long cid)
		throws NoSuchsocial_type_masterException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the social_type_master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the social_type_master
	 * @return the social_type_master, or <code>null</code> if a social_type_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public social_type_master fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		social_type_master social_type_master = (social_type_master)EntityCacheUtil.getResult(social_type_masterModelImpl.ENTITY_CACHE_ENABLED,
				social_type_masterImpl.class, primaryKey);

		if (social_type_master == _nullsocial_type_master) {
			return null;
		}

		if (social_type_master == null) {
			Session session = null;

			try {
				session = openSession();

				social_type_master = (social_type_master)session.get(social_type_masterImpl.class,
						primaryKey);

				if (social_type_master != null) {
					cacheResult(social_type_master);
				}
				else {
					EntityCacheUtil.putResult(social_type_masterModelImpl.ENTITY_CACHE_ENABLED,
						social_type_masterImpl.class, primaryKey,
						_nullsocial_type_master);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(social_type_masterModelImpl.ENTITY_CACHE_ENABLED,
					social_type_masterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return social_type_master;
	}

	/**
	 * Returns the social_type_master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the social_type_master
	 * @return the social_type_master, or <code>null</code> if a social_type_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public social_type_master fetchByPrimaryKey(long cid)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the social_type_masters.
	 *
	 * @return the social_type_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<social_type_master> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the social_type_masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.social_type_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of social_type_masters
	 * @param end the upper bound of the range of social_type_masters (not inclusive)
	 * @return the range of social_type_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<social_type_master> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the social_type_masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.social_type_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of social_type_masters
	 * @param end the upper bound of the range of social_type_masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of social_type_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<social_type_master> findAll(int start, int end,
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

		List<social_type_master> list = (List<social_type_master>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SOCIAL_TYPE_MASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SOCIAL_TYPE_MASTER;

				if (pagination) {
					sql = sql.concat(social_type_masterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<social_type_master>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<social_type_master>(list);
				}
				else {
					list = (List<social_type_master>)QueryUtil.list(q,
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
	 * Removes all the social_type_masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (social_type_master social_type_master : findAll()) {
			remove(social_type_master);
		}
	}

	/**
	 * Returns the number of social_type_masters.
	 *
	 * @return the number of social_type_masters
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

				Query q = session.createQuery(_SQL_COUNT_SOCIAL_TYPE_MASTER);

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
	 * Initializes the social_type_master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.social_type_master")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<social_type_master>> listenersList = new ArrayList<ModelListener<social_type_master>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<social_type_master>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(social_type_masterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SOCIAL_TYPE_MASTER = "SELECT social_type_master FROM social_type_master social_type_master";
	private static final String _SQL_COUNT_SOCIAL_TYPE_MASTER = "SELECT COUNT(social_type_master) FROM social_type_master social_type_master";
	private static final String _ORDER_BY_ENTITY_ALIAS = "social_type_master.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No social_type_master exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(social_type_masterPersistenceImpl.class);
	private static social_type_master _nullsocial_type_master = new social_type_masterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<social_type_master> toCacheModel() {
				return _nullsocial_type_masterCacheModel;
			}
		};

	private static CacheModel<social_type_master> _nullsocial_type_masterCacheModel =
		new CacheModel<social_type_master>() {
			@Override
			public social_type_master toEntityModel() {
				return _nullsocial_type_master;
			}
		};
}