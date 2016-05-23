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
 * Provides a wrapper for {@link cfm_masterService}.
 *
 * @author ganjuss
 * @see cfm_masterService
 * @generated
 */
public class cfm_masterServiceWrapper implements cfm_masterService,
	ServiceWrapper<cfm_masterService> {
	public cfm_masterServiceWrapper(cfm_masterService cfm_masterService) {
		_cfm_masterService = cfm_masterService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _cfm_masterService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_cfm_masterService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cfm_masterService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public cfm_masterService getWrappedcfm_masterService() {
		return _cfm_masterService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedcfm_masterService(cfm_masterService cfm_masterService) {
		_cfm_masterService = cfm_masterService;
	}

	@Override
	public cfm_masterService getWrappedService() {
		return _cfm_masterService;
	}

	@Override
	public void setWrappedService(cfm_masterService cfm_masterService) {
		_cfm_masterService = cfm_masterService;
	}

	private cfm_masterService _cfm_masterService;
}