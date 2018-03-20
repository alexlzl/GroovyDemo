package com.test

/**
 * Created by liuzhouliang on 2018/3/20.
 */
class Test5 {
    /**
     * 闭包是用{符号括起来的代码块，它可以被单独运行或调用，也可以被命名。类似‘匿名类’或内联函数的概念。
     闭包中最常见的应用是对集合进行迭代，下面定义了3个闭包对map进行了迭代：
     * @param args
     */
    static void main(def args) {
        def map = ['name': 'john', 'age': 14, 'sex': 'boy']
        map.each({ key, value ->    //key,value两个参数用于接受每个元素的键/值
            println "$key:$value"
        })
        map.each { println it }     //it是一个关键字，代表map集合的每个元素
        map.each({ println it.getKey() + "-->" + it.getValue() })
        //调用闭包
        say('groovy')
        say.call('groovy&grails')
    }

    //定义闭包 闭包名say  除了用于迭代之外，闭包也可以单独定义
    def static say = { word ->
        println "Hi,$word!"
    }
}
