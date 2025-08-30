package com.example.soapwatchapplication.presenter

import android.provider.ContactsContract.CommonDataKinds.Email
import com.example.soapwatchapplication.model.UserRepository
import com.example.soapwatchapplication.view.ILoginView

class LoginPresenter (
    private val userRepository: UserRepository
) : ILoginPresenter {
    private var view: ILoginView? = null

    override fun attachView(view: ILoginView) {
        this.view = view
    }

    override fun detachView() {
        this.view = null
    }

    override fun login(email: String, password: String) {
        val user = userRepository.authenticate(email, password)
        if (user != null) {
            view?.onLogInSuccess(user)
        } else {
            view?.onLogInFailed("Invalid credentials")
        }
    }
}