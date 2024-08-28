package com.example.travelapplication.ui.components

import android.widget.EditText
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardDoubleArrowRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CommonEditText(hint: String, onChanged: (String) -> Unit) {
    var text by rememberSaveable { mutableStateOf("") }

    OutlinedTextField (
        modifier = Modifier
            .padding(5.dp)
            .height(50.dp),
        value = text,
        placeholder = {
            Text(text = hint, modifier = Modifier.padding(0.dp))
        },
        textStyle = TextStyle(
            fontSize = 12.sp
        ),
        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = null,
                tint = Color.Gray
            )
        },
        onValueChange = {
            text = it
            onChanged(text)
        },
    )

}