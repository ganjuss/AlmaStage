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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.notificationsServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.notificationsServiceSoap
 * @generated
 */
public class notificationsSoap implements Serializable {
	public static notificationsSoap toSoapModel(notifications model) {
		notificationsSoap soapModel = new notificationsSoap();

		soapModel.setCid(model.getCid());

		return soapModel;
	}

	public static notificationsSoap[] toSoapModels(notifications[] models) {
		notificationsSoap[] soapModels = new notificationsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static notificationsSoap[][] toSoapModels(notifications[][] models) {
		notificationsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new notificationsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new notificationsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static notificationsSoap[] toSoapModels(List<notifications> models) {
		List<notificationsSoap> soapModels = new ArrayList<notificationsSoap>(models.size());

		for (notifications model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new notificationsSoap[soapModels.size()]);
	}

	public notificationsSoap() {
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