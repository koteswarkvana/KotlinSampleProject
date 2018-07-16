package com.koti.apple.kotlinsampleproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val namesList = arrayListOf("Suresh", "Ramesh", "Hari","Koti")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name_tv.setText("Hi Kotlin User >>>> ")
        change_text_bt.setOnClickListener {
            println("text button clicked >>> ")
            // randomly getting the name value
            /*val random = Random()
            val randomName = random.nextInt(namesList.count())
            name_tv.text = namesList[randomName]*/

            /// Adding names from edit text when button clicked .
            val nameEt = etr_name_et.text.toString()
            namesList.add(nameEt)
            etr_name_et.text.clear()
            name_tv.text = nameEt
            println(namesList)
            ///
        }
    }
}
