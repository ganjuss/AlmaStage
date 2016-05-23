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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.messagesServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.messagesServiceSoap
 * @generated
 */
public class messagesSoap implements Serializable {
	public static messagesSoap toSoapModel(messages model) {
		messagesSoap soapModel = new messagesSoap();

		soapModel.setCid(model.getCid());

		return soapModel;
	}

	public static messagesSoap[] toSoapModels(messages[] models) {
		messagesSoap[] soapModels = new messagesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static messagesSoap[][] toSoapModels(messages[][] models) {
		messagesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new messagesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new messagesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static messagesSoap[] toSoapModels(List<messages> models) {
		List<messagesSoap> soapModels = new ArrayList<messagesSoap>(models.size());

		for (messages model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new messagesSoap[soapModels.size()]);
	}

	public messagesSoap() {
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