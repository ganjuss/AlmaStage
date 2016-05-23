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

import com.db.NoSuchnotificationsException;

import com.db.model.impl.notificationsImpl;
import com.db.model.impl.notificationsModelImpl;
import com.db.model.notifications;

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
 * The persistence implementation for the notifications service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see notificationsPersistence
 * @see notificationsUtil
 * @generated
 */
public class notificationsPersistenceImpl extends BasePersistenceImpl<notifications>
	implements notificationsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link notificationsUtil} to access the notifications persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = notificationsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(notificationsModelImpl.ENTITY_CACHE_ENABLED,
			notificationsModelImpl.FINDER_CACHE_ENABLED,
			notificationsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(notificationsModelImpl.ENTITY_CACHE_ENABLED,
			notificationsModelImpl.FINDER_CACHE_ENABLED,
			notificationsImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(notificationsModelImpl.ENTITY_CACHE_ENABLED,
			notificationsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public notificationsPersistenceImpl() {
		setModelClass(notifications.class);
	}

	/**
	 * Caches the notifications in the entity cache if it is enabled.
	 *
	 * @param notifications the notifications
	 */
	@Override
	public void cacheResult(notifications notifications) {
		EntityCacheUtil.putResult(notificationsModelImpl.ENTITY_CACHE_ENABLED,
			notificationsImpl.class, notifications.getPrimaryKey(),
			notifications);

		notifications.resetOriginalValues();
	}

	/**
	 * Caches the notificationses in the entity cache if it is enabled.
	 *
	 * @param notificationses the notificationses
	 */
	@Override
	public void cacheResult(List<notifications> notificationses) {
		for (notifications notifications : notificationses) {
			if (EntityCacheUtil.getResult(
						notificationsModelImpl.ENTITY_CACHE_ENABLED,
						notificationsImpl.class, notifications.getPrimaryKey()) == null) {
				cacheResult(notifications);
			}
			else {
				notifications.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all notificationses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(notificationsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(notificationsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the notifications.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(notifications notifications) {
		EntityCacheUtil.removeResult(notificationsModelImpl.ENTITY_CACHE_ENABLED,
			notificationsImpl.class, notifications.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<notifications> notificationses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (notifications notifications : notificationses) {
			EntityCacheUtil.removeResult(notificationsModelImpl.ENTITY_CACHE_ENABLED,
				notificationsImpl.class, notifications.getPrimaryKey());
		}
	}

	/**
	 * Creates a new notifications with the primary key. Does not add the notifications to the database.
	 *
	 * @param cid the primary key for the new notifications
	 * @return the new notifications
	 */
	@Override
	public notifications create(long cid) {
		notifications notifications = new notificationsImpl();

		notifications.setNew(true);
		notifications.setPrimaryKey(cid);

		return notifications;
	}

	/**
	 * Removes the notifications with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the notifications
	 * @return the notifications that was removed
	 * @throws com.db.NoSuchnotificationsException if a notifications with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public notifications remove(long cid)
		throws NoSuchnotificationsException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the notifications with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the notifications
	 * @return the notifications that was removed
	 * @throws com.db.NoSuchnotificationsException if a notifications with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public notifications remove(Serializable primaryKey)
		throws NoSuchnotificationsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			notifications notifications = (notifications)session.get(notificationsImpl.class,
					primaryKey);

			if (notifications == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchnotificationsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(notifications);
		}
		catch (NoSuchnotificationsException nsee) {
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
	protected notifications removeImpl(notifications notifications)
		throws SystemException {
		notifications = toUnwrappedModel(notifications);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(notifications)) {
				notifications = (notifications)session.get(notificationsImpl.class,
						notifications.getPrimaryKeyObj());
			}

			if (notifications != null) {
				session.delete(notifications);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (notifications != null) {
			clearCache(notifications);
		}

		return notifications;
	}

	@Override
	public notifications updateImpl(com.db.model.notifications notifications)
		throws SystemException {
		notifications = toUnwrappedModel(notifications);

		boolean isNew = notifications.isNew();

		Session session = null;

		try {
			session = openSession();

			if (notifications.isNew()) {
				session.save(notifications);

				notifications.setNew(false);
			}
			else {
				session.merge(notifications);
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

		EntityCacheUtil.putResult(notificationsModelImpl.ENTITY_CACHE_ENABLED,
			notificationsImpl.class, notifications.getPrimaryKey(),
			notifications);

		return notifications;
	}

	protected notifications toUnwrappedModel(notifications notifications) {
		if (notifications instanceof notificationsImpl) {
			return notifications;
		}

		notificationsImpl notificationsImpl = new notificationsImpl();

		notificationsImpl.setNew(notifications.isNew());
		notificationsImpl.setPrimaryKey(notifications.getPrimaryKey());

		notificationsImpl.setCid(notifications.getCid());

		return notificationsImpl;
	}

	/**
	 * Returns the notifications with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the notifications
	 * @return the notifications
	 * @throws com.db.NoSuchnotificationsException if a notifications with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public notifications findByPrimaryKey(Serializable primaryKey)
		throws NoSuchnotificationsException, SystemException {
		notifications notifications = fetchByPrimaryKey(primaryKey);

		if (notifications == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchnotificationsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return notifications;
	}

	/**
	 * Returns the notifications with the primary key or throws a {@link com.db.NoSuchnotificationsException} if it could not be found.
	 *
	 * @param cid the primary key of the notifications
	 * @return the notifications
	 * @throws com.db.NoSuchnotificationsException if a notifications with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public notifications findByPrimaryKey(long cid)
		throws NoSuchnotificationsException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the notifications with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the notifications
	 * @return the notifications, or <code>null</code> if a notifications with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public notifications fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		notifications notifications = (notifications)EntityCacheUtil.getResult(notificationsModelImpl.ENTITY_CACHE_ENABLED,
				notificationsImpl.class, primaryKey);

		if (notifications == _nullnotifications) {
			return null;
		}

		if (notifications == null) {
			Session session = null;

			try {
				session = openSession();

				notifications = (notifications)session.get(notificationsImpl.class,
						primaryKey);

				if (notifications != null) {
					cacheResult(notifications);
				}
				else {
					EntityCacheUtil.putResult(notificationsModelImpl.ENTITY_CACHE_ENABLED,
						notificationsImpl.class, primaryKey, _nullnotifications);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(notificationsModelImpl.ENTITY_CACHE_ENABLED,
					notificationsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return notifications;
	}

	/**
	 * Returns the notifications with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the notifications
	 * @return the notifications, or <code>null</code> if a notifications with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public notifications fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the notificationses.
	 *
	 * @return the notificationses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<notifications> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the notificationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.notificationsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of notificationses
	 * @param end the upper bound of the range of notificationses (not inclusive)
	 * @return the range of notificationses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<notifications> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the notificationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.notificationsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of notificationses
	 * @param end the upper bound of the range of notificationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of notificationses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<notifications> findAll(int start, int end,
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

		List<notifications> list = (List<notifications>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NOTIFICATIONS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NOTIFICATIONS;

				if (pagination) {
					sql = sql.concat(notificationsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<notifications>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<notifications>(list);
				}
				else {
					list = (List<notifications>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the notificationses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (notifications notifications : findAll()) {
			remove(notifications);
		}
	}

	/**
	 * Returns the number of notificationses.
	 *
	 * @return the number of notificationses
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

				Query q = session.createQuery(_SQL_COUNT_NOTIFICATIONS);

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
	 * Initializes the notifications persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.notifications")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<notifications>> listenersList = new ArrayList<ModelListener<notifications>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<notifications>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(notificationsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NOTIFICATIONS = "SELECT notifications FROM notifications notifications";
	private static final String _SQL_COUNT_NOTIFICATIONS = "SELECT COUNT(notifications) FROM notifications notifications";
	private static final String _ORDER_BY_ENTITY_ALIAS = "notifications.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No notifications exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(notificationsPersistenceImpl.class);
	private static notifications _nullnotifications = new notificationsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<notifications> toCacheModel() {
				return _nullnotificationsCacheModel;
			}
		};

	private static CacheModel<notifications> _nullnotificationsCacheModel = new CacheModel<notifications>() {
			@Override
			public notifications toEntityModel() {
				return _nullnotifications;
			}
		};
}