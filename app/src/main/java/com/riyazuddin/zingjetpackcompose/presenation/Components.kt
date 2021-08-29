package com.riyazuddin.zingjetpackcompose.presenation

import android.util.Log
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import com.riyazuddin.zingjetpackcompose.R
import com.riyazuddin.zingjetpackcompose.presenation.utill.Screen
import timber.log.Timber

@Composable
fun StandardTextFields(
    text: String,
    onValueChange: (String) -> Unit,
    hint: String,
    keyboardType: KeyboardType,
    error: String
) {

    var passwordHidden by remember { mutableStateOf(true) }

    TextField(
        value = text,
        onValueChange = onValueChange,
        placeholder = {
            Text(text = hint)
        },
        singleLine = true,
        isError = error != "",
        visualTransformation = if (passwordHidden && keyboardType == KeyboardType.Password)
            PasswordVisualTransformation()
        else VisualTransformation.None,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        trailingIcon = {
            if (keyboardType == KeyboardType.Password) {
                IconButton(onClick = { passwordHidden = !passwordHidden }) {
                    val visibilityIcon =
                        if (passwordHidden) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                    val description =
                        if (passwordHidden) stringResource(R.string.show_password) else stringResource(
                            R.string.hide_password
                        )
                    Icon(imageVector = visibilityIcon, contentDescription = description)
                }
            }
        },
        modifier = Modifier.fillMaxWidth()
    )
}