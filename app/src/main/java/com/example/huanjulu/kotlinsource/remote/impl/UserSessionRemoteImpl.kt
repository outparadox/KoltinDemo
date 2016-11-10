package com.example.huanjulu.kotlinsource.remote.impl

import com.example.huanjulu.kotlinsource.model.UserSessionWrap
import com.example.huanjulu.kotlinsource.remote.UserSessionRemote

/**
 * Created by huanjulu on 16/11/9.
 */

class UserSessionRemoteImpl : UserSessionRemote {

    var data: List<UserSessionWrap> = listOf(UserSessionWrap(), UserSessionWrap(), UserSessionWrap(), UserSessionWrap(), UserSessionWrap(), UserSessionWrap())


    var datas: List<String> = listOf(
            "稀土攫金"
            , "泡在网上的日子",
            "cokk", "V2ex",
            "开发头条",
            "23code"

    )


    override fun <T> dataRemote(t: T?): List<String> {
        data.forEach {

        }

        return datas

    }
}