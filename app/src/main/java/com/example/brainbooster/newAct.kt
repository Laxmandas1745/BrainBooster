package com.example.brainbooster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_new.*

class newAct : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener= BottomNavigationView.OnNavigationItemSelectedListener { item->
        when(item.itemId){
            R.id.home ->{
                replaceFragment(BlankFragment())
                return@OnNavigationItemSelectedListener true


            }
            R.id.MIC ->{

                replaceFragment(BlankFragment2())

                return@OnNavigationItemSelectedListener true

            }
            R.id.PROFILE ->{
                replaceFragment(BlankFragment3())
                return@OnNavigationItemSelectedListener true


            }

        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        replaceFragment(BlankFragment())

        supportActionBar?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
        supportActionBar?.setCustomView(R.layout.txt_layout)
    }

    private fun replaceFragment(fragment: Fragment)
    {
       val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}
