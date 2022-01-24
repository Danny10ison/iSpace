package week1.lessons.operators

fun main(){
    /**
     * Kotlin Unary Operators
     * + , - , !, ++, --
     */

    var a = 9
    var b = -4
    val isFalse = false

    //Unary plus +
    val alwaysPositive = +a
    println(alwaysPositive)

    //Unary minus -
    val changedToPositive = -(b)
    println(changedToPositive)

    // Unary Not !
    val isTrue = !isFalse
    println(isFalse)
    println(isTrue)

    // increment
    println(++a)

    // increment
    println(--b)

}
