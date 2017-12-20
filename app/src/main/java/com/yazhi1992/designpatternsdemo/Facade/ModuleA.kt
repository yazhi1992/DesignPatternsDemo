package com.yazhi1992.designpatternsdemo.Facade

import android.util.Log
import com.yazhi1992.kotlindemo.Utils

/**
 * Created by zengyazhi on 2017/12/19.
 */

class ModuleA {
    fun doSomeThing() {
        Utils.myLog("ModuleA doSomeThing")
    }
}
