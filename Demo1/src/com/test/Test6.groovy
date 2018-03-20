package com.test

/**
 * Created by liuzhouliang on 2018/3/20.
 */
class Test6 {
    static void main(def args){
        Person person=new Person()
         person.setName("alex")
        person.setAge("30")
        //Groovy中方法调用可以省略()号（构造函数除外）
        person.setSex "man"
        println(person.toString())
    }
}
