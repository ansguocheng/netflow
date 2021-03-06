/*
 * Copyright 2013 Eediom Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.araqne.netflow.v9;

import java.util.HashMap;
import java.util.Map;

/**
 * @since 0.1.0
 * @author xeraph
 */
public class NetFlowV9OptionRecord extends NetFlowV9Record {
	private Map<Integer, Object> scopes = new HashMap<Integer, Object>();

	public Map<Integer, Object> getScopes() {
		return scopes;
	}

	public void setScopes(Map<Integer, Object> scopes) {
		this.scopes = scopes;
	}
}
