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
import com.db.service.skill_user_mappingLocalServiceUtil;

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
public class skill_user_mappingClp extends BaseModelImpl<skill_user_mapping>
	implements skill_user_mapping {
	public skill_user_mappingClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return skill_user_mapping.class;
	}

	@Override
	public String getModelClassName() {
		return skill_user_mapping.class.getName();
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
		attributes.put("skill_id", getSkill_id());
		attributes.put("profile_id", getProfile_id());
		attributes.put("type_id", getType_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		Long skill_id = (Long)attributes.get("skill_id");

		if (skill_id != null) {
			setSkill_id(skill_id);
		}

		Long profile_id = (Long)attributes.get("profile_id");

		if (profile_id != null) {
			setProfile_id(profile_id);
		}

		Long type_id = (Long)attributes.get("type_id");

		if (type_id != null) {
			setType_id(type_id);
		}
	}

	@Override
	public long getCid() {
		return _cid;
	}

	@Override
	public void setCid(long cid) {
		_cid = cid;

		if (_skill_user_mappingRemoteModel != null) {
			try {
				Class<?> clazz = _skill_user_mappingRemoteModel.getClass();

				Method method = clazz.getMethod("setCid", long.class);

				method.invoke(_skill_user_mappingRemoteModel, cid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSkill_id() {
		return _skill_id;
	}

	@Override
	public void setSkill_id(long skill_id) {
		_skill_id = skill_id;

		if (_skill_user_mappingRemoteModel != null) {
			try {
				Class<?> clazz = _skill_user_mappingRemoteModel.getClass();

				Method method = clazz.getMethod("setSkill_id", long.class);

				method.invoke(_skill_user_mappingRemoteModel, skill_id);
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

		if (_skill_user_mappingRemoteModel != null) {
			try {
				Class<?> clazz = _skill_user_mappingRemoteModel.getClass();

				Method method = clazz.getMethod("setProfile_id", long.class);

				method.invoke(_skill_user_mappingRemoteModel, profile_id);
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

		if (_skill_user_mappingRemoteModel != null) {
			try {
				Class<?> clazz = _skill_user_mappingRemoteModel.getClass();

				Method method = clazz.getMethod("setType_id", long.class);

				method.invoke(_skill_user_mappingRemoteModel, type_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getskill_user_mappingRemoteModel() {
		return _skill_user_mappingRemoteModel;
	}

	public void setskill_user_mappingRemoteModel(
		BaseModel<?> skill_user_mappingRemoteModel) {
		_skill_user_mappingRemoteModel = skill_user_mappingRemoteModel;
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

		Class<?> remoteModelClass = _skill_user_mappingRemoteModel.getClass();

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

		Object returnValue = method.invoke(_skill_user_mappingRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			skill_user_mappingLocalServiceUtil.addskill_user_mapping(this);
		}
		else {
			skill_user_mappingLocalServiceUtil.updateskill_user_mapping(this);
		}
	}

	@Override
	public skill_user_mapping toEscapedModel() {
		return (skill_user_mapping)ProxyUtil.newProxyInstance(skill_user_mapping.class.getClassLoader(),
			new Class[] { skill_user_mapping.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		skill_user_mappingClp clone = new skill_user_mappingClp();

		clone.setCid(getCid());
		clone.setSkill_id(getSkill_id());
		clone.setProfile_id(getProfile_id());
		clone.setType_id(getType_id());

		return clone;
	}

	@Override
	public int compareTo(skill_user_mapping skill_user_mapping) {
		long primaryKey = skill_user_mapping.getPrimaryKey();

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

		if (!(obj instanceof skill_user_mappingClp)) {
			return false;
		}

		skill_user_mappingClp skill_user_mapping = (skill_user_mappingClp)obj;

		long primaryKey = skill_user_mapping.getPrimaryKey();

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
		sb.append(", skill_id=");
		sb.append(getSkill_id());
		sb.append(", profile_id=");
		sb.append(getProfile_id());
		sb.append(", type_id=");
		sb.append(getType_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.db.model.skill_user_mapping");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cid</column-name><column-value><![CDATA[");
		sb.append(getCid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>skill_id</column-name><column-value><![CDATA[");
		sb.append(getSkill_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>profile_id</column-name><column-value><![CDATA[");
		sb.append(getProfile_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type_id</column-name><column-value><![CDATA[");
		sb.append(getType_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _cid;
	private long _skill_id;
	private long _profile_id;
	private long _type_id;
	private BaseModel<?> _skill_user_mappingRemoteModel;
	private Class<?> _clpSerializerClass = com.db.service.ClpSerializer.class;
}