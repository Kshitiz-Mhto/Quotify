package com.wisewords.quotify.ui

import android.os.Build
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.wisewords.quotify.R
import com.wisewords.quotify.databinding.FragmentLandingBinding

class LandingFragment : Fragment() {

    private lateinit var binding:FragmentLandingBinding
    private var delayedNavigation: Runnable? = null
    private val handler: Handler by lazy { Handler() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLandingBinding.inflate(inflater,container, false)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            // For API 28 and above, use postDelayed directly on the View
            delayedNavigation = Runnable {
                navigateToHomeFragment()
            }
            binding.root.postDelayed(delayedNavigation!!, 3000)
        } else {
            // For API versions less than 28, use the Handler
            delayedNavigation = Runnable {
                navigateToHomeFragment()
            }
            handler.postDelayed(delayedNavigation!!, 3000)
        }

        return binding.root
    }

    private fun navigateToHomeFragment() {
        findNavController().navigate(
            R.id.action_landingFragment_to_homeFragment
        )
    }

}