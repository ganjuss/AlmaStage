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
 * This class is a wrapper for {@link social_type_master}.
 * </p>
 *
 * @author ganjuss
 * @see social_type_master
 * @generated
 */
public class social_type_masterWrapper implements social_type_master,
	ModelWrapper<social_type_master> {
	public social_type_masterWrapper(social_type_master social_type_master) {
		_social_type_master = social_type_master;
	}

	@Override
	public Class<?> getModelClass() {
		return social_type_master.class;
	}

	@Override
	public String getModelClassName() {
		return social_type_master.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("name", getName());

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
	}

	/**
	* Returns the primary key of this social_type_master.
	*
	* @return the primary key of this social_type_master
	*/
	@Override
	public long getPrimaryKey() {
		return _social_type_master.getPrimaryKey();
	}

	/**
	* Sets the primary key of this social_type_master.
	*
	* @param primaryKey the primary key of this social_type_master
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_social_type_master.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this social_type_master.
	*
	* @return the cid of this social_type_master
	*/
	@Override
	public long getCid() {
		return _social_type_master.getCid();
	}

	/**
	* Sets the cid of this social_type_master.
	*
	* @param cid the cid of this social_type_master
	*/
	@Override
	public void setCid(long cid) {
		_social_type_master.setCid(cid);
	}

	/**
	* Returns the name of this social_type_master.
	*
	* @return the name of this social_type_master
	*/
	@Override
	public java.lang.String getName() {
		return _social_type_master.getName();
	}

	/**
	* Sets the name of this social_type_master.
	*
	* @param name the name of this social_type_master
	*/
	@Override
	public void setName(java.lang.String name) {
		_social_type_master.setName(name);
	}

	@Override
	public boolean isNew() {
		return _social_type_master.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_social_type_master.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _social_type_master.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_social_type_master.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _social_type_master.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _social_type_master.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_social_type_master.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _social_type_master.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_social_type_master.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_social_type_master.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_social_type_master.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new social_type_masterWrapper((social_type_master)_social_type_master.clone());
	}

	@Override
	public int compareTo(com.db.model.social_type_master social_type_master) {
		return _social_type_master.compareTo(social_type_master);
	}

	@Override
	public int hashCode() {
		return _social_type_master.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.social_type_master> toCacheModel() {
		return _social_type_master.toCacheModel();
	}

	@Override
	public com.db.model.social_type_master toEscapedModel() {
		return new social_type_masterWrapper(_social_type_master.toEscapedModel());
	}

	@Override
	public com.db.model.social_type_master toUnescapedModel() {
		return new social_type_masterWrapper(_social_type_master.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _social_type_master.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _social_type_master.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_social_type_master.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof social_type_masterWrapper)) {
			return false;
		}

		social_type_masterWrapper social_type_masterWrapper = (social_type_masterWrapper)obj;

		if (Validator.equals(_social_type_master,
					social_type_masterWrapper._social_type_master)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public social_type_master getWrappedsocial_type_master() {
		return _social_type_master;
	}

	@Override
	public social_type_master getWrappedModel() {
		return _social_type_master;
	}

	@Override
	public void resetOriginalValues() {
		_social_type_master.resetOriginalValues();
	}

	private social_type_master _social_type_master;
}