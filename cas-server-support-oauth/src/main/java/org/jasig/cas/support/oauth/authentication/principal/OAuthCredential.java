/*
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.cas.support.oauth.authentication.principal;

import org.jasig.cas.authentication.Credential;

import java.util.Map;

/**
 * @author Scott Battaglia
 * @since 3.1
 */
public final class OAuthCredential implements Credential {

    /** Authentication attribute name for remember-me. **/
    public static String AUTHENTICATION_ATTRIBUTE_OAUTH = "org.jasig.cas.support.oauth.authentication.principal.OAUTH";

    private static final long serialVersionUID = -98723987239832729L;

    private final String clientId;

    private final String id;

    private final Map<String, Object> attributes;

    /**
     * Instantiates a new OAuth credential.
     * Since oauth credentials rely on the primary authentication we wrapping the
     * existing authorization so we can apply specific expiration policies
     *
     * @param clientId the client id
     * @param id the user id
     * @param attributes the attributes
     */
    public OAuthCredential(final String clientId, final String id, final Map<String, Object> attributes) {
        this.clientId = clientId;
        this.id = id;
        this.attributes = attributes;
    }

    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public String getClientId() {
        return this.clientId;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.getId();
    }

}
