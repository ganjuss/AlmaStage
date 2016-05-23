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
import com.db.service.social_loginLocalServiceUtil;

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
public class social_loginClp extends BaseModelImpl<social_login>
	implements social_login {
	public social_loginClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return social_login.class;
	}

	@Override
	public String getModelClassName() {
		return social_login.class.getName();
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
		attributes.put("social_type_id", getSocial_type_id());
		attributes.put("profile_id", getProfile_id());
		attributes.put("social_id", getSocial_id());

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

		Long profile_id = (Long)attributes.get("profile_id");

		if (profile_id != null) {
			setProfile_id(profile_id);
		}

		Long social_id = (Long)attributes.get("social_id");

		if (social_id != null) {
			setSocial_id(social_id);
		}
	}

	@Override
	public long getCid() {
		return _cid;
	}

	@Override
	public void setCid(long cid) {
		_cid = cid;

		if (_social_loginRemoteModel != null) {
			try {
				Class<?> clazz = _social_loginRemoteModel.getClass();

				Method method = clazz.getMethod("setCid", long.class);

				method.invoke(_social_loginRemoteModel, cid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSocial_type_id() {
		return _social_type_id;
	}

	@Override
	public void setSocial_type_id(long social_type_id) {
		_social_type_id = social_type_id;

		if (_social_loginRemoteModel != null) {
			try {
				Class<?> clazz = _social_loginRemoteModel.getClass();

				Method method = clazz.getMethod("setSocial_type_id", long.class);

				method.invoke(_social_loginRemoteModel, social_type_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getProfile_id() {
		return _profile_id;
	}

	@Override
	public void setProfile_id(long profile_id) {
		_profile_id = profile_id;

		if (_social_loginRemoteModel != null) {
			try {
				Class<?> clazz = _social_loginRemoteModel.getClass();

				Method method = clazz.getMethod("setProfile_id", long.class);

				method.invoke(_social_loginRemoteModel, profile_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSocial_id() {
		return _social_id;
	}

	@Override
	public void setSocial_id(long social_id) {
		_social_id = social_id;

		if (_social_loginRemoteModel != null) {
			try {
				Class<?> clazz = _social_loginRemoteModel.getClass();

				Method method = clazz.getMethod("setSocial_id", long.class);

				method.invoke(_social_loginRemoteModel, social_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getsocial_loginRemoteModel() {
		return _social_loginRemoteModel;
	}

	public void setsocial_loginRemoteModel(BaseModel<?> social_loginRemoteModel) {
		_social_loginRemoteModel = social_loginRemoteModel;
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

		Class<?> remoteModelClass = _social_loginRemoteModel.getClass();

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

		Object returnValue = method.invoke(_social_loginRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			social_loginLocalServiceUtil.addsocial_login(this);
		}
		else {
			social_loginLocalServiceUtil.updatesocial_login(this);
		}
	}

	@Override
	public social_login toEscapedModel() {
		return (social_login)ProxyUtil.newProxyInstance(social_login.class.getClassLoader(),
			new Class[] { social_login.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		social_loginClp clone = new social_loginClp();

		clone.setCid(getCid());
		clone.setSocial_type_id(getSocial_type_id());
		clone.setProfile_id(getProfile_id());
		clone.setSocial_id(getSocial_id());

		return clone;
	}

	@Override
	public int compareTo(social_login social_login) {
		long primaryKey = social_login.getPrimaryKey();

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

		if (!(obj instanceof social_loginClp)) {
			return false;
		}

		social_loginClp social_login = (social_loginClp)obj;

		long primaryKey = social_login.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{cid=");
		sb.append(getCid());
		sb.append(", social_type_id=");
		sb.append(getSocial_type_id());
		sb.append(", profile_id=");
		sb.append(getProfile_id());
		sb.append(", social_id=");
		sb.append(getSocial_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.db.model.social_login");
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
			"<column><column-name>profile_id</column-name><column-value><![CDATA[");
		sb.append(getProfile_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>social_id</column-name><column-value><![CDATA[");
		sb.append(getSocial_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _cid;
	private long _social_type_id;
	private long _profile_id;
	private long _social_id;
	private BaseModel<?> _social_loginRemoteModel;
	private Class<?> _clpSerializerClass = com.db.service.ClpSerializer.class;
}