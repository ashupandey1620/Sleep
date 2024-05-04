package com.ashutosh.sleep.Components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun InputType(s: String , s2:String): String  {

    var text by remember { mutableStateOf("") }

    TextField(
        placeholder = {
            Text(text = s2,
                fontSize = 13.sp,
                color = Color.White,
                fontWeight = FontWeight.Medium)
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        value = text,
        label = { Text(text = s,
            fontSize = 17.sp,
            color = Color.White,
            fontWeight = FontWeight.Medium) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text) ,
        onValueChange = { it ->
            text = it
        },
        colors = TextFieldDefaults.colors(focusedTextColor = Color.White,
            unfocusedTextColor = Color.Gray,
            unfocusedPlaceholderColor = Color.White,
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            focusedIndicatorColor = Color.White,
            cursorColor = Color.White,
            focusedLabelColor = Color.White,
            focusedPlaceholderColor = Color.White
        )
    )

    return text
}

