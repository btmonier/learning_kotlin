// top-level variables
var nullName: String? = null // null-able string example
var name: String = "Brandon"
var greeting: String = "Hello, "

// kotlin supports type inferences
var infName = "Brandon (inferred)"
//var infNullName? = null // not applicable - need setter

fun main() {
    println(greeting + name)
    println(greeting + nullName)
    println(greeting + infName)

    // control-flow (IF ELSE)
    if (nullName != null) {
        println(greeting)
    } else {
        println("This variable was NULL")
    }

    // control-flow (WHEN) - similar to switch statement in Java
    when (name) {
        null -> println("Hello")
        else -> println(greeting + name)
    }

    // control-flow with variable
    var greetingToPrint = if (nullName != null) {
        "Not null"
    } else {
        "This is null"
    }
    println(greetingToPrint)
}