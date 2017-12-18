package com.yazhi1992.kotlindemo.Decorator_Pattern

/**
 * Created by zengyazhi on 17/5/23.
 */
public abstract class PersonCloth(var mPerson:Person) : Person() {

    //持有一个Person类的引用
    override fun dress() {
        mPerson.dress()
    }
}