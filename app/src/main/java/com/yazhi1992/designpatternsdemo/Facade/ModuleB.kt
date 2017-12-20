package com.yazhi1992.designpatternsdemo.Facade

import com.yazhi1992.kotlindemo.Utils

/**
 * Created by zengyazhi on 2017/12/19.
 */

class ModuleB {
    fun doSomeThing() {
        Utils.myLog("ModuleA doSomeThing")
    }
}