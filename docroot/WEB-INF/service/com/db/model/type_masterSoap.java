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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.type_masterServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.type_masterServiceSoap
 * @generated
 */
public class type_masterSoap implements Serializable {
	public static type_masterSoap toSoapModel(type_master model) {
		type_masterSoap soapModel = new type_masterSoap();

		soapModel.setCid(model.getCid());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static type_masterSoap[] toSoapModels(type_master[] models) {
		type_masterSoap[] soapModels = new type_masterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static type_masterSoap[][] toSoapModels(type_master[][] models) {
		type_masterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new type_masterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new type_masterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static type_masterSoap[] toSoapModels(List<type_master> models) {
		List<type_masterSoap> soapModels = new ArrayList<type_masterSoap>(models.size());

		for (type_master model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new type_masterSoap[soapModels.size()]);
	}

	public type_masterSoap() {
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

	private long _cid;
	private String _name;
}