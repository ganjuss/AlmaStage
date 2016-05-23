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

import com.db.model.about_us;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing about_us in entity cache.
 *
 * @author ganjuss
 * @see about_us
 * @generated
 */
public class about_usCacheModel implements CacheModel<about_us>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{cid=");
		sb.append(cid);
		sb.append(", profile_id=");
		sb.append(profile_id);
		sb.append(", text=");
		sb.append(text);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public about_us toEntityModel() {
		about_usImpl about_usImpl = new about_usImpl();

		about_usImpl.setCid(cid);
		about_usImpl.setProfile_id(profile_id);

		if (text == null) {
			about_usImpl.setText(StringPool.BLANK);
		}
		else {
			about_usImpl.setText(text);
		}

		about_usImpl.resetOriginalValues();

		return about_usImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cid = objectInput.readLong();
		profile_id = objectInput.readLong();
		text = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cid);
		objectOutput.writeLong(profile_id);

		if (text == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(text);
		}
	}

	public long cid;
	public long profile_id;
	public String text;
}