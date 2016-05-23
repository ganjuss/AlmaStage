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
 * This class is a wrapper for {@link type_master}.
 * </p>
 *
 * @author ganjuss
 * @see type_master
 * @generated
 */
public class type_masterWrapper implements type_master,
	ModelWrapper<type_master> {
	public type_masterWrapper(type_master type_master) {
		_type_master = type_master;
	}

	@Override
	public Class<?> getModelClass() {
		return type_master.class;
	}

	@Override
	public String getModelClassName() {
		return type_master.class.getName();
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
	* Returns the primary key of this type_master.
	*
	* @return the primary key of this type_master
	*/
	@Override
	public long getPrimaryKey() {
		return _type_master.getPrimaryKey();
	}

	/**
	* Sets the primary key of this type_master.
	*
	* @param primaryKey the primary key of this type_master
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_type_master.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this type_master.
	*
	* @return the cid of this type_master
	*/
	@Override
	public long getCid() {
		return _type_master.getCid();
	}

	/**
	* Sets the cid of this type_master.
	*
	* @param cid the cid of this type_master
	*/
	@Override
	public void setCid(long cid) {
		_type_master.setCid(cid);
	}

	/**
	* Returns the name of this type_master.
	*
	* @return the name of this type_master
	*/
	@Override
	public java.lang.String getName() {
		return _type_master.getName();
	}

	/**
	* Sets the name of this type_master.
	*
	* @param name the name of this type_master
	*/
	@Override
	public void setName(java.lang.String name) {
		_type_master.setName(name);
	}

	@Override
	public boolean isNew() {
		return _type_master.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_type_master.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _type_master.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_type_master.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _type_master.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _type_master.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_type_master.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _type_master.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_type_master.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_type_master.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_type_master.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new type_masterWrapper((type_master)_type_master.clone());
	}

	@Override
	public int compareTo(com.db.model.type_master type_master) {
		return _type_master.compareTo(type_master);
	}

	@Override
	public int hashCode() {
		return _type_master.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.type_master> toCacheModel() {
		return _type_master.toCacheModel();
	}

	@Override
	public com.db.model.type_master toEscapedModel() {
		return new type_masterWrapper(_type_master.toEscapedModel());
	}

	@Override
	public com.db.model.type_master toUnescapedModel() {
		return new type_masterWrapper(_type_master.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _type_master.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _type_master.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_type_master.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof type_masterWrapper)) {
			return false;
		}

		type_masterWrapper type_masterWrapper = (type_masterWrapper)obj;

		if (Validator.equals(_type_master, type_masterWrapper._type_master)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public type_master getWrappedtype_master() {
		return _type_master;
	}

	@Override
	public type_master getWrappedModel() {
		return _type_master;
	}

	@Override
	public void resetOriginalValues() {
		_type_master.resetOriginalValues();
	}

	private type_master _type_master;
}