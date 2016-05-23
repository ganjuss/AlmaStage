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

import com.db.NoSuchcfmException;

import com.db.model.cfm;
import com.db.model.impl.cfmImpl;
import com.db.model.impl.cfmModelImpl;

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
 * The persistence implementation for the cfm service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ganjuss
 * @see cfmPersistence
 * @see cfmUtil
 * @generated
 */
public class cfmPersistenceImpl extends BasePersistenceImpl<cfm>
	implements cfmPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link cfmUtil} to access the cfm persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = cfmImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(cfmModelImpl.ENTITY_CACHE_ENABLED,
			cfmModelImpl.FINDER_CACHE_ENABLED, cfmImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(cfmModelImpl.ENTITY_CACHE_ENABLED,
			cfmModelImpl.FINDER_CACHE_ENABLED, cfmImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(cfmModelImpl.ENTITY_CACHE_ENABLED,
			cfmModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public cfmPersistenceImpl() {
		setModelClass(cfm.class);
	}

	/**
	 * Caches the cfm in the entity cache if it is enabled.
	 *
	 * @param cfm the cfm
	 */
	@Override
	public void cacheResult(cfm cfm) {
		EntityCacheUtil.putResult(cfmModelImpl.ENTITY_CACHE_ENABLED,
			cfmImpl.class, cfm.getPrimaryKey(), cfm);

		cfm.resetOriginalValues();
	}

	/**
	 * Caches the cfms in the entity cache if it is enabled.
	 *
	 * @param cfms the cfms
	 */
	@Override
	public void cacheResult(List<cfm> cfms) {
		for (cfm cfm : cfms) {
			if (EntityCacheUtil.getResult(cfmModelImpl.ENTITY_CACHE_ENABLED,
						cfmImpl.class, cfm.getPrimaryKey()) == null) {
				cacheResult(cfm);
			}
			else {
				cfm.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cfms.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(cfmImpl.class.getName());
		}

		EntityCacheUtil.clearCache(cfmImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cfm.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(cfm cfm) {
		EntityCacheUtil.removeResult(cfmModelImpl.ENTITY_CACHE_ENABLED,
			cfmImpl.class, cfm.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<cfm> cfms) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (cfm cfm : cfms) {
			EntityCacheUtil.removeResult(cfmModelImpl.ENTITY_CACHE_ENABLED,
				cfmImpl.class, cfm.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cfm with the primary key. Does not add the cfm to the database.
	 *
	 * @param cid the primary key for the new cfm
	 * @return the new cfm
	 */
	@Override
	public cfm create(long cid) {
		cfm cfm = new cfmImpl();

		cfm.setNew(true);
		cfm.setPrimaryKey(cid);

		return cfm;
	}

	/**
	 * Removes the cfm with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cid the primary key of the cfm
	 * @return the cfm that was removed
	 * @throws com.db.NoSuchcfmException if a cfm with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cfm remove(long cid) throws NoSuchcfmException, SystemException {
		return remove((Serializable)cid);
	}

	/**
	 * Removes the cfm with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cfm
	 * @return the cfm that was removed
	 * @throws com.db.NoSuchcfmException if a cfm with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cfm remove(Serializable primaryKey)
		throws NoSuchcfmException, SystemException {
		Session session = null;

		try {
			session = openSession();

			cfm cfm = (cfm)session.get(cfmImpl.class, primaryKey);

			if (cfm == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcfmException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cfm);
		}
		catch (NoSuchcfmException nsee) {
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
	protected cfm removeImpl(cfm cfm) throws SystemException {
		cfm = toUnwrappedModel(cfm);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cfm)) {
				cfm = (cfm)session.get(cfmImpl.class, cfm.getPrimaryKeyObj());
			}

			if (cfm != null) {
				session.delete(cfm);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cfm != null) {
			clearCache(cfm);
		}

		return cfm;
	}

	@Override
	public cfm updateImpl(com.db.model.cfm cfm) throws SystemException {
		cfm = toUnwrappedModel(cfm);

		boolean isNew = cfm.isNew();

		Session session = null;

		try {
			session = openSession();

			if (cfm.isNew()) {
				session.save(cfm);

				cfm.setNew(false);
			}
			else {
				session.merge(cfm);
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

		EntityCacheUtil.putResult(cfmModelImpl.ENTITY_CACHE_ENABLED,
			cfmImpl.class, cfm.getPrimaryKey(), cfm);

		return cfm;
	}

	protected cfm toUnwrappedModel(cfm cfm) {
		if (cfm instanceof cfmImpl) {
			return cfm;
		}

		cfmImpl cfmImpl = new cfmImpl();

		cfmImpl.setNew(cfm.isNew());
		cfmImpl.setPrimaryKey(cfm.getPrimaryKey());

		cfmImpl.setCid(cfm.getCid());
		cfmImpl.setCfm_by(cfm.getCfm_by());
		cfmImpl.setCfm_to(cfm.getCfm_to());
		cfmImpl.setCfm_type_id(cfm.getCfm_type_id());

		return cfmImpl;
	}

	/**
	 * Returns the cfm with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cfm
	 * @return the cfm
	 * @throws com.db.NoSuchcfmException if a cfm with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cfm findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcfmException, SystemException {
		cfm cfm = fetchByPrimaryKey(primaryKey);

		if (cfm == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcfmException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cfm;
	}

	/**
	 * Returns the cfm with the primary key or throws a {@link com.db.NoSuchcfmException} if it could not be found.
	 *
	 * @param cid the primary key of the cfm
	 * @return the cfm
	 * @throws com.db.NoSuchcfmException if a cfm with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cfm findByPrimaryKey(long cid)
		throws NoSuchcfmException, SystemException {
		return findByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns the cfm with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cfm
	 * @return the cfm, or <code>null</code> if a cfm with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cfm fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		cfm cfm = (cfm)EntityCacheUtil.getResult(cfmModelImpl.ENTITY_CACHE_ENABLED,
				cfmImpl.class, primaryKey);

		if (cfm == _nullcfm) {
			return null;
		}

		if (cfm == null) {
			Session session = null;

			try {
				session = openSession();

				cfm = (cfm)session.get(cfmImpl.class, primaryKey);

				if (cfm != null) {
					cacheResult(cfm);
				}
				else {
					EntityCacheUtil.putResult(cfmModelImpl.ENTITY_CACHE_ENABLED,
						cfmImpl.class, primaryKey, _nullcfm);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(cfmModelImpl.ENTITY_CACHE_ENABLED,
					cfmImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cfm;
	}

	/**
	 * Returns the cfm with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cid the primary key of the cfm
	 * @return the cfm, or <code>null</code> if a cfm with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cfm fetchByPrimaryKey(long cid) throws SystemException {
		return fetchByPrimaryKey((Serializable)cid);
	}

	/**
	 * Returns all the cfms.
	 *
	 * @return the cfms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<cfm> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cfms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.cfmModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cfms
	 * @param end the upper bound of the range of cfms (not inclusive)
	 * @return the range of cfms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<cfm> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cfms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.cfmModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cfms
	 * @param end the upper bound of the range of cfms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cfms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<cfm> findAll(int start, int end,
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

		List<cfm> list = (List<cfm>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CFM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CFM;

				if (pagination) {
					sql = sql.concat(cfmModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<cfm>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<cfm>(list);
				}
				else {
					list = (List<cfm>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Removes all the cfms from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (cfm cfm : findAll()) {
			remove(cfm);
		}
	}

	/**
	 * Returns the number of cfms.
	 *
	 * @return the number of cfms
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

				Query q = session.createQuery(_SQL_COUNT_CFM);

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
	 * Initializes the cfm persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.db.model.cfm")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<cfm>> listenersList = new ArrayList<ModelListener<cfm>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<cfm>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(cfmImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CFM = "SELECT cfm FROM cfm cfm";
	private static final String _SQL_COUNT_CFM = "SELECT COUNT(cfm) FROM cfm cfm";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cfm.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No cfm exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(cfmPersistenceImpl.class);
	private static cfm _nullcfm = new cfmImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<cfm> toCacheModel() {
				return _nullcfmCacheModel;
			}
		};

	private static CacheModel<cfm> _nullcfmCacheModel = new CacheModel<cfm>() {
			@Override
			public cfm toEntityModel() {
				return _nullcfm;
			}
		};
}