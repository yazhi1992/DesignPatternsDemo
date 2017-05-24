package com.yazhi1992.kotlindemo.Decorator_Pattern

import com.yazhi1992.kotlindemo.Utils

/**
 * Created by zengyazhi on 17/5/23.
 */
public class RichPerson(mPerson: Person) : PersonCloth(mPerson) {
    //继承PersonCloth，即持有了Boy的引用

    override fun dress() {
        super.dress()
        //在原来的基础上可任意装饰
        dressA()
        dressB()
    }

    private fun dressA() {
        Utils.myLog("穿A")
    }

    private fun dressB() {
        Utils.myLog("穿B")
    }

}