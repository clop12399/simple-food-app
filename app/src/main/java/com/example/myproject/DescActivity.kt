package com.example.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DescActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_IMG = "extra_img"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc)
        supportActionBar?.title = "Description"

        val name = intent.getStringExtra(EXTRA_NAME)
        val desc = intent.getStringExtra(EXTRA_DESC)
        val img = intent.getIntExtra(EXTRA_IMG, 0)

        val descName: TextView = findViewById(R.id.desc_name)
        val descDesc: TextView = findViewById(R.id.desc_desc)
        val descImage: ImageView = findViewById(R.id.desc_image)

        descName.text = name
        descDesc.text = desc
        descImage.setImageResource(img)
    }
}
