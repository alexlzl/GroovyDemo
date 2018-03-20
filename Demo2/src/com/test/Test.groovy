package com.test

/**
 * Created by liuzhouliang on 2018/3/20.
 */
class Test {

    static void main(def args) {
        def a=100;
        def b='alex==='
        //单引号，双引号，三引号，输出内容不一样
//        def c='a+b==${a}${b}'//单引号原样输出
        def c="a+b==${a}${b}"//可以输出占位符内容
        println(c)
    }
}
