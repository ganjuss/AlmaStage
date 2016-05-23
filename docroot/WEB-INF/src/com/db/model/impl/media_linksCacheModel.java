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

import com.db.model.media_links;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing media_links in entity cache.
 *
 * @author ganjuss
 * @see media_links
 * @generated
 */
public class media_linksCacheModel implements CacheModel<media_links>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{cid=");
		sb.append(cid);
		sb.append(", profile_id=");
		sb.append(profile_id);
		sb.append(", media_type_id=");
		sb.append(media_type_id);
		sb.append(", link=");
		sb.append(link);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public media_links toEntityModel() {
		media_linksImpl media_linksImpl = new media_linksImpl();

		media_linksImpl.setCid(cid);
		media_linksImpl.setProfile_id(profile_id);
		media_linksImpl.setMedia_type_id(media_type_id);

		if (link == null) {
			media_linksImpl.setLink(StringPool.BLANK);
		}
		else {
			media_linksImpl.setLink(link);
		}

		media_linksImpl.resetOriginalValues();

		return media_linksImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cid = objectInput.readLong();
		profile_id = objectInput.readLong();
		media_type_id = objectInput.readLong();
		link = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cid);
		objectOutput.writeLong(profile_id);
		objectOutput.writeLong(media_type_id);

		if (link == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(link);
		}
	}

	public long cid;
	public long profile_id;
	public long media_type_id;
	public String link;
}