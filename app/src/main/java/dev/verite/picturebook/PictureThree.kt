package dev.verite.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureThree : AppCompatActivity() {
    lateinit var btnNextTwo: Button
    lateinit var btnBackOne: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_three)
        btnNextTwo = findViewById(R.id.btnNextTwo)
        btnNextTwo.setOnClickListener {
            var intent = Intent(this, PictureFour::class.java)
            startActivity(intent)
        }
        btnBackOne = findViewById(R.id.btnBackOne)
        btnBackOne.setOnClickListener {
            var intent = Intent(this, PictureTwo::class.java)
            startActivity(intent)
        }
    }
}