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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.recommendationsServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.recommendationsServiceSoap
 * @generated
 */
public class recommendationsSoap implements Serializable {
	public static recommendationsSoap toSoapModel(recommendations model) {
		recommendationsSoap soapModel = new recommendationsSoap();

		soapModel.setCid(model.getCid());

		return soapModel;
	}

	public static recommendationsSoap[] toSoapModels(recommendations[] models) {
		recommendationsSoap[] soapModels = new recommendationsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static recommendationsSoap[][] toSoapModels(
		recommendations[][] models) {
		recommendationsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new recommendationsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new recommendationsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static recommendationsSoap[] toSoapModels(
		List<recommendations> models) {
		List<recommendationsSoap> soapModels = new ArrayList<recommendationsSoap>(models.size());

		for (recommendations model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new recommendationsSoap[soapModels.size()]);
	}

	public recommendationsSoap() {
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