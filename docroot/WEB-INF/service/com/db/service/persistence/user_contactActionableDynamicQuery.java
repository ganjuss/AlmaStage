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

package com.db.service.persistence;

import com.db.model.user_contact;

import com.db.service.user_contactLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author ganjuss
 * @generated
 */
public abstract class user_contactActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public user_contactActionableDynamicQuery() throws SystemException {
		setBaseLocalService(user_contactLocalServiceUtil.getService());
		setClass(user_contact.class);

		setClassLoader(com.db.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("cid");
	}
}