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
 * This class is a wrapper for {@link about_us}.
 * </p>
 *
 * @author ganjuss
 * @see about_us
 * @generated
 */
public class about_usWrapper implements about_us, ModelWrapper<about_us> {
	public about_usWrapper(about_us about_us) {
		_about_us = about_us;
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

	/**
	* Returns the primary key of this about_us.
	*
	* @return the primary key of this about_us
	*/
	@Override
	public long getPrimaryKey() {
		return _about_us.getPrimaryKey();
	}

	/**
	* Sets the primary key of this about_us.
	*
	* @param primaryKey the primary key of this about_us
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_about_us.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this about_us.
	*
	* @return the cid of this about_us
	*/
	@Override
	public long getCid() {
		return _about_us.getCid();
	}

	/**
	* Sets the cid of this about_us.
	*
	* @param cid the cid of this about_us
	*/
	@Override
	public void setCid(long cid) {
		_about_us.setCid(cid);
	}

	/**
	* Returns the profile_id of this about_us.
	*
	* @return the profile_id of this about_us
	*/
	@Override
	public long getProfile_id() {
		return _about_us.getProfile_id();
	}

	/**
	* Sets the profile_id of this about_us.
	*
	* @param profile_id the profile_id of this about_us
	*/
	@Override
	public void setProfile_id(long profile_id) {
		_about_us.setProfile_id(profile_id);
	}

	/**
	* Returns the text of this about_us.
	*
	* @return the text of this about_us
	*/
	@Override
	public java.lang.String getText() {
		return _about_us.getText();
	}

	/**
	* Sets the text of this about_us.
	*
	* @param text the text of this about_us
	*/
	@Override
	public void setText(java.lang.String text) {
		_about_us.setText(text);
	}

	@Override
	public boolean isNew() {
		return _about_us.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_about_us.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _about_us.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_about_us.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _about_us.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _about_us.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_about_us.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _about_us.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_about_us.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_about_us.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_about_us.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new about_usWrapper((about_us)_about_us.clone());
	}

	@Override
	public int compareTo(com.db.model.about_us about_us) {
		return _about_us.compareTo(about_us);
	}

	@Override
	public int hashCode() {
		return _about_us.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.about_us> toCacheModel() {
		return _about_us.toCacheModel();
	}

	@Override
	public com.db.model.about_us toEscapedModel() {
		return new about_usWrapper(_about_us.toEscapedModel());
	}

	@Override
	public com.db.model.about_us toUnescapedModel() {
		return new about_usWrapper(_about_us.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _about_us.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _about_us.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_about_us.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof about_usWrapper)) {
			return false;
		}

		about_usWrapper about_usWrapper = (about_usWrapper)obj;

		if (Validator.equals(_about_us, about_usWrapper._about_us)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public about_us getWrappedabout_us() {
		return _about_us;
	}

	@Override
	public about_us getWrappedModel() {
		return _about_us;
	}

	@Override
	public void resetOriginalValues() {
		_about_us.resetOriginalValues();
	}

	private about_us _about_us;
}