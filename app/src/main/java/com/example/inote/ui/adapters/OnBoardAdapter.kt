package com.example.inote.ui.adapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.inote.ui.fragments.onboard.OnBoardViewPagerFragment

class OnBoardAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
                    //конструктор           FragmentStateAdapter — это встроенный класс в Android, который используется для управления страницами (ViewPager2) с фрагментами.
    override fun getItemCount(): Int {
        return 3 // Количество страниц
    }

    override fun createFragment(position: Int): Fragment {

        val fragment = OnBoardViewPagerFragment()     // Создаем экземпляр фрагмента
        val args = Bundle()// Создаем Bundle для передачи данных
        args.putInt("onboard", position)            // Передаем номер страницы
        fragment.arguments = args// Устанавливаем аргументы в фрагмент
        return fragment                           // Возвращаем готовый фрагмент
    }
}