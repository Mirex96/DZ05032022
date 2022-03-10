package com.example.dz05032022


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editText3 = findViewById<EditText>(R.id.ediText3)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)




        button1.setOnClickListener() {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout1, Fragment1.create(editText1.text.toString()))
                .commitAllowingStateLoss()

        }

        button2.setOnClickListener() {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout2, Fragment2.createNew(editText1.text.toString() + editText2.text.toString()))
                .commitAllowingStateLoss()
            Handler(Looper.getMainLooper()).postDelayed({
                //Do something after 100ms
                Fragment2.createNew(editText2.text.toString() + editText1.text.toString())
            }, 100)


        }

        button3.setOnClickListener() {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout3, Fragment3.createNewAll(editText3.text.toString()))
                .commitAllowingStateLoss()

        }


    }


}


// По нажатию на первую кнопку, нужно показывать первый фрагмент,
// в который пробрасывается информация о введенных данных (фрагмент расположен слева) ++++++

// По нажатию на вторую кнопку, нужно брать информацию с первого
// текстового поля, пробрасывать его во второй фрагмент, и отображать фрагмент. +++++

// На втором фрагменте отображать эту информацию о прокинутом поле, после чего
// нужно подождать 5 секунд, и поменять первый и второй фрагмент местами.
// (Ждать можно с использовать Handler.postDelayed()))

// В третье поле можно ввести числа от 1 до 3, после нажатия на третью кнопку
// удалять соответствующий фрагмент (1, 2 или 3), и так же прятать кнопку под ним


