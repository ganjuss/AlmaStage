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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.cfmServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.cfmServiceSoap
 * @generated
 */
public class cfmSoap implements Serializable {
	public static cfmSoap toSoapModel(cfm model) {
		cfmSoap soapModel = new cfmSoap();

		soapModel.setCid(model.getCid());
		soapModel.setCfm_by(model.getCfm_by());
		soapModel.setCfm_to(model.getCfm_to());
		soapModel.setCfm_type_id(model.getCfm_type_id());

		return soapModel;
	}

	public static cfmSoap[] toSoapModels(cfm[] models) {
		cfmSoap[] soapModels = new cfmSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static cfmSoap[][] toSoapModels(cfm[][] models) {
		cfmSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new cfmSoap[models.length][models[0].length];
		}
		else {
			soapModels = new cfmSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static cfmSoap[] toSoapModels(List<cfm> models) {
		List<cfmSoap> soapModels = new ArrayList<cfmSoap>(models.size());

		for (cfm model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new cfmSoap[soapModels.size()]);
	}

	public cfmSoap() {
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

	public long getCfm_by() {
		return _cfm_by;
	}

	public void setCfm_by(long cfm_by) {
		_cfm_by = cfm_by;
	}

	public long getCfm_to() {
		return _cfm_to;
	}

	public void setCfm_to(long cfm_to) {
		_cfm_to = cfm_to;
	}

	public long getCfm_type_id() {
		return _cfm_type_id;
	}

	public void setCfm_type_id(long cfm_type_id) {
		_cfm_type_id = cfm_type_id;
	}

	private long _cid;
	private long _cfm_by;
	private long _cfm_to;
	private long _cfm_type_id;
}