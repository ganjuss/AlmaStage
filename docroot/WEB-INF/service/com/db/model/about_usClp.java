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
import com.db.service.about_usLocalServiceUtil;

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
public class about_usClp extends BaseModelImpl<about_us> implements about_us {
	public about_usClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return about_us.class;
	}

	@Override
	public String getModelClassName() {
		return about_us.class.getName();
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
		attributes.put("text", getText());

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

		String text = (String)attributes.get("text");

		if (text != null) {
			setText(text);
		}
	}

	@Override
	public long getCid() {
		return _cid;
	}

	@Override
	public void setCid(long cid) {
		_cid = cid;

		if (_about_usRemoteModel != null) {
			try {
				Class<?> clazz = _about_usRemoteModel.getClass();

				Method method = clazz.getMethod("setCid", long.class);

				method.invoke(_about_usRemoteModel, cid);
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

		if (_about_usRemoteModel != null) {
			try {
				Class<?> clazz = _about_usRemoteModel.getClass();

				Method method = clazz.getMethod("setProfile_id", long.class);

				method.invoke(_about_usRemoteModel, profile_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getText() {
		return _text;
	}

	@Override
	public void setText(String text) {
		_text = text;

		if (_about_usRemoteModel != null) {
			try {
				Class<?> clazz = _about_usRemoteModel.getClass();

				Method method = clazz.getMethod("setText", String.class);

				method.invoke(_about_usRemoteModel, text);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getabout_usRemoteModel() {
		return _about_usRemoteModel;
	}

	public void setabout_usRemoteModel(BaseModel<?> about_usRemoteModel) {
		_about_usRemoteModel = about_usRemoteModel;
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

		Class<?> remoteModelClass = _about_usRemoteModel.getClass();

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

		Object returnValue = method.invoke(_about_usRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			about_usLocalServiceUtil.addabout_us(this);
		}
		else {
			about_usLocalServiceUtil.updateabout_us(this);
		}
	}

	@Override
	public about_us toEscapedModel() {
		return (about_us)ProxyUtil.newProxyInstance(about_us.class.getClassLoader(),
			new Class[] { about_us.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		about_usClp clone = new about_usClp();

		clone.setCid(getCid());
		clone.setProfile_id(getProfile_id());
		clone.setText(getText());

		return clone;
	}

	@Override
	public int compareTo(about_us about_us) {
		long primaryKey = about_us.getPrimaryKey();

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

		if (!(obj instanceof about_usClp)) {
			return false;
		}

		about_usClp about_us = (about_usClp)obj;

		long primaryKey = about_us.getPrimaryKey();

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
		sb.append(", profile_id=");
		sb.append(getProfile_id());
		sb.append(", text=");
		sb.append(getText());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.db.model.about_us");
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
			"<column><column-name>text</column-name><column-value><![CDATA[");
		sb.append(getText());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _cid;
	private long _profile_id;
	private String _text;
	private BaseModel<?> _about_usRemoteModel;
	private Class<?> _clpSerializerClass = com.db.service.ClpSerializer.class;
}