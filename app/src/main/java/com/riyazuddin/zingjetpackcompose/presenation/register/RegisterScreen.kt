package com.riyazuddin.zingjetpackcompose.presenation.register

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.riyazuddin.zingjetpackcompose.R
import com.riyazuddin.zingjetpackcompose.presenation.StandardTextFields
import com.riyazuddin.zingjetpackcompose.presenation.ui.theme.largeDP
import com.riyazuddin.zingjetpackcompose.presenation.ui.theme.smallDP

@Composable
fun RegisterScreen(
    navController: NavController,
    viewModel: RegisterViewModel = hiltViewModel()
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(largeDP)
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(
                text = stringResource(R.string.sign_up),
                color = MaterialTheme.colors.onBackground,
                style = MaterialTheme.typography.h1
            )

            Spacer(modifier = Modifier.height(largeDP))
            StandardTextFields(
                text = viewModel.emailText.value,
                onValueChange = {
                    viewModel.setEmail(it)
                },
                hint = stringResource(R.string.email),
                keyboardType = KeyboardType.Email,
                error = viewModel.emailError.value
            )

            Spacer(modifier = Modifier.height(smallDP))
            StandardTextFields(
                text = viewModel.usernameText.value,
                onValueChange = {
                    viewModel.setUserName(it)
                },
                hint = stringResource(R.string.username),
                keyboardType = KeyboardType.Text,
                error = viewModel.usernameError.value
            )

            Spacer(modifier = Modifier.height(smallDP))
            StandardTextFields(
                text = viewModel.passwordText.value,
                onValueChange = {
                    viewModel.setPassword(it)
                },
                hint = stringResource(R.string.password),
                keyboardType = KeyboardType.Password,
                error = viewModel.passwordError.value
            )
            Spacer(modifier = Modifier.height(smallDP))
            Button(
                onClick = {

                },
                modifier = Modifier.align(Alignment.End)
            ) {
                Text(
                    stringResource(id = R.string.sign_up),
                    fontSize = 20.sp
                )
            }
        }
        Text(
            text = buildAnnotatedString {
                append("Already have an Account?")
                append(" ")
                val signUpText = stringResource(R.string.login)
                withStyle(
                    style = SpanStyle(
                        color = MaterialTheme.colors.primary

                    )
                ) {
                    append(signUpText)
                }
            },
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .clickable {
                    navController.popBackStack()
                },
        )
    }
}