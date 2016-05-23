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
 * This class is a wrapper for {@link messages}.
 * </p>
 *
 * @author ganjuss
 * @see messages
 * @generated
 */
public class messagesWrapper implements messages, ModelWrapper<messages> {
	public messagesWrapper(messages messages) {
		_messages = messages;
	}

	@Override
	public Class<?> getModelClass() {
		return messages.class;
	}

	@Override
	public String getModelClassName() {
		return messages.class.getName();
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
	* Returns the primary key of this messages.
	*
	* @return the primary key of this messages
	*/
	@Override
	public long getPrimaryKey() {
		return _messages.getPrimaryKey();
	}

	/**
	* Sets the primary key of this messages.
	*
	* @param primaryKey the primary key of this messages
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_messages.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this messages.
	*
	* @return the cid of this messages
	*/
	@Override
	public long getCid() {
		return _messages.getCid();
	}

	/**
	* Sets the cid of this messages.
	*
	* @param cid the cid of this messages
	*/
	@Override
	public void setCid(long cid) {
		_messages.setCid(cid);
	}

	@Override
	public boolean isNew() {
		return _messages.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_messages.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _messages.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_messages.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _messages.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _messages.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_messages.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _messages.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_messages.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_messages.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_messages.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new messagesWrapper((messages)_messages.clone());
	}

	@Override
	public int compareTo(com.db.model.messages messages) {
		return _messages.compareTo(messages);
	}

	@Override
	public int hashCode() {
		return _messages.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.messages> toCacheModel() {
		return _messages.toCacheModel();
	}

	@Override
	public com.db.model.messages toEscapedModel() {
		return new messagesWrapper(_messages.toEscapedModel());
	}

	@Override
	public com.db.model.messages toUnescapedModel() {
		return new messagesWrapper(_messages.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _messages.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _messages.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_messages.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof messagesWrapper)) {
			return false;
		}

		messagesWrapper messagesWrapper = (messagesWrapper)obj;

		if (Validator.equals(_messages, messagesWrapper._messages)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public messages getWrappedmessages() {
		return _messages;
	}

	@Override
	public messages getWrappedModel() {
		return _messages;
	}

	@Override
	public void resetOriginalValues() {
		_messages.resetOriginalValues();
	}

	private messages _messages;
}