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

import com.db.NoSuchclub_usersException;

import com.db.model.club_users;
import com.db.model.impl.club_usersImpl;
import com.db.model.impl.club_usersModelImpl;

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
 * The persistence implementation for the club_users service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see club_usersPersistence
 * @see club_usersUtil
 * @generated
 */
public class club_usersPersistenceImpl extends BasePersistenceImpl<club_users>
	implements club_usersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link club_usersUtil} to access the club_users persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = club_usersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(club_usersModelImpl.ENTITY_CACHE_ENABLED,
			club_usersModelImpl.FINDER_CACHE_ENABLED, club_usersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(club_usersModelImpl.ENTITY_CACHE_ENABLED,
			club_usersModelImpl.FINDER_CACHE_ENABLED, club_usersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(club_usersModelImpl.ENTITY_CACHE_ENABLED,
			club_usersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public club_usersPersistenceImpl() {
		setModelClass(club_users.class);
	}

	/**
	 * Caches the club_users in the entity cache if it is enabled.
	 *
	 * @param club_users the club_users
	 */
	@Override
	public void cacheResult(club_users club_users) {
		EntityCacheUtil.putResult(club_usersModelImpl.ENTITY_CACHE_ENABLED,
			club_usersImpl.class, club_users.getPrimaryKey(), club_users);

		club_users.resetOriginalValues();
	}

	/**
	 * Caches the club_userses in the entity cache if it is enabled.
	 *
	 * @param club_userses the club_userses
	 */
	@Override
	public void cacheResult(List<club_users> club_userses) {
		for (club_users club_users : club_userses) {
			if (EntityCacheUtil.getResult(
						club_usersModelImpl.ENTITY_CACHE_ENABLED,
						club_usersImpl.class, club_users.getPrimaryKey()) == null) {
				cacheResult(club_users);
			}
			else {
				club_users.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all club_userses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(club_usersImpl.class.getName());
		}

		EntityCacheUtil.clearCache(club_usersImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the club_users.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(club_users club_users) {
		EntityCacheUtil.removeResult(club_usersModelImpl.ENTITY_CACHE_ENABLED,
			club_usersImpl.class, club_users.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<club_users> club_userses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (club_users club_users : club_userses) {
			EntityCacheUtil.removeResult(club_usersModelImpl.ENTITY_CACHE_ENABLED,
				club_usersImpl.class, club_users.getPrimaryKey());
		}
	}

	/**
	 * Creates a new club_users with the primary key. Does not add the club_users to the database.
	 *
	 * @param cid the primary key for the new club_users
	 * @return the new club_users
	 */
	@Override
	public club_users create(long cid) {
		club_users club_users = new club_usersImpl();

		club_users.setNew(true);
		club_users.setPrimaryKey(cid);

		return club_users;
	}

	/**
	 * Removes the club_users with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the club_users
	 * @return the club_users that was removed
	 * @throws com.db.NoSuchclub_usersException if a club_users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public club_users remove(long cid)
		throws NoSuchclub_usersException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the club_users with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the club_users
	 * @return the club_users that was removed
	 * @throws com.db.NoSuchclub_usersException if a club_users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public club_users remove(Serializable primaryKey)
		throws NoSuchclub_usersException, SystemException {
		Session session = null;

		try {
			session = openSession();

			club_users club_users = (club_users)session.get(club_usersImpl.class,
					primaryKey);

			if (club_users == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchclub_usersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(club_users);
		}
		catch (NoSuchclub_usersException nsee) {
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
	protected club_users removeImpl(club_users club_users)
		throws SystemException {
		club_users = toUnwrappedModel(club_users);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(club_users)) {
				club_users = (club_users)session.get(club_usersImpl.class,
						club_users.getPrimaryKeyObj());
			}

			if (club_users != null) {
				session.delete(club_users);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (club_users != null) {
			clearCache(club_users);
		}

		return club_users;
	}

	@Override
	public club_users updateImpl(com.db.model.club_users club_users)
		throws SystemException {
		club_users = toUnwrappedModel(club_users);

		boolean isNew = club_users.isNew();

		Session session = null;

		try {
			session = openSession();

			if (club_users.isNew()) {
				session.save(club_users);

				club_users.setNew(false);
			}
			else {
				session.merge(club_users);
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

		EntityCacheUtil.putResult(club_usersModelImpl.ENTITY_CACHE_ENABLED,
			club_usersImpl.class, club_users.getPrimaryKey(), club_users);

		return club_users;
	}

	protected club_users toUnwrappedModel(club_users club_users) {
		if (club_users instanceof club_usersImpl) {
			return club_users;
		}

		club_usersImpl club_usersImpl = new club_usersImpl();

		club_usersImpl.setNew(club_users.isNew());
		club_usersImpl.setPrimaryKey(club_users.getPrimaryKey());

		club_usersImpl.setCid(club_users.getCid());
		club_usersImpl.setClub_id(club_users.getClub_id());
		club_usersImpl.setUser_id(club_users.getUser_id());

		return club_usersImpl;
	}

	/**
	 * Returns the club_users with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the club_users
	 * @return the club_users
	 * @throws com.db.NoSuchclub_usersException if a club_users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public club_users findByPrimaryKey(Serializable primaryKey)
		throws NoSuchclub_usersException, SystemException {
		club_users club_users = fetchByPrimaryKey(primaryKey);

		if (club_users == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchclub_usersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return club_users;
	}

	/**
	 * Returns the club_users with the primary key or throws a {@link com.db.NoSuchclub_usersException} if it could not be found.
	 *
	 * @param cid the primary key of the club_users
	 * @return the club_users
	 * @throws com.db.NoSuchclub_usersException if a club_users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public club_users findByPrimaryKey(long cid)
		throws NoSuchclub_usersException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the club_users with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the club_users
	 * @return the club_users, or <code>null</code> if a club_users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public club_users fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		club_users club_users = (club_users)EntityCacheUtil.getResult(club_usersModelImpl.ENTITY_CACHE_ENABLED,
				club_usersImpl.class, primaryKey);

		if (club_users == _nullclub_users) {
			return null;
		}

		if (club_users == null) {
			Session session = null;

			try {
				session = openSession();

				club_users = (club_users)session.get(club_usersImpl.class,
						primaryKey);

				if (club_users != null) {
					cacheResult(club_users);
				}
				else {
					EntityCacheUtil.putResult(club_usersModelImpl.ENTITY_CACHE_ENABLED,
						club_usersImpl.class, primaryKey, _nullclub_users);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(club_usersModelImpl.ENTITY_CACHE_ENABLED,
					club_usersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return club_users;
	}

	/**
	 * Returns the club_users with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the club_users
	 * @return the club_users, or <code>null</code> if a club_users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public club_users fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the club_userses.
	 *
	 * @return the club_userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<club_users> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the club_userses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.club_usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of club_userses
	 * @param end the upper bound of the range of club_userses (not inclusive)
	 * @return the range of club_userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<club_users> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the club_userses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.club_usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of club_userses
	 * @param end the upper bound of the range of club_userses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of club_userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<club_users> findAll(int start, int end,
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

		List<club_users> list = (List<club_users>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CLUB_USERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CLUB_USERS;

				if (pagination) {
					sql = sql.concat(club_usersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<club_users>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<club_users>(list);
				}
				else {
					list = (List<club_users>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the club_userses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (club_users club_users : findAll()) {
			remove(club_users);
		}
	}

	/**
	 * Returns the number of club_userses.
	 *
	 * @return the number of club_userses
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

				Query q = session.createQuery(_SQL_COUNT_CLUB_USERS);

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
	 * Initializes the club_users persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.club_users")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<club_users>> listenersList = new ArrayList<ModelListener<club_users>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<club_users>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(club_usersImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CLUB_USERS = "SELECT club_users FROM club_users club_users";
	private static final String _SQL_COUNT_CLUB_USERS = "SELECT COUNT(club_users) FROM club_users club_users";
	private static final String _ORDER_BY_ENTITY_ALIAS = "club_users.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No club_users exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(club_usersPersistenceImpl.class);
	private static club_users _nullclub_users = new club_usersImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<club_users> toCacheModel() {
				return _nullclub_usersCacheModel;
			}
		};

	private static CacheModel<club_users> _nullclub_usersCacheModel = new CacheModel<club_users>() {
			@Override
			public club_users toEntityModel() {
				return _nullclub_users;
			}
		};
}