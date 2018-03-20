package com.test

/**
 * Created by liuzhouliang on 2018/3/20.
 */
class Test5 {

    static void main(def args){
        def map=['name':'john','age':14,'sex':'boy']
        map.each({key,value->    //key,value两个参数用于接受每个元素的键/值
            println "$key:$value"})
        map.each{println it}     //it是一个关键字，代表map集合的每个元素
        map.each({ println it.getKey()+"-->"+it.getValue()})
        say('groovy')
        say.call('groovy&grails')
    }


    def static say={word->
        println "Hi,$word!"
    }
}
