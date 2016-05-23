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

import com.db.model.profile;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing profile in entity cache.
 *
 * @author ganjuss
 * @see profile
 * @generated
 */
public class profileCacheModel implements CacheModel<profile>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{cid=");
		sb.append(cid);
		sb.append(", type_id=");
		sb.append(type_id);
		sb.append(", genere_id=");
		sb.append(genere_id);
		sb.append(", user_id=");
		sb.append(user_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public profile toEntityModel() {
		profileImpl profileImpl = new profileImpl();

		profileImpl.setCid(cid);
		profileImpl.setType_id(type_id);
		profileImpl.setGenere_id(genere_id);
		profileImpl.setUser_id(user_id);

		profileImpl.resetOriginalValues();

		return profileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cid = objectInput.readLong();
		type_id = objectInput.readLong();
		genere_id = objectInput.readLong();
		user_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cid);
		objectOutput.writeLong(type_id);
		objectOutput.writeLong(genere_id);
		objectOutput.writeLong(user_id);
	}

	public long cid;
	public long type_id;
	public long genere_id;
	public long user_id;
}