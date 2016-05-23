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
 * This class is a wrapper for {@link media_links}.
 * </p>
 *
 * @author ganjuss
 * @see media_links
 * @generated
 */
public class media_linksWrapper implements media_links,
	ModelWrapper<media_links> {
	public media_linksWrapper(media_links media_links) {
		_media_links = media_links;
	}

	@Override
	public Class<?> getModelClass() {
		return media_links.class;
	}

	@Override
	public String getModelClassName() {
		return media_links.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("profile_id", getProfile_id());
		attributes.put("media_type_id", getMedia_type_id());
		attributes.put("link", getLink());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		Long profile_id = (Long)attributes.get("profile_id");

		if (profile_id != null) {
			setProfile_id(profile_id);
		}

		Long media_type_id = (Long)attributes.get("media_type_id");

		if (media_type_id != null) {
			setMedia_type_id(media_type_id);
		}

		String link = (String)attributes.get("link");

		if (link != null) {
			setLink(link);
		}
	}

	/**
	* Returns the primary key of this media_links.
	*
	* @return the primary key of this media_links
	*/
	@Override
	public long getPrimaryKey() {
		return _media_links.getPrimaryKey();
	}

	/**
	* Sets the primary key of this media_links.
	*
	* @param primaryKey the primary key of this media_links
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_media_links.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this media_links.
	*
	* @return the cid of this media_links
	*/
	@Override
	public long getCid() {
		return _media_links.getCid();
	}

	/**
	* Sets the cid of this media_links.
	*
	* @param cid the cid of this media_links
	*/
	@Override
	public void setCid(long cid) {
		_media_links.setCid(cid);
	}

	/**
	* Returns the profile_id of this media_links.
	*
	* @return the profile_id of this media_links
	*/
	@Override
	public long getProfile_id() {
		return _media_links.getProfile_id();
	}

	/**
	* Sets the profile_id of this media_links.
	*
	* @param profile_id the profile_id of this media_links
	*/
	@Override
	public void setProfile_id(long profile_id) {
		_media_links.setProfile_id(profile_id);
	}

	/**
	* Returns the media_type_id of this media_links.
	*
	* @return the media_type_id of this media_links
	*/
	@Override
	public long getMedia_type_id() {
		return _media_links.getMedia_type_id();
	}

	/**
	* Sets the media_type_id of this media_links.
	*
	* @param media_type_id the media_type_id of this media_links
	*/
	@Override
	public void setMedia_type_id(long media_type_id) {
		_media_links.setMedia_type_id(media_type_id);
	}

	/**
	* Returns the link of this media_links.
	*
	* @return the link of this media_links
	*/
	@Override
	public java.lang.String getLink() {
		return _media_links.getLink();
	}

	/**
	* Sets the link of this media_links.
	*
	* @param link the link of this media_links
	*/
	@Override
	public void setLink(java.lang.String link) {
		_media_links.setLink(link);
	}

	@Override
	public boolean isNew() {
		return _media_links.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_media_links.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _media_links.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_media_links.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _media_links.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _media_links.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_media_links.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _media_links.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_media_links.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_media_links.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_media_links.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new media_linksWrapper((media_links)_media_links.clone());
	}

	@Override
	public int compareTo(com.db.model.media_links media_links) {
		return _media_links.compareTo(media_links);
	}

	@Override
	public int hashCode() {
		return _media_links.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.media_links> toCacheModel() {
		return _media_links.toCacheModel();
	}

	@Override
	public com.db.model.media_links toEscapedModel() {
		return new media_linksWrapper(_media_links.toEscapedModel());
	}

	@Override
	public com.db.model.media_links toUnescapedModel() {
		return new media_linksWrapper(_media_links.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _media_links.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _media_links.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_media_links.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof media_linksWrapper)) {
			return false;
		}

		media_linksWrapper media_linksWrapper = (media_linksWrapper)obj;

		if (Validator.equals(_media_links, media_linksWrapper._media_links)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public media_links getWrappedmedia_links() {
		return _media_links;
	}

	@Override
	public media_links getWrappedModel() {
		return _media_links;
	}

	@Override
	public void resetOriginalValues() {
		_media_links.resetOriginalValues();
	}

	private media_links _media_links;
}