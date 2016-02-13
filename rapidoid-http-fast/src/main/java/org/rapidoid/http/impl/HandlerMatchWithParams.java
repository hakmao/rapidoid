package org.rapidoid.http.impl;

/*
 * #%L
 * rapidoid-http-fast
 * %%
 * Copyright (C) 2014 - 2016 Nikolche Mihajlovski and contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.Since;
import org.rapidoid.http.handler.FastHttpHandler;

import java.util.Map;

@Authors("Nikolche Mihajlovski")
@Since("5.1.0")
public class HandlerMatchWithParams implements HandlerMatch {

	public final FastHttpHandler handler;

	public final Map<String, String> params;

	public HandlerMatchWithParams(FastHttpHandler handler, Map<String, String> params) {
		this.handler = handler;
		this.params = params;
	}

	@Override
	public FastHttpHandler getHandler() {
		return handler;
	}

	@Override
	public Map<String, String> getParams() {
		return params;
	}

}
