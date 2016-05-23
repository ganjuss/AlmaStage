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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.media_linksServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.media_linksServiceSoap
 * @generated
 */
public class media_linksSoap implements Serializable {
	public static media_linksSoap toSoapModel(media_links model) {
		media_linksSoap soapModel = new media_linksSoap();

		soapModel.setCid(model.getCid());
		soapModel.setProfile_id(model.getProfile_id());
		soapModel.setMedia_type_id(model.getMedia_type_id());
		soapModel.setLink(model.getLink());

		return soapModel;
	}

	public static media_linksSoap[] toSoapModels(media_links[] models) {
		media_linksSoap[] soapModels = new media_linksSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static media_linksSoap[][] toSoapModels(media_links[][] models) {
		media_linksSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new media_linksSoap[models.length][models[0].length];
		}
		else {
			soapModels = new media_linksSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static media_linksSoap[] toSoapModels(List<media_links> models) {
		List<media_linksSoap> soapModels = new ArrayList<media_linksSoap>(models.size());

		for (media_links model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new media_linksSoap[soapModels.size()]);
	}

	public media_linksSoap() {
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

	public long getMedia_type_id() {
		return _media_type_id;
	}

	public void setMedia_type_id(long media_type_id) {
		_media_type_id = media_type_id;
	}

	public String getLink() {
		return _link;
	}

	public void setLink(String link) {
		_link = link;
	}

	private long _cid;
	private long _profile_id;
	private long _media_type_id;
	private String _link;
}