package com.test

/**
 * Created by liuzhouliang on 2018/3/20.
 * 在Groovy中，很多东西都是可以省略的，比如
 语句后面的分号是可以省略的
 变量的类型和方法的返回值也是可以省略的
 方法调用时，括号也是可以省略的
 甚至语句中的return都是可以省略的
 */
class Test1 {

    static void main(def args) {
        //通过关键字def来声明变量，同时也支持java的声明方式===================1
        def a = 100
        def b = "str"
        def c = true
        //java的声明方式
        int aa = 100
        String bb = "str"
        boolean cc = true
        testMethod()
        testMethod1("method test===")
        testMethod2("tttt")
        println("测试方法返回值==="+testMethod3())
    }

    //方法定义1=================
    static testMethod() {
        println "method test"
    }

    //方法定义2=================
    static def testMethod1(String a) {
        println(a)
        BeanTest beanTest = new BeanTest()
        beanTest.beanMethod()
    }

    //方法省略了参数类型
    static testMethod2(a) {
        println a
    }

    static def testMethod3() {
        println "hello world" // 方法调用省略括号
        1                   // 方法返回值省略return
    }

}
