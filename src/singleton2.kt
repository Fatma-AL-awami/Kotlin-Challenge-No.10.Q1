class B{
    init {
        println("class init method .singleton namae proberty ")

    }

    object singltone{
        init {
            println("singltone class invoked")
        }
        var nameB= "kotlinObjectB";
        fun printNameB(){
            println("$nameB") }
    }
}


