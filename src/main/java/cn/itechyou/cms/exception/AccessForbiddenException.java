/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER
 * Copyright © Dreamer CMS 2019 All Rights Reserved.
 *
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
 */
package cn.itechyou.cms.exception;

import cn.itechyou.cms.common.Constant;

/**
 * @author TODAY <br>
 *         2018-11-26 20:06
 */
@SuppressWarnings("serial")
public class AccessForbiddenException extends ApplicationRuntimeException {

    public AccessForbiddenException(Throwable cause) {
        super(cause);
    }

    public AccessForbiddenException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessForbiddenException(String message) {
        super(message);
    }

    public AccessForbiddenException() {
        super(Constant.ACCESS_FORBIDDEN);
    }
}