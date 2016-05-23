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

import com.db.model.club_users;
import com.db.model.club_usersModel;
import com.db.model.club_usersSoap;

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
 * The base model implementation for the club_users service. Represents a row in the &quot;c_club_users&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.db.model.club_usersModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link club_usersImpl}.
 * </p>
 *
 * @author ganjuss
 * @see club_usersImpl
 * @see com.db.model.club_users
 * @see com.db.model.club_usersModel
 * @generated
 */
@JSON(strict = true)
public class club_usersModelImpl extends BaseModelImpl<club_users>
	implements club_usersModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a club_users model instance should use the {@link com.db.model.club_users} interface instead.
	 */
	public static final String TABLE_NAME = "c_club_users";
	public static final Object[][] TABLE_COLUMNS = {
			{ "cid", Types.BIGINT },
			{ "club_id", Types.BIGINT },
			{ "user_id", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table c_club_users (cid LONG not null primary key,club_id LONG,user_id LONG)";
	public static final String TABLE_SQL_DROP = "drop table c_club_users";
	public static final String ORDER_BY_JPQL = " ORDER BY club_users.cid ASC";
	public static final String ORDER_BY_SQL = " ORDER BY c_club_users.cid ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.db.model.club_users"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.db.model.club_users"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static club_users toModel(club_usersSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		club_users model = new club_usersImpl();

		model.setCid(soapModel.getCid());
		model.setClub_id(soapModel.getClub_id());
		model.setUser_id(soapModel.getUser_id());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<club_users> toModels(club_usersSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<club_users> models = new ArrayList<club_users>(soapModels.length);

		for (club_usersSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.db.model.club_users"));

	public club_usersModelImpl() {
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
		return club_users.class;
	}

	@Override
	public String getModelClassName() {
		return club_users.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("club_id", getClub_id());
		attributes.put("user_id", getUser_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		Long club_id = (Long)attributes.get("club_id");

		if (club_id != null) {
			setClub_id(club_id);
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
	public long getClub_id() {
		return _club_id;
	}

	@Override
	public void setClub_id(long club_id) {
		_club_id = club_id;
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
			club_users.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public club_users toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (club_users)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		club_usersImpl club_usersImpl = new club_usersImpl();

		club_usersImpl.setCid(getCid());
		club_usersImpl.setClub_id(getClub_id());
		club_usersImpl.setUser_id(getUser_id());

		club_usersImpl.resetOriginalValues();

		return club_usersImpl;
	}

	@Override
	public int compareTo(club_users club_users) {
		long primaryKey = club_users.getPrimaryKey();

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

		if (!(obj instanceof club_users)) {
			return false;
		}

		club_users club_users = (club_users)obj;

		long primaryKey = club_users.getPrimaryKey();

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
	public CacheModel<club_users> toCacheModel() {
		club_usersCacheModel club_usersCacheModel = new club_usersCacheModel();

		club_usersCacheModel.cid = getCid();

		club_usersCacheModel.club_id = getClub_id();

		club_usersCacheModel.user_id = getUser_id();

		return club_usersCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{cid=");
		sb.append(getCid());
		sb.append(", club_id=");
		sb.append(getClub_id());
		sb.append(", user_id=");
		sb.append(getUser_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.db.model.club_users");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cid</column-name><column-value><![CDATA[");
		sb.append(getCid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>club_id</column-name><column-value><![CDATA[");
		sb.append(getClub_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>user_id</column-name><column-value><![CDATA[");
		sb.append(getUser_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = club_users.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			club_users.class
		};
	private long _cid;
	private long _club_id;
	private long _user_id;
	private club_users _escapedModel;
}