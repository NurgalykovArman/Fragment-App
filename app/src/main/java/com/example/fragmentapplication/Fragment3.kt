package com.example.fragmentapplication

import android.graphics.Color

import androidx.fragment.app.Fragment


class Fragment3 : Fragment(R.layout.fragment_3) {
    private var backgroundColor: Int = Color.YELLOW

    fun changeBackgroundColor(color: Int) {
        backgroundColor = color
        view?.setBackgroundColor(color)
    }
    fun getBackgroundColor(): Int {
        return backgroundColor
    }
}