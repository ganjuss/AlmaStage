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
 * Provides a wrapper for {@link genere_masterService}.
 *
 * @author ganjuss
 * @see genere_masterService
 * @generated
 */
public class genere_masterServiceWrapper implements genere_masterService,
	ServiceWrapper<genere_masterService> {
	public genere_masterServiceWrapper(
		genere_masterService genere_masterService) {
		_genere_masterService = genere_masterService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _genere_masterService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_genere_masterService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _genere_masterService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public genere_masterService getWrappedgenere_masterService() {
		return _genere_masterService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedgenere_masterService(
		genere_masterService genere_masterService) {
		_genere_masterService = genere_masterService;
	}

	@Override
	public genere_masterService getWrappedService() {
		return _genere_masterService;
	}

	@Override
	public void setWrappedService(genere_masterService genere_masterService) {
		_genere_masterService = genere_masterService;
	}

	private genere_masterService _genere_masterService;
}