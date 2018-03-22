package com.test

/**
 * Created by liuzhouliang on 2018/3/22.
 */
class Test5 {
    /**
     * doTestClosure this:class com.test.Test5
     * doTestClosure owner:class com.test.Test5
     * doTestClosure delegate:do test
     * doTestClosure this:class com.test.Test5
     * doTestClosure owner:class com.test.Test5
     * doTestClosure delegate:1
     * 可以看到，在通过metaClass动态添加方法时，delegate都被动态的设置为了调用者的实例本身，如上面的"do test"字符窜，以及整数1.
     * @param args
     */
    static void main(def args) {
        String.metaClass.doTestClosure = {
            println "doTestClosure this:" + this
            println "doTestClosure owner:" + owner
            println "doTestClosure delegate:" + delegate
        }
        "do test".doTestClosure()


        Integer.metaClass.doTestClosure = {
            println "doTestClosure this:" + this
            println "doTestClosure owner:" + owner
            println "doTestClosure delegate:" + delegate
        }
        1.doTestClosure()
    }
}
