package com.example.fragmentapplication



import android.graphics.Color
import androidx.fragment.app.Fragment


class Fragment2 : Fragment(R.layout.fragment_2) {
    private var backgroundColor: Int = Color.GREEN

    fun changeBackgroundColor(color: Int) {
        backgroundColor = color
        view?.setBackgroundColor(color)
    }
    fun getBackgroundColor(): Int {
        return backgroundColor
    }

}