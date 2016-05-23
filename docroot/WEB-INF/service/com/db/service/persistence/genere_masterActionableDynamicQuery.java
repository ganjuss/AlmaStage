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

import com.db.model.genere_master;

import com.db.service.genere_masterLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author ganjuss
 * @generated
 */
public abstract class genere_masterActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public genere_masterActionableDynamicQuery() throws SystemException {
		setBaseLocalService(genere_masterLocalServiceUtil.getService());
		setClass(genere_master.class);

		setClassLoader(com.db.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("cid");
	}
}