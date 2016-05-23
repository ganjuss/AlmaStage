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

import com.db.model.about_usClp;
import com.db.model.acheivementsClp;
import com.db.model.cfmClp;
import com.db.model.cfm_masterClp;
import com.db.model.club_usersClp;
import com.db.model.clubsClp;
import com.db.model.genere_masterClp;
import com.db.model.hit_countClp;
import com.db.model.media_linksClp;
import com.db.model.media_links_masterClp;
import com.db.model.messagesClp;
import com.db.model.notificationsClp;
import com.db.model.profileClp;
import com.db.model.profile_social_linkClp;
import com.db.model.recommendationsClp;
import com.db.model.skillClp;
import com.db.model.skill_user_mappingClp;
import com.db.model.social_loginClp;
import com.db.model.social_type_masterClp;
import com.db.model.type_masterClp;
import com.db.model.user_contactClp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ganjuss
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"AlmaStage-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"AlmaStage-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "AlmaStage-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(about_usClp.class.getName())) {
			return translateInputabout_us(oldModel);
		}

		if (oldModelClassName.equals(acheivementsClp.class.getName())) {
			return translateInputacheivements(oldModel);
		}

		if (oldModelClassName.equals(cfmClp.class.getName())) {
			return translateInputcfm(oldModel);
		}

		if (oldModelClassName.equals(cfm_masterClp.class.getName())) {
			return translateInputcfm_master(oldModel);
		}

		if (oldModelClassName.equals(club_usersClp.class.getName())) {
			return translateInputclub_users(oldModel);
		}

		if (oldModelClassName.equals(clubsClp.class.getName())) {
			return translateInputclubs(oldModel);
		}

		if (oldModelClassName.equals(genere_masterClp.class.getName())) {
			return translateInputgenere_master(oldModel);
		}

		if (oldModelClassName.equals(hit_countClp.class.getName())) {
			return translateInputhit_count(oldModel);
		}

		if (oldModelClassName.equals(media_linksClp.class.getName())) {
			return translateInputmedia_links(oldModel);
		}

		if (oldModelClassName.equals(media_links_masterClp.class.getName())) {
			return translateInputmedia_links_master(oldModel);
		}

		if (oldModelClassName.equals(messagesClp.class.getName())) {
			return translateInputmessages(oldModel);
		}

		if (oldModelClassName.equals(notificationsClp.class.getName())) {
			return translateInputnotifications(oldModel);
		}

		if (oldModelClassName.equals(profileClp.class.getName())) {
			return translateInputprofile(oldModel);
		}

		if (oldModelClassName.equals(profile_social_linkClp.class.getName())) {
			return translateInputprofile_social_link(oldModel);
		}

		if (oldModelClassName.equals(recommendationsClp.class.getName())) {
			return translateInputrecommendations(oldModel);
		}

		if (oldModelClassName.equals(skillClp.class.getName())) {
			return translateInputskill(oldModel);
		}

		if (oldModelClassName.equals(skill_user_mappingClp.class.getName())) {
			return translateInputskill_user_mapping(oldModel);
		}

		if (oldModelClassName.equals(social_loginClp.class.getName())) {
			return translateInputsocial_login(oldModel);
		}

		if (oldModelClassName.equals(social_type_masterClp.class.getName())) {
			return translateInputsocial_type_master(oldModel);
		}

		if (oldModelClassName.equals(type_masterClp.class.getName())) {
			return translateInputtype_master(oldModel);
		}

		if (oldModelClassName.equals(user_contactClp.class.getName())) {
			return translateInputuser_contact(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputabout_us(BaseModel<?> oldModel) {
		about_usClp oldClpModel = (about_usClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getabout_usRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputacheivements(BaseModel<?> oldModel) {
		acheivementsClp oldClpModel = (acheivementsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getacheivementsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputcfm(BaseModel<?> oldModel) {
		cfmClp oldClpModel = (cfmClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getcfmRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputcfm_master(BaseModel<?> oldModel) {
		cfm_masterClp oldClpModel = (cfm_masterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getcfm_masterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputclub_users(BaseModel<?> oldModel) {
		club_usersClp oldClpModel = (club_usersClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getclub_usersRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputclubs(BaseModel<?> oldModel) {
		clubsClp oldClpModel = (clubsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getclubsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputgenere_master(BaseModel<?> oldModel) {
		genere_masterClp oldClpModel = (genere_masterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getgenere_masterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputhit_count(BaseModel<?> oldModel) {
		hit_countClp oldClpModel = (hit_countClp)oldModel;

		BaseModel<?> newModel = oldClpModel.gethit_countRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputmedia_links(BaseModel<?> oldModel) {
		media_linksClp oldClpModel = (media_linksClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getmedia_linksRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputmedia_links_master(BaseModel<?> oldModel) {
		media_links_masterClp oldClpModel = (media_links_masterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getmedia_links_masterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputmessages(BaseModel<?> oldModel) {
		messagesClp oldClpModel = (messagesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getmessagesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputnotifications(BaseModel<?> oldModel) {
		notificationsClp oldClpModel = (notificationsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getnotificationsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputprofile(BaseModel<?> oldModel) {
		profileClp oldClpModel = (profileClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getprofileRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputprofile_social_link(
		BaseModel<?> oldModel) {
		profile_social_linkClp oldClpModel = (profile_social_linkClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getprofile_social_linkRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputrecommendations(BaseModel<?> oldModel) {
		recommendationsClp oldClpModel = (recommendationsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getrecommendationsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputskill(BaseModel<?> oldModel) {
		skillClp oldClpModel = (skillClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getskillRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputskill_user_mapping(BaseModel<?> oldModel) {
		skill_user_mappingClp oldClpModel = (skill_user_mappingClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getskill_user_mappingRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputsocial_login(BaseModel<?> oldModel) {
		social_loginClp oldClpModel = (social_loginClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getsocial_loginRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputsocial_type_master(BaseModel<?> oldModel) {
		social_type_masterClp oldClpModel = (social_type_masterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getsocial_type_masterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputtype_master(BaseModel<?> oldModel) {
		type_masterClp oldClpModel = (type_masterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.gettype_masterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputuser_contact(BaseModel<?> oldModel) {
		user_contactClp oldClpModel = (user_contactClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getuser_contactRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals("com.db.model.impl.about_usImpl")) {
			return translateOutputabout_us(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.acheivementsImpl")) {
			return translateOutputacheivements(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.cfmImpl")) {
			return translateOutputcfm(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.cfm_masterImpl")) {
			return translateOutputcfm_master(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.club_usersImpl")) {
			return translateOutputclub_users(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.clubsImpl")) {
			return translateOutputclubs(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.genere_masterImpl")) {
			return translateOutputgenere_master(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.hit_countImpl")) {
			return translateOutputhit_count(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.media_linksImpl")) {
			return translateOutputmedia_links(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.media_links_masterImpl")) {
			return translateOutputmedia_links_master(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.messagesImpl")) {
			return translateOutputmessages(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.notificationsImpl")) {
			return translateOutputnotifications(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.profileImpl")) {
			return translateOutputprofile(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.db.model.impl.profile_social_linkImpl")) {
			return translateOutputprofile_social_link(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.recommendationsImpl")) {
			return translateOutputrecommendations(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.skillImpl")) {
			return translateOutputskill(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.skill_user_mappingImpl")) {
			return translateOutputskill_user_mapping(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.social_loginImpl")) {
			return translateOutputsocial_login(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.social_type_masterImpl")) {
			return translateOutputsocial_type_master(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.type_masterImpl")) {
			return translateOutputtype_master(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals("com.db.model.impl.user_contactImpl")) {
			return translateOutputuser_contact(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals("com.db.NoSuchabout_usException")) {
			return new com.db.NoSuchabout_usException();
		}

		if (className.equals("com.db.NoSuchacheivementsException")) {
			return new com.db.NoSuchacheivementsException();
		}

		if (className.equals("com.db.NoSuchcfmException")) {
			return new com.db.NoSuchcfmException();
		}

		if (className.equals("com.db.NoSuchcfm_masterException")) {
			return new com.db.NoSuchcfm_masterException();
		}

		if (className.equals("com.db.NoSuchclub_usersException")) {
			return new com.db.NoSuchclub_usersException();
		}

		if (className.equals("com.db.NoSuchclubsException")) {
			return new com.db.NoSuchclubsException();
		}

		if (className.equals("com.db.NoSuchgenere_masterException")) {
			return new com.db.NoSuchgenere_masterException();
		}

		if (className.equals("com.db.NoSuchhit_countException")) {
			return new com.db.NoSuchhit_countException();
		}

		if (className.equals("com.db.NoSuchmedia_linksException")) {
			return new com.db.NoSuchmedia_linksException();
		}

		if (className.equals("com.db.NoSuchmedia_links_masterException")) {
			return new com.db.NoSuchmedia_links_masterException();
		}

		if (className.equals("com.db.NoSuchmessagesException")) {
			return new com.db.NoSuchmessagesException();
		}

		if (className.equals("com.db.NoSuchnotificationsException")) {
			return new com.db.NoSuchnotificationsException();
		}

		if (className.equals("com.db.NoSuchprofileException")) {
			return new com.db.NoSuchprofileException();
		}

		if (className.equals("com.db.NoSuchprofile_social_linkException")) {
			return new com.db.NoSuchprofile_social_linkException();
		}

		if (className.equals("com.db.NoSuchrecommendationsException")) {
			return new com.db.NoSuchrecommendationsException();
		}

		if (className.equals("com.db.NoSuchskillException")) {
			return new com.db.NoSuchskillException();
		}

		if (className.equals("com.db.NoSuchskill_user_mappingException")) {
			return new com.db.NoSuchskill_user_mappingException();
		}

		if (className.equals("com.db.NoSuchsocial_loginException")) {
			return new com.db.NoSuchsocial_loginException();
		}

		if (className.equals("com.db.NoSuchsocial_type_masterException")) {
			return new com.db.NoSuchsocial_type_masterException();
		}

		if (className.equals("com.db.NoSuchtype_masterException")) {
			return new com.db.NoSuchtype_masterException();
		}

		if (className.equals("com.db.NoSuchuser_contactException")) {
			return new com.db.NoSuchuser_contactException();
		}

		return throwable;
	}

	public static Object translateOutputabout_us(BaseModel<?> oldModel) {
		about_usClp newModel = new about_usClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setabout_usRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputacheivements(BaseModel<?> oldModel) {
		acheivementsClp newModel = new acheivementsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setacheivementsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputcfm(BaseModel<?> oldModel) {
		cfmClp newModel = new cfmClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setcfmRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputcfm_master(BaseModel<?> oldModel) {
		cfm_masterClp newModel = new cfm_masterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setcfm_masterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputclub_users(BaseModel<?> oldModel) {
		club_usersClp newModel = new club_usersClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setclub_usersRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputclubs(BaseModel<?> oldModel) {
		clubsClp newModel = new clubsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setclubsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputgenere_master(BaseModel<?> oldModel) {
		genere_masterClp newModel = new genere_masterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setgenere_masterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputhit_count(BaseModel<?> oldModel) {
		hit_countClp newModel = new hit_countClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.sethit_countRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputmedia_links(BaseModel<?> oldModel) {
		media_linksClp newModel = new media_linksClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setmedia_linksRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputmedia_links_master(
		BaseModel<?> oldModel) {
		media_links_masterClp newModel = new media_links_masterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setmedia_links_masterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputmessages(BaseModel<?> oldModel) {
		messagesClp newModel = new messagesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setmessagesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputnotifications(BaseModel<?> oldModel) {
		notificationsClp newModel = new notificationsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setnotificationsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputprofile(BaseModel<?> oldModel) {
		profileClp newModel = new profileClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setprofileRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputprofile_social_link(
		BaseModel<?> oldModel) {
		profile_social_linkClp newModel = new profile_social_linkClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setprofile_social_linkRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputrecommendations(BaseModel<?> oldModel) {
		recommendationsClp newModel = new recommendationsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setrecommendationsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputskill(BaseModel<?> oldModel) {
		skillClp newModel = new skillClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setskillRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputskill_user_mapping(
		BaseModel<?> oldModel) {
		skill_user_mappingClp newModel = new skill_user_mappingClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setskill_user_mappingRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputsocial_login(BaseModel<?> oldModel) {
		social_loginClp newModel = new social_loginClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setsocial_loginRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputsocial_type_master(
		BaseModel<?> oldModel) {
		social_type_masterClp newModel = new social_type_masterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setsocial_type_masterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputtype_master(BaseModel<?> oldModel) {
		type_masterClp newModel = new type_masterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.settype_masterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputuser_contact(BaseModel<?> oldModel) {
		user_contactClp newModel = new user_contactClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setuser_contactRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}