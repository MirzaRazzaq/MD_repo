package com.bangkit.getguide.onboarding.screens

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.bangkit.getguide.R
import com.bangkit.getguide.authentication.LoginActivity

class SecondScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second_screen, container, false)

        val viewPager = requireActivity().findViewById<ViewPager2>(R.id.viewPager)
        val nextButton = view.findViewById<Button>(R.id.nextButton)
        val skipButton = view.findViewById<TextView>(R.id.skip)

        skipButton.setOnClickListener {
            val intent = Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }

        nextButton.setOnClickListener {
            viewPager?.currentItem = 2
        }

        return view
    }
}