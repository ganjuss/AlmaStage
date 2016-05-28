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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.profileServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.profileServiceSoap
 * @generated
 */
public class profileSoap implements Serializable {
	public static profileSoap toSoapModel(profile model) {
		profileSoap soapModel = new profileSoap();

		soapModel.setCid(model.getCid());
		soapModel.setType_id(model.getType_id());
		soapModel.setGenere_id(model.getGenere_id());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setProfile_name(model.getProfile_name());

		return soapModel;
	}

	public static profileSoap[] toSoapModels(profile[] models) {
		profileSoap[] soapModels = new profileSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static profileSoap[][] toSoapModels(profile[][] models) {
		profileSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new profileSoap[models.length][models[0].length];
		}
		else {
			soapModels = new profileSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static profileSoap[] toSoapModels(List<profile> models) {
		List<profileSoap> soapModels = new ArrayList<profileSoap>(models.size());

		for (profile model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new profileSoap[soapModels.size()]);
	}

	public profileSoap() {
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

	public long getType_id() {
		return _type_id;
	}

	public void setType_id(long type_id) {
		_type_id = type_id;
	}

	public long getGenere_id() {
		return _genere_id;
	}

	public void setGenere_id(long genere_id) {
		_genere_id = genere_id;
	}

	public long getUser_id() {
		return _user_id;
	}

	public void setUser_id(long user_id) {
		_user_id = user_id;
	}

	public String getProfile_name() {
		return _profile_name;
	}

	public void setProfile_name(String profile_name) {
		_profile_name = profile_name;
	}

	private long _cid;
	private long _type_id;
	private long _genere_id;
	private long _user_id;
	private String _profile_name;
}