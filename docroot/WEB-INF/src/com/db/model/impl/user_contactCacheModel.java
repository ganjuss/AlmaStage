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

import com.db.model.user_contact;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing user_contact in entity cache.
 *
 * @author ganjuss
 * @see user_contact
 * @generated
 */
public class user_contactCacheModel implements CacheModel<user_contact>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{cid=");
		sb.append(cid);
		sb.append(", profile_id=");
		sb.append(profile_id);
		sb.append(", user_id=");
		sb.append(user_id);
		sb.append(", email=");
		sb.append(email);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", dob=");
		sb.append(dob);
		sb.append(", city=");
		sb.append(city);
		sb.append(", gender=");
		sb.append(gender);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public user_contact toEntityModel() {
		user_contactImpl user_contactImpl = new user_contactImpl();

		user_contactImpl.setCid(cid);
		user_contactImpl.setProfile_id(profile_id);
		user_contactImpl.setUser_id(user_id);

		if (email == null) {
			user_contactImpl.setEmail(StringPool.BLANK);
		}
		else {
			user_contactImpl.setEmail(email);
		}

		user_contactImpl.setPhone(phone);

		if (dob == Long.MIN_VALUE) {
			user_contactImpl.setDob(null);
		}
		else {
			user_contactImpl.setDob(new Date(dob));
		}

		if (city == null) {
			user_contactImpl.setCity(StringPool.BLANK);
		}
		else {
			user_contactImpl.setCity(city);
		}

		if (gender == null) {
			user_contactImpl.setGender(StringPool.BLANK);
		}
		else {
			user_contactImpl.setGender(gender);
		}

		user_contactImpl.resetOriginalValues();

		return user_contactImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cid = objectInput.readLong();
		profile_id = objectInput.readLong();
		user_id = objectInput.readLong();
		email = objectInput.readUTF();
		phone = objectInput.readLong();
		dob = objectInput.readLong();
		city = objectInput.readUTF();
		gender = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cid);
		objectOutput.writeLong(profile_id);
		objectOutput.writeLong(user_id);

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(phone);
		objectOutput.writeLong(dob);

		if (city == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gender);
		}
	}

	public long cid;
	public long profile_id;
	public long user_id;
	public String email;
	public long phone;
	public long dob;
	public String city;
	public String gender;
}