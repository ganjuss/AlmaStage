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
 * This class is a wrapper for {@link social_login}.
 * </p>
 *
 * @author ganjuss
 * @see social_login
 * @generated
 */
public class social_loginWrapper implements social_login,
	ModelWrapper<social_login> {
	public social_loginWrapper(social_login social_login) {
		_social_login = social_login;
	}

	@Override
	public Class<?> getModelClass() {
		return social_login.class;
	}

	@Override
	public String getModelClassName() {
		return social_login.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("social_type_id", getSocial_type_id());
		attributes.put("profile_id", getProfile_id());
		attributes.put("social_id", getSocial_id());

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

		Long profile_id = (Long)attributes.get("profile_id");

		if (profile_id != null) {
			setProfile_id(profile_id);
		}

		Long social_id = (Long)attributes.get("social_id");

		if (social_id != null) {
			setSocial_id(social_id);
		}
	}

	/**
	* Returns the primary key of this social_login.
	*
	* @return the primary key of this social_login
	*/
	@Override
	public long getPrimaryKey() {
		return _social_login.getPrimaryKey();
	}

	/**
	* Sets the primary key of this social_login.
	*
	* @param primaryKey the primary key of this social_login
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_social_login.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this social_login.
	*
	* @return the cid of this social_login
	*/
	@Override
	public long getCid() {
		return _social_login.getCid();
	}

	/**
	* Sets the cid of this social_login.
	*
	* @param cid the cid of this social_login
	*/
	@Override
	public void setCid(long cid) {
		_social_login.setCid(cid);
	}

	/**
	* Returns the social_type_id of this social_login.
	*
	* @return the social_type_id of this social_login
	*/
	@Override
	public long getSocial_type_id() {
		return _social_login.getSocial_type_id();
	}

	/**
	* Sets the social_type_id of this social_login.
	*
	* @param social_type_id the social_type_id of this social_login
	*/
	@Override
	public void setSocial_type_id(long social_type_id) {
		_social_login.setSocial_type_id(social_type_id);
	}

	/**
	* Returns the profile_id of this social_login.
	*
	* @return the profile_id of this social_login
	*/
	@Override
	public long getProfile_id() {
		return _social_login.getProfile_id();
	}

	/**
	* Sets the profile_id of this social_login.
	*
	* @param profile_id the profile_id of this social_login
	*/
	@Override
	public void setProfile_id(long profile_id) {
		_social_login.setProfile_id(profile_id);
	}

	/**
	* Returns the social_id of this social_login.
	*
	* @return the social_id of this social_login
	*/
	@Override
	public long getSocial_id() {
		return _social_login.getSocial_id();
	}

	/**
	* Sets the social_id of this social_login.
	*
	* @param social_id the social_id of this social_login
	*/
	@Override
	public void setSocial_id(long social_id) {
		_social_login.setSocial_id(social_id);
	}

	@Override
	public boolean isNew() {
		return _social_login.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_social_login.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _social_login.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_social_login.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _social_login.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _social_login.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_social_login.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _social_login.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_social_login.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_social_login.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_social_login.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new social_loginWrapper((social_login)_social_login.clone());
	}

	@Override
	public int compareTo(com.db.model.social_login social_login) {
		return _social_login.compareTo(social_login);
	}

	@Override
	public int hashCode() {
		return _social_login.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.social_login> toCacheModel() {
		return _social_login.toCacheModel();
	}

	@Override
	public com.db.model.social_login toEscapedModel() {
		return new social_loginWrapper(_social_login.toEscapedModel());
	}

	@Override
	public com.db.model.social_login toUnescapedModel() {
		return new social_loginWrapper(_social_login.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _social_login.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _social_login.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_social_login.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof social_loginWrapper)) {
			return false;
		}

		social_loginWrapper social_loginWrapper = (social_loginWrapper)obj;

		if (Validator.equals(_social_login, social_loginWrapper._social_login)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public social_login getWrappedsocial_login() {
		return _social_login;
	}

	@Override
	public social_login getWrappedModel() {
		return _social_login;
	}

	@Override
	public void resetOriginalValues() {
		_social_login.resetOriginalValues();
	}

	private social_login _social_login;
}