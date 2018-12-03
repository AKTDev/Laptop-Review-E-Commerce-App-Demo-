package com.nilsproject.laptopreview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import kotlinx.android.synthetic.main.activity_second.*

class Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle : Bundle? = intent.extras
        val name_key = bundle!!.getString("name_key")
        val discri = bundle!!.getString("dis")
        val arr = bundle!!.getIntegerArrayList("arr")

        var adapter : PagerAdapter = SliderAdapter(applicationContext,arr)

        imageView.adapter = adapter
        name.text = name_key
        descrip.text = discri
    }
}
