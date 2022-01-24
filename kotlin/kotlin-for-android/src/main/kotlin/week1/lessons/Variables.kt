package week1.lessons

/**
 * Variables are used to identify a memory block
 *   that may be used to store data while a program
 *     is running.
 *
 * In Kotlin variable can be:
 *   i. Mutable : >> var x = 17
 *   ii. Immutable : >> val y = 19
 *
 * Types may be declared explicitly or inferred
 */

fun main(args: Array<String>){  // Why this
    /**
     * Mutable Variables
     *
     * User var keyword to show mutability of a variable
     *
     * var x = 12
     * x = 30
     */

    var anyMutableValueYouHave = 100
    println("Before changing, anyMutableValueYouHave = $anyMutableValueYouHave")

    anyMutableValueYouHave = 99
    println("Now anyMutableValueYouHave = $anyMutableValueYouHave")
    // Use var keyword if you want the value of the variable to be changed

    /**
     * Immutable Variable
     *
     * The val keyword indicates immutability
     *
     * val valueOfPi = 3.142
     */

    val constantValueYouHave = 34
    println("Before changing, constantValueYouHave = $constantValueYouHave")

   // constantValueYouHave = 29  // reassigning a val variable raises an error
    /* val cannot be reassigned*/

    /**
     * Implicit type declaration
     *
     * In the above, the types are inferred, meaning, types are
     *   resolved at compile time (values have default types)
     */

    var x = 9      // type Int
    var y = 1.2    // type Double
    var ch = 'a'   // type Char
    var str = "a"  // type String
    var bool = true // type Boolean

    // Checking the type of variable using ::class.simpleName
    println("x = $x, this is type ${x::class.simpleName}")  // check type of x
    println("y = $y, this is type ${y::class.simpleName}")
    println("ch = $ch, this is type ${ch::class.simpleName}")
    println("str = $str, this is type ${str::class.simpleName}")
    println("bool = $bool, this is type ${bool::class.simpleName}")

    print("\n")

    // Validate the type of variable using is keyword
    if (x is Int) println("$x is an Int") else println("Noooo")
    if (y is Double) println("$y is an Double") else println("Noooo")
    if (ch is Char) println("$ch is an Char") else println("Noooo")
    if (str is String) println("$str is a String") else println("Noooo")
    if (bool is Boolean) println("$bool is an Int") else println("Noooo")

    // actual code for twitter should be with both is and ::class...
    // https://www.geeksforgeeks.org/kotlin-type-checking-and-smart-casting/
}
