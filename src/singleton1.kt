object  singltone{
 var name= "kotlinObject"

    init {
        println("singltone class invoked")
    }

    fun printName(){
        println("$name")
    }
}

class A {
    init {
        println("class init method .singleton namae proberty :${singltone.name}")

        singltone.printName();
    }

}

fun main(){
    println("________________ class A __________________________")
    singltone.printName();
    singltone.name="kk"
    var a=A()
    println("________________ class B__________________________")
    var b=B();
    println("________________class C__________________________")
    var c=C()
    // a=A.name
    C.nameC="kotlin Tatorial"
    C.printNameC()
}

























