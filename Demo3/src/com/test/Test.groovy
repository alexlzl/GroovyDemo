package com.test

class Test {
    static def age = 100
    static def sex = 'man'
    def s = "str"
    static String name = "alex"

    static void main(String[] args) {
        age = 'alex'
//        for(int i=0;i<4;i++){
//            println(i)
//        }
//         for(i in 0..10){
//             println("=="+i+"==")
//         }
//
//         0.upto(5){
//             println("----$it---")
//         }

//         println("svn help".execute().text)
          println(sex.charAt(0))
        test(age)

    }

    static def test(str) {
        println(str?.reverse())
    }
}
