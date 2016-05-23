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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.acheivementsServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.acheivementsServiceSoap
 * @generated
 */
public class acheivementsSoap implements Serializable {
	public static acheivementsSoap toSoapModel(acheivements model) {
		acheivementsSoap soapModel = new acheivementsSoap();

		soapModel.setCid(model.getCid());

		return soapModel;
	}

	public static acheivementsSoap[] toSoapModels(acheivements[] models) {
		acheivementsSoap[] soapModels = new acheivementsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static acheivementsSoap[][] toSoapModels(acheivements[][] models) {
		acheivementsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new acheivementsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new acheivementsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static acheivementsSoap[] toSoapModels(List<acheivements> models) {
		List<acheivementsSoap> soapModels = new ArrayList<acheivementsSoap>(models.size());

		for (acheivements model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new acheivementsSoap[soapModels.size()]);
	}

	public acheivementsSoap() {
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

	private long _cid;
}