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

package com.db.model.impl;

import com.db.model.skill_user_mapping;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing skill_user_mapping in entity cache.
 *
 * @author ganjuss
 * @see skill_user_mapping
 * @generated
 */
public class skill_user_mappingCacheModel implements CacheModel<skill_user_mapping>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{cid=");
		sb.append(cid);
		sb.append(", skill_id=");
		sb.append(skill_id);
		sb.append(", profile_id=");
		sb.append(profile_id);
		sb.append(", type_id=");
		sb.append(type_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public skill_user_mapping toEntityModel() {
		skill_user_mappingImpl skill_user_mappingImpl = new skill_user_mappingImpl();

		skill_user_mappingImpl.setCid(cid);
		skill_user_mappingImpl.setSkill_id(skill_id);
		skill_user_mappingImpl.setProfile_id(profile_id);
		skill_user_mappingImpl.setType_id(type_id);

		skill_user_mappingImpl.resetOriginalValues();

		return skill_user_mappingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cid = objectInput.readLong();
		skill_id = objectInput.readLong();
		profile_id = objectInput.readLong();
		type_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cid);
		objectOutput.writeLong(skill_id);
		objectOutput.writeLong(profile_id);
		objectOutput.writeLong(type_id);
	}

	public long cid;
	public long skill_id;
	public long profile_id;
	public long type_id;
}