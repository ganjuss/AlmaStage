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

package com.db.model;

import com.db.service.ClpSerializer;
import com.db.service.profileLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ganjuss
 */
public class profileClp extends BaseModelImpl<profile> implements profile {
	public profileClp() {
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
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("type_id", getType_id());
		attributes.put("genere_id", getGenere_id());
		attributes.put("user_id", getUser_id());
		attributes.put("profile_name", getProfile_name());

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

		String profile_name = (String)attributes.get("profile_name");

		if (profile_name != null) {
			setProfile_name(profile_name);
		}
	}

	@Override
	public long getCid() {
		return _cid;
	}

	@Override
	public void setCid(long cid) {
		_cid = cid;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setCid", long.class);

				method.invoke(_profileRemoteModel, cid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getType_id() {
		return _type_id;
	}

	@Override
	public void setType_id(long type_id) {
		_type_id = type_id;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setType_id", long.class);

				method.invoke(_profileRemoteModel, type_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGenere_id() {
		return _genere_id;
	}

	@Override
	public void setGenere_id(long genere_id) {
		_genere_id = genere_id;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setGenere_id", long.class);

				method.invoke(_profileRemoteModel, genere_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUser_id() {
		return _user_id;
	}

	@Override
	public void setUser_id(long user_id) {
		_user_id = user_id;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setUser_id", long.class);

				method.invoke(_profileRemoteModel, user_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProfile_name() {
		return _profile_name;
	}

	@Override
	public void setProfile_name(String profile_name) {
		_profile_name = profile_name;

		if (_profileRemoteModel != null) {
			try {
				Class<?> clazz = _profileRemoteModel.getClass();

				Method method = clazz.getMethod("setProfile_name", String.class);

				method.invoke(_profileRemoteModel, profile_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getprofileRemoteModel() {
		return _profileRemoteModel;
	}

	public void setprofileRemoteModel(BaseModel<?> profileRemoteModel) {
		_profileRemoteModel = profileRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _profileRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_profileRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			profileLocalServiceUtil.addprofile(this);
		}
		else {
			profileLocalServiceUtil.updateprofile(this);
		}
	}

	@Override
	public profile toEscapedModel() {
		return (profile)ProxyUtil.newProxyInstance(profile.class.getClassLoader(),
			new Class[] { profile.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		profileClp clone = new profileClp();

		clone.setCid(getCid());
		clone.setType_id(getType_id());
		clone.setGenere_id(getGenere_id());
		clone.setUser_id(getUser_id());
		clone.setProfile_name(getProfile_name());

		return clone;
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

		if (!(obj instanceof profileClp)) {
			return false;
		}

		profileClp profile = (profileClp)obj;

		long primaryKey = profile.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{cid=");
		sb.append(getCid());
		sb.append(", type_id=");
		sb.append(getType_id());
		sb.append(", genere_id=");
		sb.append(getGenere_id());
		sb.append(", user_id=");
		sb.append(getUser_id());
		sb.append(", profile_name=");
		sb.append(getProfile_name());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

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
		sb.append(
			"<column><column-name>profile_name</column-name><column-value><![CDATA[");
		sb.append(getProfile_name());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _cid;
	private long _type_id;
	private long _genere_id;
	private long _user_id;
	private String _profile_name;
	private BaseModel<?> _profileRemoteModel;
	private Class<?> _clpSerializerClass = com.db.service.ClpSerializer.class;
}