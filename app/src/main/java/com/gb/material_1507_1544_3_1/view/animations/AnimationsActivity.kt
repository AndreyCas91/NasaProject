package com.gb.material_1507_1544_3_1.view.animations


import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.graphics.Rect
import android.media.Image
import android.os.Binder
import android.os.Bundle
import android.transition.Transition
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnticipateOvershootInterpolator
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.transition.*
import com.gb.material_1507_1544_3_1.R

import com.gb.material_1507_1544_3_1.databinding.ActivityAnimationsBinding

private const val duration = 1000L
class AnimationsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnimationsBinding
    var isExpanded = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimationsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.root.setOnClickListener {
            val constraintSetStart = ConstraintSet()
            constraintSetStart.clone(this,R.layout.activity_animations)

            val constraintSetEnd = ConstraintSet()
            constraintSetEnd.clone(this,R.layout.activity_animations_end)

            val transition = ChangeBounds()
            transition.duration = 1000
            transition.interpolator = AnticipateOvershootInterpolator(5f)
            TransitionManager.beginDelayedTransition(binding.root,transition)
            constraintSetEnd.applyTo(binding.constraintContainer)
        }

    }

}