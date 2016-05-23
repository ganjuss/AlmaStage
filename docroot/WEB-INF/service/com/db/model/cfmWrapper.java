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
 * This class is a wrapper for {@link cfm}.
 * </p>
 *
 * @author ganjuss
 * @see cfm
 * @generated
 */
public class cfmWrapper implements cfm, ModelWrapper<cfm> {
	public cfmWrapper(cfm cfm) {
		_cfm = cfm;
	}

	@Override
	public Class<?> getModelClass() {
		return cfm.class;
	}

	@Override
	public String getModelClassName() {
		return cfm.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("cfm_by", getCfm_by());
		attributes.put("cfm_to", getCfm_to());
		attributes.put("cfm_type_id", getCfm_type_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		Long cfm_by = (Long)attributes.get("cfm_by");

		if (cfm_by != null) {
			setCfm_by(cfm_by);
		}

		Long cfm_to = (Long)attributes.get("cfm_to");

		if (cfm_to != null) {
			setCfm_to(cfm_to);
		}

		Long cfm_type_id = (Long)attributes.get("cfm_type_id");

		if (cfm_type_id != null) {
			setCfm_type_id(cfm_type_id);
		}
	}

	/**
	* Returns the primary key of this cfm.
	*
	* @return the primary key of this cfm
	*/
	@Override
	public long getPrimaryKey() {
		return _cfm.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cfm.
	*
	* @param primaryKey the primary key of this cfm
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cfm.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this cfm.
	*
	* @return the cid of this cfm
	*/
	@Override
	public long getCid() {
		return _cfm.getCid();
	}

	/**
	* Sets the cid of this cfm.
	*
	* @param cid the cid of this cfm
	*/
	@Override
	public void setCid(long cid) {
		_cfm.setCid(cid);
	}

	/**
	* Returns the cfm_by of this cfm.
	*
	* @return the cfm_by of this cfm
	*/
	@Override
	public long getCfm_by() {
		return _cfm.getCfm_by();
	}

	/**
	* Sets the cfm_by of this cfm.
	*
	* @param cfm_by the cfm_by of this cfm
	*/
	@Override
	public void setCfm_by(long cfm_by) {
		_cfm.setCfm_by(cfm_by);
	}

	/**
	* Returns the cfm_to of this cfm.
	*
	* @return the cfm_to of this cfm
	*/
	@Override
	public long getCfm_to() {
		return _cfm.getCfm_to();
	}

	/**
	* Sets the cfm_to of this cfm.
	*
	* @param cfm_to the cfm_to of this cfm
	*/
	@Override
	public void setCfm_to(long cfm_to) {
		_cfm.setCfm_to(cfm_to);
	}

	/**
	* Returns the cfm_type_id of this cfm.
	*
	* @return the cfm_type_id of this cfm
	*/
	@Override
	public long getCfm_type_id() {
		return _cfm.getCfm_type_id();
	}

	/**
	* Sets the cfm_type_id of this cfm.
	*
	* @param cfm_type_id the cfm_type_id of this cfm
	*/
	@Override
	public void setCfm_type_id(long cfm_type_id) {
		_cfm.setCfm_type_id(cfm_type_id);
	}

	@Override
	public boolean isNew() {
		return _cfm.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_cfm.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _cfm.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cfm.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _cfm.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _cfm.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cfm.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cfm.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_cfm.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_cfm.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cfm.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new cfmWrapper((cfm)_cfm.clone());
	}

	@Override
	public int compareTo(com.db.model.cfm cfm) {
		return _cfm.compareTo(cfm);
	}

	@Override
	public int hashCode() {
		return _cfm.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.cfm> toCacheModel() {
		return _cfm.toCacheModel();
	}

	@Override
	public com.db.model.cfm toEscapedModel() {
		return new cfmWrapper(_cfm.toEscapedModel());
	}

	@Override
	public com.db.model.cfm toUnescapedModel() {
		return new cfmWrapper(_cfm.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cfm.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cfm.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cfm.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof cfmWrapper)) {
			return false;
		}

		cfmWrapper cfmWrapper = (cfmWrapper)obj;

		if (Validator.equals(_cfm, cfmWrapper._cfm)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public cfm getWrappedcfm() {
		return _cfm;
	}

	@Override
	public cfm getWrappedModel() {
		return _cfm;
	}

	@Override
	public void resetOriginalValues() {
		_cfm.resetOriginalValues();
	}

	private cfm _cfm;
}