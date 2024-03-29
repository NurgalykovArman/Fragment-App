package com.example.fragmentapplication

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentapplication.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    private lateinit var binding: Fragment1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment1Binding.inflate(inflater, container, false)

        binding.changeColorButton.setOnClickListener {
            val randomColor1 = getRandomColor()
            val randomColor2 = getRandomColor()
            val mainActivity = requireActivity() as MainActivity
            mainActivity.changeFragmentColors(randomColor1, randomColor2)
        }

        binding.replaceFragmentsButton.setOnClickListener {
            val mainActivity = requireActivity() as MainActivity
            mainActivity.swapFragmentsPosition()
        }

        return binding.root

    }

    private fun getRandomColor(): Int {
        return Color.rgb((0..255).random(), (0..255).random(), (0..255).random())
    }
}