package com.example.huanjulu.kotlinsource.contract

import com.example.huanjulu.kotlinsource.base.BasePresenter
import com.example.huanjulu.kotlinsource.base.BaseView

/**
 * Created by huanjulu on 16/11/9.
 */

interface UserSessionContract {


    interface UserSessionView : BaseView<UserSessionPresenter> {

        fun <T> dataV(t: T?): Unit
    }

    interface UserSessionPresenter : BasePresenter {
        fun <T> dataP(t: T?): Unit
    }
}