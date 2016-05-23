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

import com.db.model.hit_count;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing hit_count in entity cache.
 *
 * @author ganjuss
 * @see hit_count
 * @generated
 */
public class hit_countCacheModel implements CacheModel<hit_count>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{cid=");
		sb.append(cid);
		sb.append(", profile_id=");
		sb.append(profile_id);
		sb.append(", user_id=");
		sb.append(user_id);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", highfive=");
		sb.append(highfive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public hit_count toEntityModel() {
		hit_countImpl hit_countImpl = new hit_countImpl();

		hit_countImpl.setCid(cid);
		hit_countImpl.setProfile_id(profile_id);
		hit_countImpl.setUser_id(user_id);
		hit_countImpl.setCounter(counter);
		hit_countImpl.setHighfive(highfive);

		hit_countImpl.resetOriginalValues();

		return hit_countImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cid = objectInput.readLong();
		profile_id = objectInput.readLong();
		user_id = objectInput.readLong();
		counter = objectInput.readLong();
		highfive = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cid);
		objectOutput.writeLong(profile_id);
		objectOutput.writeLong(user_id);
		objectOutput.writeLong(counter);
		objectOutput.writeLong(highfive);
	}

	public long cid;
	public long profile_id;
	public long user_id;
	public long counter;
	public long highfive;
}