package com.test

/**
 * Created by liuzhouliang on 2018/3/22.
 */
class ClosureTest {
    /**
     * This在闭包中的含义
     * 对于this来讲，它基本上保持了跟java中this一样的含义（在java的静态方法以及静态域中，this是没有任何含义的），
     * 在上面的闭包创建的4种上下文中，实际上可以了解为只有2种，一种是在普通的类中定义，如上面的Person类，
     * 一种是在groovy script中定义，实际上也是在类中定义，只不过这个是一个比较特殊的类而已（Groovy会将groovy script编译为Script.class),
     * 所以，this在闭包中的含义指的是，表示定义该闭包的类的实例对象（实例闭包）或者类本身（静态闭包）
     */
    def static classClosure = {
        println "classClosure this:" + this
        println "classClosure owner:" + owner
        println "classClosure delegate:" + delegate
    }

    def instanceClosure = {
        println "instanceClosure this:" + this
        println "instanceClosure owner:" + owner
        println "instanceClosure delegate:" + delegate
    }

    def static classMethodClosure() {
        def classMethodClosure = {
            println "classMethodClosure this:" + this
            println "classMethodClosure owner:" + owner
            println "classMethodClosure delegate:" + delegate
        }
        classMethodClosure.call()
    }

    def instanceMethodClosure() {
        def instanceMethodClosure = {
            println "instanceMethodClosure this:" + this
            println "instanceMethodClosure owner:" + owner
            println "instanceMethodClosure delegate:" + delegate
        }
        instanceMethodClosure.call()
    }

    /**
     * Delegate在闭包中的含义
     * 对于delegate来讲，它的含义大多数情况下是跟owner的含义一样，除非它被显示的修改（通过Closure.setDelegate()方法进行修改）。
     * 在上面的几种创建上下文中，可以看到，如果闭包的delegate没有被显示改动的话，那么delegate确实是同owner是一个含义。下面我们看看修改delegate的情况：
     */
    def scriptClosure = {
        println "scriptClosure this:" + this
        println "scriptClosure owner:" + owner
        println "scriptClosure delegate:" + delegate
    }

}
