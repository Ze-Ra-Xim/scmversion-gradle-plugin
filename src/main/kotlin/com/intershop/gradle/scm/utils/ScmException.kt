/*
 * Copyright 2020 Intershop Communications AG.
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
 *  limitations under the License.
 */
package com.intershop.gradle.scm.utils

/**
 * SCM exception.
 */
class ScmException
/**
 * Constructs a {@code ScmException} instance with an error message.
 *
 * @param message the error message
 */(message: String) : RuntimeException(message) {

    /**
     * Returns the string representation of this exception.
     *
     * @return the string representation of this exception
     */
    override fun toString() : String {
        val cause = super.cause
        val msg = super.message

        if(! msg.isNullOrBlank()) {
            if(cause != null) {
                return "$msg ( $cause ) "
            }
            return msg
        }
        if(cause != null) {
            return cause.toString()
        }
        return ""
    }
}