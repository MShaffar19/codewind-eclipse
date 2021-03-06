/*******************************************************************************
 * Copyright (c) 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *	 IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.codewind.core.internal.cli;

import java.util.List;

import org.eclipse.codewind.core.internal.connection.JSONObjectResult;
import org.json.JSONObject;

public class LogLevels extends JSONObjectResult {
	
	private static final String CURRENT_LEVEL_KEY = "currentLevel";
	private static final String DEFAULT_LEVEL_KEY = "defaultLevel";
	private static final String ALL_LEVELS_KEY = "allLevels";
	
	public LogLevels(JSONObject logLevels) {
		super(logLevels, "log levels");
	}
	
	public String getCurrentLevel() {
		return getString(CURRENT_LEVEL_KEY);
	}
	
	public String getDefaultLevel() {
		return getString(DEFAULT_LEVEL_KEY);
	}
	
	public List<String> getAllLevels() {
		return getStringArray(ALL_LEVELS_KEY);
	}
}