package week1.assignments.work1

/**
 * Check whether a 8 is even or odd using if...else statement
 * then print  if it is even
 * 8 is even number
 * 8 is not even number
 */
fun main(){
    val a = 8
    // same as ternary operator in java
    var result = if(a%2 == 0) "$a is even" else "$a is not even"

    // can be
    // if(a%2 == 0){
    //     println("$a is even")
    // }
    // else{
    //     println("$a is not even")

    println(result)
}