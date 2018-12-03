package com.nilsproject.laptopreview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var layoutmanager = GridLayoutManager(this,2)
        layoutmanager.orientation = GridLayoutManager.VERTICAL
        recycler_view.layoutManager = layoutmanager

        var adapter = CustomRecyclerViewAdpt(this,supplier.laptops)
        recycler_view.adapter = adapter
    }
}
