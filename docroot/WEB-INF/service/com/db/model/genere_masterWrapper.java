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
 * This class is a wrapper for {@link genere_master}.
 * </p>
 *
 * @author ganjuss
 * @see genere_master
 * @generated
 */
public class genere_masterWrapper implements genere_master,
	ModelWrapper<genere_master> {
	public genere_masterWrapper(genere_master genere_master) {
		_genere_master = genere_master;
	}

	@Override
	public Class<?> getModelClass() {
		return genere_master.class;
	}

	@Override
	public String getModelClassName() {
		return genere_master.class.getName();
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
	* Returns the primary key of this genere_master.
	*
	* @return the primary key of this genere_master
	*/
	@Override
	public long getPrimaryKey() {
		return _genere_master.getPrimaryKey();
	}

	/**
	* Sets the primary key of this genere_master.
	*
	* @param primaryKey the primary key of this genere_master
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_genere_master.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this genere_master.
	*
	* @return the cid of this genere_master
	*/
	@Override
	public long getCid() {
		return _genere_master.getCid();
	}

	/**
	* Sets the cid of this genere_master.
	*
	* @param cid the cid of this genere_master
	*/
	@Override
	public void setCid(long cid) {
		_genere_master.setCid(cid);
	}

	/**
	* Returns the name of this genere_master.
	*
	* @return the name of this genere_master
	*/
	@Override
	public java.lang.String getName() {
		return _genere_master.getName();
	}

	/**
	* Sets the name of this genere_master.
	*
	* @param name the name of this genere_master
	*/
	@Override
	public void setName(java.lang.String name) {
		_genere_master.setName(name);
	}

	@Override
	public boolean isNew() {
		return _genere_master.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_genere_master.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _genere_master.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_genere_master.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _genere_master.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _genere_master.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_genere_master.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _genere_master.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_genere_master.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_genere_master.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_genere_master.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new genere_masterWrapper((genere_master)_genere_master.clone());
	}

	@Override
	public int compareTo(com.db.model.genere_master genere_master) {
		return _genere_master.compareTo(genere_master);
	}

	@Override
	public int hashCode() {
		return _genere_master.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.genere_master> toCacheModel() {
		return _genere_master.toCacheModel();
	}

	@Override
	public com.db.model.genere_master toEscapedModel() {
		return new genere_masterWrapper(_genere_master.toEscapedModel());
	}

	@Override
	public com.db.model.genere_master toUnescapedModel() {
		return new genere_masterWrapper(_genere_master.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _genere_master.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _genere_master.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_genere_master.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof genere_masterWrapper)) {
			return false;
		}

		genere_masterWrapper genere_masterWrapper = (genere_masterWrapper)obj;

		if (Validator.equals(_genere_master, genere_masterWrapper._genere_master)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public genere_master getWrappedgenere_master() {
		return _genere_master;
	}

	@Override
	public genere_master getWrappedModel() {
		return _genere_master;
	}

	@Override
	public void resetOriginalValues() {
		_genere_master.resetOriginalValues();
	}

	private genere_master _genere_master;
}