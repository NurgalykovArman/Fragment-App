package com.example.fragmentapplication

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.commit
import java.util.Random


class Fragment1 : Fragment(R.layout.fragment_1) {
    private var isFragmentsChanged = false
    private var isColorChanged = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.replace_fragments_button).setOnClickListener {
            parentFragmentManager.commit {
                if (!isFragmentsChanged) {
                    replace(R.id.fragment3, Fragment2(), Fragment2.TAG)
                    replace(R.id.fragment2, Fragment3(), Fragment3.TAG)
                } else {
                    replace(R.id.fragment3, Fragment3(), Fragment3.TAG)
                    replace(R.id.fragment2, Fragment2(), Fragment2.TAG)
                }
                isFragmentsChanged  = !isFragmentsChanged
            }
        }

        view.findViewById<Button>(R.id.change_color_button).setOnClickListener {
            if (!isColorChanged) {
                (parentFragmentManager.findFragmentByTag(Fragment2.TAG) as Fragment2).view?.setBackgroundColor(Color.YELLOW)
                (parentFragmentManager.findFragmentByTag(Fragment3.TAG) as Fragment3).view?.setBackgroundColor(Color.GREEN)
            } else {
                (parentFragmentManager.findFragmentByTag(Fragment2.TAG) as Fragment2).view?.setBackgroundColor(Color.GREEN)
                (parentFragmentManager.findFragmentByTag(Fragment3.TAG) as Fragment3).view?.setBackgroundColor(Color.YELLOW)
            }
            isColorChanged = !isColorChanged
        }

    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean("isFragmentsChanged", isFragmentsChanged)
        outState.putBoolean("isColorChanged", isColorChanged)
    }


    companion object{
        const val TAG = "Fragment_1"
    }
}
