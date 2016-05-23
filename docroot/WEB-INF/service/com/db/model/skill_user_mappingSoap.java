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
 * This class is used by SOAP remote services, specifically {@link com.db.service.http.skill_user_mappingServiceSoap}.
 *
 * @author ganjuss
 * @see com.db.service.http.skill_user_mappingServiceSoap
 * @generated
 */
public class skill_user_mappingSoap implements Serializable {
	public static skill_user_mappingSoap toSoapModel(skill_user_mapping model) {
		skill_user_mappingSoap soapModel = new skill_user_mappingSoap();

		soapModel.setCid(model.getCid());
		soapModel.setSkill_id(model.getSkill_id());
		soapModel.setProfile_id(model.getProfile_id());
		soapModel.setType_id(model.getType_id());

		return soapModel;
	}

	public static skill_user_mappingSoap[] toSoapModels(
		skill_user_mapping[] models) {
		skill_user_mappingSoap[] soapModels = new skill_user_mappingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static skill_user_mappingSoap[][] toSoapModels(
		skill_user_mapping[][] models) {
		skill_user_mappingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new skill_user_mappingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new skill_user_mappingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static skill_user_mappingSoap[] toSoapModels(
		List<skill_user_mapping> models) {
		List<skill_user_mappingSoap> soapModels = new ArrayList<skill_user_mappingSoap>(models.size());

		for (skill_user_mapping model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new skill_user_mappingSoap[soapModels.size()]);
	}

	public skill_user_mappingSoap() {
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

	public long getSkill_id() {
		return _skill_id;
	}

	public void setSkill_id(long skill_id) {
		_skill_id = skill_id;
	}

	public long getProfile_id() {
		return _profile_id;
	}

	public void setProfile_id(long profile_id) {
		_profile_id = profile_id;
	}

	public long getType_id() {
		return _type_id;
	}

	public void setType_id(long type_id) {
		_type_id = type_id;
	}

	private long _cid;
	private long _skill_id;
	private long _profile_id;
	private long _type_id;
}