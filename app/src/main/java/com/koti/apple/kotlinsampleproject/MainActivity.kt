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

        strFunctions()
        var sampleStr = learnCouse("Swift and Kotlin")
        var lengthOfArea = calculateArea(18, 16)
        println(sampleStr +" is > "+lengthOfArea)
        printCourseName("andr1oid")
        introduceStringTemplate()
        introduceCollectionFramework()

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

    fun strFunctions() {
        // special characters included.
        println("Learning Kotlin \n along with Swift")
        println("Learning Kotlin \b along with Swift")
        println("Learning Kotlin \t along with Swift")
        println("Learning Kotlin \r along with Swift")
        println("Learning Kotlin \$ along with Swift")
        println("Learning Kotlin \\ along with Swift")

        var courseName = """android development using Kotlin
            |language and
            |xml
        """.trimMargin()

        var compareStr = "hi".contentEquals("hi")
        println("ccompare string is > "+compareStr)
    }

    // Here fun means function
    // : String ===> means return type string
    // courseName: String ===> parameter
    // pass parameters in this function
    fun learnCouse(courseName: String): String {
        print(courseName)
        return " Length of area " // print the output in single line because we are using the ===>  "print" statment.
    }

    // pass parameters in this function and returning the result
    fun calculateArea(length: Int, breadth: Int): Int {
        return length * breadth
    }

    // switch functionality implementing in this function
    fun printCourseName(courseName: String) {
        when (courseName) {
            "java" -> { // Remember If you want to write multiple line of code need to use the curly " {} " braces .
                print("Java language selected > \n")
                println("Java contains new versions >> ")
                var name = "Ramesh"
                println("Employee name is > " + name)
            }
            "android" -> print("Android language selected > \n")
            "swift" -> print("Swift language selected > \n")
            else -> println("no language selected > ")
        }
    }

    // Kotlin has introduced the new template ===> $ in strings instead of concatination and reduced some burden to the user
    fun introduceStringTemplate() {
        var empName: String = "Narendra"
        var age: Int = 28
        var designation: String = "Ios developer"
        println("$empName working as an $designation and his age is $age ")
        println("name has  ${designation.length}  characters ")
    }

    // Working on array and collection framework arraylist and map, ...
    fun introduceCollectionFramework() {
        // String Array
        var javaSubjects = listOf("Class and object", "Encapsulation", "Abstractions", "Inheritence", "Polymorphisam", "Interfaces", "Packages", "Exception handling", "Threads")
        println(javaSubjects.sorted())
        println(javaSubjects.get(5))
        println(javaSubjects.last())
        println(javaSubjects.contains("Inheritence"))

        // String arraylist
        var androidSubjectList = arrayListOf("Activity", "Fragments", "Broadcast", "Reciver", "Services", "Content", "providers", "Listview")
        println(androidSubjectList.add("Cardview"))
        println(androidSubjectList.add(5, "Design patterns"))
        println(androidSubjectList.size)
        println(androidSubjectList.get(5))

        // Hashmap [ For immutable ] (or) map [ For mutable ]
        var courseMap = mapOf("java" to "android", "objective-c" to "ios")
        // accessing the hash map values
        println(courseMap["java"])
        println(courseMap.get("java"))
        println(courseMap.getOrDefault("java", "name is exist"))

        // Hash map can insert values using ====> "put" method
        var courseHashMapValues = hashMapOf("java" to "android", "objective-c" to "ios")
        courseHashMapValues["java"] = "Hiebernet"
        courseHashMapValues.put("java script", "PHP")
        println(courseHashMapValues.get("java script"))
    }
}
