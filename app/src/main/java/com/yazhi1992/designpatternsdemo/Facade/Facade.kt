package com.yazhi1992.designpatternsdemo.Facade

/**
 * Created by zengyazhi on 2017/12/19.
 *
 * Facade 类相当于 GUI 界面，为子系统的各个功能提供对外的接口
 */
class Facade {
    fun doSomeThing() {
        ModuleA().doSomeThing()
        ModuleB().doSomeThing()
        ModuleC().doSomeThing()
    }
}