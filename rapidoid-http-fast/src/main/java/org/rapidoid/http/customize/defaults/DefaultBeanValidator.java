/*-
 * #%L
 * rapidoid-http-fast
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

package org.rapidoid.http.customize.defaults;

import org.rapidoid.RapidoidThing;
import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.Since;
import org.rapidoid.http.Req;
import org.rapidoid.http.customize.BeanValidator;
import org.rapidoid.util.MscOpts;
import org.rapidoid.validation.Validators;


@Authors("Nikolche Mihajlovski")
@Since("5.1.0")
public class DefaultBeanValidator extends RapidoidThing implements BeanValidator {

	private final boolean supported = MscOpts.hasValidation();

	@Override
	public void validate(Req req, Object bean) {
		if (supported) {
			Validators.validate(bean);
		}
	}

}
