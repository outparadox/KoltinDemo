package com.example.huanjulu.kotlinsource.model

/**
 * Created by huanjulu on 16/11/9.
 */


class UserSessionWrap {

    var success: Boolean = false;

    var data: DataBean? = null

    inner class DataBean {


        var content: String? = "this is a null content"

        var name: String ?= "this is a null content"

        var age: Int? = 0

        var session: String? = "this is a null session"
    }

}