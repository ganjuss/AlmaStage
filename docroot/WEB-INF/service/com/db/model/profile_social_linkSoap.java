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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.profile_social_linkServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.profile_social_linkServiceSoap
 * @generated
 */
public class profile_social_linkSoap implements Serializable {
	public static profile_social_linkSoap toSoapModel(profile_social_link model) {
		profile_social_linkSoap soapModel = new profile_social_linkSoap();

		soapModel.setCid(model.getCid());
		soapModel.setSocial_type_id(model.getSocial_type_id());
		soapModel.setLink(model.getLink());
		soapModel.setProfile_id(model.getProfile_id());

		return soapModel;
	}

	public static profile_social_linkSoap[] toSoapModels(
		profile_social_link[] models) {
		profile_social_linkSoap[] soapModels = new profile_social_linkSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static profile_social_linkSoap[][] toSoapModels(
		profile_social_link[][] models) {
		profile_social_linkSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new profile_social_linkSoap[models.length][models[0].length];
		}
		else {
			soapModels = new profile_social_linkSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static profile_social_linkSoap[] toSoapModels(
		List<profile_social_link> models) {
		List<profile_social_linkSoap> soapModels = new ArrayList<profile_social_linkSoap>(models.size());

		for (profile_social_link model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new profile_social_linkSoap[soapModels.size()]);
	}

	public profile_social_linkSoap() {
	}

	public long getPrimaryKey() {
		return _cid;
	}

	public void setPrimaryKey(long pk) {
		setCid(pk);
	}

	public long getCid() {
		return _cid;
	}

	public void setCid(long cid) {
		_cid = cid;
	}

	public long getSocial_type_id() {
		return _social_type_id;
	}

	public void setSocial_type_id(long social_type_id) {
		_social_type_id = social_type_id;
	}

	public String getLink() {
		return _link;
	}

	public void setLink(String link) {
		_link = link;
	}

	public long getProfile_id() {
		return _profile_id;
	}

	public void setProfile_id(long profile_id) {
		_profile_id = profile_id;
	}

	private long _cid;
	private long _social_type_id;
	private String _link;
	private long _profile_id;
}