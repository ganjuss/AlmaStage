/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.db;

import com.liferay.portal.NoSuchModelException;

/**
 * @author ganjuss
 */
public class NoSuchhit_countException extends NoSuchModelException {

	public NoSuchhit_countException() {
		super();
	}

	public NoSuchhit_countException(String msg) {
		super(msg);
	}

	public NoSuchhit_countException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchhit_countException(Throwable cause) {
		super(cause);
	}

}