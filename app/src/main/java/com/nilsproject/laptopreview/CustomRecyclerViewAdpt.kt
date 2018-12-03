package com.nilsproject.laptopreview

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.nilsproject.laptopreview.supplier.laptops
import kotlinx.android.synthetic.main.custom_card_view.view.*

class CustomRecyclerViewAdpt(val context : Context,val Lap : List<LaptopData>) : RecyclerView.Adapter<CustomRecyclerViewAdpt.MyViewHolder>()
{
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.custom_card_view,p0,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return Lap.size
    }

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        var laptops = laptops[p1]
        p0.setData(laptops)
    }

    inner class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
    {
        var currentLaptop : LaptopData? = null
        init {
            itemView.setOnClickListener {
                Toast.makeText(context,"Selected" +currentLaptop!!.title,Toast.LENGTH_SHORT).show()

                var intent = Intent(context,Second :: class.java)
                intent.putExtra("name_key",currentLaptop!!.title)
                intent.putExtra("img_key",currentLaptop!!.img)
                intent.putExtra("dis",currentLaptop!!.discri)
                intent.putExtra("arr",currentLaptop!!.arr)
                context.startActivity(intent)
            }
        }

        fun setData(laptops : LaptopData?)
        {
            itemView.text.text = laptops!!.title
            itemView.image.setBackgroundResource(laptops.img)
            itemView.rupee.append(laptops.rs)
            itemView.rate.text = " " +laptops.org_rate
            itemView.des.text = " " +laptops.dis

            this.currentLaptop = laptops
        }
    }
}