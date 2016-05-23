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
 * This class is a wrapper for {@link media_links_master}.
 * </p>
 *
 * @author ganjuss
 * @see media_links_master
 * @generated
 */
public class media_links_masterWrapper implements media_links_master,
	ModelWrapper<media_links_master> {
	public media_links_masterWrapper(media_links_master media_links_master) {
		_media_links_master = media_links_master;
	}

	@Override
	public Class<?> getModelClass() {
		return media_links_master.class;
	}

	@Override
	public String getModelClassName() {
		return media_links_master.class.getName();
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
	* Returns the primary key of this media_links_master.
	*
	* @return the primary key of this media_links_master
	*/
	@Override
	public long getPrimaryKey() {
		return _media_links_master.getPrimaryKey();
	}

	/**
	* Sets the primary key of this media_links_master.
	*
	* @param primaryKey the primary key of this media_links_master
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_media_links_master.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this media_links_master.
	*
	* @return the cid of this media_links_master
	*/
	@Override
	public long getCid() {
		return _media_links_master.getCid();
	}

	/**
	* Sets the cid of this media_links_master.
	*
	* @param cid the cid of this media_links_master
	*/
	@Override
	public void setCid(long cid) {
		_media_links_master.setCid(cid);
	}

	/**
	* Returns the name of this media_links_master.
	*
	* @return the name of this media_links_master
	*/
	@Override
	public java.lang.String getName() {
		return _media_links_master.getName();
	}

	/**
	* Sets the name of this media_links_master.
	*
	* @param name the name of this media_links_master
	*/
	@Override
	public void setName(java.lang.String name) {
		_media_links_master.setName(name);
	}

	@Override
	public boolean isNew() {
		return _media_links_master.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_media_links_master.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _media_links_master.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_media_links_master.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _media_links_master.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _media_links_master.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_media_links_master.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _media_links_master.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_media_links_master.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_media_links_master.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_media_links_master.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new media_links_masterWrapper((media_links_master)_media_links_master.clone());
	}

	@Override
	public int compareTo(com.db.model.media_links_master media_links_master) {
		return _media_links_master.compareTo(media_links_master);
	}

	@Override
	public int hashCode() {
		return _media_links_master.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.media_links_master> toCacheModel() {
		return _media_links_master.toCacheModel();
	}

	@Override
	public com.db.model.media_links_master toEscapedModel() {
		return new media_links_masterWrapper(_media_links_master.toEscapedModel());
	}

	@Override
	public com.db.model.media_links_master toUnescapedModel() {
		return new media_links_masterWrapper(_media_links_master.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _media_links_master.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _media_links_master.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_media_links_master.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof media_links_masterWrapper)) {
			return false;
		}

		media_links_masterWrapper media_links_masterWrapper = (media_links_masterWrapper)obj;

		if (Validator.equals(_media_links_master,
					media_links_masterWrapper._media_links_master)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public media_links_master getWrappedmedia_links_master() {
		return _media_links_master;
	}

	@Override
	public media_links_master getWrappedModel() {
		return _media_links_master;
	}

	@Override
	public void resetOriginalValues() {
		_media_links_master.resetOriginalValues();
	}

	private media_links_master _media_links_master;
}