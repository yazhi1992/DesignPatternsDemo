package com.yazhi1992.designpatternsdemo.Factory

import com.yazhi1992.kotlindemo.Utils

/**
 * Created by zengyazhi on 2017/12/18.
 *
 * 产品的实现类
 */

class ConcreteProductA : IProduct {
    override fun describe() {
        Utils.myLog("具体的产品A")
    }
}
