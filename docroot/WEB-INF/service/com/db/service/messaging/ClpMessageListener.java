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

package com.db.service.messaging;

import com.db.service.ClpSerializer;
import com.db.service.about_usLocalServiceUtil;
import com.db.service.about_usServiceUtil;
import com.db.service.acheivementsLocalServiceUtil;
import com.db.service.acheivementsServiceUtil;
import com.db.service.cfmLocalServiceUtil;
import com.db.service.cfmServiceUtil;
import com.db.service.cfm_masterLocalServiceUtil;
import com.db.service.cfm_masterServiceUtil;
import com.db.service.club_usersLocalServiceUtil;
import com.db.service.club_usersServiceUtil;
import com.db.service.clubsLocalServiceUtil;
import com.db.service.clubsServiceUtil;
import com.db.service.genere_masterLocalServiceUtil;
import com.db.service.genere_masterServiceUtil;
import com.db.service.hit_countLocalServiceUtil;
import com.db.service.hit_countServiceUtil;
import com.db.service.media_linksLocalServiceUtil;
import com.db.service.media_linksServiceUtil;
import com.db.service.media_links_masterLocalServiceUtil;
import com.db.service.media_links_masterServiceUtil;
import com.db.service.messagesLocalServiceUtil;
import com.db.service.messagesServiceUtil;
import com.db.service.notificationsLocalServiceUtil;
import com.db.service.notificationsServiceUtil;
import com.db.service.profileLocalServiceUtil;
import com.db.service.profileServiceUtil;
import com.db.service.profile_social_linkLocalServiceUtil;
import com.db.service.profile_social_linkServiceUtil;
import com.db.service.recommendationsLocalServiceUtil;
import com.db.service.recommendationsServiceUtil;
import com.db.service.skillLocalServiceUtil;
import com.db.service.skillServiceUtil;
import com.db.service.skill_user_mappingLocalServiceUtil;
import com.db.service.skill_user_mappingServiceUtil;
import com.db.service.social_loginLocalServiceUtil;
import com.db.service.social_loginServiceUtil;
import com.db.service.social_type_masterLocalServiceUtil;
import com.db.service.social_type_masterServiceUtil;
import com.db.service.type_masterLocalServiceUtil;
import com.db.service.type_masterServiceUtil;
import com.db.service.user_contactLocalServiceUtil;
import com.db.service.user_contactServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author ganjuss
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			about_usLocalServiceUtil.clearService();

			about_usServiceUtil.clearService();
			acheivementsLocalServiceUtil.clearService();

			acheivementsServiceUtil.clearService();
			cfmLocalServiceUtil.clearService();

			cfmServiceUtil.clearService();
			cfm_masterLocalServiceUtil.clearService();

			cfm_masterServiceUtil.clearService();
			club_usersLocalServiceUtil.clearService();

			club_usersServiceUtil.clearService();
			clubsLocalServiceUtil.clearService();

			clubsServiceUtil.clearService();
			genere_masterLocalServiceUtil.clearService();

			genere_masterServiceUtil.clearService();
			hit_countLocalServiceUtil.clearService();

			hit_countServiceUtil.clearService();
			media_linksLocalServiceUtil.clearService();

			media_linksServiceUtil.clearService();
			media_links_masterLocalServiceUtil.clearService();

			media_links_masterServiceUtil.clearService();
			messagesLocalServiceUtil.clearService();

			messagesServiceUtil.clearService();
			notificationsLocalServiceUtil.clearService();

			notificationsServiceUtil.clearService();
			profileLocalServiceUtil.clearService();

			profileServiceUtil.clearService();
			profile_social_linkLocalServiceUtil.clearService();

			profile_social_linkServiceUtil.clearService();
			recommendationsLocalServiceUtil.clearService();

			recommendationsServiceUtil.clearService();
			skillLocalServiceUtil.clearService();

			skillServiceUtil.clearService();
			skill_user_mappingLocalServiceUtil.clearService();

			skill_user_mappingServiceUtil.clearService();
			social_loginLocalServiceUtil.clearService();

			social_loginServiceUtil.clearService();
			social_type_masterLocalServiceUtil.clearService();

			social_type_masterServiceUtil.clearService();
			type_masterLocalServiceUtil.clearService();

			type_masterServiceUtil.clearService();
			user_contactLocalServiceUtil.clearService();

			user_contactServiceUtil.clearService();
		}
	}
}