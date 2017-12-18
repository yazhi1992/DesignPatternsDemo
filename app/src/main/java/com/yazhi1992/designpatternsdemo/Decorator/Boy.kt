package com.yazhi1992.kotlindemo.Decorator_Pattern

import com.yazhi1992.kotlindemo.Utils

/**
 * Created by zengyazhi on 17/5/23.
 */
public class Boy: Person() {

    override fun dress() {
        Utils.myLog("基本穿着")
    }
}