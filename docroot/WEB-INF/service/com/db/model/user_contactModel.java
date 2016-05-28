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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the user_contact service. Represents a row in the &quot;c_user_contact&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.db.model.impl.user_contactModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.db.model.impl.user_contactImpl}.
 * </p>
 *
 * @author ganjuss
 * @see user_contact
 * @see com.db.model.impl.user_contactImpl
 * @see com.db.model.impl.user_contactModelImpl
 * @generated
 */
public interface user_contactModel extends BaseModel<user_contact> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user_contact model instance should use the {@link user_contact} interface instead.
	 */

	/**
	 * Returns the primary key of this user_contact.
	 *
	 * @return the primary key of this user_contact
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this user_contact.
	 *
	 * @param primaryKey the primary key of this user_contact
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the cid of this user_contact.
	 *
	 * @return the cid of this user_contact
	 */
	public long getCid();

	/**
	 * Sets the cid of this user_contact.
	 *
	 * @param cid the cid of this user_contact
	 */
	public void setCid(long cid);

	/**
	 * Returns the profile_id of this user_contact.
	 *
	 * @return the profile_id of this user_contact
	 */
	public long getProfile_id();

	/**
	 * Sets the profile_id of this user_contact.
	 *
	 * @param profile_id the profile_id of this user_contact
	 */
	public void setProfile_id(long profile_id);

	/**
	 * Returns the user_id of this user_contact.
	 *
	 * @return the user_id of this user_contact
	 */
	public long getUser_id();

	/**
	 * Sets the user_id of this user_contact.
	 *
	 * @param user_id the user_id of this user_contact
	 */
	public void setUser_id(long user_id);

	/**
	 * Returns the email of this user_contact.
	 *
	 * @return the email of this user_contact
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this user_contact.
	 *
	 * @param email the email of this user_contact
	 */
	public void setEmail(String email);

	/**
	 * Returns the phone of this user_contact.
	 *
	 * @return the phone of this user_contact
	 */
	@AutoEscape
	public String getPhone();

	/**
	 * Sets the phone of this user_contact.
	 *
	 * @param phone the phone of this user_contact
	 */
	public void setPhone(String phone);

	/**
	 * Returns the dob of this user_contact.
	 *
	 * @return the dob of this user_contact
	 */
	public Date getDob();

	/**
	 * Sets the dob of this user_contact.
	 *
	 * @param dob the dob of this user_contact
	 */
	public void setDob(Date dob);

	/**
	 * Returns the city of this user_contact.
	 *
	 * @return the city of this user_contact
	 */
	@AutoEscape
	public String getCity();

	/**
	 * Sets the city of this user_contact.
	 *
	 * @param city the city of this user_contact
	 */
	public void setCity(String city);

	/**
	 * Returns the gender of this user_contact.
	 *
	 * @return the gender of this user_contact
	 */
	@AutoEscape
	public String getGender();

	/**
	 * Sets the gender of this user_contact.
	 *
	 * @param gender the gender of this user_contact
	 */
	public void setGender(String gender);

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
	public int compareTo(com.db.model.user_contact user_contact);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.db.model.user_contact> toCacheModel();

	@Override
	public com.db.model.user_contact toEscapedModel();

	@Override
	public com.db.model.user_contact toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}