package org.rapidoid.db;

/*
 * #%L
 * rapidoid-db-tests
 * %%
 * Copyright (C) 2014 - 2015 Nikolche Mihajlovski
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

import org.rapidoid.log.Log;
import org.rapidoid.log.LogLevel;
import org.rapidoid.test.TestCommons;
import org.rapidoid.util.AppCtx;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class DbTestCommons extends TestCommons {

	@BeforeMethod(alwaysRun = true)
	@AfterMethod(alwaysRun = true)
	public void initDB() {
		Log.warn("Destroying all databases: " + DBs.instances());
		DBs.destroyAll();
		DB.destroy();
		DB.init();
		Log.setLogLevel(LogLevel.DEBUG);
		AppCtx.reset();
	}

}
