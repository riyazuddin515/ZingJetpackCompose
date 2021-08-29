package com.riyazuddin.zingjetpackcompose.presenation.login

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(): ViewModel(){

    private val _usernameOrEmailText = mutableStateOf("")
    val usernameOrEmailText: State<String> = _usernameOrEmailText

    private val _usernameError = mutableStateOf("")
    val usernameError: State<String> = _usernameError

    private val _passwordText = mutableStateOf("")
    val passwordText: State<String> = _passwordText

    private val _passwordError = mutableStateOf("")
    val passwordError: State<String> = _passwordError

    fun setUserName(username: String) {
        _usernameOrEmailText.value = username
    }

    fun setPassword(password: String) {
        _passwordText.value = password
    }

    fun setUsernameOrEmailError(error: String) {
        _usernameOrEmailText.value = error
    }

    fun setPasswordError(error: String) {
        _passwordError.value = error
    }
}