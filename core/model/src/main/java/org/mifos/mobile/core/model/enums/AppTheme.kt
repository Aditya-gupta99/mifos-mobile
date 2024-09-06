/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-mobile/blob/master/LICENSE.md
 */
package org.mifos.mobile.core.model.enums

enum class AppTheme(
    val themeName: String,
) {
    SYSTEM(themeName = "System Theme"),
    LIGHT(themeName = "Light Theme"),
    DARK(themeName = "Dark Theme"),
}