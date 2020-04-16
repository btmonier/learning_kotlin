//-------------------------------------------------------------------
// Description: LESSON 3 - Function parameters
// Author:      Brandon Monier
// Created:     2020-04-15
//-------------------------------------------------------------------

// Function example from LESSON 2
fun sayHello(greeting: String, itemsToGreet: List<String>) {
    itemsToGreet.forEach { i ->
        println("$greeting $i")
    }
}

// vararg function parameter
fun sayHello2(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { i ->
        println("$greeting $i")
    }
}

// Provide default parameters
fun greetPerson(greeting: String = "Hello", name: String = "Brandon") {
    println("$greeting $name")
}

fun main() {
    val interestingThings = listOf("Pizza", "Tacos", "Burgers")
    sayHello("Hello,", interestingThings)

    // What if we wanted to pass NULL non variables?
    //   sayHello("Hello, ", listOf())
    // We can also use vararg for blank parameters
    println("--- --- ---")
    sayHello2("Hello,", "Kotlin", "Programming", "R", "Python")

    // Pass an array via varargs
    println("--- --- ---")
    val intThings2 = arrayOf("Pizza", "Tacos", "Burgers")
    sayHello2("Hello", *intThings2)

    // Pass parameter values in unorthodox order
    println("--- --- ---")
    greetPerson(name = "Brandon")
    greetPerson() // same as above

    // If you specify one parameter, you must specify ALL parameters
    println("--- --- ---")
    sayHello2(greeting = "Hello,", itemsToGreet = *intThings2)
}
