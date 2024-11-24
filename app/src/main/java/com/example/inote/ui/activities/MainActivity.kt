package com.example.inote.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.inote.R
import com.example.inote.ui.App
import com.example.inote.ui.utils.AppSittings

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpNavigation()
    }

    private fun setUpNavigation() {
        // TODO: понять что тут происходит 
        val appSittings = AppSittings()
        appSittings.helper(this)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostContainer) as NavHostFragment
        val navController = navHostFragment.navController
        val navGraph = navController.navInflater.inflate(R.navigation.nav_graph)
        navGraph.setStartDestination(
            if (appSittings.isOnBoardShown){
              R.id.INoteFragment
            }
            else{
                R.id.OnBoardFragment
            }
        )
        navController.graph = navGraph
    }
}