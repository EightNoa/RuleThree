/** RuleThree Android application to solve rules of three
 *
 * Copyright (C) 2023  Elio Manuel Leon Lopez
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see https://www.gnu.org/licenses/.
 */
package com.eightnoa.rulethree.ui.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreHoriz
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.eightnoa.rulethree.R

@Composable
fun Header() {
    Column(Modifier.fillMaxWidth()) {
        Row {
            Spacer(modifier = Modifier.weight(1f))
            Options()
            Spacer(modifier = Modifier.width(8.dp))
        }
        Row(Modifier.align(Alignment.CenterHorizontally)) {
            Title(stringResource(R.string.title))
        }
    }
}

@Composable
fun Options() {
    IconButton(onClick = {

    }) {
        Icon(imageVector = Icons.Rounded.MoreHoriz, contentDescription = "More options", Modifier.size(64.dp))
    }
}