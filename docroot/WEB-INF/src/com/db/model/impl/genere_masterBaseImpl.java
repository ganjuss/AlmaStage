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

import com.db.model.genere_master;

import com.db.service.genere_masterLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the genere_master service. Represents a row in the &quot;c_genere_master&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link genere_masterImpl}.
 * </p>
 *
 * @author ganjuss
 * @see genere_masterImpl
 * @see com.db.model.genere_master
 * @generated
 */
public abstract class genere_masterBaseImpl extends genere_masterModelImpl
	implements genere_master {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a genere_master model instance should use the {@link genere_master} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			genere_masterLocalServiceUtil.addgenere_master(this);
		}
		else {
			genere_masterLocalServiceUtil.updategenere_master(this);
		}
	}
}