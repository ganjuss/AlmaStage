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
 * This class is a wrapper for {@link recommendations}.
 * </p>
 *
 * @author ganjuss
 * @see recommendations
 * @generated
 */
public class recommendationsWrapper implements recommendations,
	ModelWrapper<recommendations> {
	public recommendationsWrapper(recommendations recommendations) {
		_recommendations = recommendations;
	}

	@Override
	public Class<?> getModelClass() {
		return recommendations.class;
	}

	@Override
	public String getModelClassName() {
		return recommendations.class.getName();
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
	* Returns the primary key of this recommendations.
	*
	* @return the primary key of this recommendations
	*/
	@Override
	public long getPrimaryKey() {
		return _recommendations.getPrimaryKey();
	}

	/**
	* Sets the primary key of this recommendations.
	*
	* @param primaryKey the primary key of this recommendations
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_recommendations.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cid of this recommendations.
	*
	* @return the cid of this recommendations
	*/
	@Override
	public long getCid() {
		return _recommendations.getCid();
	}

	/**
	* Sets the cid of this recommendations.
	*
	* @param cid the cid of this recommendations
	*/
	@Override
	public void setCid(long cid) {
		_recommendations.setCid(cid);
	}

	@Override
	public boolean isNew() {
		return _recommendations.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_recommendations.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _recommendations.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_recommendations.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _recommendations.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _recommendations.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_recommendations.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _recommendations.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_recommendations.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_recommendations.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_recommendations.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new recommendationsWrapper((recommendations)_recommendations.clone());
	}

	@Override
	public int compareTo(com.db.model.recommendations recommendations) {
		return _recommendations.compareTo(recommendations);
	}

	@Override
	public int hashCode() {
		return _recommendations.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.db.model.recommendations> toCacheModel() {
		return _recommendations.toCacheModel();
	}

	@Override
	public com.db.model.recommendations toEscapedModel() {
		return new recommendationsWrapper(_recommendations.toEscapedModel());
	}

	@Override
	public com.db.model.recommendations toUnescapedModel() {
		return new recommendationsWrapper(_recommendations.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _recommendations.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _recommendations.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_recommendations.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof recommendationsWrapper)) {
			return false;
		}

		recommendationsWrapper recommendationsWrapper = (recommendationsWrapper)obj;

		if (Validator.equals(_recommendations,
					recommendationsWrapper._recommendations)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public recommendations getWrappedrecommendations() {
		return _recommendations;
	}

	@Override
	public recommendations getWrappedModel() {
		return _recommendations;
	}

	@Override
	public void resetOriginalValues() {
		_recommendations.resetOriginalValues();
	}

	private recommendations _recommendations;
}