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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the skill_user_mapping service. Represents a row in the &quot;c_skill_user_mapping&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.db.model.impl.skill_user_mappingModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.db.model.impl.skill_user_mappingImpl}.
 * </p>
 *
 * @author ganjuss
 * @see skill_user_mapping
 * @see com.db.model.impl.skill_user_mappingImpl
 * @see com.db.model.impl.skill_user_mappingModelImpl
 * @generated
 */
public interface skill_user_mappingModel extends BaseModel<skill_user_mapping> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a skill_user_mapping model instance should use the {@link skill_user_mapping} interface instead.
	 */

	/**
	 * Returns the primary key of this skill_user_mapping.
	 *
	 * @return the primary key of this skill_user_mapping
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this skill_user_mapping.
	 *
	 * @param primaryKey the primary key of this skill_user_mapping
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the cid of this skill_user_mapping.
	 *
	 * @return the cid of this skill_user_mapping
	 */
	public long getCid();

	/**
	 * Sets the cid of this skill_user_mapping.
	 *
	 * @param cid the cid of this skill_user_mapping
	 */
	public void setCid(long cid);

	/**
	 * Returns the skill_id of this skill_user_mapping.
	 *
	 * @return the skill_id of this skill_user_mapping
	 */
	public long getSkill_id();

	/**
	 * Sets the skill_id of this skill_user_mapping.
	 *
	 * @param skill_id the skill_id of this skill_user_mapping
	 */
	public void setSkill_id(long skill_id);

	/**
	 * Returns the profile_id of this skill_user_mapping.
	 *
	 * @return the profile_id of this skill_user_mapping
	 */
	public long getProfile_id();

	/**
	 * Sets the profile_id of this skill_user_mapping.
	 *
	 * @param profile_id the profile_id of this skill_user_mapping
	 */
	public void setProfile_id(long profile_id);

	/**
	 * Returns the type_id of this skill_user_mapping.
	 *
	 * @return the type_id of this skill_user_mapping
	 */
	public long getType_id();

	/**
	 * Sets the type_id of this skill_user_mapping.
	 *
	 * @param type_id the type_id of this skill_user_mapping
	 */
	public void setType_id(long type_id);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.db.model.skill_user_mapping skill_user_mapping);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.db.model.skill_user_mapping> toCacheModel();

	@Override
	public com.db.model.skill_user_mapping toEscapedModel();

	@Override
	public com.db.model.skill_user_mapping toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}