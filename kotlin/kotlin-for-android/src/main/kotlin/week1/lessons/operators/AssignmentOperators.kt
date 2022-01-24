package week1.lessons.operators

fun main(){
    /**
     * Assignment operator in Kotlin
     *
     * Assignment operators are used to store a value into a variable
     * The "Equals to" symbol is used as assignment operator.
     *
     *  // variable_name = value
     *
     * Arithmetic operators combined with equals to sign are also assignment operators
     */

    // variable = value
    var myAge =  45 // store 45 in the variable, myAge.
    println(myAge)  // myAge = 45

    myAge += 5      // add 5 to myAge and store in myAge,
    println(myAge)  // myAge = 45 + 5

    myAge -= 40     // subtract 40 from myAge and store in myAge,
    println(myAge)  // myAge = 50 - 40

    myAge *= 20     // multiply myAge by 20 and store in myAge,
    println(myAge)  // myAge = 10*20

    myAge /= 50     // divide myAge by 50 and store in myAge,
    println(myAge)  // myAge = 200 / 50

    myAge %= 3      // divide myAge by 3 and store the remainder in myAge,
    println(myAge)  // myAge = 4 modulus 3


}