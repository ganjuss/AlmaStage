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
 * This class is a wrapper for {@link club_users}.
 * </p>
 *
 * @author ganjuss
 * @see club_users
 * @generated
 */
public class club_usersWrapper implements club_users, ModelWrapper<club_users> {
	public club_usersWrapper(club_users club_users) {
		_club_users = club_users;
	}

	@Override
	public Class<?> getModelClass() {
		return club_users.class;
	}

	@Override
	public String getModelClassName() {
		return club_users.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("club_id", getClub_id());
		attributes.put("user_id", getUser_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		Long club_id = (Long)attributes.get("club_id");

		if (club_id != null) {
			setClub_id(club_id);
		}

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}
	}

	/**
	* Returns the primary key of this club_users.
	*
	* @return the primary key of this club_users
	*/
	@Override
	public long getPrimaryKey() {
		return _club_users.getPrimaryKey();
	}

	/**
	* Sets the primary key of this club_users.
	*
	* @param primaryKey the primary key of this club_users
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_club_users.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this club_users.
	*
	* @return the cid of this club_users
	*/
	@Override
	public long getCid() {
		return _club_users.getCid();
	}

	/**
	* Sets the cid of this club_users.
	*
	* @param cid the cid of this club_users
	*/
	@Override
	public void setCid(long cid) {
		_club_users.setCid(cid);
	}

	/**
	* Returns the club_id of this club_users.
	*
	* @return the club_id of this club_users
	*/
	@Override
	public long getClub_id() {
		return _club_users.getClub_id();
	}

	/**
	* Sets the club_id of this club_users.
	*
	* @param club_id the club_id of this club_users
	*/
	@Override
	public void setClub_id(long club_id) {
		_club_users.setClub_id(club_id);
	}

	/**
	* Returns the user_id of this club_users.
	*
	* @return the user_id of this club_users
	*/
	@Override
	public long getUser_id() {
		return _club_users.getUser_id();
	}

	/**
	* Sets the user_id of this club_users.
	*
	* @param user_id the user_id of this club_users
	*/
	@Override
	public void setUser_id(long user_id) {
		_club_users.setUser_id(user_id);
	}

	@Override
	public boolean isNew() {
		return _club_users.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_club_users.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _club_users.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_club_users.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _club_users.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _club_users.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_club_users.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _club_users.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_club_users.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_club_users.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_club_users.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new club_usersWrapper((club_users)_club_users.clone());
	}

	@Override
	public int compareTo(com.db.model.club_users club_users) {
		return _club_users.compareTo(club_users);
	}

	@Override
	public int hashCode() {
		return _club_users.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.club_users> toCacheModel() {
		return _club_users.toCacheModel();
	}

	@Override
	public com.db.model.club_users toEscapedModel() {
		return new club_usersWrapper(_club_users.toEscapedModel());
	}

	@Override
	public com.db.model.club_users toUnescapedModel() {
		return new club_usersWrapper(_club_users.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _club_users.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _club_users.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_club_users.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof club_usersWrapper)) {
			return false;
		}

		club_usersWrapper club_usersWrapper = (club_usersWrapper)obj;

		if (Validator.equals(_club_users, club_usersWrapper._club_users)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public club_users getWrappedclub_users() {
		return _club_users;
	}

	@Override
	public club_users getWrappedModel() {
		return _club_users;
	}

	@Override
	public void resetOriginalValues() {
		_club_users.resetOriginalValues();
	}

	private club_users _club_users;
}