package com.example.soapwatchapplication.view

import com.example.soapwatchapplication.model.User

interface ILoginView {
    abstract val btnSignUp: Any
    abstract val PasswordEditText: Any
    abstract val EmailEditText: Any

    fun onLogInSuccess(user: User)
    fun onLogInFailed(message:String)
}