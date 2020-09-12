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
    singltone.printName();
    singltone.name="kk"
    var a=A()
}