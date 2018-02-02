package com.murathm.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.text.ParseException


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var numadd:String=""
    var cavab=""
    var num1:Int=0
    var num2=0
    var hesab=0
    var emeliyyat=""

    fun reqem(v: View) {
        number.text=""
        val b = v as Button
        val buttonText = b.text.toString()

        numadd += buttonText
        number.text = numadd
    }

    fun topla(v: View){
        emeliyyat="+"
        num1=number.text.toString().toInt()
      cavab=number.text.toString()+ "+"
        cavabtext.text=cavab
        number.text=""
        numadd=""
    }

    fun cix(v: View){
        emeliyyat="-"
        num1=number.text.toString().toInt()
        cavab=number.text.toString()+ "-"
        cavabtext.text=cavab
        number.text=""
        numadd=""
    }

    fun vur(v: View){
        emeliyyat="*"
        num1=number.text.toString().toInt()
        cavab=number.text.toString()+ "*"
        cavabtext.text=cavab
        number.text=""
        numadd=""
    }

    fun bol(v: View){
        emeliyyat="/"
        num1=number.text.toString().toInt()
        cavab=number.text.toString()+ "/"
        cavabtext.text=cavab
        number.text=""
        numadd=""
    }

    fun beraber(v: View){
        num2=number.text.toString().toInt()
        cavab+=number.text
        cavabtext.text=cavab

        if (emeliyyat=="+"){
            hesab= num1+num2
        }else if (emeliyyat=="-"){
            hesab= num1-num2
        }else if(emeliyyat=="*"){
            hesab= num1*num2
        }else if(emeliyyat=="/"){
            hesab= num1/num2
        }

        number.text=hesab.toString()

        numadd=""
        cavab=""
        num1=0
        num2=0
        hesab=0

    }

    fun sil(v: View){
        numadd=""
        cavab=""
        num1=0
        num2=0
        hesab=0
        cavabtext.text=""
        number.text=""
    }


}
