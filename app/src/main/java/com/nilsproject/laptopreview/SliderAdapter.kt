package com.nilsproject.laptopreview

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout

class SliderAdapter : PagerAdapter
{
    var context : Context
    var images : ArrayList<Int>
    lateinit var layout : LayoutInflater

    constructor(context : Context,images : ArrayList<Int>) : super()
    {
        this.context = context
        this.images = images
    }

    override fun isViewFromObject(p0: View, p1: Any): Boolean = p0 == `p1` as RelativeLayout

    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var image : ImageView
        
        layout = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var view : View = layout.inflate(R.layout.custom_slider,container,false)
        image = view.findViewById(R.id.slider_images)
        image.setBackgroundResource(images[position])
        container!!.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        container!!.removeView(`object` as RelativeLayout)

    }


}