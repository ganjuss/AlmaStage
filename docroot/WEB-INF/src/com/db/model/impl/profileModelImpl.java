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

import com.db.model.profile;
import com.db.model.profileModel;
import com.db.model.profileSoap;

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
 * The base model implementation for the profile service. Represents a row in the &quot;c_profile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.db.model.profileModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link profileImpl}.
 * </p>
 *
 * @author ganjuss
 * @see profileImpl
 * @see com.db.model.profile
 * @see com.db.model.profileModel
 * @generated
 */
@JSON(strict = true)
public class profileModelImpl extends BaseModelImpl<profile>
	implements profileModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a profile model instance should use the {@link com.db.model.profile} interface instead.
	 */
	public static final String TABLE_NAME = "c_profile";
	public static final Object[][] TABLE_COLUMNS = {
			{ "cid", Types.BIGINT },
			{ "type_id", Types.BIGINT },
			{ "genere_id", Types.BIGINT },
			{ "user_id", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table c_profile (cid LONG not null primary key,type_id LONG,genere_id LONG,user_id LONG)";
	public static final String TABLE_SQL_DROP = "drop table c_profile";
	public static final String ORDER_BY_JPQL = " ORDER BY profile.cid ASC";
	public static final String ORDER_BY_SQL = " ORDER BY c_profile.cid ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.db.model.profile"), true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.db.model.profile"), true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static profile toModel(profileSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		profile model = new profileImpl();

		model.setCid(soapModel.getCid());
		model.setType_id(soapModel.getType_id());
		model.setGenere_id(soapModel.getGenere_id());
		model.setUser_id(soapModel.getUser_id());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<profile> toModels(profileSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<profile> models = new ArrayList<profile>(soapModels.length);

		for (profileSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.db.model.profile"));

	public profileModelImpl() {
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
		return profile.class;
	}

	@Override
	public String getModelClassName() {
		return profile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("type_id", getType_id());
		attributes.put("genere_id", getGenere_id());
		attributes.put("user_id", getUser_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		Long type_id = (Long)attributes.get("type_id");

		if (type_id != null) {
			setType_id(type_id);
		}

		Long genere_id = (Long)attributes.get("genere_id");

		if (genere_id != null) {
			setGenere_id(genere_id);
		}

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
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
	public long getType_id() {
		return _type_id;
	}

	@Override
	public void setType_id(long type_id) {
		_type_id = type_id;
	}

	@JSON
	@Override
	public long getGenere_id() {
		return _genere_id;
	}

	@Override
	public void setGenere_id(long genere_id) {
		_genere_id = genere_id;
	}

	@JSON
	@Override
	public long getUser_id() {
		return _user_id;
	}

	@Override
	public void setUser_id(long user_id) {
		_user_id = user_id;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			profile.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public profile toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (profile)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		profileImpl profileImpl = new profileImpl();

		profileImpl.setCid(getCid());
		profileImpl.setType_id(getType_id());
		profileImpl.setGenere_id(getGenere_id());
		profileImpl.setUser_id(getUser_id());

		profileImpl.resetOriginalValues();

		return profileImpl;
	}

	@Override
	public int compareTo(profile profile) {
		long primaryKey = profile.getPrimaryKey();

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

		if (!(obj instanceof profile)) {
			return false;
		}

		profile profile = (profile)obj;

		long primaryKey = profile.getPrimaryKey();

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
	public CacheModel<profile> toCacheModel() {
		profileCacheModel profileCacheModel = new profileCacheModel();

		profileCacheModel.cid = getCid();

		profileCacheModel.type_id = getType_id();

		profileCacheModel.genere_id = getGenere_id();

		profileCacheModel.user_id = getUser_id();

		return profileCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{cid=");
		sb.append(getCid());
		sb.append(", type_id=");
		sb.append(getType_id());
		sb.append(", genere_id=");
		sb.append(getGenere_id());
		sb.append(", user_id=");
		sb.append(getUser_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.db.model.profile");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cid</column-name><column-value><![CDATA[");
		sb.append(getCid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type_id</column-name><column-value><![CDATA[");
		sb.append(getType_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>genere_id</column-name><column-value><![CDATA[");
		sb.append(getGenere_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>user_id</column-name><column-value><![CDATA[");
		sb.append(getUser_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = profile.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			profile.class
		};
	private long _cid;
	private long _type_id;
	private long _genere_id;
	private long _user_id;
	private profile _escapedModel;
}