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
 * This class is a wrapper for {@link acheivements}.
 * </p>
 *
 * @author ganjuss
 * @see acheivements
 * @generated
 */
public class acheivementsWrapper implements acheivements,
	ModelWrapper<acheivements> {
	public acheivementsWrapper(acheivements acheivements) {
		_acheivements = acheivements;
	}

	@Override
	public Class<?> getModelClass() {
		return acheivements.class;
	}

	@Override
	public String getModelClassName() {
		return acheivements.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}
	}

	/**
	* Returns the primary key of this acheivements.
	*
	* @return the primary key of this acheivements
	*/
	@Override
	public long getPrimaryKey() {
		return _acheivements.getPrimaryKey();
	}

	/**
	* Sets the primary key of this acheivements.
	*
	* @param primaryKey the primary key of this acheivements
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_acheivements.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this acheivements.
	*
	* @return the cid of this acheivements
	*/
	@Override
	public long getCid() {
		return _acheivements.getCid();
	}

	/**
	* Sets the cid of this acheivements.
	*
	* @param cid the cid of this acheivements
	*/
	@Override
	public void setCid(long cid) {
		_acheivements.setCid(cid);
	}

	@Override
	public boolean isNew() {
		return _acheivements.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_acheivements.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _acheivements.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_acheivements.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _acheivements.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _acheivements.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_acheivements.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _acheivements.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_acheivements.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_acheivements.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_acheivements.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new acheivementsWrapper((acheivements)_acheivements.clone());
	}

	@Override
	public int compareTo(com.db.model.acheivements acheivements) {
		return _acheivements.compareTo(acheivements);
	}

	@Override
	public int hashCode() {
		return _acheivements.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.acheivements> toCacheModel() {
		return _acheivements.toCacheModel();
	}

	@Override
	public com.db.model.acheivements toEscapedModel() {
		return new acheivementsWrapper(_acheivements.toEscapedModel());
	}

	@Override
	public com.db.model.acheivements toUnescapedModel() {
		return new acheivementsWrapper(_acheivements.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _acheivements.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _acheivements.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_acheivements.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof acheivementsWrapper)) {
			return false;
		}

		acheivementsWrapper acheivementsWrapper = (acheivementsWrapper)obj;

		if (Validator.equals(_acheivements, acheivementsWrapper._acheivements)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public acheivements getWrappedacheivements() {
		return _acheivements;
	}

	@Override
	public acheivements getWrappedModel() {
		return _acheivements;
	}

	@Override
	public void resetOriginalValues() {
		_acheivements.resetOriginalValues();
	}

	private acheivements _acheivements;
}