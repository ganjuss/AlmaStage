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

import com.db.NoSuchprofile_social_linkException;

import com.db.model.impl.profile_social_linkImpl;
import com.db.model.impl.profile_social_linkModelImpl;
import com.db.model.profile_social_link;

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
 * The persistence implementation for the profile_social_link service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see profile_social_linkPersistence
 * @see profile_social_linkUtil
 * @generated
 */
public class profile_social_linkPersistenceImpl extends BasePersistenceImpl<profile_social_link>
	implements profile_social_linkPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link profile_social_linkUtil} to access the profile_social_link persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = profile_social_linkImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(profile_social_linkModelImpl.ENTITY_CACHE_ENABLED,
			profile_social_linkModelImpl.FINDER_CACHE_ENABLED,
			profile_social_linkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(profile_social_linkModelImpl.ENTITY_CACHE_ENABLED,
			profile_social_linkModelImpl.FINDER_CACHE_ENABLED,
			profile_social_linkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(profile_social_linkModelImpl.ENTITY_CACHE_ENABLED,
			profile_social_linkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public profile_social_linkPersistenceImpl() {
		setModelClass(profile_social_link.class);
	}

	/**
	 * Caches the profile_social_link in the entity cache if it is enabled.
	 *
	 * @param profile_social_link the profile_social_link
	 */
	@Override
	public void cacheResult(profile_social_link profile_social_link) {
		EntityCacheUtil.putResult(profile_social_linkModelImpl.ENTITY_CACHE_ENABLED,
			profile_social_linkImpl.class, profile_social_link.getPrimaryKey(),
			profile_social_link);

		profile_social_link.resetOriginalValues();
	}

	/**
	 * Caches the profile_social_links in the entity cache if it is enabled.
	 *
	 * @param profile_social_links the profile_social_links
	 */
	@Override
	public void cacheResult(List<profile_social_link> profile_social_links) {
		for (profile_social_link profile_social_link : profile_social_links) {
			if (EntityCacheUtil.getResult(
						profile_social_linkModelImpl.ENTITY_CACHE_ENABLED,
						profile_social_linkImpl.class,
						profile_social_link.getPrimaryKey()) == null) {
				cacheResult(profile_social_link);
			}
			else {
				profile_social_link.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all profile_social_links.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(profile_social_linkImpl.class.getName());
		}

		EntityCacheUtil.clearCache(profile_social_linkImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the profile_social_link.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(profile_social_link profile_social_link) {
		EntityCacheUtil.removeResult(profile_social_linkModelImpl.ENTITY_CACHE_ENABLED,
			profile_social_linkImpl.class, profile_social_link.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<profile_social_link> profile_social_links) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (profile_social_link profile_social_link : profile_social_links) {
			EntityCacheUtil.removeResult(profile_social_linkModelImpl.ENTITY_CACHE_ENABLED,
				profile_social_linkImpl.class,
				profile_social_link.getPrimaryKey());
		}
	}

	/**
	 * Creates a new profile_social_link with the primary key. Does not add the profile_social_link to the database.
	 *
	 * @param cid the primary key for the new profile_social_link
	 * @return the new profile_social_link
	 */
	@Override
	public profile_social_link create(long cid) {
		profile_social_link profile_social_link = new profile_social_linkImpl();

		profile_social_link.setNew(true);
		profile_social_link.setPrimaryKey(cid);

		return profile_social_link;
	}

	/**
	 * Removes the profile_social_link with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the profile_social_link
	 * @return the profile_social_link that was removed
	 * @throws com.db.NoSuchprofile_social_linkException if a profile_social_link with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public profile_social_link remove(long cid)
		throws NoSuchprofile_social_linkException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the profile_social_link with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the profile_social_link
	 * @return the profile_social_link that was removed
	 * @throws com.db.NoSuchprofile_social_linkException if a profile_social_link with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public profile_social_link remove(Serializable primaryKey)
		throws NoSuchprofile_social_linkException, SystemException {
		Session session = null;

		try {
			session = openSession();

			profile_social_link profile_social_link = (profile_social_link)session.get(profile_social_linkImpl.class,
					primaryKey);

			if (profile_social_link == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchprofile_social_linkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(profile_social_link);
		}
		catch (NoSuchprofile_social_linkException nsee) {
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
	protected profile_social_link removeImpl(
		profile_social_link profile_social_link) throws SystemException {
		profile_social_link = toUnwrappedModel(profile_social_link);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(profile_social_link)) {
				profile_social_link = (profile_social_link)session.get(profile_social_linkImpl.class,
						profile_social_link.getPrimaryKeyObj());
			}

			if (profile_social_link != null) {
				session.delete(profile_social_link);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (profile_social_link != null) {
			clearCache(profile_social_link);
		}

		return profile_social_link;
	}

	@Override
	public profile_social_link updateImpl(
		com.db.model.profile_social_link profile_social_link)
		throws SystemException {
		profile_social_link = toUnwrappedModel(profile_social_link);

		boolean isNew = profile_social_link.isNew();

		Session session = null;

		try {
			session = openSession();

			if (profile_social_link.isNew()) {
				session.save(profile_social_link);

				profile_social_link.setNew(false);
			}
			else {
				session.merge(profile_social_link);
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

		EntityCacheUtil.putResult(profile_social_linkModelImpl.ENTITY_CACHE_ENABLED,
			profile_social_linkImpl.class, profile_social_link.getPrimaryKey(),
			profile_social_link);

		return profile_social_link;
	}

	protected profile_social_link toUnwrappedModel(
		profile_social_link profile_social_link) {
		if (profile_social_link instanceof profile_social_linkImpl) {
			return profile_social_link;
		}

		profile_social_linkImpl profile_social_linkImpl = new profile_social_linkImpl();

		profile_social_linkImpl.setNew(profile_social_link.isNew());
		profile_social_linkImpl.setPrimaryKey(profile_social_link.getPrimaryKey());

		profile_social_linkImpl.setCid(profile_social_link.getCid());
		profile_social_linkImpl.setSocial_type_id(profile_social_link.getSocial_type_id());
		profile_social_linkImpl.setLink(profile_social_link.getLink());
		profile_social_linkImpl.setProfile_id(profile_social_link.getProfile_id());

		return profile_social_linkImpl;
	}

	/**
	 * Returns the profile_social_link with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the profile_social_link
	 * @return the profile_social_link
	 * @throws com.db.NoSuchprofile_social_linkException if a profile_social_link with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public profile_social_link findByPrimaryKey(Serializable primaryKey)
		throws NoSuchprofile_social_linkException, SystemException {
		profile_social_link profile_social_link = fetchByPrimaryKey(primaryKey);

		if (profile_social_link == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchprofile_social_linkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return profile_social_link;
	}

	/**
	 * Returns the profile_social_link with the primary key or throws a {@link com.db.NoSuchprofile_social_linkException} if it could not be found.
	 *
	 * @param cid the primary key of the profile_social_link
	 * @return the profile_social_link
	 * @throws com.db.NoSuchprofile_social_linkException if a profile_social_link with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public profile_social_link findByPrimaryKey(long cid)
		throws NoSuchprofile_social_linkException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the profile_social_link with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the profile_social_link
	 * @return the profile_social_link, or <code>null</code> if a profile_social_link with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public profile_social_link fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		profile_social_link profile_social_link = (profile_social_link)EntityCacheUtil.getResult(profile_social_linkModelImpl.ENTITY_CACHE_ENABLED,
				profile_social_linkImpl.class, primaryKey);

		if (profile_social_link == _nullprofile_social_link) {
			return null;
		}

		if (profile_social_link == null) {
			Session session = null;

			try {
				session = openSession();

				profile_social_link = (profile_social_link)session.get(profile_social_linkImpl.class,
						primaryKey);

				if (profile_social_link != null) {
					cacheResult(profile_social_link);
				}
				else {
					EntityCacheUtil.putResult(profile_social_linkModelImpl.ENTITY_CACHE_ENABLED,
						profile_social_linkImpl.class, primaryKey,
						_nullprofile_social_link);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(profile_social_linkModelImpl.ENTITY_CACHE_ENABLED,
					profile_social_linkImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return profile_social_link;
	}

	/**
	 * Returns the profile_social_link with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the profile_social_link
	 * @return the profile_social_link, or <code>null</code> if a profile_social_link with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public profile_social_link fetchByPrimaryKey(long cid)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the profile_social_links.
	 *
	 * @return the profile_social_links
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<profile_social_link> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the profile_social_links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.profile_social_linkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of profile_social_links
	 * @param end the upper bound of the range of profile_social_links (not inclusive)
	 * @return the range of profile_social_links
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<profile_social_link> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the profile_social_links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.profile_social_linkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of profile_social_links
	 * @param end the upper bound of the range of profile_social_links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of profile_social_links
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<profile_social_link> findAll(int start, int end,
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

		List<profile_social_link> list = (List<profile_social_link>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PROFILE_SOCIAL_LINK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROFILE_SOCIAL_LINK;

				if (pagination) {
					sql = sql.concat(profile_social_linkModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<profile_social_link>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<profile_social_link>(list);
				}
				else {
					list = (List<profile_social_link>)QueryUtil.list(q,
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
	 * Removes all the profile_social_links from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (profile_social_link profile_social_link : findAll()) {
			remove(profile_social_link);
		}
	}

	/**
	 * Returns the number of profile_social_links.
	 *
	 * @return the number of profile_social_links
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

				Query q = session.createQuery(_SQL_COUNT_PROFILE_SOCIAL_LINK);

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
	 * Initializes the profile_social_link persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.profile_social_link")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<profile_social_link>> listenersList = new ArrayList<ModelListener<profile_social_link>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<profile_social_link>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(profile_social_linkImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PROFILE_SOCIAL_LINK = "SELECT profile_social_link FROM profile_social_link profile_social_link";
	private static final String _SQL_COUNT_PROFILE_SOCIAL_LINK = "SELECT COUNT(profile_social_link) FROM profile_social_link profile_social_link";
	private static final String _ORDER_BY_ENTITY_ALIAS = "profile_social_link.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No profile_social_link exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(profile_social_linkPersistenceImpl.class);
	private static profile_social_link _nullprofile_social_link = new profile_social_linkImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<profile_social_link> toCacheModel() {
				return _nullprofile_social_linkCacheModel;
			}
		};

	private static CacheModel<profile_social_link> _nullprofile_social_linkCacheModel =
		new CacheModel<profile_social_link>() {
			@Override
			public profile_social_link toEntityModel() {
				return _nullprofile_social_link;
			}
		};
}