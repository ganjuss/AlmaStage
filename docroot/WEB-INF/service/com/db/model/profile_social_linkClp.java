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
import com.db.service.profile_social_linkLocalServiceUtil;

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
public class profile_social_linkClp extends BaseModelImpl<profile_social_link>
	implements profile_social_link {
	public profile_social_linkClp() {
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

	@Override
	public long getCid() {
		return _cid;
	}

	@Override
	public void setCid(long cid) {
		_cid = cid;

		if (_profile_social_linkRemoteModel != null) {
			try {
				Class<?> clazz = _profile_social_linkRemoteModel.getClass();

				Method method = clazz.getMethod("setCid", long.class);

				method.invoke(_profile_social_linkRemoteModel, cid);
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

		if (_profile_social_linkRemoteModel != null) {
			try {
				Class<?> clazz = _profile_social_linkRemoteModel.getClass();

				Method method = clazz.getMethod("setSocial_type_id", long.class);

				method.invoke(_profile_social_linkRemoteModel, social_type_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLink() {
		return _link;
	}

	@Override
	public void setLink(String link) {
		_link = link;

		if (_profile_social_linkRemoteModel != null) {
			try {
				Class<?> clazz = _profile_social_linkRemoteModel.getClass();

				Method method = clazz.getMethod("setLink", String.class);

				method.invoke(_profile_social_linkRemoteModel, link);
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

		if (_profile_social_linkRemoteModel != null) {
			try {
				Class<?> clazz = _profile_social_linkRemoteModel.getClass();

				Method method = clazz.getMethod("setProfile_id", long.class);

				method.invoke(_profile_social_linkRemoteModel, profile_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getprofile_social_linkRemoteModel() {
		return _profile_social_linkRemoteModel;
	}

	public void setprofile_social_linkRemoteModel(
		BaseModel<?> profile_social_linkRemoteModel) {
		_profile_social_linkRemoteModel = profile_social_linkRemoteModel;
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

		Class<?> remoteModelClass = _profile_social_linkRemoteModel.getClass();

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

		Object returnValue = method.invoke(_profile_social_linkRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			profile_social_linkLocalServiceUtil.addprofile_social_link(this);
		}
		else {
			profile_social_linkLocalServiceUtil.updateprofile_social_link(this);
		}
	}

	@Override
	public profile_social_link toEscapedModel() {
		return (profile_social_link)ProxyUtil.newProxyInstance(profile_social_link.class.getClassLoader(),
			new Class[] { profile_social_link.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		profile_social_linkClp clone = new profile_social_linkClp();

		clone.setCid(getCid());
		clone.setSocial_type_id(getSocial_type_id());
		clone.setLink(getLink());
		clone.setProfile_id(getProfile_id());

		return clone;
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

		if (!(obj instanceof profile_social_linkClp)) {
			return false;
		}

		profile_social_linkClp profile_social_link = (profile_social_linkClp)obj;

		long primaryKey = profile_social_link.getPrimaryKey();

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

	private long _cid;
	private long _social_type_id;
	private String _link;
	private long _profile_id;
	private BaseModel<?> _profile_social_linkRemoteModel;
	private Class<?> _clpSerializerClass = com.db.service.ClpSerializer.class;
}