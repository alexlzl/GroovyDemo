package com.test

/**
 * Created by liuzhouliang on 2018/3/22.
 *
 * 实际上，闭包根据其创建的上下文不同，还可以分为静态闭包和实例闭包，在这两种情况下，this，owner和delegate的含义也是不同的。
 */
class Test4 {
    static void main(def args) {
        ClosureTest.classClosure()
        new ClosureTest().instanceClosure()
        ClosureTest.classMethodClosure()
        new ClosureTest().instanceMethodClosure()
        /**
         * 测试闭包代理
         */
        ClosureTest closureTest=new ClosureTest()
        println "before setDelegate()"
        closureTest.scriptClosure.call()
        closureTest.scriptClosure.setDelegate(new PersonBean())
        println "after setDelegate()"
        closureTest.scriptClosure.call()
    }
}
