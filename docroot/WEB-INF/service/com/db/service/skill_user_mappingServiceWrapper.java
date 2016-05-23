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

package com.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link skill_user_mappingService}.
 *
 * @author ganjuss
 * @see skill_user_mappingService
 * @generated
 */
public class skill_user_mappingServiceWrapper
	implements skill_user_mappingService,
		ServiceWrapper<skill_user_mappingService> {
	public skill_user_mappingServiceWrapper(
		skill_user_mappingService skill_user_mappingService) {
		_skill_user_mappingService = skill_user_mappingService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _skill_user_mappingService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_skill_user_mappingService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _skill_user_mappingService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public skill_user_mappingService getWrappedskill_user_mappingService() {
		return _skill_user_mappingService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedskill_user_mappingService(
		skill_user_mappingService skill_user_mappingService) {
		_skill_user_mappingService = skill_user_mappingService;
	}

	@Override
	public skill_user_mappingService getWrappedService() {
		return _skill_user_mappingService;
	}

	@Override
	public void setWrappedService(
		skill_user_mappingService skill_user_mappingService) {
		_skill_user_mappingService = skill_user_mappingService;
	}

	private skill_user_mappingService _skill_user_mappingService;
}