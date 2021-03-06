/*-
 * #%L
 * rapidoid-web
 * %%
 * Copyright (C) 2014 - 2017 Nikolche Mihajlovski and contributors
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

package org.rapidoid.web.config.bean;


import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.Since;

import java.util.Map;

@Authors("Nikolche Mihajlovski")
@Since("5.3.0")
public class PageConfig extends AbstractRouteConfig implements GuiConfig {

	public volatile PageGuiType type = PageGuiType.grid;

	public volatile Boolean mvc;

	public volatile String view;

	public volatile String zone;

	public volatile String caption;

	public volatile String header;

	public volatile String footer;

	public volatile String sql;

	public volatile String uri;

	public volatile int pageSize;

	public volatile Map<String, PageGuiConfig> gui;

	public PageConfig() {
	}

	public PageConfig(String shortcut) {
		this.sql = shortcut;
	}

	@Override
	public PageGuiType type() {
		return type;
	}

	@Override
	public String caption() {
		return caption;
	}

	@Override
	public String header() {
		return header;
	}

	@Override
	public String footer() {
		return footer;
	}

	@Override
	public String sql() {
		return sql;
	}

	@Override
	public String uri() {
		return uri;
	}

	@Override
	public boolean single() {
		return single;
	}

	@Override
	public int pageSize() {
		return pageSize;
	}
}
