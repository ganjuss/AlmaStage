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
 * This class is a wrapper for {@link skill_user_mapping}.
 * </p>
 *
 * @author ganjuss
 * @see skill_user_mapping
 * @generated
 */
public class skill_user_mappingWrapper implements skill_user_mapping,
	ModelWrapper<skill_user_mapping> {
	public skill_user_mappingWrapper(skill_user_mapping skill_user_mapping) {
		_skill_user_mapping = skill_user_mapping;
	}

	@Override
	public Class<?> getModelClass() {
		return skill_user_mapping.class;
	}

	@Override
	public String getModelClassName() {
		return skill_user_mapping.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("skill_id", getSkill_id());
		attributes.put("profile_id", getProfile_id());
		attributes.put("type_id", getType_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		Long skill_id = (Long)attributes.get("skill_id");

		if (skill_id != null) {
			setSkill_id(skill_id);
		}

		Long profile_id = (Long)attributes.get("profile_id");

		if (profile_id != null) {
			setProfile_id(profile_id);
		}

		Long type_id = (Long)attributes.get("type_id");

		if (type_id != null) {
			setType_id(type_id);
		}
	}

	/**
	* Returns the primary key of this skill_user_mapping.
	*
	* @return the primary key of this skill_user_mapping
	*/
	@Override
	public long getPrimaryKey() {
		return _skill_user_mapping.getPrimaryKey();
	}

	/**
	* Sets the primary key of this skill_user_mapping.
	*
	* @param primaryKey the primary key of this skill_user_mapping
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_skill_user_mapping.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this skill_user_mapping.
	*
	* @return the cid of this skill_user_mapping
	*/
	@Override
	public long getCid() {
		return _skill_user_mapping.getCid();
	}

	/**
	* Sets the cid of this skill_user_mapping.
	*
	* @param cid the cid of this skill_user_mapping
	*/
	@Override
	public void setCid(long cid) {
		_skill_user_mapping.setCid(cid);
	}

	/**
	* Returns the skill_id of this skill_user_mapping.
	*
	* @return the skill_id of this skill_user_mapping
	*/
	@Override
	public long getSkill_id() {
		return _skill_user_mapping.getSkill_id();
	}

	/**
	* Sets the skill_id of this skill_user_mapping.
	*
	* @param skill_id the skill_id of this skill_user_mapping
	*/
	@Override
	public void setSkill_id(long skill_id) {
		_skill_user_mapping.setSkill_id(skill_id);
	}

	/**
	* Returns the profile_id of this skill_user_mapping.
	*
	* @return the profile_id of this skill_user_mapping
	*/
	@Override
	public long getProfile_id() {
		return _skill_user_mapping.getProfile_id();
	}

	/**
	* Sets the profile_id of this skill_user_mapping.
	*
	* @param profile_id the profile_id of this skill_user_mapping
	*/
	@Override
	public void setProfile_id(long profile_id) {
		_skill_user_mapping.setProfile_id(profile_id);
	}

	/**
	* Returns the type_id of this skill_user_mapping.
	*
	* @return the type_id of this skill_user_mapping
	*/
	@Override
	public long getType_id() {
		return _skill_user_mapping.getType_id();
	}

	/**
	* Sets the type_id of this skill_user_mapping.
	*
	* @param type_id the type_id of this skill_user_mapping
	*/
	@Override
	public void setType_id(long type_id) {
		_skill_user_mapping.setType_id(type_id);
	}

	@Override
	public boolean isNew() {
		return _skill_user_mapping.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_skill_user_mapping.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _skill_user_mapping.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_skill_user_mapping.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _skill_user_mapping.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _skill_user_mapping.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_skill_user_mapping.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _skill_user_mapping.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_skill_user_mapping.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_skill_user_mapping.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_skill_user_mapping.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new skill_user_mappingWrapper((skill_user_mapping)_skill_user_mapping.clone());
	}

	@Override
	public int compareTo(com.db.model.skill_user_mapping skill_user_mapping) {
		return _skill_user_mapping.compareTo(skill_user_mapping);
	}

	@Override
	public int hashCode() {
		return _skill_user_mapping.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.skill_user_mapping> toCacheModel() {
		return _skill_user_mapping.toCacheModel();
	}

	@Override
	public com.db.model.skill_user_mapping toEscapedModel() {
		return new skill_user_mappingWrapper(_skill_user_mapping.toEscapedModel());
	}

	@Override
	public com.db.model.skill_user_mapping toUnescapedModel() {
		return new skill_user_mappingWrapper(_skill_user_mapping.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _skill_user_mapping.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _skill_user_mapping.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_skill_user_mapping.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof skill_user_mappingWrapper)) {
			return false;
		}

		skill_user_mappingWrapper skill_user_mappingWrapper = (skill_user_mappingWrapper)obj;

		if (Validator.equals(_skill_user_mapping,
					skill_user_mappingWrapper._skill_user_mapping)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public skill_user_mapping getWrappedskill_user_mapping() {
		return _skill_user_mapping;
	}

	@Override
	public skill_user_mapping getWrappedModel() {
		return _skill_user_mapping;
	}

	@Override
	public void resetOriginalValues() {
		_skill_user_mapping.resetOriginalValues();
	}

	private skill_user_mapping _skill_user_mapping;
}