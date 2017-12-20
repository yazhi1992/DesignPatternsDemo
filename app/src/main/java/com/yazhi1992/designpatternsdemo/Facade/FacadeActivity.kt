package com.yazhi1992.designpatternsdemo.Facade

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yazhi1992.designpatternsdemo.R

/**
 * 外观模式：外部与一个子系统的通信必须通过一个统一的外观对象进行，为子系统中的一组接口提供一个一致的界面，
 * 外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 */
class FacadeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facade)
    }

    /**
     * 不使用外观，则需要与内部模块交互
     */
    fun withinFacade() {
        ModuleA().doSomeThing()
        ModuleB().doSomeThing()
        ModuleC().doSomeThing()
    }

    /**
     * 通过Facade调用，屏蔽了外部客户端与系统内部模块的交互，且外观可以共享，实现复用
     */
    fun withFacade() {
        Facade().doSomeThing()
    }

}
