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

import com.db.NoSuchmedia_linksException;

import com.db.model.impl.media_linksImpl;
import com.db.model.impl.media_linksModelImpl;
import com.db.model.media_links;

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
 * The persistence implementation for the media_links service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see media_linksPersistence
 * @see media_linksUtil
 * @generated
 */
public class media_linksPersistenceImpl extends BasePersistenceImpl<media_links>
	implements media_linksPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link media_linksUtil} to access the media_links persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = media_linksImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(media_linksModelImpl.ENTITY_CACHE_ENABLED,
			media_linksModelImpl.FINDER_CACHE_ENABLED, media_linksImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(media_linksModelImpl.ENTITY_CACHE_ENABLED,
			media_linksModelImpl.FINDER_CACHE_ENABLED, media_linksImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(media_linksModelImpl.ENTITY_CACHE_ENABLED,
			media_linksModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public media_linksPersistenceImpl() {
		setModelClass(media_links.class);
	}

	/**
	 * Caches the media_links in the entity cache if it is enabled.
	 *
	 * @param media_links the media_links
	 */
	@Override
	public void cacheResult(media_links media_links) {
		EntityCacheUtil.putResult(media_linksModelImpl.ENTITY_CACHE_ENABLED,
			media_linksImpl.class, media_links.getPrimaryKey(), media_links);

		media_links.resetOriginalValues();
	}

	/**
	 * Caches the media_linkses in the entity cache if it is enabled.
	 *
	 * @param media_linkses the media_linkses
	 */
	@Override
	public void cacheResult(List<media_links> media_linkses) {
		for (media_links media_links : media_linkses) {
			if (EntityCacheUtil.getResult(
						media_linksModelImpl.ENTITY_CACHE_ENABLED,
						media_linksImpl.class, media_links.getPrimaryKey()) == null) {
				cacheResult(media_links);
			}
			else {
				media_links.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all media_linkses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(media_linksImpl.class.getName());
		}

		EntityCacheUtil.clearCache(media_linksImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the media_links.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(media_links media_links) {
		EntityCacheUtil.removeResult(media_linksModelImpl.ENTITY_CACHE_ENABLED,
			media_linksImpl.class, media_links.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<media_links> media_linkses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (media_links media_links : media_linkses) {
			EntityCacheUtil.removeResult(media_linksModelImpl.ENTITY_CACHE_ENABLED,
				media_linksImpl.class, media_links.getPrimaryKey());
		}
	}

	/**
	 * Creates a new media_links with the primary key. Does not add the media_links to the database.
	 *
	 * @param cid the primary key for the new media_links
	 * @return the new media_links
	 */
	@Override
	public media_links create(long cid) {
		media_links media_links = new media_linksImpl();

		media_links.setNew(true);
		media_links.setPrimaryKey(cid);

		return media_links;
	}

	/**
	 * Removes the media_links with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the media_links
	 * @return the media_links that was removed
	 * @throws com.db.NoSuchmedia_linksException if a media_links with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public media_links remove(long cid)
		throws NoSuchmedia_linksException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the media_links with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the media_links
	 * @return the media_links that was removed
	 * @throws com.db.NoSuchmedia_linksException if a media_links with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public media_links remove(Serializable primaryKey)
		throws NoSuchmedia_linksException, SystemException {
		Session session = null;

		try {
			session = openSession();

			media_links media_links = (media_links)session.get(media_linksImpl.class,
					primaryKey);

			if (media_links == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchmedia_linksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(media_links);
		}
		catch (NoSuchmedia_linksException nsee) {
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
	protected media_links removeImpl(media_links media_links)
		throws SystemException {
		media_links = toUnwrappedModel(media_links);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(media_links)) {
				media_links = (media_links)session.get(media_linksImpl.class,
						media_links.getPrimaryKeyObj());
			}

			if (media_links != null) {
				session.delete(media_links);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (media_links != null) {
			clearCache(media_links);
		}

		return media_links;
	}

	@Override
	public media_links updateImpl(com.db.model.media_links media_links)
		throws SystemException {
		media_links = toUnwrappedModel(media_links);

		boolean isNew = media_links.isNew();

		Session session = null;

		try {
			session = openSession();

			if (media_links.isNew()) {
				session.save(media_links);

				media_links.setNew(false);
			}
			else {
				session.merge(media_links);
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

		EntityCacheUtil.putResult(media_linksModelImpl.ENTITY_CACHE_ENABLED,
			media_linksImpl.class, media_links.getPrimaryKey(), media_links);

		return media_links;
	}

	protected media_links toUnwrappedModel(media_links media_links) {
		if (media_links instanceof media_linksImpl) {
			return media_links;
		}

		media_linksImpl media_linksImpl = new media_linksImpl();

		media_linksImpl.setNew(media_links.isNew());
		media_linksImpl.setPrimaryKey(media_links.getPrimaryKey());

		media_linksImpl.setCid(media_links.getCid());
		media_linksImpl.setProfile_id(media_links.getProfile_id());
		media_linksImpl.setMedia_type_id(media_links.getMedia_type_id());
		media_linksImpl.setLink(media_links.getLink());

		return media_linksImpl;
	}

	/**
	 * Returns the media_links with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the media_links
	 * @return the media_links
	 * @throws com.db.NoSuchmedia_linksException if a media_links with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public media_links findByPrimaryKey(Serializable primaryKey)
		throws NoSuchmedia_linksException, SystemException {
		media_links media_links = fetchByPrimaryKey(primaryKey);

		if (media_links == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchmedia_linksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return media_links;
	}

	/**
	 * Returns the media_links with the primary key or throws a {@link com.db.NoSuchmedia_linksException} if it could not be found.
	 *
	 * @param cid the primary key of the media_links
	 * @return the media_links
	 * @throws com.db.NoSuchmedia_linksException if a media_links with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public media_links findByPrimaryKey(long cid)
		throws NoSuchmedia_linksException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the media_links with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the media_links
	 * @return the media_links, or <code>null</code> if a media_links with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public media_links fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		media_links media_links = (media_links)EntityCacheUtil.getResult(media_linksModelImpl.ENTITY_CACHE_ENABLED,
				media_linksImpl.class, primaryKey);

		if (media_links == _nullmedia_links) {
			return null;
		}

		if (media_links == null) {
			Session session = null;

			try {
				session = openSession();

				media_links = (media_links)session.get(media_linksImpl.class,
						primaryKey);

				if (media_links != null) {
					cacheResult(media_links);
				}
				else {
					EntityCacheUtil.putResult(media_linksModelImpl.ENTITY_CACHE_ENABLED,
						media_linksImpl.class, primaryKey, _nullmedia_links);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(media_linksModelImpl.ENTITY_CACHE_ENABLED,
					media_linksImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return media_links;
	}

	/**
	 * Returns the media_links with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the media_links
	 * @return the media_links, or <code>null</code> if a media_links with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public media_links fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the media_linkses.
	 *
	 * @return the media_linkses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<media_links> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the media_linkses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.media_linksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of media_linkses
	 * @param end the upper bound of the range of media_linkses (not inclusive)
	 * @return the range of media_linkses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<media_links> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the media_linkses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.media_linksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of media_linkses
	 * @param end the upper bound of the range of media_linkses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of media_linkses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<media_links> findAll(int start, int end,
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

		List<media_links> list = (List<media_links>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MEDIA_LINKS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MEDIA_LINKS;

				if (pagination) {
					sql = sql.concat(media_linksModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<media_links>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<media_links>(list);
				}
				else {
					list = (List<media_links>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the media_linkses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (media_links media_links : findAll()) {
			remove(media_links);
		}
	}

	/**
	 * Returns the number of media_linkses.
	 *
	 * @return the number of media_linkses
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

				Query q = session.createQuery(_SQL_COUNT_MEDIA_LINKS);

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
	 * Initializes the media_links persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.media_links")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<media_links>> listenersList = new ArrayList<ModelListener<media_links>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<media_links>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(media_linksImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MEDIA_LINKS = "SELECT media_links FROM media_links media_links";
	private static final String _SQL_COUNT_MEDIA_LINKS = "SELECT COUNT(media_links) FROM media_links media_links";
	private static final String _ORDER_BY_ENTITY_ALIAS = "media_links.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No media_links exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(media_linksPersistenceImpl.class);
	private static media_links _nullmedia_links = new media_linksImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<media_links> toCacheModel() {
				return _nullmedia_linksCacheModel;
			}
		};

	private static CacheModel<media_links> _nullmedia_linksCacheModel = new CacheModel<media_links>() {
			@Override
			public media_links toEntityModel() {
				return _nullmedia_links;
			}
		};
}