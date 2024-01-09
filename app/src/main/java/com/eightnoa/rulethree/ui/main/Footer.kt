/**  RuleThree Android application to solve rules of three
 *  Copyright (C) 2023 Juan Antonio Buitrago Balsalobre
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.eightnoa.rulethree.ui.main

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Calculate
import androidx.compose.material.icons.outlined.History
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.eightnoa.rulethree.R

@Composable
fun Footer() {
    NavigationBar(containerColor = MaterialTheme.colorScheme.primary) {
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Outlined.Calculate, contentDescription = "") },
            label = { Text(text = stringResource(id = R.string.calculate_btn)) },
            selected = true,
            onClick = { },
            colors = NavigationBarItemDefaults.colors(indicatorColor = MaterialTheme.colorScheme.primary)
        )

        Divider(Modifier.fillMaxHeight().width(1.dp), color = Color.Black)

        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Outlined.History, contentDescription = "") },
            label = { Text(text = stringResource(id = R.string.history_btn)) },
            selected = false,
            onClick = { },
            colors = NavigationBarItemDefaults.colors()
        )

    }
}