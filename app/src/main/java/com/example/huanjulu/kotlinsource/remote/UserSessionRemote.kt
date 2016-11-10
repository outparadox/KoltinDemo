package com.example.huanjulu.kotlinsource.remote

/**
 * Created by huanjulu on 16/11/9.
 */


public interface UserSessionRemote {



    fun <T> dataRemote(t: T?): List<String>

}
