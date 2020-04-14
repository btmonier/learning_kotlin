//-------------------------------------------------------------------
// Description: LESSON 2 - Functions, Arrays, Lists, and Maps
// Author:      Brandon Monier
// Created:     2020-04-14
//-------------------------------------------------------------------

// Functions are somewhat similar to how you would make functions
//   in R. The major difference is that you have to define a
//   data type on return (i.e. return type) . See example:
fun getGreeting(): String {
    return "Hello, Kotlin"
}

// unit in Kotlin is the absence of any useful type
fun sayHello(): Unit {
    println(getGreeting())
}

// single expression function example
fun getGreeting2(): String = "Hello, Kotlin"

// define function parameters
fun sayHello2(greeting: String, itemToGreet: String) {
    println("$greeting $itemToGreet") // a string template - similar to BASH
}

// a function with arrays
fun sayHelloArray(greeting: String, itemsToGreet: List<String>) {
    itemsToGreet.forEach { i ->
        println("$greeting $i")
    }
}



fun adder(valA: Int, valB: Int): Int {
    return valA + valB
}




fun main() {
    // println(getGreeting())
    // println(getGreeting2())
    // var addedResults = adder(3, 4)
    // println(addedResults)
    sayHello2("What is going on,", "Brandon")

    // Arrays
    val interestingThings = arrayOf("Enchiladas", "Hot Dogs", "Pizza")
    println(interestingThings.size)
    println(interestingThings.get(0))
    println(interestingThings[0])
    println("--- --- ---")

    //// Iteration
    for (i in interestingThings) {
        println(i) // print each element in array
    }

    println("--- --- --- for each")
    //// Iteration... but more functional...
    interestingThings.forEach {
        //// "Lambda syntax" e.g. it ->
        println(it) // "it" is the default name that is passed in the lambda function
    }
    println("--- --- --- for each (indexed)")
    interestingThings.forEachIndexed { index, s ->
        println("$s is at index: $index ...")
    }

    // Lists
    println("--- --- --- Lists")
    val interestingThings2 = listOf("Dog", "Cat", "Bird")
    interestingThings2.forEach { i ->
        println(i)
    }

    // Maps
    println("--- --- --- Maps")
    val map = mapOf(1 to "chrom_1", 2 to "chrom_2", 3 to "chrom_3")
    map.forEach{key, value -> println("$key -> $value")}
    //// NOTE: the map above is a immutable map. What if we want to add more stuff?

    // Mutable maps and lists
    println("--- --- --- mutable maps and lists")
    val mutList = mutableListOf("chrom_1", "chrom_2", "chrom_3")
    mutList.add("chrom_4")
    val mutMap = mutableMapOf(1 to "chrom_1", 2 to "chrom_2")
    mutMap.put(3, "chrom_3")
    println(mutMap.size)

    // Array-based functions
    println("--- --- --- array-based functions")
    sayHelloArray("Hello,", mutList)





}