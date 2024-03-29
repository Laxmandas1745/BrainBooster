package com.example.brainbooster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dp.startAnimation(AnimationUtils.loadAnimation(this,R.anim.zoom_in))
        Handler().postDelayed({
            dp.visibility= View.GONE
            startActivity(Intent(this,newAct::class.java))
            finish()
        },3500
        )}
}
