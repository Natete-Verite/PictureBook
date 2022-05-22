package dev.verite.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureFive : AppCompatActivity() {
    lateinit var btnBackThree: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_five)
        btnBackThree = findViewById(R.id.btnBackThree)
        btnBackThree.setOnClickListener {
            var intent = Intent(this, PictureFour::class.java)
            startActivity(intent)
        }
    }
}