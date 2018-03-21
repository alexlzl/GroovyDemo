package com.test

/**
 * Created by liuzhouliang on 2018/3/21.
 */
class Test2 {
    static void main(def args){
        PersonBean personBean=new PersonBean()
        /**
         * 在Groovy中，当对同一个对象进行操作时，可以使用with，比如：
         */
        personBean.with {
            name="alex"
            age=100
            sex="man"
            test()
        }

        println personBean.toString()
    }

}
