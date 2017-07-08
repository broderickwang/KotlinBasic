/**
 * Created by 王成达 on 2017/7/8.
 */

class AlertDialog{

    val str = "111"

    //嵌套类，没有AlertDialog的引用，拿不到str
    class Builder{
//        str
    }

    //添加inner关键字，才可以拿到
    inner class Inner{
        fun test(){
            println(str.substring(1))
        }
    }

    //伴生类 可以指定名字，也可以不知道，不指定，默认的名字是Companion
    companion object {
        fun show(){
            println("alertdialog show")
        }
    }
}
//kotlin没有static object相当于java中的static
object Dialog{
    fun show(){
        println("dialog show")
    }
}

interface A{
    fun click()
}

fun main(args: Array<String>) {
    Dialog.show()

    //调用伴生类
    AlertDialog.show()

    //匿名内部类 ,实现抽象类，需要加上object
    var person = object : Per(){
        override fun test(){
            println("person per test")
        }
    }


}
//kotlin的作用域基本与java一样
/*
* public 默认，所有地方可见
* private 类内部，同文件中可见
* protected 子类内部可见
* 没有default
* internal 模块内可见
* */

private class P1{

}

private class P2{
    constructor(){
        P1()
    }
}

