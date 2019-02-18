package com.test
/**
 * 在Groovy中，很多东西都是可以省略的，比如
 *
 * 语句后面的分号是可以省略的
 * 变量的类型和方法的返回值也是可以省略的
 * 方法调用时，括号也是可以省略的
 * 甚至语句中的return都是可以省略的
 *
 * 在Groovy中，类型是弱化的，所有的类型都可以动态推断，但是Groovy仍然是强类型的语言，类型不匹配仍然会报错；
 * 在Groovy中很多东西都可以省略，所以寻找一种自己喜欢的写法；
 * Groovy中的注释和Java中相同。
 */
class Test1 {
    static def list = ['alex', "name", 'jim', 100]

    static void main(String[] args) {
//        println(list[3])
//        println(['alex', "name", 'jim', 100][0])
//        println test1()
        println hello('ttttttt')
    }

    static def test1() {
        println "test"
        1
    }

    // 方法省略参数类型
    static hello(msg) {
        println msg
        return 1 // 这个return不能省略
        println "done"
    }
}
