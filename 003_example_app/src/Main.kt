fun main() {
    var x = 1

    while (x < 3) {
        print(if (x == 1) "Yab" else "Dab")
        print("ba")
        x ++
    }
    if (x == 3) println("Do")

    x = 1
    while (x <= 10) {
        println("This is the value of x: $x")
        //Thread.sleep(50)
        x++
    }

    val x2 = arrayOf(1, "2", 3)

    val rand1 = (Math.random() * x2.size).toInt()
    println(rand1)
    println(Math.random() * x2.size)

}