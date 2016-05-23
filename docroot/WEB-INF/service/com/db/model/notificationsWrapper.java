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
 * This class is a wrapper for {@link notifications}.
 * </p>
 *
 * @author ganjuss
 * @see notifications
 * @generated
 */
public class notificationsWrapper implements notifications,
	ModelWrapper<notifications> {
	public notificationsWrapper(notifications notifications) {
		_notifications = notifications;
	}

	@Override
	public Class<?> getModelClass() {
		return notifications.class;
	}

	@Override
	public String getModelClassName() {
		return notifications.class.getName();
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
	* Returns the primary key of this notifications.
	*
	* @return the primary key of this notifications
	*/
	@Override
	public long getPrimaryKey() {
		return _notifications.getPrimaryKey();
	}

	/**
	* Sets the primary key of this notifications.
	*
	* @param primaryKey the primary key of this notifications
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_notifications.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this notifications.
	*
	* @return the cid of this notifications
	*/
	@Override
	public long getCid() {
		return _notifications.getCid();
	}

	/**
	* Sets the cid of this notifications.
	*
	* @param cid the cid of this notifications
	*/
	@Override
	public void setCid(long cid) {
		_notifications.setCid(cid);
	}

	@Override
	public boolean isNew() {
		return _notifications.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_notifications.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _notifications.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_notifications.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _notifications.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _notifications.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_notifications.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _notifications.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_notifications.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_notifications.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_notifications.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new notificationsWrapper((notifications)_notifications.clone());
	}

	@Override
	public int compareTo(com.db.model.notifications notifications) {
		return _notifications.compareTo(notifications);
	}

	@Override
	public int hashCode() {
		return _notifications.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.notifications> toCacheModel() {
		return _notifications.toCacheModel();
	}

	@Override
	public com.db.model.notifications toEscapedModel() {
		return new notificationsWrapper(_notifications.toEscapedModel());
	}

	@Override
	public com.db.model.notifications toUnescapedModel() {
		return new notificationsWrapper(_notifications.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _notifications.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _notifications.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_notifications.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof notificationsWrapper)) {
			return false;
		}

		notificationsWrapper notificationsWrapper = (notificationsWrapper)obj;

		if (Validator.equals(_notifications, notificationsWrapper._notifications)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public notifications getWrappednotifications() {
		return _notifications;
	}

	@Override
	public notifications getWrappedModel() {
		return _notifications;
	}

	@Override
	public void resetOriginalValues() {
		_notifications.resetOriginalValues();
	}

	private notifications _notifications;
}