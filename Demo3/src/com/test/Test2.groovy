package com.test
/**
 * groovy
 */
class Test2 {
    static void main(String[] args) {
//        test()
//        c1('000000000')
        test1(closure(100,'200'))
    }

    static def test() {
        closure(100, "renyugang")
        test.call(100, 200)
        def c = ryg(100, 200)
        println c
    }
    /**
     * 定义闭包
     */
    static def closure = { int a, String b ->
        println "a=${a}, b=${b}, I am a closure!"
    }

// 这里省略了闭包的参数类型
    static def test = { a, b ->
        println "a=${a}, b=${b}, I am a closure!"
    }

    static def ryg = { a, b ->
        a + b
    }

    static def c1={
        println it
    }

  static   test1(Closure closure1){
        println(closure1)
    }


}
