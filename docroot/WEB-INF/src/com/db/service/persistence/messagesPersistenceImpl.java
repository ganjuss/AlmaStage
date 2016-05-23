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

import com.db.NoSuchmessagesException;

import com.db.model.impl.messagesImpl;
import com.db.model.impl.messagesModelImpl;
import com.db.model.messages;

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
 * The persistence implementation for the messages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see messagesPersistence
 * @see messagesUtil
 * @generated
 */
public class messagesPersistenceImpl extends BasePersistenceImpl<messages>
	implements messagesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link messagesUtil} to access the messages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = messagesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(messagesModelImpl.ENTITY_CACHE_ENABLED,
			messagesModelImpl.FINDER_CACHE_ENABLED, messagesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(messagesModelImpl.ENTITY_CACHE_ENABLED,
			messagesModelImpl.FINDER_CACHE_ENABLED, messagesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(messagesModelImpl.ENTITY_CACHE_ENABLED,
			messagesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public messagesPersistenceImpl() {
		setModelClass(messages.class);
	}

	/**
	 * Caches the messages in the entity cache if it is enabled.
	 *
	 * @param messages the messages
	 */
	@Override
	public void cacheResult(messages messages) {
		EntityCacheUtil.putResult(messagesModelImpl.ENTITY_CACHE_ENABLED,
			messagesImpl.class, messages.getPrimaryKey(), messages);

		messages.resetOriginalValues();
	}

	/**
	 * Caches the messageses in the entity cache if it is enabled.
	 *
	 * @param messageses the messageses
	 */
	@Override
	public void cacheResult(List<messages> messageses) {
		for (messages messages : messageses) {
			if (EntityCacheUtil.getResult(
						messagesModelImpl.ENTITY_CACHE_ENABLED,
						messagesImpl.class, messages.getPrimaryKey()) == null) {
				cacheResult(messages);
			}
			else {
				messages.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all messageses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(messagesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(messagesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the messages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(messages messages) {
		EntityCacheUtil.removeResult(messagesModelImpl.ENTITY_CACHE_ENABLED,
			messagesImpl.class, messages.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<messages> messageses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (messages messages : messageses) {
			EntityCacheUtil.removeResult(messagesModelImpl.ENTITY_CACHE_ENABLED,
				messagesImpl.class, messages.getPrimaryKey());
		}
	}

	/**
	 * Creates a new messages with the primary key. Does not add the messages to the database.
	 *
	 * @param cid the primary key for the new messages
	 * @return the new messages
	 */
	@Override
	public messages create(long cid) {
		messages messages = new messagesImpl();

		messages.setNew(true);
		messages.setPrimaryKey(cid);

		return messages;
	}

	/**
	 * Removes the messages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the messages
	 * @return the messages that was removed
	 * @throws com.db.NoSuchmessagesException if a messages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public messages remove(long cid)
		throws NoSuchmessagesException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the messages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the messages
	 * @return the messages that was removed
	 * @throws com.db.NoSuchmessagesException if a messages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public messages remove(Serializable primaryKey)
		throws NoSuchmessagesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			messages messages = (messages)session.get(messagesImpl.class,
					primaryKey);

			if (messages == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchmessagesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(messages);
		}
		catch (NoSuchmessagesException nsee) {
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
	protected messages removeImpl(messages messages) throws SystemException {
		messages = toUnwrappedModel(messages);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(messages)) {
				messages = (messages)session.get(messagesImpl.class,
						messages.getPrimaryKeyObj());
			}

			if (messages != null) {
				session.delete(messages);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (messages != null) {
			clearCache(messages);
		}

		return messages;
	}

	@Override
	public messages updateImpl(com.db.model.messages messages)
		throws SystemException {
		messages = toUnwrappedModel(messages);

		boolean isNew = messages.isNew();

		Session session = null;

		try {
			session = openSession();

			if (messages.isNew()) {
				session.save(messages);

				messages.setNew(false);
			}
			else {
				session.merge(messages);
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

		EntityCacheUtil.putResult(messagesModelImpl.ENTITY_CACHE_ENABLED,
			messagesImpl.class, messages.getPrimaryKey(), messages);

		return messages;
	}

	protected messages toUnwrappedModel(messages messages) {
		if (messages instanceof messagesImpl) {
			return messages;
		}

		messagesImpl messagesImpl = new messagesImpl();

		messagesImpl.setNew(messages.isNew());
		messagesImpl.setPrimaryKey(messages.getPrimaryKey());

		messagesImpl.setCid(messages.getCid());

		return messagesImpl;
	}

	/**
	 * Returns the messages with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the messages
	 * @return the messages
	 * @throws com.db.NoSuchmessagesException if a messages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public messages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchmessagesException, SystemException {
		messages messages = fetchByPrimaryKey(primaryKey);

		if (messages == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchmessagesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return messages;
	}

	/**
	 * Returns the messages with the primary key or throws a {@link com.db.NoSuchmessagesException} if it could not be found.
	 *
	 * @param cid the primary key of the messages
	 * @return the messages
	 * @throws com.db.NoSuchmessagesException if a messages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public messages findByPrimaryKey(long cid)
		throws NoSuchmessagesException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the messages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the messages
	 * @return the messages, or <code>null</code> if a messages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public messages fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		messages messages = (messages)EntityCacheUtil.getResult(messagesModelImpl.ENTITY_CACHE_ENABLED,
				messagesImpl.class, primaryKey);

		if (messages == _nullmessages) {
			return null;
		}

		if (messages == null) {
			Session session = null;

			try {
				session = openSession();

				messages = (messages)session.get(messagesImpl.class, primaryKey);

				if (messages != null) {
					cacheResult(messages);
				}
				else {
					EntityCacheUtil.putResult(messagesModelImpl.ENTITY_CACHE_ENABLED,
						messagesImpl.class, primaryKey, _nullmessages);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(messagesModelImpl.ENTITY_CACHE_ENABLED,
					messagesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return messages;
	}

	/**
	 * Returns the messages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the messages
	 * @return the messages, or <code>null</code> if a messages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public messages fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the messageses.
	 *
	 * @return the messageses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<messages> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the messageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.messagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of messageses
	 * @param end the upper bound of the range of messageses (not inclusive)
	 * @return the range of messageses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<messages> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the messageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.messagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of messageses
	 * @param end the upper bound of the range of messageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of messageses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<messages> findAll(int start, int end,
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

		List<messages> list = (List<messages>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MESSAGES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MESSAGES;

				if (pagination) {
					sql = sql.concat(messagesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<messages>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<messages>(list);
				}
				else {
					list = (List<messages>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the messageses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (messages messages : findAll()) {
			remove(messages);
		}
	}

	/**
	 * Returns the number of messageses.
	 *
	 * @return the number of messageses
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

				Query q = session.createQuery(_SQL_COUNT_MESSAGES);

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
	 * Initializes the messages persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.messages")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<messages>> listenersList = new ArrayList<ModelListener<messages>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<messages>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(messagesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MESSAGES = "SELECT messages FROM messages messages";
	private static final String _SQL_COUNT_MESSAGES = "SELECT COUNT(messages) FROM messages messages";
	private static final String _ORDER_BY_ENTITY_ALIAS = "messages.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No messages exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(messagesPersistenceImpl.class);
	private static messages _nullmessages = new messagesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<messages> toCacheModel() {
				return _nullmessagesCacheModel;
			}
		};

	private static CacheModel<messages> _nullmessagesCacheModel = new CacheModel<messages>() {
			@Override
			public messages toEntityModel() {
				return _nullmessages;
			}
		};
}