package com.test

/**
 * Created by liuzhouliang on 2018/3/22.
 */
class ClosureBean {

    /**
     * This在闭包中的含义
     * 对于this来讲，它基本上保持了跟java中this一样的含义（在java的静态方法以及静态域中，this是没有任何含义的），
     * 在上面的闭包创建的4种上下文中，实际上可以了解为只有2种，一种是在普通的类中定义，如上面的Person类，
     * 一种是在groovy script中定义，实际上也是在类中定义，只不过这个是一个比较特殊的类而已（Groovy会将groovy script编译为Script.class),
     * 所以，this在闭包中的含义指的是，表示定义该闭包的类的实例对象（实例闭包）或者类本身（静态闭包）
     */
    def static method() {
        def methodClosure = {
            /**
             * methodClosure this:class com.test.ClosureBean
             methodClosure owner:class com.test.ClosureBean
             methodClosure delegate:class com.test.ClosureBean
             */
            println "定义在方法中methodClosure this:" + this
            println "定义在方法中methodClosure owner:" + owner
            println "定义在方法中methodClosure delegate:" + delegate
        }

        methodClosure
    }

    def static classClosure = {
        println "定义在类中classClosure this:" + this
        println "定义在类中classClosure owner:" + owner
        println "定义在类中classClosure delegate:" + delegate
    }

    /**
     * 定义在闭包中closureClosure this:class com.test.ClosureBean
     * 定义在闭包中closureClosure owner:com.test.ClosureBean$__clinit__closure3@1060b431
     * 定义在闭包中closureClosure delegate:com.test.ClosureBean$__clinit__closure3@1060b431
     *
     *
     * 对于owner来讲，它的含义基本上跟this的含义一样，只是除了一种情况，如果该闭包是在其他的闭包中定义的，那么owner是指向定义它的闭包对象。 如上面最后一种创建上下文：
     */
    def static closure = {
        def closureClosure = {
            println "定义在闭包中closureClosure this:" + this
            println "定义在闭包中closureClosure owner:" + owner
            println "定义在闭包中closureClosure delegate:" + delegate
        }
        closureClosure.call()
    }

}
