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
        println("测试方法返回值===" + testMethod3())
        testString()
        closure(100, "renyugang")
        closure1.call(100, 200)
        def result = closure2(100, 200)
        println result
        closure3("默认参数it");
        testList()
        testMap1()
        testMap2()
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
    //方法带返回值
    static def testMethod3() {
        println "hello world" // 方法调用省略括号
        1                   // 方法返回值省略return
    }

    static def testString() {
        def a = 1
        def b = "hello"
        //单引号，双引号，三引号，输出内容不一样
//        def c='a+b==${a}${b}'//单引号原样输出
        def c = "a+b==${a}${b}"//可以输出占位符内容
        println "测试字符串拼接=====" + c

    }

    /**
     * 闭包定义======================
     */
    //声明了参数类型
    static def closure ={ int a, String b ->
        println "a=${a}, b=${b}, I am a closure!"
    }

    // 这里省略了闭包的参数类型
    static def closure1 = { a, b ->
        println "a=${a}, b=${b}, I am a closure!"
    }

    //闭包返回参数
    static def closure2 = { a, b ->
        a + b
    }

    // 如果闭包不指定参数，那么它会有一个隐含的参数 it,这里省略了闭包的参数类型
    static def closure3 = {
        println "find ${it}, I am a closure!"
    }

   //List使用
    static def testList() {
        def emptyList = []
        def test = [100, "hello", true]
        test[1] = "world"
        println test[0]
        println test[1]
        test << 200//List还有一种看起来很奇怪的操作符<<，其实这并没有什么大不了，左移位表示向List中添加新元素的意思
        println test.size
        println test.toString()
        test.each {
            println("遍历list==="+it)
        }
    }
    //Map的使用
    static def testMap1() {
        def emptyMap = [:]
        def test = ["id": 1, "name": "renyugang", "isMale": true]
        test["id"] = 2
        test.id = 900
        println test.id
        println test.isMale
        println(test.toString())
    }

    static def testMap2(){
        def emptyMap = [:]
        def test = ["id":1, "name":"renyugang", "isMale":true]

        test.each { key, value ->
            println "two parameters, find [${key} : ${value}]"
        }

        test.each {
            println "one parameters, find [${it.key} : ${it.value}]"
        }
    }
}
