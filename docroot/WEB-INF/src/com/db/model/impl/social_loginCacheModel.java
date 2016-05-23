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

import com.db.model.social_login;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing social_login in entity cache.
 *
 * @author ganjuss
 * @see social_login
 * @generated
 */
public class social_loginCacheModel implements CacheModel<social_login>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{cid=");
		sb.append(cid);
		sb.append(", social_type_id=");
		sb.append(social_type_id);
		sb.append(", profile_id=");
		sb.append(profile_id);
		sb.append(", social_id=");
		sb.append(social_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public social_login toEntityModel() {
		social_loginImpl social_loginImpl = new social_loginImpl();

		social_loginImpl.setCid(cid);
		social_loginImpl.setSocial_type_id(social_type_id);
		social_loginImpl.setProfile_id(profile_id);
		social_loginImpl.setSocial_id(social_id);

		social_loginImpl.resetOriginalValues();

		return social_loginImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cid = objectInput.readLong();
		social_type_id = objectInput.readLong();
		profile_id = objectInput.readLong();
		social_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cid);
		objectOutput.writeLong(social_type_id);
		objectOutput.writeLong(profile_id);
		objectOutput.writeLong(social_id);
	}

	public long cid;
	public long social_type_id;
	public long profile_id;
	public long social_id;
}