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
 * This class is a wrapper for {@link skill}.
 * </p>
 *
 * @author ganjuss
 * @see skill
 * @generated
 */
public class skillWrapper implements skill, ModelWrapper<skill> {
	public skillWrapper(skill skill) {
		_skill = skill;
	}

	@Override
	public Class<?> getModelClass() {
		return skill.class;
	}

	@Override
	public String getModelClassName() {
		return skill.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("name", getName());
		attributes.put("genere_id", getGenere_id());

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

		Long genere_id = (Long)attributes.get("genere_id");

		if (genere_id != null) {
			setGenere_id(genere_id);
		}
	}

	/**
	* Returns the primary key of this skill.
	*
	* @return the primary key of this skill
	*/
	@Override
	public long getPrimaryKey() {
		return _skill.getPrimaryKey();
	}

	/**
	* Sets the primary key of this skill.
	*
	* @param primaryKey the primary key of this skill
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_skill.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this skill.
	*
	* @return the cid of this skill
	*/
	@Override
	public long getCid() {
		return _skill.getCid();
	}

	/**
	* Sets the cid of this skill.
	*
	* @param cid the cid of this skill
	*/
	@Override
	public void setCid(long cid) {
		_skill.setCid(cid);
	}

	/**
	* Returns the name of this skill.
	*
	* @return the name of this skill
	*/
	@Override
	public java.lang.String getName() {
		return _skill.getName();
	}

	/**
	* Sets the name of this skill.
	*
	* @param name the name of this skill
	*/
	@Override
	public void setName(java.lang.String name) {
		_skill.setName(name);
	}

	/**
	* Returns the genere_id of this skill.
	*
	* @return the genere_id of this skill
	*/
	@Override
	public long getGenere_id() {
		return _skill.getGenere_id();
	}

	/**
	* Sets the genere_id of this skill.
	*
	* @param genere_id the genere_id of this skill
	*/
	@Override
	public void setGenere_id(long genere_id) {
		_skill.setGenere_id(genere_id);
	}

	@Override
	public boolean isNew() {
		return _skill.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_skill.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _skill.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_skill.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _skill.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _skill.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_skill.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _skill.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_skill.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_skill.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_skill.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new skillWrapper((skill)_skill.clone());
	}

	@Override
	public int compareTo(com.db.model.skill skill) {
		return _skill.compareTo(skill);
	}

	@Override
	public int hashCode() {
		return _skill.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.skill> toCacheModel() {
		return _skill.toCacheModel();
	}

	@Override
	public com.db.model.skill toEscapedModel() {
		return new skillWrapper(_skill.toEscapedModel());
	}

	@Override
	public com.db.model.skill toUnescapedModel() {
		return new skillWrapper(_skill.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _skill.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _skill.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_skill.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof skillWrapper)) {
			return false;
		}

		skillWrapper skillWrapper = (skillWrapper)obj;

		if (Validator.equals(_skill, skillWrapper._skill)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public skill getWrappedskill() {
		return _skill;
	}

	@Override
	public skill getWrappedModel() {
		return _skill;
	}

	@Override
	public void resetOriginalValues() {
		_skill.resetOriginalValues();
	}

	private skill _skill;
}