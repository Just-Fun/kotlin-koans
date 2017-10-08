class MyOwnTests()

fun main(args: Array<String>) {
    someFunction()
}

fun someFunction() {
    val listWithNulls: List<String?> = listOf("A", null)
    for (item in listWithNulls) {
//        item?.let { println(it) } // prints A and ignores null
        println(item)  // prints A and null
    }
}