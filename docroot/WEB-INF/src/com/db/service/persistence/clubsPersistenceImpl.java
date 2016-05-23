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

import com.db.NoSuchclubsException;

import com.db.model.clubs;
import com.db.model.impl.clubsImpl;
import com.db.model.impl.clubsModelImpl;

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
 * The persistence implementation for the clubs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see clubsPersistence
 * @see clubsUtil
 * @generated
 */
public class clubsPersistenceImpl extends BasePersistenceImpl<clubs>
	implements clubsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link clubsUtil} to access the clubs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = clubsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(clubsModelImpl.ENTITY_CACHE_ENABLED,
			clubsModelImpl.FINDER_CACHE_ENABLED, clubsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(clubsModelImpl.ENTITY_CACHE_ENABLED,
			clubsModelImpl.FINDER_CACHE_ENABLED, clubsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(clubsModelImpl.ENTITY_CACHE_ENABLED,
			clubsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public clubsPersistenceImpl() {
		setModelClass(clubs.class);
	}

	/**
	 * Caches the clubs in the entity cache if it is enabled.
	 *
	 * @param clubs the clubs
	 */
	@Override
	public void cacheResult(clubs clubs) {
		EntityCacheUtil.putResult(clubsModelImpl.ENTITY_CACHE_ENABLED,
			clubsImpl.class, clubs.getPrimaryKey(), clubs);

		clubs.resetOriginalValues();
	}

	/**
	 * Caches the clubses in the entity cache if it is enabled.
	 *
	 * @param clubses the clubses
	 */
	@Override
	public void cacheResult(List<clubs> clubses) {
		for (clubs clubs : clubses) {
			if (EntityCacheUtil.getResult(clubsModelImpl.ENTITY_CACHE_ENABLED,
						clubsImpl.class, clubs.getPrimaryKey()) == null) {
				cacheResult(clubs);
			}
			else {
				clubs.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all clubses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(clubsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(clubsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the clubs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(clubs clubs) {
		EntityCacheUtil.removeResult(clubsModelImpl.ENTITY_CACHE_ENABLED,
			clubsImpl.class, clubs.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<clubs> clubses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (clubs clubs : clubses) {
			EntityCacheUtil.removeResult(clubsModelImpl.ENTITY_CACHE_ENABLED,
				clubsImpl.class, clubs.getPrimaryKey());
		}
	}

	/**
	 * Creates a new clubs with the primary key. Does not add the clubs to the database.
	 *
	 * @param cid the primary key for the new clubs
	 * @return the new clubs
	 */
	@Override
	public clubs create(long cid) {
		clubs clubs = new clubsImpl();

		clubs.setNew(true);
		clubs.setPrimaryKey(cid);

		return clubs;
	}

	/**
	 * Removes the clubs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the clubs
	 * @return the clubs that was removed
	 * @throws com.db.NoSuchclubsException if a clubs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public clubs remove(long cid) throws NoSuchclubsException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the clubs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the clubs
	 * @return the clubs that was removed
	 * @throws com.db.NoSuchclubsException if a clubs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public clubs remove(Serializable primaryKey)
		throws NoSuchclubsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			clubs clubs = (clubs)session.get(clubsImpl.class, primaryKey);

			if (clubs == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchclubsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(clubs);
		}
		catch (NoSuchclubsException nsee) {
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
	protected clubs removeImpl(clubs clubs) throws SystemException {
		clubs = toUnwrappedModel(clubs);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(clubs)) {
				clubs = (clubs)session.get(clubsImpl.class,
						clubs.getPrimaryKeyObj());
			}

			if (clubs != null) {
				session.delete(clubs);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (clubs != null) {
			clearCache(clubs);
		}

		return clubs;
	}

	@Override
	public clubs updateImpl(com.db.model.clubs clubs) throws SystemException {
		clubs = toUnwrappedModel(clubs);

		boolean isNew = clubs.isNew();

		Session session = null;

		try {
			session = openSession();

			if (clubs.isNew()) {
				session.save(clubs);

				clubs.setNew(false);
			}
			else {
				session.merge(clubs);
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

		EntityCacheUtil.putResult(clubsModelImpl.ENTITY_CACHE_ENABLED,
			clubsImpl.class, clubs.getPrimaryKey(), clubs);

		return clubs;
	}

	protected clubs toUnwrappedModel(clubs clubs) {
		if (clubs instanceof clubsImpl) {
			return clubs;
		}

		clubsImpl clubsImpl = new clubsImpl();

		clubsImpl.setNew(clubs.isNew());
		clubsImpl.setPrimaryKey(clubs.getPrimaryKey());

		clubsImpl.setCid(clubs.getCid());
		clubsImpl.setName(clubs.getName());
		clubsImpl.setAdmin_user_id(clubs.getAdmin_user_id());

		return clubsImpl;
	}

	/**
	 * Returns the clubs with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the clubs
	 * @return the clubs
	 * @throws com.db.NoSuchclubsException if a clubs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public clubs findByPrimaryKey(Serializable primaryKey)
		throws NoSuchclubsException, SystemException {
		clubs clubs = fetchByPrimaryKey(primaryKey);

		if (clubs == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchclubsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return clubs;
	}

	/**
	 * Returns the clubs with the primary key or throws a {@link com.db.NoSuchclubsException} if it could not be found.
	 *
	 * @param cid the primary key of the clubs
	 * @return the clubs
	 * @throws com.db.NoSuchclubsException if a clubs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public clubs findByPrimaryKey(long cid)
		throws NoSuchclubsException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the clubs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the clubs
	 * @return the clubs, or <code>null</code> if a clubs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public clubs fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		clubs clubs = (clubs)EntityCacheUtil.getResult(clubsModelImpl.ENTITY_CACHE_ENABLED,
				clubsImpl.class, primaryKey);

		if (clubs == _nullclubs) {
			return null;
		}

		if (clubs == null) {
			Session session = null;

			try {
				session = openSession();

				clubs = (clubs)session.get(clubsImpl.class, primaryKey);

				if (clubs != null) {
					cacheResult(clubs);
				}
				else {
					EntityCacheUtil.putResult(clubsModelImpl.ENTITY_CACHE_ENABLED,
						clubsImpl.class, primaryKey, _nullclubs);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(clubsModelImpl.ENTITY_CACHE_ENABLED,
					clubsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return clubs;
	}

	/**
	 * Returns the clubs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the clubs
	 * @return the clubs, or <code>null</code> if a clubs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public clubs fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the clubses.
	 *
	 * @return the clubses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<clubs> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clubses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.clubsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of clubses
	 * @param end the upper bound of the range of clubses (not inclusive)
	 * @return the range of clubses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<clubs> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the clubses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.clubsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of clubses
	 * @param end the upper bound of the range of clubses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of clubses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<clubs> findAll(int start, int end,
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

		List<clubs> list = (List<clubs>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CLUBS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CLUBS;

				if (pagination) {
					sql = sql.concat(clubsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<clubs>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<clubs>(list);
				}
				else {
					list = (List<clubs>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the clubses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (clubs clubs : findAll()) {
			remove(clubs);
		}
	}

	/**
	 * Returns the number of clubses.
	 *
	 * @return the number of clubses
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

				Query q = session.createQuery(_SQL_COUNT_CLUBS);

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
	 * Initializes the clubs persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.clubs")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<clubs>> listenersList = new ArrayList<ModelListener<clubs>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<clubs>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(clubsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CLUBS = "SELECT clubs FROM clubs clubs";
	private static final String _SQL_COUNT_CLUBS = "SELECT COUNT(clubs) FROM clubs clubs";
	private static final String _ORDER_BY_ENTITY_ALIAS = "clubs.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No clubs exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(clubsPersistenceImpl.class);
	private static clubs _nullclubs = new clubsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<clubs> toCacheModel() {
				return _nullclubsCacheModel;
			}
		};

	private static CacheModel<clubs> _nullclubsCacheModel = new CacheModel<clubs>() {
			@Override
			public clubs toEntityModel() {
				return _nullclubs;
			}
		};
}