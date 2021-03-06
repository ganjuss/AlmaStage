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
 * The base model interface for the cfm service. Represents a row in the &quot;c_cfm&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.db.model.impl.cfmModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.db.model.impl.cfmImpl}.
 * </p>
 *
 * @author ganjuss
 * @see cfm
 * @see com.db.model.impl.cfmImpl
 * @see com.db.model.impl.cfmModelImpl
 * @generated
 */
public interface cfmModel extends BaseModel<cfm> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cfm model instance should use the {@link cfm} interface instead.
	 */

	/**
	 * Returns the primary key of this cfm.
	 *
	 * @return the primary key of this cfm
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cfm.
	 *
	 * @param primaryKey the primary key of this cfm
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the cid of this cfm.
	 *
	 * @return the cid of this cfm
	 */
	public long getCid();

	/**
	 * Sets the cid of this cfm.
	 *
	 * @param cid the cid of this cfm
	 */
	public void setCid(long cid);

	/**
	 * Returns the cfm_by of this cfm.
	 *
	 * @return the cfm_by of this cfm
	 */
	public long getCfm_by();

	/**
	 * Sets the cfm_by of this cfm.
	 *
	 * @param cfm_by the cfm_by of this cfm
	 */
	public void setCfm_by(long cfm_by);

	/**
	 * Returns the cfm_to of this cfm.
	 *
	 * @return the cfm_to of this cfm
	 */
	public long getCfm_to();

	/**
	 * Sets the cfm_to of this cfm.
	 *
	 * @param cfm_to the cfm_to of this cfm
	 */
	public void setCfm_to(long cfm_to);

	/**
	 * Returns the cfm_type_id of this cfm.
	 *
	 * @return the cfm_type_id of this cfm
	 */
	public long getCfm_type_id();

	/**
	 * Sets the cfm_type_id of this cfm.
	 *
	 * @param cfm_type_id the cfm_type_id of this cfm
	 */
	public void setCfm_type_id(long cfm_type_id);

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
	public int compareTo(com.db.model.cfm cfm);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.db.model.cfm> toCacheModel();

	@Override
	public com.db.model.cfm toEscapedModel();

	@Override
	public com.db.model.cfm toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}