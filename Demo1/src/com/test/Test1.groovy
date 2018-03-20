package com.test

/**
 * Created by liuzhouliang on 2018/3/19.
 */
class Test1 {
    def a = 'coffee'
    def c = {
        def b = 'tea'
        a + ' and ' + b //a refers to the variable a outside the closure,
        //and is remembered by the closure
    }
}
