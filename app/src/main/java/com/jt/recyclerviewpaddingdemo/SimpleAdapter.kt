package com.jt.recyclerviewpaddingdemo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_item.view.*
import java.util.*

class SimpleAdapter : RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder>() {
    private var items: MutableList<String> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        SimpleViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_item, parent, false))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        items[position].run {
            holder.itemView.also {
                it.numberId.text = this
            }
        }
    }

    fun setItems(newItems: List<String>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }
    class SimpleViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view)
}