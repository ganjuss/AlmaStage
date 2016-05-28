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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link user_contact}.
 * </p>
 *
 * @author ganjuss
 * @see user_contact
 * @generated
 */
public class user_contactWrapper implements user_contact,
	ModelWrapper<user_contact> {
	public user_contactWrapper(user_contact user_contact) {
		_user_contact = user_contact;
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

		String phone = (String)attributes.get("phone");

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

	/**
	* Returns the primary key of this user_contact.
	*
	* @return the primary key of this user_contact
	*/
	@Override
	public long getPrimaryKey() {
		return _user_contact.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user_contact.
	*
	* @param primaryKey the primary key of this user_contact
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_user_contact.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this user_contact.
	*
	* @return the cid of this user_contact
	*/
	@Override
	public long getCid() {
		return _user_contact.getCid();
	}

	/**
	* Sets the cid of this user_contact.
	*
	* @param cid the cid of this user_contact
	*/
	@Override
	public void setCid(long cid) {
		_user_contact.setCid(cid);
	}

	/**
	* Returns the profile_id of this user_contact.
	*
	* @return the profile_id of this user_contact
	*/
	@Override
	public long getProfile_id() {
		return _user_contact.getProfile_id();
	}

	/**
	* Sets the profile_id of this user_contact.
	*
	* @param profile_id the profile_id of this user_contact
	*/
	@Override
	public void setProfile_id(long profile_id) {
		_user_contact.setProfile_id(profile_id);
	}

	/**
	* Returns the user_id of this user_contact.
	*
	* @return the user_id of this user_contact
	*/
	@Override
	public long getUser_id() {
		return _user_contact.getUser_id();
	}

	/**
	* Sets the user_id of this user_contact.
	*
	* @param user_id the user_id of this user_contact
	*/
	@Override
	public void setUser_id(long user_id) {
		_user_contact.setUser_id(user_id);
	}

	/**
	* Returns the email of this user_contact.
	*
	* @return the email of this user_contact
	*/
	@Override
	public java.lang.String getEmail() {
		return _user_contact.getEmail();
	}

	/**
	* Sets the email of this user_contact.
	*
	* @param email the email of this user_contact
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_user_contact.setEmail(email);
	}

	/**
	* Returns the phone of this user_contact.
	*
	* @return the phone of this user_contact
	*/
	@Override
	public java.lang.String getPhone() {
		return _user_contact.getPhone();
	}

	/**
	* Sets the phone of this user_contact.
	*
	* @param phone the phone of this user_contact
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_user_contact.setPhone(phone);
	}

	/**
	* Returns the dob of this user_contact.
	*
	* @return the dob of this user_contact
	*/
	@Override
	public java.util.Date getDob() {
		return _user_contact.getDob();
	}

	/**
	* Sets the dob of this user_contact.
	*
	* @param dob the dob of this user_contact
	*/
	@Override
	public void setDob(java.util.Date dob) {
		_user_contact.setDob(dob);
	}

	/**
	* Returns the city of this user_contact.
	*
	* @return the city of this user_contact
	*/
	@Override
	public java.lang.String getCity() {
		return _user_contact.getCity();
	}

	/**
	* Sets the city of this user_contact.
	*
	* @param city the city of this user_contact
	*/
	@Override
	public void setCity(java.lang.String city) {
		_user_contact.setCity(city);
	}

	/**
	* Returns the gender of this user_contact.
	*
	* @return the gender of this user_contact
	*/
	@Override
	public java.lang.String getGender() {
		return _user_contact.getGender();
	}

	/**
	* Sets the gender of this user_contact.
	*
	* @param gender the gender of this user_contact
	*/
	@Override
	public void setGender(java.lang.String gender) {
		_user_contact.setGender(gender);
	}

	@Override
	public boolean isNew() {
		return _user_contact.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_user_contact.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _user_contact.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_user_contact.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _user_contact.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _user_contact.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_user_contact.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _user_contact.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_user_contact.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_user_contact.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_user_contact.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new user_contactWrapper((user_contact)_user_contact.clone());
	}

	@Override
	public int compareTo(com.db.model.user_contact user_contact) {
		return _user_contact.compareTo(user_contact);
	}

	@Override
	public int hashCode() {
		return _user_contact.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.user_contact> toCacheModel() {
		return _user_contact.toCacheModel();
	}

	@Override
	public com.db.model.user_contact toEscapedModel() {
		return new user_contactWrapper(_user_contact.toEscapedModel());
	}

	@Override
	public com.db.model.user_contact toUnescapedModel() {
		return new user_contactWrapper(_user_contact.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _user_contact.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _user_contact.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_user_contact.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof user_contactWrapper)) {
			return false;
		}

		user_contactWrapper user_contactWrapper = (user_contactWrapper)obj;

		if (Validator.equals(_user_contact, user_contactWrapper._user_contact)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public user_contact getWrappeduser_contact() {
		return _user_contact;
	}

	@Override
	public user_contact getWrappedModel() {
		return _user_contact;
	}

	@Override
	public void resetOriginalValues() {
		_user_contact.resetOriginalValues();
	}

	private user_contact _user_contact;
}