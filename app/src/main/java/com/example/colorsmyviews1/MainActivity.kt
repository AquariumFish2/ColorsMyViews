package com.example.colorsmyviews1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.colorsmyviews1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding =DataBindingUtil.setContentView(this,R.layout.activity_main)
        setClickable()
    }

    private fun setClickable() {
        binding.apply {
            val clickableViews:List<View> = listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText,coreWidget,redButton,greenButton,yellowButton)
            for (view in clickableViews){
               view.setOnClickListener {setViewClickListener(it)}
            }
        }
    }

    private fun setViewClickListener(view: View) {
            binding.apply {
                when(view){
                    boxOneText ->  view.setBackgroundColor(Color.RED)
                    boxTwoText -> view.setBackgroundColor(Color.BLUE)
                    boxThreeText -> view.setBackgroundColor(Color.CYAN)
                    boxFourText -> view.setBackgroundResource(android.R.color.holo_purple)
                    boxFiveText -> view.setBackgroundResource(android.R.color.darker_gray)
                    redButton -> boxThreeText.setBackgroundResource(android.R.color.holo_red_light)
                    yellowButton -> boxFourText.setBackgroundColor(Color.YELLOW)
                    greenButton -> boxFiveText.setBackgroundResource(android.R.color.holo_green_light)
                else ->view.setBackgroundResource(android.R.color.background_light)}
            }

    }

}