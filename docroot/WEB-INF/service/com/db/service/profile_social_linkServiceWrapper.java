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
 * Provides a wrapper for {@link profile_social_linkService}.
 *
 * @author ganjuss
 * @see profile_social_linkService
 * @generated
 */
public class profile_social_linkServiceWrapper
	implements profile_social_linkService,
		ServiceWrapper<profile_social_linkService> {
	public profile_social_linkServiceWrapper(
		profile_social_linkService profile_social_linkService) {
		_profile_social_linkService = profile_social_linkService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _profile_social_linkService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_profile_social_linkService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _profile_social_linkService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public profile_social_linkService getWrappedprofile_social_linkService() {
		return _profile_social_linkService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedprofile_social_linkService(
		profile_social_linkService profile_social_linkService) {
		_profile_social_linkService = profile_social_linkService;
	}

	@Override
	public profile_social_linkService getWrappedService() {
		return _profile_social_linkService;
	}

	@Override
	public void setWrappedService(
		profile_social_linkService profile_social_linkService) {
		_profile_social_linkService = profile_social_linkService;
	}

	private profile_social_linkService _profile_social_linkService;
}