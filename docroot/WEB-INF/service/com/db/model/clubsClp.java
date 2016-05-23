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
import com.db.service.clubsLocalServiceUtil;

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
public class clubsClp extends BaseModelImpl<clubs> implements clubs {
	public clubsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return clubs.class;
	}

	@Override
	public String getModelClassName() {
		return clubs.class.getName();
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
		attributes.put("name", getName());
		attributes.put("admin_user_id", getAdmin_user_id());

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

		Long admin_user_id = (Long)attributes.get("admin_user_id");

		if (admin_user_id != null) {
			setAdmin_user_id(admin_user_id);
		}
	}

	@Override
	public long getCid() {
		return _cid;
	}

	@Override
	public void setCid(long cid) {
		_cid = cid;

		if (_clubsRemoteModel != null) {
			try {
				Class<?> clazz = _clubsRemoteModel.getClass();

				Method method = clazz.getMethod("setCid", long.class);

				method.invoke(_clubsRemoteModel, cid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_clubsRemoteModel != null) {
			try {
				Class<?> clazz = _clubsRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_clubsRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAdmin_user_id() {
		return _admin_user_id;
	}

	@Override
	public void setAdmin_user_id(long admin_user_id) {
		_admin_user_id = admin_user_id;

		if (_clubsRemoteModel != null) {
			try {
				Class<?> clazz = _clubsRemoteModel.getClass();

				Method method = clazz.getMethod("setAdmin_user_id", long.class);

				method.invoke(_clubsRemoteModel, admin_user_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getclubsRemoteModel() {
		return _clubsRemoteModel;
	}

	public void setclubsRemoteModel(BaseModel<?> clubsRemoteModel) {
		_clubsRemoteModel = clubsRemoteModel;
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

		Class<?> remoteModelClass = _clubsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_clubsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			clubsLocalServiceUtil.addclubs(this);
		}
		else {
			clubsLocalServiceUtil.updateclubs(this);
		}
	}

	@Override
	public clubs toEscapedModel() {
		return (clubs)ProxyUtil.newProxyInstance(clubs.class.getClassLoader(),
			new Class[] { clubs.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		clubsClp clone = new clubsClp();

		clone.setCid(getCid());
		clone.setName(getName());
		clone.setAdmin_user_id(getAdmin_user_id());

		return clone;
	}

	@Override
	public int compareTo(clubs clubs) {
		long primaryKey = clubs.getPrimaryKey();

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

		if (!(obj instanceof clubsClp)) {
			return false;
		}

		clubsClp clubs = (clubsClp)obj;

		long primaryKey = clubs.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{cid=");
		sb.append(getCid());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", admin_user_id=");
		sb.append(getAdmin_user_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.db.model.clubs");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cid</column-name><column-value><![CDATA[");
		sb.append(getCid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>admin_user_id</column-name><column-value><![CDATA[");
		sb.append(getAdmin_user_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _cid;
	private String _name;
	private long _admin_user_id;
	private BaseModel<?> _clubsRemoteModel;
	private Class<?> _clpSerializerClass = com.db.service.ClpSerializer.class;
}