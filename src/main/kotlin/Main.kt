fun main(args: Array<String>) {
    println("Hello World!")
    println("Try to log some result:"+testFun(0).toString())
    println(testVariableArgs(1,2,3,4,5).toString()+","+testString())
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun testFun(a:Int):Int {
    return a + 1
}

fun testVariableArgs(vararg vs:Int):Int{
    for (v in vs){
        print("$v,")
    }
    return vs.size
}

fun testString() {
    for(char in "It's OK to get char by index,like this:"){
        print(char)
    }
    println("Test String"[3])
}