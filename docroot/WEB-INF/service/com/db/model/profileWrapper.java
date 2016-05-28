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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link profile}.
 * </p>
 *
 * @author ganjuss
 * @see profile
 * @generated
 */
public class profileWrapper implements profile, ModelWrapper<profile> {
	public profileWrapper(profile profile) {
		_profile = profile;
	}

	@Override
	public Class<?> getModelClass() {
		return profile.class;
	}

	@Override
	public String getModelClassName() {
		return profile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("type_id", getType_id());
		attributes.put("genere_id", getGenere_id());
		attributes.put("user_id", getUser_id());
		attributes.put("profile_name", getProfile_name());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		Long type_id = (Long)attributes.get("type_id");

		if (type_id != null) {
			setType_id(type_id);
		}

		Long genere_id = (Long)attributes.get("genere_id");

		if (genere_id != null) {
			setGenere_id(genere_id);
		}

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		String profile_name = (String)attributes.get("profile_name");

		if (profile_name != null) {
			setProfile_name(profile_name);
		}
	}

	/**
	* Returns the primary key of this profile.
	*
	* @return the primary key of this profile
	*/
	@Override
	public long getPrimaryKey() {
		return _profile.getPrimaryKey();
	}

	/**
	* Sets the primary key of this profile.
	*
	* @param primaryKey the primary key of this profile
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_profile.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this profile.
	*
	* @return the cid of this profile
	*/
	@Override
	public long getCid() {
		return _profile.getCid();
	}

	/**
	* Sets the cid of this profile.
	*
	* @param cid the cid of this profile
	*/
	@Override
	public void setCid(long cid) {
		_profile.setCid(cid);
	}

	/**
	* Returns the type_id of this profile.
	*
	* @return the type_id of this profile
	*/
	@Override
	public long getType_id() {
		return _profile.getType_id();
	}

	/**
	* Sets the type_id of this profile.
	*
	* @param type_id the type_id of this profile
	*/
	@Override
	public void setType_id(long type_id) {
		_profile.setType_id(type_id);
	}

	/**
	* Returns the genere_id of this profile.
	*
	* @return the genere_id of this profile
	*/
	@Override
	public long getGenere_id() {
		return _profile.getGenere_id();
	}

	/**
	* Sets the genere_id of this profile.
	*
	* @param genere_id the genere_id of this profile
	*/
	@Override
	public void setGenere_id(long genere_id) {
		_profile.setGenere_id(genere_id);
	}

	/**
	* Returns the user_id of this profile.
	*
	* @return the user_id of this profile
	*/
	@Override
	public long getUser_id() {
		return _profile.getUser_id();
	}

	/**
	* Sets the user_id of this profile.
	*
	* @param user_id the user_id of this profile
	*/
	@Override
	public void setUser_id(long user_id) {
		_profile.setUser_id(user_id);
	}

	/**
	* Returns the profile_name of this profile.
	*
	* @return the profile_name of this profile
	*/
	@Override
	public java.lang.String getProfile_name() {
		return _profile.getProfile_name();
	}

	/**
	* Sets the profile_name of this profile.
	*
	* @param profile_name the profile_name of this profile
	*/
	@Override
	public void setProfile_name(java.lang.String profile_name) {
		_profile.setProfile_name(profile_name);
	}

	@Override
	public boolean isNew() {
		return _profile.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_profile.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _profile.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_profile.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _profile.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _profile.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_profile.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _profile.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_profile.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_profile.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_profile.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new profileWrapper((profile)_profile.clone());
	}

	@Override
	public int compareTo(com.db.model.profile profile) {
		return _profile.compareTo(profile);
	}

	@Override
	public int hashCode() {
		return _profile.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.profile> toCacheModel() {
		return _profile.toCacheModel();
	}

	@Override
	public com.db.model.profile toEscapedModel() {
		return new profileWrapper(_profile.toEscapedModel());
	}

	@Override
	public com.db.model.profile toUnescapedModel() {
		return new profileWrapper(_profile.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _profile.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _profile.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_profile.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof profileWrapper)) {
			return false;
		}

		profileWrapper profileWrapper = (profileWrapper)obj;

		if (Validator.equals(_profile, profileWrapper._profile)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public profile getWrappedprofile() {
		return _profile;
	}

	@Override
	public profile getWrappedModel() {
		return _profile;
	}

	@Override
	public void resetOriginalValues() {
		_profile.resetOriginalValues();
	}

	private profile _profile;
}