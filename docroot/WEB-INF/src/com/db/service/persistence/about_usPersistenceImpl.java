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

import com.db.NoSuchabout_usException;

import com.db.model.about_us;
import com.db.model.impl.about_usImpl;
import com.db.model.impl.about_usModelImpl;

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
import com.liferay.portal.kernel.util.SetUtil;
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
import java.util.Set;

/**
 * The persistence implementation for the about_us service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see about_usPersistence
 * @see about_usUtil
 * @generated
 */
public class about_usPersistenceImpl extends BasePersistenceImpl<about_us>
	implements about_usPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link about_usUtil} to access the about_us persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = about_usImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(about_usModelImpl.ENTITY_CACHE_ENABLED,
			about_usModelImpl.FINDER_CACHE_ENABLED, about_usImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(about_usModelImpl.ENTITY_CACHE_ENABLED,
			about_usModelImpl.FINDER_CACHE_ENABLED, about_usImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(about_usModelImpl.ENTITY_CACHE_ENABLED,
			about_usModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public about_usPersistenceImpl() {
		setModelClass(about_us.class);
	}

	/**
	 * Caches the about_us in the entity cache if it is enabled.
	 *
	 * @param about_us the about_us
	 */
	@Override
	public void cacheResult(about_us about_us) {
		EntityCacheUtil.putResult(about_usModelImpl.ENTITY_CACHE_ENABLED,
			about_usImpl.class, about_us.getPrimaryKey(), about_us);

		about_us.resetOriginalValues();
	}

	/**
	 * Caches the about_uses in the entity cache if it is enabled.
	 *
	 * @param about_uses the about_uses
	 */
	@Override
	public void cacheResult(List<about_us> about_uses) {
		for (about_us about_us : about_uses) {
			if (EntityCacheUtil.getResult(
						about_usModelImpl.ENTITY_CACHE_ENABLED,
						about_usImpl.class, about_us.getPrimaryKey()) == null) {
				cacheResult(about_us);
			}
			else {
				about_us.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all about_uses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(about_usImpl.class.getName());
		}

		EntityCacheUtil.clearCache(about_usImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the about_us.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(about_us about_us) {
		EntityCacheUtil.removeResult(about_usModelImpl.ENTITY_CACHE_ENABLED,
			about_usImpl.class, about_us.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<about_us> about_uses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (about_us about_us : about_uses) {
			EntityCacheUtil.removeResult(about_usModelImpl.ENTITY_CACHE_ENABLED,
				about_usImpl.class, about_us.getPrimaryKey());
		}
	}

	/**
	 * Creates a new about_us with the primary key. Does not add the about_us to the database.
	 *
	 * @param cid the primary key for the new about_us
	 * @return the new about_us
	 */
	@Override
	public about_us create(long cid) {
		about_us about_us = new about_usImpl();

		about_us.setNew(true);
		about_us.setPrimaryKey(cid);

		return about_us;
	}

	/**
	 * Removes the about_us with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the about_us
	 * @return the about_us that was removed
	 * @throws com.db.NoSuchabout_usException if a about_us with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public about_us remove(long cid)
		throws NoSuchabout_usException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the about_us with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the about_us
	 * @return the about_us that was removed
	 * @throws com.db.NoSuchabout_usException if a about_us with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public about_us remove(Serializable primaryKey)
		throws NoSuchabout_usException, SystemException {
		Session session = null;

		try {
			session = openSession();

			about_us about_us = (about_us)session.get(about_usImpl.class,
					primaryKey);

			if (about_us == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchabout_usException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(about_us);
		}
		catch (NoSuchabout_usException nsee) {
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
	protected about_us removeImpl(about_us about_us) throws SystemException {
		about_us = toUnwrappedModel(about_us);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(about_us)) {
				about_us = (about_us)session.get(about_usImpl.class,
						about_us.getPrimaryKeyObj());
			}

			if (about_us != null) {
				session.delete(about_us);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (about_us != null) {
			clearCache(about_us);
		}

		return about_us;
	}

	@Override
	public about_us updateImpl(com.db.model.about_us about_us)
		throws SystemException {
		about_us = toUnwrappedModel(about_us);

		boolean isNew = about_us.isNew();

		Session session = null;

		try {
			session = openSession();

			if (about_us.isNew()) {
				session.save(about_us);

				about_us.setNew(false);
			}
			else {
				session.merge(about_us);
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

		EntityCacheUtil.putResult(about_usModelImpl.ENTITY_CACHE_ENABLED,
			about_usImpl.class, about_us.getPrimaryKey(), about_us);

		return about_us;
	}

	protected about_us toUnwrappedModel(about_us about_us) {
		if (about_us instanceof about_usImpl) {
			return about_us;
		}

		about_usImpl about_usImpl = new about_usImpl();

		about_usImpl.setNew(about_us.isNew());
		about_usImpl.setPrimaryKey(about_us.getPrimaryKey());

		about_usImpl.setCid(about_us.getCid());
		about_usImpl.setProfile_id(about_us.getProfile_id());
		about_usImpl.setText(about_us.getText());

		return about_usImpl;
	}

	/**
	 * Returns the about_us with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the about_us
	 * @return the about_us
	 * @throws com.db.NoSuchabout_usException if a about_us with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public about_us findByPrimaryKey(Serializable primaryKey)
		throws NoSuchabout_usException, SystemException {
		about_us about_us = fetchByPrimaryKey(primaryKey);

		if (about_us == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchabout_usException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return about_us;
	}

	/**
	 * Returns the about_us with the primary key or throws a {@link com.db.NoSuchabout_usException} if it could not be found.
	 *
	 * @param cid the primary key of the about_us
	 * @return the about_us
	 * @throws com.db.NoSuchabout_usException if a about_us with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public about_us findByPrimaryKey(long cid)
		throws NoSuchabout_usException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the about_us with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the about_us
	 * @return the about_us, or <code>null</code> if a about_us with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public about_us fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		about_us about_us = (about_us)EntityCacheUtil.getResult(about_usModelImpl.ENTITY_CACHE_ENABLED,
				about_usImpl.class, primaryKey);

		if (about_us == _nullabout_us) {
			return null;
		}

		if (about_us == null) {
			Session session = null;

			try {
				session = openSession();

				about_us = (about_us)session.get(about_usImpl.class, primaryKey);

				if (about_us != null) {
					cacheResult(about_us);
				}
				else {
					EntityCacheUtil.putResult(about_usModelImpl.ENTITY_CACHE_ENABLED,
						about_usImpl.class, primaryKey, _nullabout_us);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(about_usModelImpl.ENTITY_CACHE_ENABLED,
					about_usImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return about_us;
	}

	/**
	 * Returns the about_us with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the about_us
	 * @return the about_us, or <code>null</code> if a about_us with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public about_us fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the about_uses.
	 *
	 * @return the about_uses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<about_us> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the about_uses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.about_usModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of about_uses
	 * @param end the upper bound of the range of about_uses (not inclusive)
	 * @return the range of about_uses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<about_us> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the about_uses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.about_usModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of about_uses
	 * @param end the upper bound of the range of about_uses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of about_uses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<about_us> findAll(int start, int end,
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

		List<about_us> list = (List<about_us>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ABOUT_US);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ABOUT_US;

				if (pagination) {
					sql = sql.concat(about_usModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<about_us>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<about_us>(list);
				}
				else {
					list = (List<about_us>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the about_uses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (about_us about_us : findAll()) {
			remove(about_us);
		}
	}

	/**
	 * Returns the number of about_uses.
	 *
	 * @return the number of about_uses
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

				Query q = session.createQuery(_SQL_COUNT_ABOUT_US);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the about_us persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.about_us")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<about_us>> listenersList = new ArrayList<ModelListener<about_us>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<about_us>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(about_usImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ABOUT_US = "SELECT about_us FROM about_us about_us";
	private static final String _SQL_COUNT_ABOUT_US = "SELECT COUNT(about_us) FROM about_us about_us";
	private static final String _ORDER_BY_ENTITY_ALIAS = "about_us.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No about_us exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(about_usPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"text"
			});
	private static about_us _nullabout_us = new about_usImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<about_us> toCacheModel() {
				return _nullabout_usCacheModel;
			}
		};

	private static CacheModel<about_us> _nullabout_usCacheModel = new CacheModel<about_us>() {
			@Override
			public about_us toEntityModel() {
				return _nullabout_us;
			}
		};
}