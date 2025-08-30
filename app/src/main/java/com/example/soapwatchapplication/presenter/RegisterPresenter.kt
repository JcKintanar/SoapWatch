package com.example.soapwatchapplication.presenter

import com.example.soapwatchapplication.model.UserRepository
import com.example.soapwatchapplication.view.ILoginView
import com.example.soapwatchapplication.view.IRegisterView

class RegisterPresenter (
    private val userRepository: UserRepository
) : IRegisterPresenter {
    var view: IRegisterView? = null
    override fun register(fname: String, lname: String, email: String, password:String) {
        val user = userRepository.authenticate(fname, lname, email, password)
        if (user != null) {
            view?.onLogInSuccess(user)
        } else {
            view?.onLogInFailed("Invalid credentials")
        }
    }

}
