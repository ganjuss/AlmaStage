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

import com.db.model.club_users;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing club_users in entity cache.
 *
 * @author ganjuss
 * @see club_users
 * @generated
 */
public class club_usersCacheModel implements CacheModel<club_users>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{cid=");
		sb.append(cid);
		sb.append(", club_id=");
		sb.append(club_id);
		sb.append(", user_id=");
		sb.append(user_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public club_users toEntityModel() {
		club_usersImpl club_usersImpl = new club_usersImpl();

		club_usersImpl.setCid(cid);
		club_usersImpl.setClub_id(club_id);
		club_usersImpl.setUser_id(user_id);

		club_usersImpl.resetOriginalValues();

		return club_usersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cid = objectInput.readLong();
		club_id = objectInput.readLong();
		user_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cid);
		objectOutput.writeLong(club_id);
		objectOutput.writeLong(user_id);
	}

	public long cid;
	public long club_id;
	public long user_id;
}