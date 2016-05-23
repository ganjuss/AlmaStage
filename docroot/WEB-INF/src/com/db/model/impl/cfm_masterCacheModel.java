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

import com.db.model.cfm_master;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing cfm_master in entity cache.
 *
 * @author ganjuss
 * @see cfm_master
 * @generated
 */
public class cfm_masterCacheModel implements CacheModel<cfm_master>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{cid=");
		sb.append(cid);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public cfm_master toEntityModel() {
		cfm_masterImpl cfm_masterImpl = new cfm_masterImpl();

		cfm_masterImpl.setCid(cid);

		if (name == null) {
			cfm_masterImpl.setName(StringPool.BLANK);
		}
		else {
			cfm_masterImpl.setName(name);
		}

		cfm_masterImpl.resetOriginalValues();

		return cfm_masterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cid = objectInput.readLong();
		name = objectInput.readUTF();
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
	}

	public long cid;
	public String name;
}