package com.gb.material_1507_1544_3_1.view.picture

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gb.material_1507_1544_3_1.view.constraint.ConstraintFragment
import com.gb.material_1507_1544_3_1.view.constraint.CoordinatorFragment
import com.gb.material_1507_1544_3_1.view.constraint.MotionFragment
import com.gb.material_1507_1555_3_1.R
import com.gb.material_1507_1555_3_1.databinding.BottomNavigationLayoutBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomNavigationDrawerFragment : BottomSheetDialogFragment() {

    private var _binding: BottomNavigationLayoutBinding? = null
    val binding: BottomNavigationLayoutBinding
        get() {
            return _binding!!
        }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.navigationView.setNavigationItemSelectedListener { menuItem ->

            when (menuItem.itemId) {
                R.id.navigation_one -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.container, ConstraintFragment.newInstance()).addToBackStack("").commit()
                }
                R.id.navigation_two -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.container, CoordinatorFragment.newInstance()).addToBackStack("").commit()
                }
                R.id.navigation_third -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.container, MotionFragment.newInstance()).addToBackStack("").commit()
                }
            }
            dismiss()
            true
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomNavigationLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }


}