package com.jt.recyclerviewpaddingdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val myAdapter = SimpleAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = myAdapter
        }

        showFirstItem.setOnClickListener {
            firstItemId.text = (myRecyclerView.layoutManager as LinearLayoutManager).findFirstCompletelyVisibleItemPosition().toString()
        }

        myAdapter.setItems(listOf("1", "2", "3", "4", "5"))
    }
}
