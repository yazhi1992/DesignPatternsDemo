package com.yazhi1992.designpatternsdemo.Factory

/**
 * Created by zengyazhi on 2017/12/18.
 *
 * 具体的工厂类
 */

class ConcreteFactory : IFactory {
    override fun createProduct(): IProduct {
        return ConcreteProductA()
    }
}
