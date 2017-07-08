/**
 * Created by 王成达 on 2017/7/8.
 */
//接口，抽象类
//嵌套类，内部类 object与伴生对象
//访问控制

//interface
interface OnClick{
    val name:String
    fun click()
    fun test(){
        println("onclick test")
    }
}

interface OnClickListner{
    fun click()
    fun test(){

    }
}

open class Button(override val name: String) :OnClick,OnClickListner{
    override fun test() {
        super<OnClick>.test()
    }

    override fun click() {

    }

    open fun show(){

    }

}

abstract class Per{
    abstract fun test();
}

class Man: Per() {
    override fun test() {

    }

}

class B2(override val name: String) : Button(name){
    override fun click() {
        super.click()
    }

    //需要在父类的定义中添加open关键字，不然子类中无法重写
    override fun show() {
        super.show()
    }
}