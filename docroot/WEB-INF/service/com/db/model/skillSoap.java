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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.skillServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.skillServiceSoap
 * @generated
 */
public class skillSoap implements Serializable {
	public static skillSoap toSoapModel(skill model) {
		skillSoap soapModel = new skillSoap();

		soapModel.setCid(model.getCid());
		soapModel.setName(model.getName());
		soapModel.setGenere_id(model.getGenere_id());

		return soapModel;
	}

	public static skillSoap[] toSoapModels(skill[] models) {
		skillSoap[] soapModels = new skillSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static skillSoap[][] toSoapModels(skill[][] models) {
		skillSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new skillSoap[models.length][models[0].length];
		}
		else {
			soapModels = new skillSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static skillSoap[] toSoapModels(List<skill> models) {
		List<skillSoap> soapModels = new ArrayList<skillSoap>(models.size());

		for (skill model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new skillSoap[soapModels.size()]);
	}

	public skillSoap() {
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

	public long getGenere_id() {
		return _genere_id;
	}

	public void setGenere_id(long genere_id) {
		_genere_id = genere_id;
	}

	private long _cid;
	private String _name;
	private long _genere_id;
}