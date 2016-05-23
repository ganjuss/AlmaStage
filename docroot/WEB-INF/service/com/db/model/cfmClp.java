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
import com.db.service.cfmLocalServiceUtil;

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
public class cfmClp extends BaseModelImpl<cfm> implements cfm {
	public cfmClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return cfm.class;
	}

	@Override
	public String getModelClassName() {
		return cfm.class.getName();
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
		attributes.put("cfm_by", getCfm_by());
		attributes.put("cfm_to", getCfm_to());
		attributes.put("cfm_type_id", getCfm_type_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		Long cfm_by = (Long)attributes.get("cfm_by");

		if (cfm_by != null) {
			setCfm_by(cfm_by);
		}

		Long cfm_to = (Long)attributes.get("cfm_to");

		if (cfm_to != null) {
			setCfm_to(cfm_to);
		}

		Long cfm_type_id = (Long)attributes.get("cfm_type_id");

		if (cfm_type_id != null) {
			setCfm_type_id(cfm_type_id);
		}
	}

	@Override
	public long getCid() {
		return _cid;
	}

	@Override
	public void setCid(long cid) {
		_cid = cid;

		if (_cfmRemoteModel != null) {
			try {
				Class<?> clazz = _cfmRemoteModel.getClass();

				Method method = clazz.getMethod("setCid", long.class);

				method.invoke(_cfmRemoteModel, cid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCfm_by() {
		return _cfm_by;
	}

	@Override
	public void setCfm_by(long cfm_by) {
		_cfm_by = cfm_by;

		if (_cfmRemoteModel != null) {
			try {
				Class<?> clazz = _cfmRemoteModel.getClass();

				Method method = clazz.getMethod("setCfm_by", long.class);

				method.invoke(_cfmRemoteModel, cfm_by);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCfm_to() {
		return _cfm_to;
	}

	@Override
	public void setCfm_to(long cfm_to) {
		_cfm_to = cfm_to;

		if (_cfmRemoteModel != null) {
			try {
				Class<?> clazz = _cfmRemoteModel.getClass();

				Method method = clazz.getMethod("setCfm_to", long.class);

				method.invoke(_cfmRemoteModel, cfm_to);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCfm_type_id() {
		return _cfm_type_id;
	}

	@Override
	public void setCfm_type_id(long cfm_type_id) {
		_cfm_type_id = cfm_type_id;

		if (_cfmRemoteModel != null) {
			try {
				Class<?> clazz = _cfmRemoteModel.getClass();

				Method method = clazz.getMethod("setCfm_type_id", long.class);

				method.invoke(_cfmRemoteModel, cfm_type_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getcfmRemoteModel() {
		return _cfmRemoteModel;
	}

	public void setcfmRemoteModel(BaseModel<?> cfmRemoteModel) {
		_cfmRemoteModel = cfmRemoteModel;
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

		Class<?> remoteModelClass = _cfmRemoteModel.getClass();

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

		Object returnValue = method.invoke(_cfmRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			cfmLocalServiceUtil.addcfm(this);
		}
		else {
			cfmLocalServiceUtil.updatecfm(this);
		}
	}

	@Override
	public cfm toEscapedModel() {
		return (cfm)ProxyUtil.newProxyInstance(cfm.class.getClassLoader(),
			new Class[] { cfm.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		cfmClp clone = new cfmClp();

		clone.setCid(getCid());
		clone.setCfm_by(getCfm_by());
		clone.setCfm_to(getCfm_to());
		clone.setCfm_type_id(getCfm_type_id());

		return clone;
	}

	@Override
	public int compareTo(cfm cfm) {
		long primaryKey = cfm.getPrimaryKey();

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

		if (!(obj instanceof cfmClp)) {
			return false;
		}

		cfmClp cfm = (cfmClp)obj;

		long primaryKey = cfm.getPrimaryKey();

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
		sb.append(", cfm_by=");
		sb.append(getCfm_by());
		sb.append(", cfm_to=");
		sb.append(getCfm_to());
		sb.append(", cfm_type_id=");
		sb.append(getCfm_type_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.db.model.cfm");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cid</column-name><column-value><![CDATA[");
		sb.append(getCid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cfm_by</column-name><column-value><![CDATA[");
		sb.append(getCfm_by());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cfm_to</column-name><column-value><![CDATA[");
		sb.append(getCfm_to());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cfm_type_id</column-name><column-value><![CDATA[");
		sb.append(getCfm_type_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _cid;
	private long _cfm_by;
	private long _cfm_to;
	private long _cfm_type_id;
	private BaseModel<?> _cfmRemoteModel;
	private Class<?> _clpSerializerClass = com.db.service.ClpSerializer.class;
}