package com.example.huanjulu.kotlinsource.presenter

import com.example.huanjulu.kotlinsource.contract.UserSessionContract
import com.example.huanjulu.kotlinsource.remote.UserSessionRemote
import com.example.huanjulu.kotlinsource.remote.impl.UserSessionRemoteImpl

/**
 * Created by huanjulu on 16/11/9.
 */

class UserSessionPresenter(views: UserSessionContract.UserSessionView) : UserSessionContract.UserSessionPresenter {


    var view: UserSessionContract.UserSessionView? = null

    var model: UserSessionRemote? = null


    init {

        view = views as UserSessionContract.UserSessionView
        model = UserSessionRemoteImpl()
        view!!.setPresenter(this)
    }


    override fun subscribe() {
    }

    override fun unSubscribe() {
        if (view != null) {
            view = null;
        }
    }


    override fun <T> dataP(t: T?) {

        view!!.dataV(model!!.dataRemote(null))

    }

}