class C{
    init {
        println("class init method")
    }
    object  singletonA
    {
        init {
            println("singltoneA class invoked")
            var nameC= "kotlinObjectC"
            fun printNameC(){
                println("$nameC") }
        }
        }

    companion object  singletonB{
        var nameC= "kotlinObjectB"
        init {
            println("singltone B class invoked")
        }

        fun printNameC(){
            println("$nameC") }
    }
}

