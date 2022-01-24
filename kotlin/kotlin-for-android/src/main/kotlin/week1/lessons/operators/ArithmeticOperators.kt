package week1.lessons.operators

fun main(args: Array<String>){
    /**
     * Arithmetic Operators in Kotlin
     *
     * + for addition
     * - for subtraction
     * * for multiplication
     * / for division
     * % for modulus (return the remainder)
     */

    val x = 30
    val y = 5
    // Using the operators
    println("Using the arithmetic operators")
    println("$x + $y = ${x+y}")
    println("$x - $y = ${x-y}")
    println("$x * $y = ${x*y}")
    println("$x / $y = ${x/y}")
    println("$x % $y = ${x%y}")

    // Actual Kotlin Implementation
    println("\nHow kotlin works under the hood")
    println("$x + $y = x.plus(y) = ${x.plus(y)}")
    println("$x - $y = x.minus(y) = ${x.minus(y)}")
    println("$x * $y = x.times(y) = ${x.times(y)}")
    println("$x / $y = x.div(y) = ${x.div(y)}")
    println("$x % $y = x.rem(y) = ${x.rem(y)}")

}