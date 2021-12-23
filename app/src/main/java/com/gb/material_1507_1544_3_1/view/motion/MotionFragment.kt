package com.gb.material_1507_1544_3_1.view.constraint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import com.gb.material_1507_1544_3_1.view.coordinator.NestedBehavior
import com.gb.material_1507_1555_3_1.databinding.BonusStartBinding
import com.gb.material_1507_1555_3_1.databinding.FragmentCoordinatorBinding


class MotionFragment : Fragment() {


    private var _binding: BonusStartBinding? = null
    val binding: BonusStartBinding
        get() {
            return _binding!!
        }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BonusStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MotionFragment()
    }
}