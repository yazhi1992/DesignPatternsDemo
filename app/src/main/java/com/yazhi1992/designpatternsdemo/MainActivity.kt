package com.yazhi1992.designpatternsdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yazhi1992.kotlindemo.Decorator_Pattern.Boy
import com.yazhi1992.kotlindemo.Decorator_Pattern.RichPerson

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*装饰者模式*/

        //首先有个男孩，有最基本的穿着
        val boy = Boy()
        //男孩可以是有钱人
        val richPerson = RichPerson(boy)
        richPerson.dress()
    }
}
