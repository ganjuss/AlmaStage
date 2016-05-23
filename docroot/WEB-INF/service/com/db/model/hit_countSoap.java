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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.hit_countServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.hit_countServiceSoap
 * @generated
 */
public class hit_countSoap implements Serializable {
	public static hit_countSoap toSoapModel(hit_count model) {
		hit_countSoap soapModel = new hit_countSoap();

		soapModel.setCid(model.getCid());
		soapModel.setProfile_id(model.getProfile_id());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setCounter(model.getCounter());
		soapModel.setHighfive(model.getHighfive());

		return soapModel;
	}

	public static hit_countSoap[] toSoapModels(hit_count[] models) {
		hit_countSoap[] soapModels = new hit_countSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static hit_countSoap[][] toSoapModels(hit_count[][] models) {
		hit_countSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new hit_countSoap[models.length][models[0].length];
		}
		else {
			soapModels = new hit_countSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static hit_countSoap[] toSoapModels(List<hit_count> models) {
		List<hit_countSoap> soapModels = new ArrayList<hit_countSoap>(models.size());

		for (hit_count model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new hit_countSoap[soapModels.size()]);
	}

	public hit_countSoap() {
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

	public long getCounter() {
		return _counter;
	}

	public void setCounter(long counter) {
		_counter = counter;
	}

	public long getHighfive() {
		return _highfive;
	}

	public void setHighfive(long highfive) {
		_highfive = highfive;
	}

	private long _cid;
	private long _profile_id;
	private long _user_id;
	private long _counter;
	private long _highfive;
}