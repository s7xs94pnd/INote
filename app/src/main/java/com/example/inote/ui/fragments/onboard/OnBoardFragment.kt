package com.example.inote.ui.fragments.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.inote.R
import com.example.inote.databinding.FragmentOnBoardBinding
import com.example.inote.ui.adapters.OnBoardAdapter


class OnBoardFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOnBoardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpListeners()
        initAdapterOnBoarding()
    }

    private fun setUpListeners() = with(binding) {

        binding.viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                //todo понять что это такое
            }
        })

        btnSkip.setOnClickListener {
            //todo implementation skip btn
        }

        btnStart.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardFragment_to_INoteFragment)
        }

        btnBack.setOnClickListener {
            //todo implementation start btn
        }
    }

    private fun initAdapterOnBoarding() {
        // инициализация адаптера в viewPager2
        binding.viewPager2.adapter = OnBoardAdapter(this)

        // инициализация tab layout библиотеки
        binding.dotsIndicator.attachTo(binding.viewPager2)
    }
}