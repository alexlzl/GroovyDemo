package com.test

/**
 * Created by liuzhouliang on 2018/3/20.
 */
class Test6 {
    /**
     * 你可以把main方法前面的public去掉，实际上，groovy中默认的修饰符就是public，
     * 所以public修饰符你根本就不需要写，这点跟java不一样。
     * @param args
     */
    static void main(def args) {
        Date date = new Date()
        println date.toString()
        Person person = new Person()
        person.setName("alex")
        person.setAge("30")
        //Groovy中方法调用可以省略()号（构造函数除外）
        person.setSex "man"
        println(person.toString())
        //不在需要程序员声明任何构造函数，因为groovy自动提供了足够你使用的构造函数。不用担心构造函数不够多，因为实际上只需要两个构造函数（1个不带参数的默认构造函数，1个只带一个map参数的构造函数—由于是map类型，通过这个参数你可以在构造对象时任意初始化它的成员变量）。
        Person person1 = new Person(["name": "jim", "age": 30, "sex": "man==="])
        println person1
        /**
         *         ？运算符
         * 在java中，有时候为了避免出现空指针异常，我们通常需要这样的技巧：
         * if(rs!=null){rs.next()
         * … …}在groovy中，可以使用?操作符达到同样的目的：
         * rs?.next()
         */
        println person1?.getName()

        // 我们可以在调用sum时使用任意个数的参数（1个，2个，3个……）：
        println sum(1)
        println sum(1, 2)
        println sum(1, 2, 3)

        //============

        def today = Day.SATURDAY
        switch (today) {
        //Saturday or Sunday
            case [Day.SATURDAY, Day.SUNDAY]:
                println "Weekends are cool"
                break
        //a day between Monday and Friday
            case Day.MONDAY..Day.FRIDAY:
                println "Boring work day"
                break
            default:
                println "Are you sure this is a valid day?"
        }
        /**
         * 这是三目运算符“?:”的简单形式，三目运算符通常以这种形式出现：
         String displayName = name != null ? name : "Unknown";
         在groovy中，也可以简化为（因为null在groovy中可以转化为布尔值false）：
         String displayName = name ? name : "Unknown";
         基于“不重复”的原则，可以使用elvis操作符再次简化为：
         String displayName = name ?: "Unknown"
         */
        def name = true
        String displayName = name ?: "Unknown"
        println displayName

        /**
         *   动态性
         Groovy所有的对象都有一个元类metaClass，我们可以通过metaClass属性访问该元类。
         通过元类，可以为这个对象增加方法（在java中不可想象）！
         见下面的代码，msg是一个String,通过元类，
         我们为msg增加了一个String 类中所没有的方法up：
         */
        def msg = "Hello!"
        println msg.metaClass
        String.metaClass.up = { delegate.toUpperCase() }
        println msg.up()

        // 通过元类，我们还可以检索对象所拥有的方法和属性（就象反射）：
        msg.metaClass.methods.each { println it.name }
        msg.metaClass.properties.each { println it.name }
        // 甚至我们可以看到我们刚才添加的up方法。
        // 我们可以通过元类判断有没有一个叫up的方法，然后再调用它：
        if (msg.metaClass.respondsTo(msg, 'up')) {
            println msg.toUpperCase()
        }
        // 当然，也可以推断它有没有一个叫bytes的属性：
        if (msg.metaClass.hasProperty(msg, 'bytes')) {
            println msg.bytes.encodeBase64()
        }
    }
    //定义可变参数
    static int sum(int ... var) {
        def total = 0
        for (i in var)
            total += i
        return total
    }

    //定义枚举
    static enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }
}
