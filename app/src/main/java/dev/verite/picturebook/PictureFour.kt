package dev.verite.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureFour : AppCompatActivity() {
    lateinit var btnNextThree: Button
    lateinit var btnBackTwo: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_four)
        btnNextThree = findViewById(R.id.btnNextThree)
        btnNextThree.setOnClickListener {
            var intent = Intent(this, PictureFive::class.java)
            startActivity(intent)
        }
        btnBackTwo = findViewById(R.id.btnBackTwo)
        btnBackTwo.setOnClickListener {
            var intent = Intent(this, PictureThree::class.java)
            startActivity(intent)
        }
    }
}