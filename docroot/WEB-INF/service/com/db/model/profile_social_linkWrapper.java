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
 * This class is a wrapper for {@link profile_social_link}.
 * </p>
 *
 * @author ganjuss
 * @see profile_social_link
 * @generated
 */
public class profile_social_linkWrapper implements profile_social_link,
	ModelWrapper<profile_social_link> {
	public profile_social_linkWrapper(profile_social_link profile_social_link) {
		_profile_social_link = profile_social_link;
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

	/**
	* Returns the primary key of this profile_social_link.
	*
	* @return the primary key of this profile_social_link
	*/
	@Override
	public long getPrimaryKey() {
		return _profile_social_link.getPrimaryKey();
	}

	/**
	* Sets the primary key of this profile_social_link.
	*
	* @param primaryKey the primary key of this profile_social_link
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_profile_social_link.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this profile_social_link.
	*
	* @return the cid of this profile_social_link
	*/
	@Override
	public long getCid() {
		return _profile_social_link.getCid();
	}

	/**
	* Sets the cid of this profile_social_link.
	*
	* @param cid the cid of this profile_social_link
	*/
	@Override
	public void setCid(long cid) {
		_profile_social_link.setCid(cid);
	}

	/**
	* Returns the social_type_id of this profile_social_link.
	*
	* @return the social_type_id of this profile_social_link
	*/
	@Override
	public long getSocial_type_id() {
		return _profile_social_link.getSocial_type_id();
	}

	/**
	* Sets the social_type_id of this profile_social_link.
	*
	* @param social_type_id the social_type_id of this profile_social_link
	*/
	@Override
	public void setSocial_type_id(long social_type_id) {
		_profile_social_link.setSocial_type_id(social_type_id);
	}

	/**
	* Returns the link of this profile_social_link.
	*
	* @return the link of this profile_social_link
	*/
	@Override
	public java.lang.String getLink() {
		return _profile_social_link.getLink();
	}

	/**
	* Sets the link of this profile_social_link.
	*
	* @param link the link of this profile_social_link
	*/
	@Override
	public void setLink(java.lang.String link) {
		_profile_social_link.setLink(link);
	}

	/**
	* Returns the profile_id of this profile_social_link.
	*
	* @return the profile_id of this profile_social_link
	*/
	@Override
	public long getProfile_id() {
		return _profile_social_link.getProfile_id();
	}

	/**
	* Sets the profile_id of this profile_social_link.
	*
	* @param profile_id the profile_id of this profile_social_link
	*/
	@Override
	public void setProfile_id(long profile_id) {
		_profile_social_link.setProfile_id(profile_id);
	}

	@Override
	public boolean isNew() {
		return _profile_social_link.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_profile_social_link.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _profile_social_link.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_profile_social_link.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _profile_social_link.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _profile_social_link.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_profile_social_link.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _profile_social_link.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_profile_social_link.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_profile_social_link.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_profile_social_link.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new profile_social_linkWrapper((profile_social_link)_profile_social_link.clone());
	}

	@Override
	public int compareTo(com.db.model.profile_social_link profile_social_link) {
		return _profile_social_link.compareTo(profile_social_link);
	}

	@Override
	public int hashCode() {
		return _profile_social_link.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.profile_social_link> toCacheModel() {
		return _profile_social_link.toCacheModel();
	}

	@Override
	public com.db.model.profile_social_link toEscapedModel() {
		return new profile_social_linkWrapper(_profile_social_link.toEscapedModel());
	}

	@Override
	public com.db.model.profile_social_link toUnescapedModel() {
		return new profile_social_linkWrapper(_profile_social_link.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _profile_social_link.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _profile_social_link.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_profile_social_link.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof profile_social_linkWrapper)) {
			return false;
		}

		profile_social_linkWrapper profile_social_linkWrapper = (profile_social_linkWrapper)obj;

		if (Validator.equals(_profile_social_link,
					profile_social_linkWrapper._profile_social_link)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public profile_social_link getWrappedprofile_social_link() {
		return _profile_social_link;
	}

	@Override
	public profile_social_link getWrappedModel() {
		return _profile_social_link;
	}

	@Override
	public void resetOriginalValues() {
		_profile_social_link.resetOriginalValues();
	}

	private profile_social_link _profile_social_link;
}