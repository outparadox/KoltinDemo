package com.example.huanjulu.kotlinsource.base

/**
 * Created by huanjulu on 16/11/9.
 */

interface BasePresenter {

    open fun subscribe(): Unit

    open fun unSubscribe(): Unit

}