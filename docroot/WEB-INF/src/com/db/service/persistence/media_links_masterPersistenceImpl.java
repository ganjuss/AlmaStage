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

import com.db.NoSuchmedia_links_masterException;

import com.db.model.impl.media_links_masterImpl;
import com.db.model.impl.media_links_masterModelImpl;
import com.db.model.media_links_master;

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
 * The persistence implementation for the media_links_master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see media_links_masterPersistence
 * @see media_links_masterUtil
 * @generated
 */
public class media_links_masterPersistenceImpl extends BasePersistenceImpl<media_links_master>
	implements media_links_masterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link media_links_masterUtil} to access the media_links_master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = media_links_masterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(media_links_masterModelImpl.ENTITY_CACHE_ENABLED,
			media_links_masterModelImpl.FINDER_CACHE_ENABLED,
			media_links_masterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(media_links_masterModelImpl.ENTITY_CACHE_ENABLED,
			media_links_masterModelImpl.FINDER_CACHE_ENABLED,
			media_links_masterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(media_links_masterModelImpl.ENTITY_CACHE_ENABLED,
			media_links_masterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public media_links_masterPersistenceImpl() {
		setModelClass(media_links_master.class);
	}

	/**
	 * Caches the media_links_master in the entity cache if it is enabled.
	 *
	 * @param media_links_master the media_links_master
	 */
	@Override
	public void cacheResult(media_links_master media_links_master) {
		EntityCacheUtil.putResult(media_links_masterModelImpl.ENTITY_CACHE_ENABLED,
			media_links_masterImpl.class, media_links_master.getPrimaryKey(),
			media_links_master);

		media_links_master.resetOriginalValues();
	}

	/**
	 * Caches the media_links_masters in the entity cache if it is enabled.
	 *
	 * @param media_links_masters the media_links_masters
	 */
	@Override
	public void cacheResult(List<media_links_master> media_links_masters) {
		for (media_links_master media_links_master : media_links_masters) {
			if (EntityCacheUtil.getResult(
						media_links_masterModelImpl.ENTITY_CACHE_ENABLED,
						media_links_masterImpl.class,
						media_links_master.getPrimaryKey()) == null) {
				cacheResult(media_links_master);
			}
			else {
				media_links_master.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all media_links_masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(media_links_masterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(media_links_masterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the media_links_master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(media_links_master media_links_master) {
		EntityCacheUtil.removeResult(media_links_masterModelImpl.ENTITY_CACHE_ENABLED,
			media_links_masterImpl.class, media_links_master.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<media_links_master> media_links_masters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (media_links_master media_links_master : media_links_masters) {
			EntityCacheUtil.removeResult(media_links_masterModelImpl.ENTITY_CACHE_ENABLED,
				media_links_masterImpl.class, media_links_master.getPrimaryKey());
		}
	}

	/**
	 * Creates a new media_links_master with the primary key. Does not add the media_links_master to the database.
	 *
	 * @param cid the primary key for the new media_links_master
	 * @return the new media_links_master
	 */
	@Override
	public media_links_master create(long cid) {
		media_links_master media_links_master = new media_links_masterImpl();

		media_links_master.setNew(true);
		media_links_master.setPrimaryKey(cid);

		return media_links_master;
	}

	/**
	 * Removes the media_links_master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the media_links_master
	 * @return the media_links_master that was removed
	 * @throws com.db.NoSuchmedia_links_masterException if a media_links_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public media_links_master remove(long cid)
		throws NoSuchmedia_links_masterException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the media_links_master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the media_links_master
	 * @return the media_links_master that was removed
	 * @throws com.db.NoSuchmedia_links_masterException if a media_links_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public media_links_master remove(Serializable primaryKey)
		throws NoSuchmedia_links_masterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			media_links_master media_links_master = (media_links_master)session.get(media_links_masterImpl.class,
					primaryKey);

			if (media_links_master == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchmedia_links_masterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(media_links_master);
		}
		catch (NoSuchmedia_links_masterException nsee) {
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
	protected media_links_master removeImpl(
		media_links_master media_links_master) throws SystemException {
		media_links_master = toUnwrappedModel(media_links_master);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(media_links_master)) {
				media_links_master = (media_links_master)session.get(media_links_masterImpl.class,
						media_links_master.getPrimaryKeyObj());
			}

			if (media_links_master != null) {
				session.delete(media_links_master);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (media_links_master != null) {
			clearCache(media_links_master);
		}

		return media_links_master;
	}

	@Override
	public media_links_master updateImpl(
		com.db.model.media_links_master media_links_master)
		throws SystemException {
		media_links_master = toUnwrappedModel(media_links_master);

		boolean isNew = media_links_master.isNew();

		Session session = null;

		try {
			session = openSession();

			if (media_links_master.isNew()) {
				session.save(media_links_master);

				media_links_master.setNew(false);
			}
			else {
				session.merge(media_links_master);
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

		EntityCacheUtil.putResult(media_links_masterModelImpl.ENTITY_CACHE_ENABLED,
			media_links_masterImpl.class, media_links_master.getPrimaryKey(),
			media_links_master);

		return media_links_master;
	}

	protected media_links_master toUnwrappedModel(
		media_links_master media_links_master) {
		if (media_links_master instanceof media_links_masterImpl) {
			return media_links_master;
		}

		media_links_masterImpl media_links_masterImpl = new media_links_masterImpl();

		media_links_masterImpl.setNew(media_links_master.isNew());
		media_links_masterImpl.setPrimaryKey(media_links_master.getPrimaryKey());

		media_links_masterImpl.setCid(media_links_master.getCid());
		media_links_masterImpl.setName(media_links_master.getName());

		return media_links_masterImpl;
	}

	/**
	 * Returns the media_links_master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the media_links_master
	 * @return the media_links_master
	 * @throws com.db.NoSuchmedia_links_masterException if a media_links_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public media_links_master findByPrimaryKey(Serializable primaryKey)
		throws NoSuchmedia_links_masterException, SystemException {
		media_links_master media_links_master = fetchByPrimaryKey(primaryKey);

		if (media_links_master == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchmedia_links_masterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return media_links_master;
	}

	/**
	 * Returns the media_links_master with the primary key or throws a {@link com.db.NoSuchmedia_links_masterException} if it could not be found.
	 *
	 * @param cid the primary key of the media_links_master
	 * @return the media_links_master
	 * @throws com.db.NoSuchmedia_links_masterException if a media_links_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public media_links_master findByPrimaryKey(long cid)
		throws NoSuchmedia_links_masterException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the media_links_master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the media_links_master
	 * @return the media_links_master, or <code>null</code> if a media_links_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public media_links_master fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		media_links_master media_links_master = (media_links_master)EntityCacheUtil.getResult(media_links_masterModelImpl.ENTITY_CACHE_ENABLED,
				media_links_masterImpl.class, primaryKey);

		if (media_links_master == _nullmedia_links_master) {
			return null;
		}

		if (media_links_master == null) {
			Session session = null;

			try {
				session = openSession();

				media_links_master = (media_links_master)session.get(media_links_masterImpl.class,
						primaryKey);

				if (media_links_master != null) {
					cacheResult(media_links_master);
				}
				else {
					EntityCacheUtil.putResult(media_links_masterModelImpl.ENTITY_CACHE_ENABLED,
						media_links_masterImpl.class, primaryKey,
						_nullmedia_links_master);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(media_links_masterModelImpl.ENTITY_CACHE_ENABLED,
					media_links_masterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return media_links_master;
	}

	/**
	 * Returns the media_links_master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the media_links_master
	 * @return the media_links_master, or <code>null</code> if a media_links_master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public media_links_master fetchByPrimaryKey(long cid)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the media_links_masters.
	 *
	 * @return the media_links_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<media_links_master> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the media_links_masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.media_links_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of media_links_masters
	 * @param end the upper bound of the range of media_links_masters (not inclusive)
	 * @return the range of media_links_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<media_links_master> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the media_links_masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.media_links_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of media_links_masters
	 * @param end the upper bound of the range of media_links_masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of media_links_masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<media_links_master> findAll(int start, int end,
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

		List<media_links_master> list = (List<media_links_master>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MEDIA_LINKS_MASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MEDIA_LINKS_MASTER;

				if (pagination) {
					sql = sql.concat(media_links_masterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<media_links_master>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<media_links_master>(list);
				}
				else {
					list = (List<media_links_master>)QueryUtil.list(q,
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
	 * Removes all the media_links_masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (media_links_master media_links_master : findAll()) {
			remove(media_links_master);
		}
	}

	/**
	 * Returns the number of media_links_masters.
	 *
	 * @return the number of media_links_masters
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

				Query q = session.createQuery(_SQL_COUNT_MEDIA_LINKS_MASTER);

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
	 * Initializes the media_links_master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.media_links_master")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<media_links_master>> listenersList = new ArrayList<ModelListener<media_links_master>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<media_links_master>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(media_links_masterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MEDIA_LINKS_MASTER = "SELECT media_links_master FROM media_links_master media_links_master";
	private static final String _SQL_COUNT_MEDIA_LINKS_MASTER = "SELECT COUNT(media_links_master) FROM media_links_master media_links_master";
	private static final String _ORDER_BY_ENTITY_ALIAS = "media_links_master.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No media_links_master exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(media_links_masterPersistenceImpl.class);
	private static media_links_master _nullmedia_links_master = new media_links_masterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<media_links_master> toCacheModel() {
				return _nullmedia_links_masterCacheModel;
			}
		};

	private static CacheModel<media_links_master> _nullmedia_links_masterCacheModel =
		new CacheModel<media_links_master>() {
			@Override
			public media_links_master toEntityModel() {
				return _nullmedia_links_master;
			}
		};
}