/*
 * Copyright 2019-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.unit.flute.exception;

/**
 * @param <CAUSE> The type of cause exception.
 * @author jflute (from UTFlute)
 * @since 1.0.0 (2019/04/14 Sunday)
 */
@FunctionalInterface
public interface ExceptionExpectationCall<CAUSE extends Throwable> {

    /**
     * @param cause The expected cause. (NotNull)
     */
    void callback(CAUSE cause);
}
