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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.user_contactServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.user_contactServiceSoap
 * @generated
 */
public class user_contactSoap implements Serializable {
	public static user_contactSoap toSoapModel(user_contact model) {
		user_contactSoap soapModel = new user_contactSoap();

		soapModel.setCid(model.getCid());
		soapModel.setProfile_id(model.getProfile_id());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setEmail(model.getEmail());
		soapModel.setPhone(model.getPhone());
		soapModel.setDob(model.getDob());
		soapModel.setCity(model.getCity());
		soapModel.setGender(model.getGender());

		return soapModel;
	}

	public static user_contactSoap[] toSoapModels(user_contact[] models) {
		user_contactSoap[] soapModels = new user_contactSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static user_contactSoap[][] toSoapModels(user_contact[][] models) {
		user_contactSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new user_contactSoap[models.length][models[0].length];
		}
		else {
			soapModels = new user_contactSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static user_contactSoap[] toSoapModels(List<user_contact> models) {
		List<user_contactSoap> soapModels = new ArrayList<user_contactSoap>(models.size());

		for (user_contact model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new user_contactSoap[soapModels.size()]);
	}

	public user_contactSoap() {
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

	public long getProfile_id() {
		return _profile_id;
	}

	public void setProfile_id(long profile_id) {
		_profile_id = profile_id;
	}

	public long getUser_id() {
		return _user_id;
	}

	public void setUser_id(long user_id) {
		_user_id = user_id;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public long getPhone() {
		return _phone;
	}

	public void setPhone(long phone) {
		_phone = phone;
	}

	public Date getDob() {
		return _dob;
	}

	public void setDob(Date dob) {
		_dob = dob;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	private long _cid;
	private long _profile_id;
	private long _user_id;
	private String _email;
	private long _phone;
	private Date _dob;
	private String _city;
	private String _gender;
}