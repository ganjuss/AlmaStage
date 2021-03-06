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

import com.db.model.media_links_master;
import com.db.model.media_links_masterModel;
import com.db.model.media_links_masterSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
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
 * The base model implementation for the media_links_master service. Represents a row in the &quot;c_media_link_master&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.db.model.media_links_masterModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link media_links_masterImpl}.
 * </p>
 *
 * @author ganjuss
 * @see media_links_masterImpl
 * @see com.db.model.media_links_master
 * @see com.db.model.media_links_masterModel
 * @generated
 */
@JSON(strict = true)
public class media_links_masterModelImpl extends BaseModelImpl<media_links_master>
	implements media_links_masterModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a media_links_master model instance should use the {@link com.db.model.media_links_master} interface instead.
	 */
	public static final String TABLE_NAME = "c_media_link_master";
	public static final Object[][] TABLE_COLUMNS = {
			{ "cid", Types.BIGINT },
			{ "name", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table c_media_link_master (cid LONG not null primary key,name VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table c_media_link_master";
	public static final String ORDER_BY_JPQL = " ORDER BY media_links_master.cid ASC";
	public static final String ORDER_BY_SQL = " ORDER BY c_media_link_master.cid ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.db.model.media_links_master"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.db.model.media_links_master"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static media_links_master toModel(media_links_masterSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		media_links_master model = new media_links_masterImpl();

		model.setCid(soapModel.getCid());
		model.setName(soapModel.getName());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<media_links_master> toModels(
		media_links_masterSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<media_links_master> models = new ArrayList<media_links_master>(soapModels.length);

		for (media_links_masterSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.db.model.media_links_master"));

	public media_links_masterModelImpl() {
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
		return media_links_master.class;
	}

	@Override
	public String getModelClassName() {
		return media_links_master.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
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

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			media_links_master.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public media_links_master toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (media_links_master)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		media_links_masterImpl media_links_masterImpl = new media_links_masterImpl();

		media_links_masterImpl.setCid(getCid());
		media_links_masterImpl.setName(getName());

		media_links_masterImpl.resetOriginalValues();

		return media_links_masterImpl;
	}

	@Override
	public int compareTo(media_links_master media_links_master) {
		long primaryKey = media_links_master.getPrimaryKey();

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

		if (!(obj instanceof media_links_master)) {
			return false;
		}

		media_links_master media_links_master = (media_links_master)obj;

		long primaryKey = media_links_master.getPrimaryKey();

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
	public CacheModel<media_links_master> toCacheModel() {
		media_links_masterCacheModel media_links_masterCacheModel = new media_links_masterCacheModel();

		media_links_masterCacheModel.cid = getCid();

		media_links_masterCacheModel.name = getName();

		String name = media_links_masterCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			media_links_masterCacheModel.name = null;
		}

		return media_links_masterCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{cid=");
		sb.append(getCid());
		sb.append(", name=");
		sb.append(getName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.db.model.media_links_master");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cid</column-name><column-value><![CDATA[");
		sb.append(getCid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = media_links_master.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			media_links_master.class
		};
	private long _cid;
	private String _name;
	private media_links_master _escapedModel;
}