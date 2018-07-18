package com.koti.apple.kotlinsampleproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

// Here val means const variable which doesn't change.
// Here var means variable which can change.
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

            // Expressively tell the data type of variable ex:- var rawString :String ===> "Explaining the string variable."
            var rawString :String  = "I am Raw String!"
            println("Hey!!"+rawString)

            val name = "Koti"
            var isAvailable = true
            println("Hey "+name+" is available >> "+isAvailable)

            var aVal: Int = 5
            var bVal = 6
            println(" result >> "+ (aVal + bVal))

            var doubleValue: Double
            doubleValue = 33.45
            var cVal: String = aVal.toString()
            println("double value >> "+doubleValue)
            println("cVal value >> "+cVal)
            // Assign new value to variable.
            cVal = "Local Broadcast Receiver"
            println("cVal value >> "+cVal)

            ///
        }
    }
}
