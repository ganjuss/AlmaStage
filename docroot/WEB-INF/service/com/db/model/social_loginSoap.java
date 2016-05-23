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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.social_loginServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.social_loginServiceSoap
 * @generated
 */
public class social_loginSoap implements Serializable {
	public static social_loginSoap toSoapModel(social_login model) {
		social_loginSoap soapModel = new social_loginSoap();

		soapModel.setCid(model.getCid());
		soapModel.setSocial_type_id(model.getSocial_type_id());
		soapModel.setProfile_id(model.getProfile_id());
		soapModel.setSocial_id(model.getSocial_id());

		return soapModel;
	}

	public static social_loginSoap[] toSoapModels(social_login[] models) {
		social_loginSoap[] soapModels = new social_loginSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static social_loginSoap[][] toSoapModels(social_login[][] models) {
		social_loginSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new social_loginSoap[models.length][models[0].length];
		}
		else {
			soapModels = new social_loginSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static social_loginSoap[] toSoapModels(List<social_login> models) {
		List<social_loginSoap> soapModels = new ArrayList<social_loginSoap>(models.size());

		for (social_login model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new social_loginSoap[soapModels.size()]);
	}

	public social_loginSoap() {
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

	public long getProfile_id() {
		return _profile_id;
	}

	public void setProfile_id(long profile_id) {
		_profile_id = profile_id;
	}

	public long getSocial_id() {
		return _social_id;
	}

	public void setSocial_id(long social_id) {
		_social_id = social_id;
	}

	private long _cid;
	private long _social_type_id;
	private long _profile_id;
	private long _social_id;
}