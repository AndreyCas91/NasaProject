package com.gb.material_1507_1544_3_1.view.animations


import android.graphics.Rect
import android.media.Image
import android.os.Bundle
import android.transition.Transition
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.transition.*
import com.gb.material_1507_1544_3_1.R

import com.gb.material_1507_1544_3_1.databinding.ActivityAnimationsBinding

class AnimationsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnimationsBinding

    private var isDirectionRight= false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimationsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val titles: MutableList<String> = ArrayList()
        for (i in 0..4) {
            titles.add("Item $i")
        }


        binding.button.setOnClickListener {

            val cb = ChangeBounds()
            cb.duration= 2000
            TransitionManager.beginDelayedTransition(binding.transitionsContainer,cb)
            titles.shuffle()

            binding.transitionsContainer.removeAllViews()
            titles.forEach {
                binding.transitionsContainer.addView(TextView(this).apply {
                    text = it
                    ViewCompat.setTransitionName(this,it)
                    gravity = Gravity.CENTER_HORIZONTAL
                })
            }
        }
    }

}