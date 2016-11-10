package com.example.huanjulu.kotlinsource

import android.content.Context
import android.media.Image
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_data.view.*
import java.util.*

/**
 * Created by huanjulu on 16/11/9.
 */


class Adapter constructor(context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val mContext: Context?


    companion object {

    }

    init {
        this.mContext = context
    }


    val items = LinkedList<String>()


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        (holder as ViewHolder).bind(items[position])

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_data, parent, false)
        return ViewHolder(view)
    }

    fun load(articles: List<String>) {
        if (articles.isNotEmpty()) {
            items.run {
                clear()
                addAll(articles)
                notifyDataSetChanged()
            }
        }
    }


    override fun getItemCount(): Int = items.size


    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {


        fun bind(item: String) {

            view.run {
                tag = this
                Log.d("TAG", item)
                content.text = item
            }

        }
    }
}