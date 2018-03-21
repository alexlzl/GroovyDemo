package com.test

import groovy.transform.ToString

/**
 * Created by liuzhouliang on 2018/3/21.
 */
class PersonBean {
    def name
    def age
    def sex

   String toString(){

       "name=="+name+"===age==="+age+"==sex==="+sex
    }

    def test(){
     println("test method====")
    }
}
