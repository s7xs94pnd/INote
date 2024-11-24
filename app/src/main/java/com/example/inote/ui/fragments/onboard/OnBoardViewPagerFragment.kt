package com.example.inote.ui.fragments.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.airbnb.lottie.LottieComposition
import com.airbnb.lottie.LottieCompositionFactory
import com.example.inote.R
import com.example.inote.databinding.FragmentOnBoardViewPagerBinding

class OnBoardViewPagerFragment : Fragment() {

    private lateinit var binding : FragmentOnBoardViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOnBoardViewPagerBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() = with(binding) {
        when(requireArguments().getInt("onboard")){
            0->{
                title1.text = "Manage your \n notes easily"
                title2.text = "A completely easy way to manage and customize \n your notes."
                lottie.setAnimation(R.raw.anim_onboard_1)
                lottie.playAnimation()
            }
            1->{
                title1.text = "Organize your \n thougts"
                title2.text = "Most beautiful note taking application."
                lottie.setAnimation(R.raw.anim_onboard_2)
                lottie.playAnimation()
            }
            2->{
                title1.text = "Create cards and \n easy styling"
                title2.text = "Making your content legible has never been \n easier."
                lottie.setAnimation(R.raw.anim_onboard_3)
                lottie.playAnimation()
            }
        }
    }

}