package week1.assignments.work2

/**
 * write to check if a given number is positive, negative or zero
 *
 * for a given number b,
 * b is positive if b>0
 * b is negative if b<0
 * b is zero if b==0
 */

fun main(){
    var x = 9

    if(x==0){  // check for zero
        println("$x is zero")
    }else if (x<0){  // check for negative
        println("$x is negative")
    }else{
        println("$x is positive")  // number is positive if not negative or zero
    }

}