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

import com.db.model.clubs;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing clubs in entity cache.
 *
 * @author ganjuss
 * @see clubs
 * @generated
 */
public class clubsCacheModel implements CacheModel<clubs>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{cid=");
		sb.append(cid);
		sb.append(", name=");
		sb.append(name);
		sb.append(", admin_user_id=");
		sb.append(admin_user_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public clubs toEntityModel() {
		clubsImpl clubsImpl = new clubsImpl();

		clubsImpl.setCid(cid);

		if (name == null) {
			clubsImpl.setName(StringPool.BLANK);
		}
		else {
			clubsImpl.setName(name);
		}

		clubsImpl.setAdmin_user_id(admin_user_id);

		clubsImpl.resetOriginalValues();

		return clubsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cid = objectInput.readLong();
		name = objectInput.readUTF();
		admin_user_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cid);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(admin_user_id);
	}

	public long cid;
	public String name;
	public long admin_user_id;
}