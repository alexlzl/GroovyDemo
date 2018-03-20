package com.test

/**
 * Created by liuzhouliang on 2018/3/20.
 */
class Test4 {

//    static void main(def args){
//        def  var="hello "+
//                "world"+
//                ",groovy!"
//
//
//    }
    def var = "hello " +
            "world" +
            ",groovy!"

    def repeat(val) {
        for (int i = 0; i < 5; i++) {
            println val
            //除了标准的java.lang.String以外（用’号括住），groovy还支持Gstring字符串类型（用“号括住）
            println "This is ${i}:${val}"
        }
    }

    def repeat1(val, repeat = 3) {
        for (i in 0..<repeat) {
            println "This is ${i}:${val}"
        }
    }


    def test() {
        //集合定义
        def collect = ["a", "b", "c"]
        collect.add(1);
        collect << "come on";
        collect[collect.size()] = 100.0
        // groovy支持负索引： 索引其倒数第1个元素
        println collect[-1]

        collect = collect + 5        //在集合中添加元素5
        println collect[collect.size() - 1]
        collect = collect - 'a'         //在集合中减去元素a(第1个)
        println collect[0]          //现在第1个元素变成b了

//        同样地，你可以往集合中添加另一个集合或删除一个集合：
        collect = collect - collect[0..4]   //把集合中的前5个元素去掉
        println collect[0]   //现在集合中仅有一个元素，即原来的最后一个元素
        println collect[-1]  //也可以用负索引，证明最后一个元素就是第一个元素

        //Map是“键-值”对的集合，在groovy中，键不一定是String，可以是任何对象(实际上Groovy中的Map就是java.util.Linke dHashMap)。
        如此可以定义一个Map:
        def map = ['name': 'john', 'age': 14, 'sex': 'boy']
        def map1 = ["name": "value", "age": 13, "sex": body]
//        添加项：
        map = map + ['weight': 25]       //添加john的体重
        map.put('length', 1.27)      //添加john的身高
        map.father = 'Keller'         //添加john的父亲
//        可以用两种方式检索值：
        println map['father']       //通过key作为下标索引
        println map.length          //通过key作为成员名索引
    }

    static void main(def args) {
    }
}
