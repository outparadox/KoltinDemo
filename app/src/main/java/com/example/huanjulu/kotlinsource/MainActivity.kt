package com.example.huanjulu.kotlinsource

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.huanjulu.kotlinsource.contract.UserSessionContract
import com.example.huanjulu.kotlinsource.presenter.UserSessionPresenter
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by huanjulu on 16/11/9.
 */
class MainActivity : AppCompatActivity(), UserSessionContract.UserSessionView {

    var mPresenter: UserSessionContract.UserSessionPresenter? = null

    //Adapter
    var adapter: Adapter = Adapter(this)

    //实例化LinearLayoutManager
    var linearlayout = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //start 订阅
        UserSessionPresenter(this).subscribe()

        mPresenter!!.dataP(null)

        //设置adapter 以及 layoutManager
        recycleview.adapter = adapter

        recycleview.layoutManager = linearlayout


    }

    override fun onDestroy() {
        super.onDestroy()
        //cancle 订阅
        mPresenter!!.unSubscribe()
    }


    override fun <T> dataV(t: T?) {

        t as List<String>

        //非空调用
        adapter!!.load(t)

    }

    override fun setPresenter(p: UserSessionContract.UserSessionPresenter) {
        this.mPresenter = p
    }

}