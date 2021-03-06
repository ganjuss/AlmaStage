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

import com.db.service.skillLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the skill service. Represents a row in the &quot;c_skill&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link skillImpl}.
 * </p>
 *
 * @author ganjuss
 * @see skillImpl
 * @see com.db.model.skill
 * @generated
 */
public abstract class skillBaseImpl extends skillModelImpl implements skill {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a skill model instance should use the {@link skill} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			skillLocalServiceUtil.addskill(this);
		}
		else {
			skillLocalServiceUtil.updateskill(this);
		}
	}
}