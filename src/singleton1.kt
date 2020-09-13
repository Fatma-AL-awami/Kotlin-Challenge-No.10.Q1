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
    println("//////////////////class A/////////////////")
    singltone.printName();
    singltone.name="kk"
    var a=A()
  println("//////////////////class C/////////////////")
    var c=C()
    // a=A.name
    C.nameC="kotlin Tatorial"
    C.printNameC()
    println("//////////////////class B/////////////////")
    var b=B();
}

























