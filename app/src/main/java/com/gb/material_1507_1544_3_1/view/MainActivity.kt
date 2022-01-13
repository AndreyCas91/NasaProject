package com.gb.material_1507_1544_3_1.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gb.material_1507_1544_3_1.view.constraint.MotionFragment
import com.gb.material_1507_1544_3_1.R
import com.gb.material_1507_1544_3_1.view.picture.PictureOfTheDayFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
       //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        // если во время исполнения то не забываем выполнить recreate()
        setTheme(R.style.Theme_Material_1507_1544_3_1)
        setContentView(R.layout.activity_test_button)

    }

    private fun isConnecton(): Boolean {
        return true
    }

}