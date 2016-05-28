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

import com.db.NoSuchprofileException;

import com.db.model.impl.profileImpl;
import com.db.model.impl.profileModelImpl;
import com.db.model.profile;

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
 * The persistence implementation for the profile service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see profilePersistence
 * @see profileUtil
 * @generated
 */
public class profilePersistenceImpl extends BasePersistenceImpl<profile>
	implements profilePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link profileUtil} to access the profile persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = profileImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(profileModelImpl.ENTITY_CACHE_ENABLED,
			profileModelImpl.FINDER_CACHE_ENABLED, profileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(profileModelImpl.ENTITY_CACHE_ENABLED,
			profileModelImpl.FINDER_CACHE_ENABLED, profileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(profileModelImpl.ENTITY_CACHE_ENABLED,
			profileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public profilePersistenceImpl() {
		setModelClass(profile.class);
	}

	/**
	 * Caches the profile in the entity cache if it is enabled.
	 *
	 * @param profile the profile
	 */
	@Override
	public void cacheResult(profile profile) {
		EntityCacheUtil.putResult(profileModelImpl.ENTITY_CACHE_ENABLED,
			profileImpl.class, profile.getPrimaryKey(), profile);

		profile.resetOriginalValues();
	}

	/**
	 * Caches the profiles in the entity cache if it is enabled.
	 *
	 * @param profiles the profiles
	 */
	@Override
	public void cacheResult(List<profile> profiles) {
		for (profile profile : profiles) {
			if (EntityCacheUtil.getResult(
						profileModelImpl.ENTITY_CACHE_ENABLED,
						profileImpl.class, profile.getPrimaryKey()) == null) {
				cacheResult(profile);
			}
			else {
				profile.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all profiles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(profileImpl.class.getName());
		}

		EntityCacheUtil.clearCache(profileImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the profile.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(profile profile) {
		EntityCacheUtil.removeResult(profileModelImpl.ENTITY_CACHE_ENABLED,
			profileImpl.class, profile.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<profile> profiles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (profile profile : profiles) {
			EntityCacheUtil.removeResult(profileModelImpl.ENTITY_CACHE_ENABLED,
				profileImpl.class, profile.getPrimaryKey());
		}
	}

	/**
	 * Creates a new profile with the primary key. Does not add the profile to the database.
	 *
	 * @param cid the primary key for the new profile
	 * @return the new profile
	 */
	@Override
	public profile create(long cid) {
		profile profile = new profileImpl();

		profile.setNew(true);
		profile.setPrimaryKey(cid);

		return profile;
	}

	/**
	 * Removes the profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the profile
	 * @return the profile that was removed
	 * @throws com.db.NoSuchprofileException if a profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public profile remove(long cid)
		throws NoSuchprofileException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the profile
	 * @return the profile that was removed
	 * @throws com.db.NoSuchprofileException if a profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public profile remove(Serializable primaryKey)
		throws NoSuchprofileException, SystemException {
		Session session = null;

		try {
			session = openSession();

			profile profile = (profile)session.get(profileImpl.class, primaryKey);

			if (profile == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchprofileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(profile);
		}
		catch (NoSuchprofileException nsee) {
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
	protected profile removeImpl(profile profile) throws SystemException {
		profile = toUnwrappedModel(profile);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(profile)) {
				profile = (profile)session.get(profileImpl.class,
						profile.getPrimaryKeyObj());
			}

			if (profile != null) {
				session.delete(profile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (profile != null) {
			clearCache(profile);
		}

		return profile;
	}

	@Override
	public profile updateImpl(com.db.model.profile profile)
		throws SystemException {
		profile = toUnwrappedModel(profile);

		boolean isNew = profile.isNew();

		Session session = null;

		try {
			session = openSession();

			if (profile.isNew()) {
				session.save(profile);

				profile.setNew(false);
			}
			else {
				session.merge(profile);
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

		EntityCacheUtil.putResult(profileModelImpl.ENTITY_CACHE_ENABLED,
			profileImpl.class, profile.getPrimaryKey(), profile);

		return profile;
	}

	protected profile toUnwrappedModel(profile profile) {
		if (profile instanceof profileImpl) {
			return profile;
		}

		profileImpl profileImpl = new profileImpl();

		profileImpl.setNew(profile.isNew());
		profileImpl.setPrimaryKey(profile.getPrimaryKey());

		profileImpl.setCid(profile.getCid());
		profileImpl.setType_id(profile.getType_id());
		profileImpl.setGenere_id(profile.getGenere_id());
		profileImpl.setUser_id(profile.getUser_id());
		profileImpl.setProfile_name(profile.getProfile_name());

		return profileImpl;
	}

	/**
	 * Returns the profile with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the profile
	 * @return the profile
	 * @throws com.db.NoSuchprofileException if a profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public profile findByPrimaryKey(Serializable primaryKey)
		throws NoSuchprofileException, SystemException {
		profile profile = fetchByPrimaryKey(primaryKey);

		if (profile == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchprofileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return profile;
	}

	/**
	 * Returns the profile with the primary key or throws a {@link com.db.NoSuchprofileException} if it could not be found.
	 *
	 * @param cid the primary key of the profile
	 * @return the profile
	 * @throws com.db.NoSuchprofileException if a profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public profile findByPrimaryKey(long cid)
		throws NoSuchprofileException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the profile
	 * @return the profile, or <code>null</code> if a profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public profile fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		profile profile = (profile)EntityCacheUtil.getResult(profileModelImpl.ENTITY_CACHE_ENABLED,
				profileImpl.class, primaryKey);

		if (profile == _nullprofile) {
			return null;
		}

		if (profile == null) {
			Session session = null;

			try {
				session = openSession();

				profile = (profile)session.get(profileImpl.class, primaryKey);

				if (profile != null) {
					cacheResult(profile);
				}
				else {
					EntityCacheUtil.putResult(profileModelImpl.ENTITY_CACHE_ENABLED,
						profileImpl.class, primaryKey, _nullprofile);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(profileModelImpl.ENTITY_CACHE_ENABLED,
					profileImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return profile;
	}

	/**
	 * Returns the profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the profile
	 * @return the profile, or <code>null</code> if a profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public profile fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the profiles.
	 *
	 * @return the profiles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<profile> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.profileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of profiles
	 * @param end the upper bound of the range of profiles (not inclusive)
	 * @return the range of profiles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<profile> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.profileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of profiles
	 * @param end the upper bound of the range of profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of profiles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<profile> findAll(int start, int end,
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

		List<profile> list = (List<profile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PROFILE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROFILE;

				if (pagination) {
					sql = sql.concat(profileModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<profile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<profile>(list);
				}
				else {
					list = (List<profile>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the profiles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (profile profile : findAll()) {
			remove(profile);
		}
	}

	/**
	 * Returns the number of profiles.
	 *
	 * @return the number of profiles
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

				Query q = session.createQuery(_SQL_COUNT_PROFILE);

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
	 * Initializes the profile persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.profile")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<profile>> listenersList = new ArrayList<ModelListener<profile>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<profile>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(profileImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PROFILE = "SELECT profile FROM profile profile";
	private static final String _SQL_COUNT_PROFILE = "SELECT COUNT(profile) FROM profile profile";
	private static final String _ORDER_BY_ENTITY_ALIAS = "profile.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No profile exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(profilePersistenceImpl.class);
	private static profile _nullprofile = new profileImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<profile> toCacheModel() {
				return _nullprofileCacheModel;
			}
		};

	private static CacheModel<profile> _nullprofileCacheModel = new CacheModel<profile>() {
			@Override
			public profile toEntityModel() {
				return _nullprofile;
			}
		};
}