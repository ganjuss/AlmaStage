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

import com.db.model.cfm;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing cfm in entity cache.
 *
 * @author ganjuss
 * @see cfm
 * @generated
 */
public class cfmCacheModel implements CacheModel<cfm>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{cid=");
		sb.append(cid);
		sb.append(", cfm_by=");
		sb.append(cfm_by);
		sb.append(", cfm_to=");
		sb.append(cfm_to);
		sb.append(", cfm_type_id=");
		sb.append(cfm_type_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public cfm toEntityModel() {
		cfmImpl cfmImpl = new cfmImpl();

		cfmImpl.setCid(cid);
		cfmImpl.setCfm_by(cfm_by);
		cfmImpl.setCfm_to(cfm_to);
		cfmImpl.setCfm_type_id(cfm_type_id);

		cfmImpl.resetOriginalValues();

		return cfmImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cid = objectInput.readLong();
		cfm_by = objectInput.readLong();
		cfm_to = objectInput.readLong();
		cfm_type_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cid);
		objectOutput.writeLong(cfm_by);
		objectOutput.writeLong(cfm_to);
		objectOutput.writeLong(cfm_type_id);
	}

	public long cid;
	public long cfm_by;
	public long cfm_to;
	public long cfm_type_id;
}