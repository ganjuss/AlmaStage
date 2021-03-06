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

package com.db.model.impl;

import com.db.model.acheivements;
import com.db.model.acheivementsModel;
import com.db.model.acheivementsSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the acheivements service. Represents a row in the &quot;c_acheivments&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.db.model.acheivementsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link acheivementsImpl}.
 * </p>
 *
 * @author ganjuss
 * @see acheivementsImpl
 * @see com.db.model.acheivements
 * @see com.db.model.acheivementsModel
 * @generated
 */
@JSON(strict = true)
public class acheivementsModelImpl extends BaseModelImpl<acheivements>
	implements acheivementsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a acheivements model instance should use the {@link com.db.model.acheivements} interface instead.
	 */
	public static final String TABLE_NAME = "c_acheivments";
	public static final Object[][] TABLE_COLUMNS = {
			{ "cid", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table c_acheivments (cid LONG not null primary key)";
	public static final String TABLE_SQL_DROP = "drop table c_acheivments";
	public static final String ORDER_BY_JPQL = " ORDER BY acheivements.cid ASC";
	public static final String ORDER_BY_SQL = " ORDER BY c_acheivments.cid ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.db.model.acheivements"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.db.model.acheivements"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static acheivements toModel(acheivementsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		acheivements model = new acheivementsImpl();

		model.setCid(soapModel.getCid());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<acheivements> toModels(acheivementsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<acheivements> models = new ArrayList<acheivements>(soapModels.length);

		for (acheivementsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.db.model.acheivements"));

	public acheivementsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _cid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return acheivements.class;
	}

	@Override
	public String getModelClassName() {
		return acheivements.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}
	}

	@JSON
	@Override
	public long getCid() {
		return _cid;
	}

	@Override
	public void setCid(long cid) {
		_cid = cid;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			acheivements.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public acheivements toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (acheivements)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		acheivementsImpl acheivementsImpl = new acheivementsImpl();

		acheivementsImpl.setCid(getCid());

		acheivementsImpl.resetOriginalValues();

		return acheivementsImpl;
	}

	@Override
	public int compareTo(acheivements acheivements) {
		long primaryKey = acheivements.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof acheivements)) {
			return false;
		}

		acheivements acheivements = (acheivements)obj;

		long primaryKey = acheivements.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<acheivements> toCacheModel() {
		acheivementsCacheModel acheivementsCacheModel = new acheivementsCacheModel();

		acheivementsCacheModel.cid = getCid();

		return acheivementsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{cid=");
		sb.append(getCid());

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(7);

		sb.append("<model><model-name>");
		sb.append("com.db.model.acheivements");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cid</column-name><column-value><![CDATA[");
		sb.append(getCid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = acheivements.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			acheivements.class
		};
	private long _cid;
	private acheivements _escapedModel;
}