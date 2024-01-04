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

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Body() {
    Column(Modifier.fillMaxWidth()) {
        CalculationArea()

    }
}

@Composable
fun CalculationArea() {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(16.dp)) {
        Card(shape = RoundedCornerShape(8.dp), border = BorderStroke(4.dp, MaterialTheme.colorScheme.secondary)) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.background)
                    .padding(start =  32.dp, end =  32.dp)
                    .height(256.dp)
            ) {
                Spacer(modifier = Modifier.weight(1F))
               Row {
                   TextField(value = "", onValueChange = {}, Modifier.weight(1F))
                   Spacer(modifier = Modifier.width(32.dp).weight(0.4F))
                   TextField(value = "", onValueChange = {}, Modifier.weight(1F))
               }
                Spacer(modifier = Modifier.weight(0.8F))
                Row {
                    TextField(value = "", onValueChange = {}, Modifier.weight(1F))
                    Spacer(modifier = Modifier.width(32.dp).weight(0.4F))
                    Text(text = "X", Modifier.weight(1F))
                }
                Spacer(modifier = Modifier.weight(1F))
                }
            }
        }
}