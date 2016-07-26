/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2016 ForgeRock AS.
 */

package com.sun.identity.sm;

import com.iplanet.sso.SSOToken;

/**
 * Factory interface for creating {@link OrganizationConfigManager} instances.
 *
 * @since 14.0.0
 */
public interface OrganizationConfigManagerFactory {

    /**
     * Creates a {@link OrganizationConfigManager} for the provided {@literal realm}.
     *
     * @param token The {@code SSOToken} instance.
     * @param realm The realm. If {@code null} the root realm will be used.
     * @return A {@code OrganizationConfigManager} instance.
     * @throws SMSException If an error occurrs while getting the {@code OrganizationConfigManager}.
     */
    OrganizationConfigManager create(SSOToken token, String realm) throws SMSException;
}
