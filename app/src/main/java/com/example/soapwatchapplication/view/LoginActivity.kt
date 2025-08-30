package com.example.soapwatchapplication.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.soapwatchapplication.R
import com.example.soapwatchapplication.model.User
import com.example.soapwatchapplication.presenter.LoginPresenter
import com.example.soapwatchapplication.presenter.ILoginPresenter
import com.example.soapwatchapplication.model.UserRepository as UserRepository

abstract class LoginActivity : AppCompatActivity(), ILoginView {

    private lateinit var presenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        presenter = LoginPresenter(UserRepository())
        presenter.attachView(this)


        btnSignUp.setOnClickListener {
            presenter.login(
                EmailEditText.toString(),
                PasswordEditText.toString()
            )
        }
    }

    fun onLoginSuccess(user: User) {
        Toast.makeText(this, "Welcome ${user.email}!", Toast.LENGTH_SHORT).show()
    }

    fun onLoginFailed(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}


