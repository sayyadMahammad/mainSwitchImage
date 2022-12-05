package com.example.imageproject

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

//for vs app centre distribution
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    lateinit var image1: ImageView
    lateinit var image2: ImageView
    lateinit var press: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(  //for vs app centre distribution
            application, "bcb1d794-fa3b-49b7-adaf-ae5c570a01d3",
            Analytics::class.java, Crashes::class.java
        )

        press = findViewById(R.id.button2)
        image1 = findViewById(R.id.imageView1)
        image2 = findViewById(R.id.imageView2)
        image1.setImageResource(R.drawable.first_image)
        image2.setImageResource(R.drawable.third_image)
        var temp = true

        press.setOnClickListener {
            if (temp) {
                temp = false
                image1.setImageResource(R.drawable.third_image)
                image2.setImageResource(R.drawable.first_image)

            } else {
                temp = true
                image1.setImageResource(R.drawable.first_image)
                image2.setImageResource(R.drawable.third_image)
            }
        }
    }
}