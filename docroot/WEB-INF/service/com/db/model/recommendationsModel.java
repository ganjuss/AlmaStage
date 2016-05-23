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
 * The base model interface for the recommendations service. Represents a row in the &quot;c_recommendations&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.db.model.impl.recommendationsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.db.model.impl.recommendationsImpl}.
 * </p>
 *
 * @author ganjuss
 * @see recommendations
 * @see com.db.model.impl.recommendationsImpl
 * @see com.db.model.impl.recommendationsModelImpl
 * @generated
 */
public interface recommendationsModel extends BaseModel<recommendations> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a recommendations model instance should use the {@link recommendations} interface instead.
	 */

	/**
	 * Returns the primary key of this recommendations.
	 *
	 * @return the primary key of this recommendations
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this recommendations.
	 *
	 * @param primaryKey the primary key of this recommendations
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the cid of this recommendations.
	 *
	 * @return the cid of this recommendations
	 */
	public long getCid();

	/**
	 * Sets the cid of this recommendations.
	 *
	 * @param cid the cid of this recommendations
	 */
	public void setCid(long cid);

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
	public int compareTo(com.db.model.recommendations recommendations);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.db.model.recommendations> toCacheModel();

	@Override
	public com.db.model.recommendations toEscapedModel();

	@Override
	public com.db.model.recommendations toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}