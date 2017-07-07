/**
 * kotlin支持可变参数
 * Created by hannahxian on 2017/7/7.
 */

fun test (vararg item:Int){
    item.forEach { println(it) }
}

fun rang( a : Int = 100, b:String){

}

//自定义扩展方法
inline fun String.show(){
    println(this)
}
//自定义扩展属性
val String.lastChar: Char
    get() = get(length-1)

fun main(args: Array<String>) {
    val list = listOf(1,2,4,5)

    //参数默认值
    rang(b = "c");

    list.forEach { println(it) }

    var s = "sfffsdsd";
    s.show();
    println(s.lastChar)

    //to 是中缀调用
    var map = mapOf(1 to "a",2 to "b","c" to 3)

    //我们自己写的中缀调用
    var pair = 1 with "test"

    var (key,value) = pair

    map.forEach { println("key = ${it.key} value = ${it.value}") }

    var complite = "com.android.support.containt:containt-layout:1.0.2"

    //析构
    var (group,name,version) = complite.split(":")

    println("group = ${group}  name = ${name} version = ${version}")
}

infix fun <A, B> A.with(that: B): Pair<A, B> = Pair(this, that)