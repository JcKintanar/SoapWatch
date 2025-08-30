package com.example.soapwatchapplication.presenter

import com.example.soapwatchapplication.view.ILoginView

interface ILoginPresenter {
    fun attachView (view:ILoginView)
    fun detachView()
    fun login (email:String, password:String)
}