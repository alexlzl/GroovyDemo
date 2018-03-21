package com.test

/**
 * Created by liuzhouliang on 2018/3/21.
 */
class Test2 {
    static void main(def args) {
        def str = "name"
        PersonBean personBean = new PersonBean()
        /**
         * 在Groovy中，当对同一个对象进行操作时，可以使用with，比如：
         */
        personBean.with {
            name = "alex"
            age = 100
            sex = "man"
            test()
        }

        println personBean.toString()
        /**
         * 在Groovy中，判断是否为真可以更简洁：
         */
        if (str) {
            println("================")
        }
        if (str != null && str.length() > 0) {
            println("11111================")
        }

        /**
         * 三元表达式更加简洁===============
         */
        def name
        def result = name != null ? name : "Unknown"
        println(result)
        // 省略了name
        name = "test"
        def result1 = name ?: "Unknown"
        println result1

        check(name)
        test1()
        test2()
    }
    /**
     * 在Groovy中，可以使用assert来设置断言，当断言的条件为false时，程序将会抛出异常：
     * @param name
     */
    static def check(String name) {
        // name non-null and non-empty according to Gro    ovy Truth
        assert name
        // safe navigation + Groovy Truth to check
        assert name?.size() > 3
    }

    /**
     * switch测试=========在Groovy中，switch方法变得更加灵活，可以同时支持更多的参数类型：
     */

    static def test1() {
        def x = 1.23
        def result = ""
        switch (x) {
            case "foo": result = "found foo"
        // lets fall through
            case "bar":
                result += "bar"
            case [4, 5, 6, 'inList']:
                result = "list"
                break
            case 12..30:
                result = "range"
                break
            case Integer:
                result = "integer"
                break
            case Number:
                result = "number"
                break
            case { it > 3 }:
                result = "number > 3"
                break
            default: result = "default"
        }
        assert result == "number"
    }

    /**
     * 对象比较=====在Groovy中，==相当于Java的equals，，如果需要比较对个对象是否是同一个，需要使用.is()。
     */
    static def test2() {
        Object a = new Object()
        Object b = new Object()
        assert !a.is(b)
        assert a == b

    }
}
