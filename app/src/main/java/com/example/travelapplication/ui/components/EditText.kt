package com.example.travelapplication.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    singleLine: Boolean = false,
    modifier: Modifier = Modifier,
    errorMessage: String? = null,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
    placeholderText: String = "Placeholder",
    fontSize: TextUnit = MaterialTheme.typography.bodyMedium.fontSize
) {
    var value by rememberSaveable { mutableStateOf(value) }
    Column{
        BasicTextField(
            modifier = modifier
                .background(
                    MaterialTheme.colorScheme.surface,
                    MaterialTheme.shapes.small,
                )
                .fillMaxWidth()
                .padding(top = 4.dp)
                .border(1.dp, MaterialTheme.colorScheme.outline , CircleShape),       // Border Style
            value = value,
            onValueChange = {
                value = it                                                                         //Update the text
                onValueChange(it)                                                                  //Pass the result back
            },
            singleLine = singleLine,
            cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
            textStyle = LocalTextStyle.current.copy(                                                /*                        */
                color = MaterialTheme.colorScheme.onSurface,                                        /*    Input text style    */
                fontSize = fontSize                                                                 /*                        */
            ),
            decorationBox = { innerTextField ->
                Row(
                    modifier = Modifier.padding(
                        start = 16.dp
                    ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (leadingIcon != null) leadingIcon()
                    Box(Modifier.weight(1f)) {
                        if (value.isEmpty())
                            Text(
                                text = placeholderText,
                                style = LocalTextStyle.current.copy(
                                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.3f),
                                    fontSize = fontSize
                                ),
                            )
                        innerTextField()
                    }
                    if (!errorMessage.isNullOrEmpty()) {
                        Icon(
                            imageVector = Icons.Default.Error,                          //need to implement extend Icon library
                            contentDescription = "Error Icon",
                            tint = MaterialTheme.colorScheme.error
                        )
                    }else if (trailingIcon != null) trailingIcon()
                }
            }
        )
        //Error message when invalid
        if (!errorMessage.isNullOrEmpty()) {
            Text(
                text = errorMessage,
                color = MaterialTheme.colorScheme.error,
                fontSize = 12.sp
            )
        }
    }
}