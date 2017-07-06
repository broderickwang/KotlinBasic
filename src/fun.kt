/**
 * Created by hannahxian on 2017/7/6.
 */
//顶层变量
val i = "1" // val = final
var j = "2"  //由编译器在编译的时候推断类型
fun main(args: Array<String>)  {
    var z : String = "3"
    println("i:${i}j:${j}z:${z}")
    var str : String = "i:${i}j:${j}z:${z}"
    j = "233"
    println(str)
    var p = Person(null,29)
    p.isMarried = true
    println("name is ${p.name} , ag is ${p.age} ,isMarried = ${p.isMarried}")

    Color.RED
    //kotlin中没有switch 使用when进行switch操作
    when(Color.RED){
        // case XXX: break;
        Color.BLUE -> print("11")
        Color.RED,
        Color.YELLOW -> print("22")
    }

    // if else
    when{
        1+1 == 4 -> print("omg")
        test() -> print("true")
    }
    //for循环
    var range : IntRange = 0..10;
    for (i in 0..10){
        println(i)
        if(i == 4)break
    }

    loop@ for (i in 0..4){
        if (i == 3)
            break@loop//相当于java中的goto
    }
}

fun test() = true;
//= 可以推断返回类型
fun max(x:Int,y:Int) = if(x>y) x else y

fun max2(x: Int,y: Int) = when{
    x>y ->x
    else -> y
}

class Person(val name:String?,val age:Int){
    var isMarried : Boolean = false;
    get() = true;
    set(value) {
        field = value
    }
}
//enum软关键字，只有跟在class前面才是关键字
enum class Color(val r:Int,val g:Int,val b:Int){
    RED(255,0,0),
    YELLOW(1,23,3),
    BLUE(34,55,33);//如果需要在枚举类中创建类，需要在最后的枚举相后面添加分号

    fun rgb() = r+g+b
}