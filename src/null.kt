/**
 * Created by 王成达 on 2017/7/8.
 */

fun main(args: Array<String>) {
    test(null)
}

fun test(str:String?){
    //?.是安全操作符
    str?.substring(0);

    //不安全，需要自己保证
    str!!.substring(0);
}

//本地函数
class User(val id:Int,val name:String?)

//存库 本地函数
fun User.save(){
    fun check(str: String?){
        if(str === null||str.isEmpty()){

        }
    }

    class ke{

    }

    check(name);
}