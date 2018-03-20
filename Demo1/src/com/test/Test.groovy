package com.test

/**
 * Created by liuzhouliang on 2018/3/6.
 */
class Test {
    def listener = { e -> println "Clicked on $e.source" }
    Closure callback = { println 'Done!' }
    Closure<Boolean> isTextFile = {
        File it -> it.name.endsWith('.txt')
    }


}
