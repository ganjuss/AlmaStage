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

import com.db.model.profile;

import com.db.service.profileLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the profile service. Represents a row in the &quot;c_profile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link profileImpl}.
 * </p>
 *
 * @author ganjuss
 * @see profileImpl
 * @see com.db.model.profile
 * @generated
 */
public abstract class profileBaseImpl extends profileModelImpl
	implements profile {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a profile model instance should use the {@link profile} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			profileLocalServiceUtil.addprofile(this);
		}
		else {
			profileLocalServiceUtil.updateprofile(this);
		}
	}
}