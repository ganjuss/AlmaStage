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

import com.db.model.profile_social_link;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing profile_social_link in entity cache.
 *
 * @author ganjuss
 * @see profile_social_link
 * @generated
 */
public class profile_social_linkCacheModel implements CacheModel<profile_social_link>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{cid=");
		sb.append(cid);
		sb.append(", social_type_id=");
		sb.append(social_type_id);
		sb.append(", link=");
		sb.append(link);
		sb.append(", profile_id=");
		sb.append(profile_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public profile_social_link toEntityModel() {
		profile_social_linkImpl profile_social_linkImpl = new profile_social_linkImpl();

		profile_social_linkImpl.setCid(cid);
		profile_social_linkImpl.setSocial_type_id(social_type_id);

		if (link == null) {
			profile_social_linkImpl.setLink(StringPool.BLANK);
		}
		else {
			profile_social_linkImpl.setLink(link);
		}

		profile_social_linkImpl.setProfile_id(profile_id);

		profile_social_linkImpl.resetOriginalValues();

		return profile_social_linkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cid = objectInput.readLong();
		social_type_id = objectInput.readLong();
		link = objectInput.readUTF();
		profile_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cid);
		objectOutput.writeLong(social_type_id);

		if (link == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(link);
		}

		objectOutput.writeLong(profile_id);
	}

	public long cid;
	public long social_type_id;
	public String link;
	public long profile_id;
}