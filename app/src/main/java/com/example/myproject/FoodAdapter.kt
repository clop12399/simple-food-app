package com.example.myproject


import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class FoodAdapter(private val listFood: ArrayList<Food>): RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    class FoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var foodImage: ImageView = itemView.findViewById(R.id.food_image)
        var foodName: TextView = itemView.findViewById(R.id.food_name)
        var btnDesc: Button = itemView.findViewById(R.id.btn_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_food, parent, false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = listFood[position]

        Glide.with(holder.itemView.context)
            .load(food.image)
            .apply(RequestOptions().override(80, 80))
            .into(holder.foodImage)

        holder.foodName.text = food.name

        holder.btnDesc.setOnClickListener {
            val intent = Intent(holder.itemView.context, DescActivity::class.java)
            intent.putExtra(DescActivity.EXTRA_NAME, food.name)
            intent.putExtra(DescActivity.EXTRA_DESC, food.desc)
            intent.putExtra(DescActivity.EXTRA_IMG, food.image)
            holder.itemView.context.startActivity(intent)
        }
    }
}
