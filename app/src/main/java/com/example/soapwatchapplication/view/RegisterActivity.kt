package com.example.soapwatchapplication.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.soapwatchapplication.R
import com.example.soapwatchapplication.model.UserRepository
import com.example.soapwatchapplication.presenter.LoginPresenter
import com.example.soapwatchapplication.presenter.RegisterPresenter

class RegisterActivity : AppCompatActivity(), IRegisterView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        presenter = RegisterPresenter(UserRepository())
        presenter.attachView(this)


        btnSignUp.setOnClickListener {
            presenter.register(
                EmailEditText.toString(),
                PasswordEditText.toString()
            )
        }
    }
    }
}