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
import com.db.service.hit_countLocalServiceUtil;

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
public class hit_countClp extends BaseModelImpl<hit_count> implements hit_count {
	public hit_countClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return hit_count.class;
	}

	@Override
	public String getModelClassName() {
		return hit_count.class.getName();
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
		attributes.put("profile_id", getProfile_id());
		attributes.put("user_id", getUser_id());
		attributes.put("counter", getCounter());
		attributes.put("highfive", getHighfive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		Long profile_id = (Long)attributes.get("profile_id");

		if (profile_id != null) {
			setProfile_id(profile_id);
		}

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		Long counter = (Long)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long highfive = (Long)attributes.get("highfive");

		if (highfive != null) {
			setHighfive(highfive);
		}
	}

	@Override
	public long getCid() {
		return _cid;
	}

	@Override
	public void setCid(long cid) {
		_cid = cid;

		if (_hit_countRemoteModel != null) {
			try {
				Class<?> clazz = _hit_countRemoteModel.getClass();

				Method method = clazz.getMethod("setCid", long.class);

				method.invoke(_hit_countRemoteModel, cid);
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

		if (_hit_countRemoteModel != null) {
			try {
				Class<?> clazz = _hit_countRemoteModel.getClass();

				Method method = clazz.getMethod("setProfile_id", long.class);

				method.invoke(_hit_countRemoteModel, profile_id);
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

		if (_hit_countRemoteModel != null) {
			try {
				Class<?> clazz = _hit_countRemoteModel.getClass();

				Method method = clazz.getMethod("setUser_id", long.class);

				method.invoke(_hit_countRemoteModel, user_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCounter() {
		return _counter;
	}

	@Override
	public void setCounter(long counter) {
		_counter = counter;

		if (_hit_countRemoteModel != null) {
			try {
				Class<?> clazz = _hit_countRemoteModel.getClass();

				Method method = clazz.getMethod("setCounter", long.class);

				method.invoke(_hit_countRemoteModel, counter);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHighfive() {
		return _highfive;
	}

	@Override
	public void setHighfive(long highfive) {
		_highfive = highfive;

		if (_hit_countRemoteModel != null) {
			try {
				Class<?> clazz = _hit_countRemoteModel.getClass();

				Method method = clazz.getMethod("setHighfive", long.class);

				method.invoke(_hit_countRemoteModel, highfive);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> gethit_countRemoteModel() {
		return _hit_countRemoteModel;
	}

	public void sethit_countRemoteModel(BaseModel<?> hit_countRemoteModel) {
		_hit_countRemoteModel = hit_countRemoteModel;
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

		Class<?> remoteModelClass = _hit_countRemoteModel.getClass();

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

		Object returnValue = method.invoke(_hit_countRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			hit_countLocalServiceUtil.addhit_count(this);
		}
		else {
			hit_countLocalServiceUtil.updatehit_count(this);
		}
	}

	@Override
	public hit_count toEscapedModel() {
		return (hit_count)ProxyUtil.newProxyInstance(hit_count.class.getClassLoader(),
			new Class[] { hit_count.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		hit_countClp clone = new hit_countClp();

		clone.setCid(getCid());
		clone.setProfile_id(getProfile_id());
		clone.setUser_id(getUser_id());
		clone.setCounter(getCounter());
		clone.setHighfive(getHighfive());

		return clone;
	}

	@Override
	public int compareTo(hit_count hit_count) {
		long primaryKey = hit_count.getPrimaryKey();

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

		if (!(obj instanceof hit_countClp)) {
			return false;
		}

		hit_countClp hit_count = (hit_countClp)obj;

		long primaryKey = hit_count.getPrimaryKey();

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
		sb.append(", profile_id=");
		sb.append(getProfile_id());
		sb.append(", user_id=");
		sb.append(getUser_id());
		sb.append(", counter=");
		sb.append(getCounter());
		sb.append(", highfive=");
		sb.append(getHighfive());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.db.model.hit_count");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cid</column-name><column-value><![CDATA[");
		sb.append(getCid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>profile_id</column-name><column-value><![CDATA[");
		sb.append(getProfile_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>user_id</column-name><column-value><![CDATA[");
		sb.append(getUser_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>counter</column-name><column-value><![CDATA[");
		sb.append(getCounter());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>highfive</column-name><column-value><![CDATA[");
		sb.append(getHighfive());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _cid;
	private long _profile_id;
	private long _user_id;
	private long _counter;
	private long _highfive;
	private BaseModel<?> _hit_countRemoteModel;
	private Class<?> _clpSerializerClass = com.db.service.ClpSerializer.class;
}