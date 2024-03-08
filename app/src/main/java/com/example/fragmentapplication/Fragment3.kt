package com.example.fragmentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Fragment3 : Fragment(R.layout.fragment_3) {

    fun changeColor(color: Int) {
        view?.setBackgroundColor(color)
    }
    companion object{
        const val TAG = "Fragment_3"
    }

}