package com.yazhi1992.designpatternsdemo.Factory

/**
 * Created by zengyazhi on 2017/12/18.
 *
 * 工厂的抽象
 */

interface IFactory {
    //抽象出工厂的功能
    fun createProduct(): IProduct
}
