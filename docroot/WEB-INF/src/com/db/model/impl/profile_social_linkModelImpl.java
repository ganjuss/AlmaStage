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

import com.db.model.profile_social_link;
import com.db.model.profile_social_linkModel;
import com.db.model.profile_social_linkSoap;

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
 * The base model implementation for the profile_social_link service. Represents a row in the &quot;c_profile_social_link&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.db.model.profile_social_linkModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link profile_social_linkImpl}.
 * </p>
 *
 * @author ganjuss
 * @see profile_social_linkImpl
 * @see com.db.model.profile_social_link
 * @see com.db.model.profile_social_linkModel
 * @generated
 */
@JSON(strict = true)
public class profile_social_linkModelImpl extends BaseModelImpl<profile_social_link>
	implements profile_social_linkModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a profile_social_link model instance should use the {@link com.db.model.profile_social_link} interface instead.
	 */
	public static final String TABLE_NAME = "c_profile_social_link";
	public static final Object[][] TABLE_COLUMNS = {
			{ "cid", Types.BIGINT },
			{ "social_type_id", Types.BIGINT },
			{ "link", Types.VARCHAR },
			{ "profile_id", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table c_profile_social_link (cid LONG not null primary key,social_type_id LONG,link VARCHAR(75) null,profile_id LONG)";
	public static final String TABLE_SQL_DROP = "drop table c_profile_social_link";
	public static final String ORDER_BY_JPQL = " ORDER BY profile_social_link.cid ASC";
	public static final String ORDER_BY_SQL = " ORDER BY c_profile_social_link.cid ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.db.model.profile_social_link"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.db.model.profile_social_link"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static profile_social_link toModel(profile_social_linkSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		profile_social_link model = new profile_social_linkImpl();

		model.setCid(soapModel.getCid());
		model.setSocial_type_id(soapModel.getSocial_type_id());
		model.setLink(soapModel.getLink());
		model.setProfile_id(soapModel.getProfile_id());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<profile_social_link> toModels(
		profile_social_linkSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<profile_social_link> models = new ArrayList<profile_social_link>(soapModels.length);

		for (profile_social_linkSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.db.model.profile_social_link"));

	public profile_social_linkModelImpl() {
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
		return profile_social_link.class;
	}

	@Override
	public String getModelClassName() {
		return profile_social_link.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("social_type_id", getSocial_type_id());
		attributes.put("link", getLink());
		attributes.put("profile_id", getProfile_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		Long social_type_id = (Long)attributes.get("social_type_id");

		if (social_type_id != null) {
			setSocial_type_id(social_type_id);
		}

		String link = (String)attributes.get("link");

		if (link != null) {
			setLink(link);
		}

		Long profile_id = (Long)attributes.get("profile_id");

		if (profile_id != null) {
			setProfile_id(profile_id);
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
	public long getSocial_type_id() {
		return _social_type_id;
	}

	@Override
	public void setSocial_type_id(long social_type_id) {
		_social_type_id = social_type_id;
	}

	@JSON
	@Override
	public String getLink() {
		if (_link == null) {
			return StringPool.BLANK;
		}
		else {
			return _link;
		}
	}

	@Override
	public void setLink(String link) {
		_link = link;
	}

	@JSON
	@Override
	public long getProfile_id() {
		return _profile_id;
	}

	@Override
	public void setProfile_id(long profile_id) {
		_profile_id = profile_id;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			profile_social_link.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public profile_social_link toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (profile_social_link)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		profile_social_linkImpl profile_social_linkImpl = new profile_social_linkImpl();

		profile_social_linkImpl.setCid(getCid());
		profile_social_linkImpl.setSocial_type_id(getSocial_type_id());
		profile_social_linkImpl.setLink(getLink());
		profile_social_linkImpl.setProfile_id(getProfile_id());

		profile_social_linkImpl.resetOriginalValues();

		return profile_social_linkImpl;
	}

	@Override
	public int compareTo(profile_social_link profile_social_link) {
		long primaryKey = profile_social_link.getPrimaryKey();

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

		if (!(obj instanceof profile_social_link)) {
			return false;
		}

		profile_social_link profile_social_link = (profile_social_link)obj;

		long primaryKey = profile_social_link.getPrimaryKey();

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
	public CacheModel<profile_social_link> toCacheModel() {
		profile_social_linkCacheModel profile_social_linkCacheModel = new profile_social_linkCacheModel();

		profile_social_linkCacheModel.cid = getCid();

		profile_social_linkCacheModel.social_type_id = getSocial_type_id();

		profile_social_linkCacheModel.link = getLink();

		String link = profile_social_linkCacheModel.link;

		if ((link != null) && (link.length() == 0)) {
			profile_social_linkCacheModel.link = null;
		}

		profile_social_linkCacheModel.profile_id = getProfile_id();

		return profile_social_linkCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{cid=");
		sb.append(getCid());
		sb.append(", social_type_id=");
		sb.append(getSocial_type_id());
		sb.append(", link=");
		sb.append(getLink());
		sb.append(", profile_id=");
		sb.append(getProfile_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.db.model.profile_social_link");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cid</column-name><column-value><![CDATA[");
		sb.append(getCid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>social_type_id</column-name><column-value><![CDATA[");
		sb.append(getSocial_type_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>link</column-name><column-value><![CDATA[");
		sb.append(getLink());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>profile_id</column-name><column-value><![CDATA[");
		sb.append(getProfile_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = profile_social_link.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			profile_social_link.class
		};
	private long _cid;
	private long _social_type_id;
	private String _link;
	private long _profile_id;
	private profile_social_link _escapedModel;
}