package com.gb.material_1507_1544_3_1.view.constraint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import com.gb.material_1507_1544_3_1.view.coordinator.NestedBehavior
import com.gb.material_1507_1544_3_1.databinding.FragmentCoordinatorBinding


class CoordinatorFragment : Fragment() {


    private var _binding: FragmentCoordinatorBinding? = null
    val binding: FragmentCoordinatorBinding
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
        _binding = FragmentCoordinatorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nestedBehavior= NestedBehavior()
        (binding.nested.layoutParams as CoordinatorLayout.LayoutParams).behavior = nestedBehavior
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            CoordinatorFragment()
    }
}