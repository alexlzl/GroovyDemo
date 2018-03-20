package com.test

/**
 * Created by liuzhouliang on 2018/3/19.
 */
class Test3 {
    /**
     *
     * @param args
     */
     static void main(def args) {
        Date data=new Date()
        System.out.println(data.toString())
        String name="===="
        System.out.println(name)
        println "test"
        def v = "kkkk"
        println v.class;
        def b = 100;
        println b.class;
        def var = "hello " +
                "world" +
                ",groovy!"
        //var这个变量在程序运行中，类型在改变。一开始给它赋值String，它的类型就是String，后面给它赋值Integer，它又转变为Integer。
        println var;
        println var.class;
        var=1001
        println var.class
        //跟java一样，如果你需要把一个字符串写在多行里，可以使用+号连接字符串。代码可以这样写：
        def var1 = """hello
                   world
               groovy!"""
        println var1

//        def var2="hello "+
//                "world"+
//                ",groovy!"
//        def repeat(v){
//            for(int i = 0; i < 5; i++){
//                println v
//            }
//        }
//        repeat(var2)

    }
}
