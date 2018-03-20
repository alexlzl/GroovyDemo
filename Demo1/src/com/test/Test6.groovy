package com.test

/**
 * Created by liuzhouliang on 2018/3/20.
 */
class Test6 {
    static void main(def args) {
        Person person = new Person()
        person.setName("alex")
        person.setAge("30")
        //Groovy中方法调用可以省略()号（构造函数除外）
        person.setSex "man"
        println(person.toString())
        //不在需要程序员声明任何构造函数，因为groovy自动提供了足够你使用的构造函数。不用担心构造函数不够多，因为实际上只需要两个构造函数（1个不带参数的默认构造函数，1个只带一个map参数的构造函数—由于是map类型，通过这个参数你可以在构造对象时任意初始化它的成员变量）。
        Person person1 = new Person(["name": "jim", "age": 30, "sex": "man==="])
        println person1
    }
}
