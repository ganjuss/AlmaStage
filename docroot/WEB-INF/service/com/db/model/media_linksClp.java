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
import com.db.service.media_linksLocalServiceUtil;

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
public class media_linksClp extends BaseModelImpl<media_links>
	implements media_links {
	public media_linksClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return media_links.class;
	}

	@Override
	public String getModelClassName() {
		return media_links.class.getName();
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
		attributes.put("media_type_id", getMedia_type_id());
		attributes.put("link", getLink());

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

		Long media_type_id = (Long)attributes.get("media_type_id");

		if (media_type_id != null) {
			setMedia_type_id(media_type_id);
		}

		String link = (String)attributes.get("link");

		if (link != null) {
			setLink(link);
		}
	}

	@Override
	public long getCid() {
		return _cid;
	}

	@Override
	public void setCid(long cid) {
		_cid = cid;

		if (_media_linksRemoteModel != null) {
			try {
				Class<?> clazz = _media_linksRemoteModel.getClass();

				Method method = clazz.getMethod("setCid", long.class);

				method.invoke(_media_linksRemoteModel, cid);
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

		if (_media_linksRemoteModel != null) {
			try {
				Class<?> clazz = _media_linksRemoteModel.getClass();

				Method method = clazz.getMethod("setProfile_id", long.class);

				method.invoke(_media_linksRemoteModel, profile_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMedia_type_id() {
		return _media_type_id;
	}

	@Override
	public void setMedia_type_id(long media_type_id) {
		_media_type_id = media_type_id;

		if (_media_linksRemoteModel != null) {
			try {
				Class<?> clazz = _media_linksRemoteModel.getClass();

				Method method = clazz.getMethod("setMedia_type_id", long.class);

				method.invoke(_media_linksRemoteModel, media_type_id);
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

		if (_media_linksRemoteModel != null) {
			try {
				Class<?> clazz = _media_linksRemoteModel.getClass();

				Method method = clazz.getMethod("setLink", String.class);

				method.invoke(_media_linksRemoteModel, link);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getmedia_linksRemoteModel() {
		return _media_linksRemoteModel;
	}

	public void setmedia_linksRemoteModel(BaseModel<?> media_linksRemoteModel) {
		_media_linksRemoteModel = media_linksRemoteModel;
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

		Class<?> remoteModelClass = _media_linksRemoteModel.getClass();

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

		Object returnValue = method.invoke(_media_linksRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			media_linksLocalServiceUtil.addmedia_links(this);
		}
		else {
			media_linksLocalServiceUtil.updatemedia_links(this);
		}
	}

	@Override
	public media_links toEscapedModel() {
		return (media_links)ProxyUtil.newProxyInstance(media_links.class.getClassLoader(),
			new Class[] { media_links.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		media_linksClp clone = new media_linksClp();

		clone.setCid(getCid());
		clone.setProfile_id(getProfile_id());
		clone.setMedia_type_id(getMedia_type_id());
		clone.setLink(getLink());

		return clone;
	}

	@Override
	public int compareTo(media_links media_links) {
		long primaryKey = media_links.getPrimaryKey();

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

		if (!(obj instanceof media_linksClp)) {
			return false;
		}

		media_linksClp media_links = (media_linksClp)obj;

		long primaryKey = media_links.getPrimaryKey();

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
		sb.append(", profile_id=");
		sb.append(getProfile_id());
		sb.append(", media_type_id=");
		sb.append(getMedia_type_id());
		sb.append(", link=");
		sb.append(getLink());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.db.model.media_links");
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
			"<column><column-name>media_type_id</column-name><column-value><![CDATA[");
		sb.append(getMedia_type_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>link</column-name><column-value><![CDATA[");
		sb.append(getLink());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _cid;
	private long _profile_id;
	private long _media_type_id;
	private String _link;
	private BaseModel<?> _media_linksRemoteModel;
	private Class<?> _clpSerializerClass = com.db.service.ClpSerializer.class;
}