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

import com.db.model.type_master;

import com.db.service.type_masterLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the type_master service. Represents a row in the &quot;c_type_master&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link type_masterImpl}.
 * </p>
 *
 * @author ganjuss
 * @see type_masterImpl
 * @see com.db.model.type_master
 * @generated
 */
public abstract class type_masterBaseImpl extends type_masterModelImpl
	implements type_master {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a type_master model instance should use the {@link type_master} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			type_masterLocalServiceUtil.addtype_master(this);
		}
		else {
			type_masterLocalServiceUtil.updatetype_master(this);
		}
	}
}