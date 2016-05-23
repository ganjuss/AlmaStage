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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for social_type_master. This utility wraps
 * {@link com.db.service.impl.social_type_masterLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ganjuss
 * @see social_type_masterLocalService
 * @see com.db.service.base.social_type_masterLocalServiceBaseImpl
 * @see com.db.service.impl.social_type_masterLocalServiceImpl
 * @generated
 */
public class social_type_masterLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.db.service.impl.social_type_masterLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the social_type_master to the database. Also notifies the appropriate model listeners.
	*
	* @param social_type_master the social_type_master
	* @return the social_type_master that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.social_type_master addsocial_type_master(
		com.db.model.social_type_master social_type_master)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addsocial_type_master(social_type_master);
	}

	/**
	* Creates a new social_type_master with the primary key. Does not add the social_type_master to the database.
	*
	* @param cid the primary key for the new social_type_master
	* @return the new social_type_master
	*/
	public static com.db.model.social_type_master createsocial_type_master(
		long cid) {
		return getService().createsocial_type_master(cid);
	}

	/**
	* Deletes the social_type_master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the social_type_master
	* @return the social_type_master that was removed
	* @throws PortalException if a social_type_master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.social_type_master deletesocial_type_master(
		long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletesocial_type_master(cid);
	}

	/**
	* Deletes the social_type_master from the database. Also notifies the appropriate model listeners.
	*
	* @param social_type_master the social_type_master
	* @return the social_type_master that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.social_type_master deletesocial_type_master(
		com.db.model.social_type_master social_type_master)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletesocial_type_master(social_type_master);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.social_type_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.social_type_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.db.model.social_type_master fetchsocial_type_master(
		long cid) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchsocial_type_master(cid);
	}

	/**
	* Returns the social_type_master with the primary key.
	*
	* @param cid the primary key of the social_type_master
	* @return the social_type_master
	* @throws PortalException if a social_type_master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.social_type_master getsocial_type_master(
		long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getsocial_type_master(cid);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the social_type_masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.db.model.impl.social_type_masterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of social_type_masters
	* @param end the upper bound of the range of social_type_masters (not inclusive)
	* @return the range of social_type_masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.db.model.social_type_master> getsocial_type_masters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getsocial_type_masters(start, end);
	}

	/**
	* Returns the number of social_type_masters.
	*
	* @return the number of social_type_masters
	* @throws SystemException if a system exception occurred
	*/
	public static int getsocial_type_mastersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getsocial_type_mastersCount();
	}

	/**
	* Updates the social_type_master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param social_type_master the social_type_master
	* @return the social_type_master that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.db.model.social_type_master updatesocial_type_master(
		com.db.model.social_type_master social_type_master)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatesocial_type_master(social_type_master);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static social_type_masterLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					social_type_masterLocalService.class.getName());

			if (invokableLocalService instanceof social_type_masterLocalService) {
				_service = (social_type_masterLocalService)invokableLocalService;
			}
			else {
				_service = new social_type_masterLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(social_type_masterLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(social_type_masterLocalService service) {
	}

	private static social_type_masterLocalService _service;
}