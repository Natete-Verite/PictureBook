package dev.verite.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureTwo : AppCompatActivity() {
    lateinit var btnNextOne: Button
    lateinit var btnBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_two)
        btnNextOne = findViewById(R.id.btnNextOne)
        btnNextOne.setOnClickListener {
            var intent = Intent(this, PictureThree::class.java)
            startActivity(intent)
        }
        btnBack = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}