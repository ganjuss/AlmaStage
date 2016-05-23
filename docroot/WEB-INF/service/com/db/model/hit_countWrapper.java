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
 * This class is a wrapper for {@link hit_count}.
 * </p>
 *
 * @author ganjuss
 * @see hit_count
 * @generated
 */
public class hit_countWrapper implements hit_count, ModelWrapper<hit_count> {
	public hit_countWrapper(hit_count hit_count) {
		_hit_count = hit_count;
	}

	@Override
	public Class<?> getModelClass() {
		return hit_count.class;
	}

	@Override
	public String getModelClassName() {
		return hit_count.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("profile_id", getProfile_id());
		attributes.put("user_id", getUser_id());
		attributes.put("counter", getCounter());
		attributes.put("highfive", getHighfive());

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

		Long counter = (Long)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long highfive = (Long)attributes.get("highfive");

		if (highfive != null) {
			setHighfive(highfive);
		}
	}

	/**
	* Returns the primary key of this hit_count.
	*
	* @return the primary key of this hit_count
	*/
	@Override
	public long getPrimaryKey() {
		return _hit_count.getPrimaryKey();
	}

	/**
	* Sets the primary key of this hit_count.
	*
	* @param primaryKey the primary key of this hit_count
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_hit_count.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this hit_count.
	*
	* @return the cid of this hit_count
	*/
	@Override
	public long getCid() {
		return _hit_count.getCid();
	}

	/**
	* Sets the cid of this hit_count.
	*
	* @param cid the cid of this hit_count
	*/
	@Override
	public void setCid(long cid) {
		_hit_count.setCid(cid);
	}

	/**
	* Returns the profile_id of this hit_count.
	*
	* @return the profile_id of this hit_count
	*/
	@Override
	public long getProfile_id() {
		return _hit_count.getProfile_id();
	}

	/**
	* Sets the profile_id of this hit_count.
	*
	* @param profile_id the profile_id of this hit_count
	*/
	@Override
	public void setProfile_id(long profile_id) {
		_hit_count.setProfile_id(profile_id);
	}

	/**
	* Returns the user_id of this hit_count.
	*
	* @return the user_id of this hit_count
	*/
	@Override
	public long getUser_id() {
		return _hit_count.getUser_id();
	}

	/**
	* Sets the user_id of this hit_count.
	*
	* @param user_id the user_id of this hit_count
	*/
	@Override
	public void setUser_id(long user_id) {
		_hit_count.setUser_id(user_id);
	}

	/**
	* Returns the counter of this hit_count.
	*
	* @return the counter of this hit_count
	*/
	@Override
	public long getCounter() {
		return _hit_count.getCounter();
	}

	/**
	* Sets the counter of this hit_count.
	*
	* @param counter the counter of this hit_count
	*/
	@Override
	public void setCounter(long counter) {
		_hit_count.setCounter(counter);
	}

	/**
	* Returns the highfive of this hit_count.
	*
	* @return the highfive of this hit_count
	*/
	@Override
	public long getHighfive() {
		return _hit_count.getHighfive();
	}

	/**
	* Sets the highfive of this hit_count.
	*
	* @param highfive the highfive of this hit_count
	*/
	@Override
	public void setHighfive(long highfive) {
		_hit_count.setHighfive(highfive);
	}

	@Override
	public boolean isNew() {
		return _hit_count.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_hit_count.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _hit_count.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_hit_count.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _hit_count.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _hit_count.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_hit_count.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _hit_count.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_hit_count.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_hit_count.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_hit_count.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new hit_countWrapper((hit_count)_hit_count.clone());
	}

	@Override
	public int compareTo(com.db.model.hit_count hit_count) {
		return _hit_count.compareTo(hit_count);
	}

	@Override
	public int hashCode() {
		return _hit_count.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.hit_count> toCacheModel() {
		return _hit_count.toCacheModel();
	}

	@Override
	public com.db.model.hit_count toEscapedModel() {
		return new hit_countWrapper(_hit_count.toEscapedModel());
	}

	@Override
	public com.db.model.hit_count toUnescapedModel() {
		return new hit_countWrapper(_hit_count.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _hit_count.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _hit_count.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_hit_count.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof hit_countWrapper)) {
			return false;
		}

		hit_countWrapper hit_countWrapper = (hit_countWrapper)obj;

		if (Validator.equals(_hit_count, hit_countWrapper._hit_count)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public hit_count getWrappedhit_count() {
		return _hit_count;
	}

	@Override
	public hit_count getWrappedModel() {
		return _hit_count;
	}

	@Override
	public void resetOriginalValues() {
		_hit_count.resetOriginalValues();
	}

	private hit_count _hit_count;
}