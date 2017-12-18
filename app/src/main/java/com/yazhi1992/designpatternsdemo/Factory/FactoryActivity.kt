package com.yazhi1992.designpatternsdemo.Factory

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yazhi1992.designpatternsdemo.R

/**
 * 工厂方法
 */
class FactoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory)

        var factory: IFactory = ConcreteFactory()
        var product: IProduct = factory.createProduct()
        product.describe()
    }
}
