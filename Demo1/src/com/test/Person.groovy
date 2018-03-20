package com.test

import groovy.transform.ToString

/**
 * Created by liuzhouliang on 2018/3/20.
 */
class Person {
    //groovy的默认访问修饰符就是public，如果你的groovy类成员需要public修饰，则你根本不用写它
    def name
    def age
    def sex
    //toString 方法中并没有return 一个String，但不用担心，Groovy 默认返回方法的最后一行的值
    String toString() {
        "$name===$age===$sex==="
    }
}
