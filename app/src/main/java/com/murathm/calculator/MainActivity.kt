package com.murathm.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var h=0
    var q=0
    var r1=0
    var r2=0
    var numAdd=""
    var num=0
    var emeliyyat=""
    val listreqem= arrayListOf<Int>()
    var text=""

    fun reqem(view:View){

      val b=view as Button
        var btext=b.text.toString()

         numAdd+=btext
        var r=numAdd

       number.text=numAdd
     }

    fun topla(view:View){
        num=numAdd.toInt()
        text+=num.toString()+"+"
        numAdd=""
        d=1
        if(emeliyyat=="*"){
            r2=num
            Emeliyyat1()
            listreqem.add(h)
        }else if(emeliyyat=="/"){
            r2=num
            Emeliyyat1()
            listreqem.add(q)
        }

        cavabtext.text=text
        Emeliyyat1()
        emeliyyat="+"
        r1=h
    }

    var d=1
    fun vur(v:View){
        num=numAdd.toInt()
        text+=num.toString()+"*"
        numAdd=""
        d++
        emeliyyat="*"
        if(emeliyyat=="*"){
            if (d>=3){
                r2=num
                Emeliyyat1()

            }
            r1=num

            cavabtext.text=text
        }

    }

    fun bol(v:View){
        num=numAdd.toInt()
        text+=num.toString()+"/"
        numAdd=""
        d++
        emeliyyat="/"
        if(emeliyyat=="/"){
            if (d==3){
                r2=num
                Emeliyyat1()
                d=1
            }
            r1=num

            cavabtext.text=text
        }
    }

    fun beraber(v:View){
        num=numAdd.toInt()
        text+=num.toString()+"="
        numAdd=""
        if(emeliyyat=="*"){
            r2=num
            Emeliyyat1()

            listreqem.add(h)
        }else if(emeliyyat=="/"){
            r2=num
            Emeliyyat1()

            listreqem.add(q)
        }else if(emeliyyat=="+"){
            listreqem.add(num)
        }
        var sum=""
        var c=0
        while (c<listreqem.count()){
            sum+=listreqem[c].toString()+"-"
            c++

        }
        number.text=sum
    Hesab()

        cavabtext.text=text

    }

    fun Hesab(){
        var sum=0
        var c=0
        while (c<listreqem.count()){
            sum+=listreqem[c]
            c++

        }
        number.text=sum.toString()
    }

    fun Emeliyyat1(){
        if(emeliyyat=="*"){
           num= r1*r2
            h=num
        }else if(emeliyyat=="/"){
            num= r1/r2
            q=num
        }else if(emeliyyat=="+"||emeliyyat==""){
            listreqem.add(num)
        }
    }


    fun sil(v: View){
        h=0
        q=0
        r1=0
        r2=0
        numAdd=""
        num=0
        emeliyyat=""
        listreqem.clear()
        text=""
        cavabtext.text=""
        number.text="0"
    }

}
