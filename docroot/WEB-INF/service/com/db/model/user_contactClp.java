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
import com.db.service.user_contactLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ganjuss
 */
public class user_contactClp extends BaseModelImpl<user_contact>
	implements user_contact {
	public user_contactClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return user_contact.class;
	}

	@Override
	public String getModelClassName() {
		return user_contact.class.getName();
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
		attributes.put("email", getEmail());
		attributes.put("phone", getPhone());
		attributes.put("dob", getDob());
		attributes.put("city", getCity());
		attributes.put("gender", getGender());

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

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Long phone = (Long)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		Date dob = (Date)attributes.get("dob");

		if (dob != null) {
			setDob(dob);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}
	}

	@Override
	public long getCid() {
		return _cid;
	}

	@Override
	public void setCid(long cid) {
		_cid = cid;

		if (_user_contactRemoteModel != null) {
			try {
				Class<?> clazz = _user_contactRemoteModel.getClass();

				Method method = clazz.getMethod("setCid", long.class);

				method.invoke(_user_contactRemoteModel, cid);
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

		if (_user_contactRemoteModel != null) {
			try {
				Class<?> clazz = _user_contactRemoteModel.getClass();

				Method method = clazz.getMethod("setProfile_id", long.class);

				method.invoke(_user_contactRemoteModel, profile_id);
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

		if (_user_contactRemoteModel != null) {
			try {
				Class<?> clazz = _user_contactRemoteModel.getClass();

				Method method = clazz.getMethod("setUser_id", long.class);

				method.invoke(_user_contactRemoteModel, user_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_user_contactRemoteModel != null) {
			try {
				Class<?> clazz = _user_contactRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_user_contactRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhone() {
		return _phone;
	}

	@Override
	public void setPhone(long phone) {
		_phone = phone;

		if (_user_contactRemoteModel != null) {
			try {
				Class<?> clazz = _user_contactRemoteModel.getClass();

				Method method = clazz.getMethod("setPhone", long.class);

				method.invoke(_user_contactRemoteModel, phone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDob() {
		return _dob;
	}

	@Override
	public void setDob(Date dob) {
		_dob = dob;

		if (_user_contactRemoteModel != null) {
			try {
				Class<?> clazz = _user_contactRemoteModel.getClass();

				Method method = clazz.getMethod("setDob", Date.class);

				method.invoke(_user_contactRemoteModel, dob);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCity() {
		return _city;
	}

	@Override
	public void setCity(String city) {
		_city = city;

		if (_user_contactRemoteModel != null) {
			try {
				Class<?> clazz = _user_contactRemoteModel.getClass();

				Method method = clazz.getMethod("setCity", String.class);

				method.invoke(_user_contactRemoteModel, city);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGender() {
		return _gender;
	}

	@Override
	public void setGender(String gender) {
		_gender = gender;

		if (_user_contactRemoteModel != null) {
			try {
				Class<?> clazz = _user_contactRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", String.class);

				method.invoke(_user_contactRemoteModel, gender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getuser_contactRemoteModel() {
		return _user_contactRemoteModel;
	}

	public void setuser_contactRemoteModel(BaseModel<?> user_contactRemoteModel) {
		_user_contactRemoteModel = user_contactRemoteModel;
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

		Class<?> remoteModelClass = _user_contactRemoteModel.getClass();

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

		Object returnValue = method.invoke(_user_contactRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			user_contactLocalServiceUtil.adduser_contact(this);
		}
		else {
			user_contactLocalServiceUtil.updateuser_contact(this);
		}
	}

	@Override
	public user_contact toEscapedModel() {
		return (user_contact)ProxyUtil.newProxyInstance(user_contact.class.getClassLoader(),
			new Class[] { user_contact.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		user_contactClp clone = new user_contactClp();

		clone.setCid(getCid());
		clone.setProfile_id(getProfile_id());
		clone.setUser_id(getUser_id());
		clone.setEmail(getEmail());
		clone.setPhone(getPhone());
		clone.setDob(getDob());
		clone.setCity(getCity());
		clone.setGender(getGender());

		return clone;
	}

	@Override
	public int compareTo(user_contact user_contact) {
		long primaryKey = user_contact.getPrimaryKey();

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

		if (!(obj instanceof user_contactClp)) {
			return false;
		}

		user_contactClp user_contact = (user_contactClp)obj;

		long primaryKey = user_contact.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{cid=");
		sb.append(getCid());
		sb.append(", profile_id=");
		sb.append(getProfile_id());
		sb.append(", user_id=");
		sb.append(getUser_id());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", dob=");
		sb.append(getDob());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.db.model.user_contact");
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
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dob</column-name><column-value><![CDATA[");
		sb.append(getDob());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _cid;
	private long _profile_id;
	private long _user_id;
	private String _email;
	private long _phone;
	private Date _dob;
	private String _city;
	private String _gender;
	private BaseModel<?> _user_contactRemoteModel;
	private Class<?> _clpSerializerClass = com.db.service.ClpSerializer.class;
}