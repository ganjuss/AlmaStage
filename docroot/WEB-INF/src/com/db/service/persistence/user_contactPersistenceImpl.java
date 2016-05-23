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

import com.db.NoSuchuser_contactException;

import com.db.model.impl.user_contactImpl;
import com.db.model.impl.user_contactModelImpl;
import com.db.model.user_contact;

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
 * The persistence implementation for the user_contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see user_contactPersistence
 * @see user_contactUtil
 * @generated
 */
public class user_contactPersistenceImpl extends BasePersistenceImpl<user_contact>
	implements user_contactPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link user_contactUtil} to access the user_contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = user_contactImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(user_contactModelImpl.ENTITY_CACHE_ENABLED,
			user_contactModelImpl.FINDER_CACHE_ENABLED, user_contactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(user_contactModelImpl.ENTITY_CACHE_ENABLED,
			user_contactModelImpl.FINDER_CACHE_ENABLED, user_contactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(user_contactModelImpl.ENTITY_CACHE_ENABLED,
			user_contactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public user_contactPersistenceImpl() {
		setModelClass(user_contact.class);
	}

	/**
	 * Caches the user_contact in the entity cache if it is enabled.
	 *
	 * @param user_contact the user_contact
	 */
	@Override
	public void cacheResult(user_contact user_contact) {
		EntityCacheUtil.putResult(user_contactModelImpl.ENTITY_CACHE_ENABLED,
			user_contactImpl.class, user_contact.getPrimaryKey(), user_contact);

		user_contact.resetOriginalValues();
	}

	/**
	 * Caches the user_contacts in the entity cache if it is enabled.
	 *
	 * @param user_contacts the user_contacts
	 */
	@Override
	public void cacheResult(List<user_contact> user_contacts) {
		for (user_contact user_contact : user_contacts) {
			if (EntityCacheUtil.getResult(
						user_contactModelImpl.ENTITY_CACHE_ENABLED,
						user_contactImpl.class, user_contact.getPrimaryKey()) == null) {
				cacheResult(user_contact);
			}
			else {
				user_contact.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user_contacts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(user_contactImpl.class.getName());
		}

		EntityCacheUtil.clearCache(user_contactImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user_contact.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(user_contact user_contact) {
		EntityCacheUtil.removeResult(user_contactModelImpl.ENTITY_CACHE_ENABLED,
			user_contactImpl.class, user_contact.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<user_contact> user_contacts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (user_contact user_contact : user_contacts) {
			EntityCacheUtil.removeResult(user_contactModelImpl.ENTITY_CACHE_ENABLED,
				user_contactImpl.class, user_contact.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user_contact with the primary key. Does not add the user_contact to the database.
	 *
	 * @param cid the primary key for the new user_contact
	 * @return the new user_contact
	 */
	@Override
	public user_contact create(long cid) {
		user_contact user_contact = new user_contactImpl();

		user_contact.setNew(true);
		user_contact.setPrimaryKey(cid);

		return user_contact;
	}

	/**
	 * Removes the user_contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the user_contact
	 * @return the user_contact that was removed
	 * @throws com.db.NoSuchuser_contactException if a user_contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public user_contact remove(long cid)
		throws NoSuchuser_contactException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the user_contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user_contact
	 * @return the user_contact that was removed
	 * @throws com.db.NoSuchuser_contactException if a user_contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public user_contact remove(Serializable primaryKey)
		throws NoSuchuser_contactException, SystemException {
		Session session = null;

		try {
			session = openSession();

			user_contact user_contact = (user_contact)session.get(user_contactImpl.class,
					primaryKey);

			if (user_contact == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchuser_contactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(user_contact);
		}
		catch (NoSuchuser_contactException nsee) {
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
	protected user_contact removeImpl(user_contact user_contact)
		throws SystemException {
		user_contact = toUnwrappedModel(user_contact);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(user_contact)) {
				user_contact = (user_contact)session.get(user_contactImpl.class,
						user_contact.getPrimaryKeyObj());
			}

			if (user_contact != null) {
				session.delete(user_contact);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (user_contact != null) {
			clearCache(user_contact);
		}

		return user_contact;
	}

	@Override
	public user_contact updateImpl(com.db.model.user_contact user_contact)
		throws SystemException {
		user_contact = toUnwrappedModel(user_contact);

		boolean isNew = user_contact.isNew();

		Session session = null;

		try {
			session = openSession();

			if (user_contact.isNew()) {
				session.save(user_contact);

				user_contact.setNew(false);
			}
			else {
				session.merge(user_contact);
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

		EntityCacheUtil.putResult(user_contactModelImpl.ENTITY_CACHE_ENABLED,
			user_contactImpl.class, user_contact.getPrimaryKey(), user_contact);

		return user_contact;
	}

	protected user_contact toUnwrappedModel(user_contact user_contact) {
		if (user_contact instanceof user_contactImpl) {
			return user_contact;
		}

		user_contactImpl user_contactImpl = new user_contactImpl();

		user_contactImpl.setNew(user_contact.isNew());
		user_contactImpl.setPrimaryKey(user_contact.getPrimaryKey());

		user_contactImpl.setCid(user_contact.getCid());
		user_contactImpl.setProfile_id(user_contact.getProfile_id());
		user_contactImpl.setUser_id(user_contact.getUser_id());
		user_contactImpl.setEmail(user_contact.getEmail());
		user_contactImpl.setPhone(user_contact.getPhone());
		user_contactImpl.setDob(user_contact.getDob());
		user_contactImpl.setCity(user_contact.getCity());
		user_contactImpl.setGender(user_contact.getGender());

		return user_contactImpl;
	}

	/**
	 * Returns the user_contact with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user_contact
	 * @return the user_contact
	 * @throws com.db.NoSuchuser_contactException if a user_contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public user_contact findByPrimaryKey(Serializable primaryKey)
		throws NoSuchuser_contactException, SystemException {
		user_contact user_contact = fetchByPrimaryKey(primaryKey);

		if (user_contact == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchuser_contactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return user_contact;
	}

	/**
	 * Returns the user_contact with the primary key or throws a {@link com.db.NoSuchuser_contactException} if it could not be found.
	 *
	 * @param cid the primary key of the user_contact
	 * @return the user_contact
	 * @throws com.db.NoSuchuser_contactException if a user_contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public user_contact findByPrimaryKey(long cid)
		throws NoSuchuser_contactException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the user_contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user_contact
	 * @return the user_contact, or <code>null</code> if a user_contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public user_contact fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		user_contact user_contact = (user_contact)EntityCacheUtil.getResult(user_contactModelImpl.ENTITY_CACHE_ENABLED,
				user_contactImpl.class, primaryKey);

		if (user_contact == _nulluser_contact) {
			return null;
		}

		if (user_contact == null) {
			Session session = null;

			try {
				session = openSession();

				user_contact = (user_contact)session.get(user_contactImpl.class,
						primaryKey);

				if (user_contact != null) {
					cacheResult(user_contact);
				}
				else {
					EntityCacheUtil.putResult(user_contactModelImpl.ENTITY_CACHE_ENABLED,
						user_contactImpl.class, primaryKey, _nulluser_contact);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(user_contactModelImpl.ENTITY_CACHE_ENABLED,
					user_contactImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return user_contact;
	}

	/**
	 * Returns the user_contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the user_contact
	 * @return the user_contact, or <code>null</code> if a user_contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public user_contact fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the user_contacts.
	 *
	 * @return the user_contacts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<user_contact> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user_contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.user_contactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user_contacts
	 * @param end the upper bound of the range of user_contacts (not inclusive)
	 * @return the range of user_contacts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<user_contact> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user_contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.user_contactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user_contacts
	 * @param end the upper bound of the range of user_contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user_contacts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<user_contact> findAll(int start, int end,
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

		List<user_contact> list = (List<user_contact>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USER_CONTACT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USER_CONTACT;

				if (pagination) {
					sql = sql.concat(user_contactModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<user_contact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<user_contact>(list);
				}
				else {
					list = (List<user_contact>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user_contacts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (user_contact user_contact : findAll()) {
			remove(user_contact);
		}
	}

	/**
	 * Returns the number of user_contacts.
	 *
	 * @return the number of user_contacts
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

				Query q = session.createQuery(_SQL_COUNT_USER_CONTACT);

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
	 * Initializes the user_contact persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.user_contact")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<user_contact>> listenersList = new ArrayList<ModelListener<user_contact>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<user_contact>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(user_contactImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USER_CONTACT = "SELECT user_contact FROM user_contact user_contact";
	private static final String _SQL_COUNT_USER_CONTACT = "SELECT COUNT(user_contact) FROM user_contact user_contact";
	private static final String _ORDER_BY_ENTITY_ALIAS = "user_contact.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No user_contact exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(user_contactPersistenceImpl.class);
	private static user_contact _nulluser_contact = new user_contactImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<user_contact> toCacheModel() {
				return _nulluser_contactCacheModel;
			}
		};

	private static CacheModel<user_contact> _nulluser_contactCacheModel = new CacheModel<user_contact>() {
			@Override
			public user_contact toEntityModel() {
				return _nulluser_contact;
			}
		};
}