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
 * This class is a wrapper for {@link cfm_master}.
 * </p>
 *
 * @author ganjuss
 * @see cfm_master
 * @generated
 */
public class cfm_masterWrapper implements cfm_master, ModelWrapper<cfm_master> {
	public cfm_masterWrapper(cfm_master cfm_master) {
		_cfm_master = cfm_master;
	}

	@Override
	public Class<?> getModelClass() {
		return cfm_master.class;
	}

	@Override
	public String getModelClassName() {
		return cfm_master.class.getName();
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
	* Returns the primary key of this cfm_master.
	*
	* @return the primary key of this cfm_master
	*/
	@Override
	public long getPrimaryKey() {
		return _cfm_master.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cfm_master.
	*
	* @param primaryKey the primary key of this cfm_master
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cfm_master.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this cfm_master.
	*
	* @return the cid of this cfm_master
	*/
	@Override
	public long getCid() {
		return _cfm_master.getCid();
	}

	/**
	* Sets the cid of this cfm_master.
	*
	* @param cid the cid of this cfm_master
	*/
	@Override
	public void setCid(long cid) {
		_cfm_master.setCid(cid);
	}

	/**
	* Returns the name of this cfm_master.
	*
	* @return the name of this cfm_master
	*/
	@Override
	public java.lang.String getName() {
		return _cfm_master.getName();
	}

	/**
	* Sets the name of this cfm_master.
	*
	* @param name the name of this cfm_master
	*/
	@Override
	public void setName(java.lang.String name) {
		_cfm_master.setName(name);
	}

	@Override
	public boolean isNew() {
		return _cfm_master.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_cfm_master.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _cfm_master.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cfm_master.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _cfm_master.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _cfm_master.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cfm_master.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cfm_master.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_cfm_master.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_cfm_master.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cfm_master.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new cfm_masterWrapper((cfm_master)_cfm_master.clone());
	}

	@Override
	public int compareTo(com.db.model.cfm_master cfm_master) {
		return _cfm_master.compareTo(cfm_master);
	}

	@Override
	public int hashCode() {
		return _cfm_master.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.cfm_master> toCacheModel() {
		return _cfm_master.toCacheModel();
	}

	@Override
	public com.db.model.cfm_master toEscapedModel() {
		return new cfm_masterWrapper(_cfm_master.toEscapedModel());
	}

	@Override
	public com.db.model.cfm_master toUnescapedModel() {
		return new cfm_masterWrapper(_cfm_master.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cfm_master.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cfm_master.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cfm_master.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof cfm_masterWrapper)) {
			return false;
		}

		cfm_masterWrapper cfm_masterWrapper = (cfm_masterWrapper)obj;

		if (Validator.equals(_cfm_master, cfm_masterWrapper._cfm_master)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public cfm_master getWrappedcfm_master() {
		return _cfm_master;
	}

	@Override
	public cfm_master getWrappedModel() {
		return _cfm_master;
	}

	@Override
	public void resetOriginalValues() {
		_cfm_master.resetOriginalValues();
	}

	private cfm_master _cfm_master;
}