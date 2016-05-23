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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.about_usServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.about_usServiceSoap
 * @generated
 */
public class about_usSoap implements Serializable {
	public static about_usSoap toSoapModel(about_us model) {
		about_usSoap soapModel = new about_usSoap();

		soapModel.setCid(model.getCid());
		soapModel.setProfile_id(model.getProfile_id());
		soapModel.setText(model.getText());

		return soapModel;
	}

	public static about_usSoap[] toSoapModels(about_us[] models) {
		about_usSoap[] soapModels = new about_usSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static about_usSoap[][] toSoapModels(about_us[][] models) {
		about_usSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new about_usSoap[models.length][models[0].length];
		}
		else {
			soapModels = new about_usSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static about_usSoap[] toSoapModels(List<about_us> models) {
		List<about_usSoap> soapModels = new ArrayList<about_usSoap>(models.size());

		for (about_us model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new about_usSoap[soapModels.size()]);
	}

	public about_usSoap() {
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

	public String getText() {
		return _text;
	}

	public void setText(String text) {
		_text = text;
	}

	private long _cid;
	private long _profile_id;
	private String _text;
}