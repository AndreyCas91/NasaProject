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
import androidx.appcompat.app.AppCompatActivity
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
        binding.button.setOnClickListener {
            isDirectionRight = !isDirectionRight
            val params = binding.button.layoutParams as FrameLayout.LayoutParams
            params.gravity =if(isDirectionRight){
                 Gravity.BOTTOM or Gravity.END
            }else{
                Gravity.TOP or Gravity.START
            }
            val transition = ChangeBounds()
            val path = ArcMotion()
            transition.setPathMotion(path)
            transition.duration = 3000
            TransitionManager.beginDelayedTransition(binding.transitionsContainer,transition)

            binding.button.layoutParams = params
        }
    }

}