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

import com.db.NoSuchsocial_loginException;

import com.db.model.impl.social_loginImpl;
import com.db.model.impl.social_loginModelImpl;
import com.db.model.social_login;

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
 * The persistence implementation for the social_login service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see social_loginPersistence
 * @see social_loginUtil
 * @generated
 */
public class social_loginPersistenceImpl extends BasePersistenceImpl<social_login>
	implements social_loginPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link social_loginUtil} to access the social_login persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = social_loginImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(social_loginModelImpl.ENTITY_CACHE_ENABLED,
			social_loginModelImpl.FINDER_CACHE_ENABLED, social_loginImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(social_loginModelImpl.ENTITY_CACHE_ENABLED,
			social_loginModelImpl.FINDER_CACHE_ENABLED, social_loginImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(social_loginModelImpl.ENTITY_CACHE_ENABLED,
			social_loginModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public social_loginPersistenceImpl() {
		setModelClass(social_login.class);
	}

	/**
	 * Caches the social_login in the entity cache if it is enabled.
	 *
	 * @param social_login the social_login
	 */
	@Override
	public void cacheResult(social_login social_login) {
		EntityCacheUtil.putResult(social_loginModelImpl.ENTITY_CACHE_ENABLED,
			social_loginImpl.class, social_login.getPrimaryKey(), social_login);

		social_login.resetOriginalValues();
	}

	/**
	 * Caches the social_logins in the entity cache if it is enabled.
	 *
	 * @param social_logins the social_logins
	 */
	@Override
	public void cacheResult(List<social_login> social_logins) {
		for (social_login social_login : social_logins) {
			if (EntityCacheUtil.getResult(
						social_loginModelImpl.ENTITY_CACHE_ENABLED,
						social_loginImpl.class, social_login.getPrimaryKey()) == null) {
				cacheResult(social_login);
			}
			else {
				social_login.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all social_logins.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(social_loginImpl.class.getName());
		}

		EntityCacheUtil.clearCache(social_loginImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the social_login.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(social_login social_login) {
		EntityCacheUtil.removeResult(social_loginModelImpl.ENTITY_CACHE_ENABLED,
			social_loginImpl.class, social_login.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<social_login> social_logins) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (social_login social_login : social_logins) {
			EntityCacheUtil.removeResult(social_loginModelImpl.ENTITY_CACHE_ENABLED,
				social_loginImpl.class, social_login.getPrimaryKey());
		}
	}

	/**
	 * Creates a new social_login with the primary key. Does not add the social_login to the database.
	 *
	 * @param cid the primary key for the new social_login
	 * @return the new social_login
	 */
	@Override
	public social_login create(long cid) {
		social_login social_login = new social_loginImpl();

		social_login.setNew(true);
		social_login.setPrimaryKey(cid);

		return social_login;
	}

	/**
	 * Removes the social_login with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the social_login
	 * @return the social_login that was removed
	 * @throws com.db.NoSuchsocial_loginException if a social_login with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public social_login remove(long cid)
		throws NoSuchsocial_loginException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the social_login with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the social_login
	 * @return the social_login that was removed
	 * @throws com.db.NoSuchsocial_loginException if a social_login with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public social_login remove(Serializable primaryKey)
		throws NoSuchsocial_loginException, SystemException {
		Session session = null;

		try {
			session = openSession();

			social_login social_login = (social_login)session.get(social_loginImpl.class,
					primaryKey);

			if (social_login == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsocial_loginException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(social_login);
		}
		catch (NoSuchsocial_loginException nsee) {
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
	protected social_login removeImpl(social_login social_login)
		throws SystemException {
		social_login = toUnwrappedModel(social_login);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(social_login)) {
				social_login = (social_login)session.get(social_loginImpl.class,
						social_login.getPrimaryKeyObj());
			}

			if (social_login != null) {
				session.delete(social_login);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (social_login != null) {
			clearCache(social_login);
		}

		return social_login;
	}

	@Override
	public social_login updateImpl(com.db.model.social_login social_login)
		throws SystemException {
		social_login = toUnwrappedModel(social_login);

		boolean isNew = social_login.isNew();

		Session session = null;

		try {
			session = openSession();

			if (social_login.isNew()) {
				session.save(social_login);

				social_login.setNew(false);
			}
			else {
				session.merge(social_login);
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

		EntityCacheUtil.putResult(social_loginModelImpl.ENTITY_CACHE_ENABLED,
			social_loginImpl.class, social_login.getPrimaryKey(), social_login);

		return social_login;
	}

	protected social_login toUnwrappedModel(social_login social_login) {
		if (social_login instanceof social_loginImpl) {
			return social_login;
		}

		social_loginImpl social_loginImpl = new social_loginImpl();

		social_loginImpl.setNew(social_login.isNew());
		social_loginImpl.setPrimaryKey(social_login.getPrimaryKey());

		social_loginImpl.setCid(social_login.getCid());
		social_loginImpl.setSocial_type_id(social_login.getSocial_type_id());
		social_loginImpl.setProfile_id(social_login.getProfile_id());
		social_loginImpl.setSocial_id(social_login.getSocial_id());

		return social_loginImpl;
	}

	/**
	 * Returns the social_login with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the social_login
	 * @return the social_login
	 * @throws com.db.NoSuchsocial_loginException if a social_login with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public social_login findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsocial_loginException, SystemException {
		social_login social_login = fetchByPrimaryKey(primaryKey);

		if (social_login == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsocial_loginException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return social_login;
	}

	/**
	 * Returns the social_login with the primary key or throws a {@link com.db.NoSuchsocial_loginException} if it could not be found.
	 *
	 * @param cid the primary key of the social_login
	 * @return the social_login
	 * @throws com.db.NoSuchsocial_loginException if a social_login with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public social_login findByPrimaryKey(long cid)
		throws NoSuchsocial_loginException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the social_login with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the social_login
	 * @return the social_login, or <code>null</code> if a social_login with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public social_login fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		social_login social_login = (social_login)EntityCacheUtil.getResult(social_loginModelImpl.ENTITY_CACHE_ENABLED,
				social_loginImpl.class, primaryKey);

		if (social_login == _nullsocial_login) {
			return null;
		}

		if (social_login == null) {
			Session session = null;

			try {
				session = openSession();

				social_login = (social_login)session.get(social_loginImpl.class,
						primaryKey);

				if (social_login != null) {
					cacheResult(social_login);
				}
				else {
					EntityCacheUtil.putResult(social_loginModelImpl.ENTITY_CACHE_ENABLED,
						social_loginImpl.class, primaryKey, _nullsocial_login);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(social_loginModelImpl.ENTITY_CACHE_ENABLED,
					social_loginImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return social_login;
	}

	/**
	 * Returns the social_login with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the social_login
	 * @return the social_login, or <code>null</code> if a social_login with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public social_login fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the social_logins.
	 *
	 * @return the social_logins
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<social_login> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the social_logins.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.social_loginModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of social_logins
	 * @param end the upper bound of the range of social_logins (not inclusive)
	 * @return the range of social_logins
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<social_login> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the social_logins.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.social_loginModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of social_logins
	 * @param end the upper bound of the range of social_logins (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of social_logins
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<social_login> findAll(int start, int end,
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

		List<social_login> list = (List<social_login>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SOCIAL_LOGIN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SOCIAL_LOGIN;

				if (pagination) {
					sql = sql.concat(social_loginModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<social_login>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<social_login>(list);
				}
				else {
					list = (List<social_login>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the social_logins from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (social_login social_login : findAll()) {
			remove(social_login);
		}
	}

	/**
	 * Returns the number of social_logins.
	 *
	 * @return the number of social_logins
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

				Query q = session.createQuery(_SQL_COUNT_SOCIAL_LOGIN);

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
	 * Initializes the social_login persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.social_login")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<social_login>> listenersList = new ArrayList<ModelListener<social_login>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<social_login>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(social_loginImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SOCIAL_LOGIN = "SELECT social_login FROM social_login social_login";
	private static final String _SQL_COUNT_SOCIAL_LOGIN = "SELECT COUNT(social_login) FROM social_login social_login";
	private static final String _ORDER_BY_ENTITY_ALIAS = "social_login.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No social_login exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(social_loginPersistenceImpl.class);
	private static social_login _nullsocial_login = new social_loginImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<social_login> toCacheModel() {
				return _nullsocial_loginCacheModel;
			}
		};

	private static CacheModel<social_login> _nullsocial_loginCacheModel = new CacheModel<social_login>() {
			@Override
			public social_login toEntityModel() {
				return _nullsocial_login;
			}
		};
}