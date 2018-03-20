package com.test

import groovy.transform.ToString

/**
 * Created by liuzhouliang on 2018/3/20.
 */
class Person {
    def  name
    def age
    def sex
       String toString(){
           "$name===$age===$sex==="
       }
}
