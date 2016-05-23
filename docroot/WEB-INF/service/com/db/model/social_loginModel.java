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
 * The base model interface for the social_login service. Represents a row in the &quot;c_social_login&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.db.model.impl.social_loginModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.db.model.impl.social_loginImpl}.
 * </p>
 *
 * @author ganjuss
 * @see social_login
 * @see com.db.model.impl.social_loginImpl
 * @see com.db.model.impl.social_loginModelImpl
 * @generated
 */
public interface social_loginModel extends BaseModel<social_login> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a social_login model instance should use the {@link social_login} interface instead.
	 */

	/**
	 * Returns the primary key of this social_login.
	 *
	 * @return the primary key of this social_login
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this social_login.
	 *
	 * @param primaryKey the primary key of this social_login
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the cid of this social_login.
	 *
	 * @return the cid of this social_login
	 */
	public long getCid();

	/**
	 * Sets the cid of this social_login.
	 *
	 * @param cid the cid of this social_login
	 */
	public void setCid(long cid);

	/**
	 * Returns the social_type_id of this social_login.
	 *
	 * @return the social_type_id of this social_login
	 */
	public long getSocial_type_id();

	/**
	 * Sets the social_type_id of this social_login.
	 *
	 * @param social_type_id the social_type_id of this social_login
	 */
	public void setSocial_type_id(long social_type_id);

	/**
	 * Returns the profile_id of this social_login.
	 *
	 * @return the profile_id of this social_login
	 */
	public long getProfile_id();

	/**
	 * Sets the profile_id of this social_login.
	 *
	 * @param profile_id the profile_id of this social_login
	 */
	public void setProfile_id(long profile_id);

	/**
	 * Returns the social_id of this social_login.
	 *
	 * @return the social_id of this social_login
	 */
	public long getSocial_id();

	/**
	 * Sets the social_id of this social_login.
	 *
	 * @param social_id the social_id of this social_login
	 */
	public void setSocial_id(long social_id);

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
	public int compareTo(com.db.model.social_login social_login);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.db.model.social_login> toCacheModel();

	@Override
	public com.db.model.social_login toEscapedModel();

	@Override
	public com.db.model.social_login toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}