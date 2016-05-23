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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.clubsServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.clubsServiceSoap
 * @generated
 */
public class clubsSoap implements Serializable {
	public static clubsSoap toSoapModel(clubs model) {
		clubsSoap soapModel = new clubsSoap();

		soapModel.setCid(model.getCid());
		soapModel.setName(model.getName());
		soapModel.setAdmin_user_id(model.getAdmin_user_id());

		return soapModel;
	}

	public static clubsSoap[] toSoapModels(clubs[] models) {
		clubsSoap[] soapModels = new clubsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static clubsSoap[][] toSoapModels(clubs[][] models) {
		clubsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new clubsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new clubsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static clubsSoap[] toSoapModels(List<clubs> models) {
		List<clubsSoap> soapModels = new ArrayList<clubsSoap>(models.size());

		for (clubs model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new clubsSoap[soapModels.size()]);
	}

	public clubsSoap() {
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public long getAdmin_user_id() {
		return _admin_user_id;
	}

	public void setAdmin_user_id(long admin_user_id) {
		_admin_user_id = admin_user_id;
	}

	private long _cid;
	private String _name;
	private long _admin_user_id;
}