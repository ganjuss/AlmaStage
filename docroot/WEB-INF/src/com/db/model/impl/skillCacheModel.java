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

import com.db.model.skill;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing skill in entity cache.
 *
 * @author ganjuss
 * @see skill
 * @generated
 */
public class skillCacheModel implements CacheModel<skill>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{cid=");
		sb.append(cid);
		sb.append(", name=");
		sb.append(name);
		sb.append(", genere_id=");
		sb.append(genere_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public skill toEntityModel() {
		skillImpl skillImpl = new skillImpl();

		skillImpl.setCid(cid);

		if (name == null) {
			skillImpl.setName(StringPool.BLANK);
		}
		else {
			skillImpl.setName(name);
		}

		skillImpl.setGenere_id(genere_id);

		skillImpl.resetOriginalValues();

		return skillImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cid = objectInput.readLong();
		name = objectInput.readUTF();
		genere_id = objectInput.readLong();
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

		objectOutput.writeLong(genere_id);
	}

	public long cid;
	public String name;
	public long genere_id;
}