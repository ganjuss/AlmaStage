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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.club_usersServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.club_usersServiceSoap
 * @generated
 */
public class club_usersSoap implements Serializable {
	public static club_usersSoap toSoapModel(club_users model) {
		club_usersSoap soapModel = new club_usersSoap();

		soapModel.setCid(model.getCid());
		soapModel.setClub_id(model.getClub_id());
		soapModel.setUser_id(model.getUser_id());

		return soapModel;
	}

	public static club_usersSoap[] toSoapModels(club_users[] models) {
		club_usersSoap[] soapModels = new club_usersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static club_usersSoap[][] toSoapModels(club_users[][] models) {
		club_usersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new club_usersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new club_usersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static club_usersSoap[] toSoapModels(List<club_users> models) {
		List<club_usersSoap> soapModels = new ArrayList<club_usersSoap>(models.size());

		for (club_users model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new club_usersSoap[soapModels.size()]);
	}

	public club_usersSoap() {
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

	public long getClub_id() {
		return _club_id;
	}

	public void setClub_id(long club_id) {
		_club_id = club_id;
	}

	public long getUser_id() {
		return _user_id;
	}

	public void setUser_id(long user_id) {
		_user_id = user_id;
	}

	private long _cid;
	private long _club_id;
	private long _user_id;
}