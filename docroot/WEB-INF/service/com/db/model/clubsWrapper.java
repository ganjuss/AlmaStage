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
 * This class is a wrapper for {@link clubs}.
 * </p>
 *
 * @author ganjuss
 * @see clubs
 * @generated
 */
public class clubsWrapper implements clubs, ModelWrapper<clubs> {
	public clubsWrapper(clubs clubs) {
		_clubs = clubs;
	}

	@Override
	public Class<?> getModelClass() {
		return clubs.class;
	}

	@Override
	public String getModelClassName() {
		return clubs.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("name", getName());
		attributes.put("admin_user_id", getAdmin_user_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long admin_user_id = (Long)attributes.get("admin_user_id");

		if (admin_user_id != null) {
			setAdmin_user_id(admin_user_id);
		}
	}

	/**
	* Returns the primary key of this clubs.
	*
	* @return the primary key of this clubs
	*/
	@Override
	public long getPrimaryKey() {
		return _clubs.getPrimaryKey();
	}

	/**
	* Sets the primary key of this clubs.
	*
	* @param primaryKey the primary key of this clubs
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_clubs.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this clubs.
	*
	* @return the cid of this clubs
	*/
	@Override
	public long getCid() {
		return _clubs.getCid();
	}

	/**
	* Sets the cid of this clubs.
	*
	* @param cid the cid of this clubs
	*/
	@Override
	public void setCid(long cid) {
		_clubs.setCid(cid);
	}

	/**
	* Returns the name of this clubs.
	*
	* @return the name of this clubs
	*/
	@Override
	public java.lang.String getName() {
		return _clubs.getName();
	}

	/**
	* Sets the name of this clubs.
	*
	* @param name the name of this clubs
	*/
	@Override
	public void setName(java.lang.String name) {
		_clubs.setName(name);
	}

	/**
	* Returns the admin_user_id of this clubs.
	*
	* @return the admin_user_id of this clubs
	*/
	@Override
	public long getAdmin_user_id() {
		return _clubs.getAdmin_user_id();
	}

	/**
	* Sets the admin_user_id of this clubs.
	*
	* @param admin_user_id the admin_user_id of this clubs
	*/
	@Override
	public void setAdmin_user_id(long admin_user_id) {
		_clubs.setAdmin_user_id(admin_user_id);
	}

	@Override
	public boolean isNew() {
		return _clubs.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_clubs.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _clubs.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_clubs.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _clubs.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _clubs.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_clubs.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _clubs.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_clubs.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_clubs.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_clubs.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new clubsWrapper((clubs)_clubs.clone());
	}

	@Override
	public int compareTo(com.db.model.clubs clubs) {
		return _clubs.compareTo(clubs);
	}

	@Override
	public int hashCode() {
		return _clubs.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.clubs> toCacheModel() {
		return _clubs.toCacheModel();
	}

	@Override
	public com.db.model.clubs toEscapedModel() {
		return new clubsWrapper(_clubs.toEscapedModel());
	}

	@Override
	public com.db.model.clubs toUnescapedModel() {
		return new clubsWrapper(_clubs.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _clubs.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _clubs.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_clubs.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof clubsWrapper)) {
			return false;
		}

		clubsWrapper clubsWrapper = (clubsWrapper)obj;

		if (Validator.equals(_clubs, clubsWrapper._clubs)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public clubs getWrappedclubs() {
		return _clubs;
	}

	@Override
	public clubs getWrappedModel() {
		return _clubs;
	}

	@Override
	public void resetOriginalValues() {
		_clubs.resetOriginalValues();
	}

	private clubs _clubs;
}