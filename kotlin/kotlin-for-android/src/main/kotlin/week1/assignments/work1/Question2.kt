package week1.assignments.work1

/**
 * Given the following
 * x = 3
 * x+y = 7
 * x+y+z = 12
 * find y and z
 * a-multiply x and y
 */
fun main(){
    val x = 3

    // using change of subject, x+y=7 thus y = 7 - x
    val y = 7 - x

    // if x+y+z = 12, then z = 12 -x-y
    val z = 12 - (x+y)

    println("y is $y and z is $z") // print the value of y and z

    println("$x * $y = ${x*y}")  // result of multiplying x and y
}