package week1.assignments.work2

/**
 * Sum of Natural Numbers using for loop
 *
 * natural numbers are those numbers used for counting, from +1 to +infinity
 * [1, 2, 3, ..., infinity]
 * -> there should be a limit for the addition [x, ..., n]
 * -> add all numbers starting from x to n
 *
 * [1, 2, 3]
 * total = 0   // initially
 * (new)total = total + i(1) // when i is 1
 * (new_new)total = (new)total + i(2)  // when i is 2
 * finaltotal = (new_new)total + i(3) // when i is 3
 *
 * sum = finaltotal
 */

fun main(){
    /* initialise this way to make code
    *  easily changeable to take input from keyboard*/
    val lowerLimit = 1
    val upperLimit = 3

    var sum =  0  // make sum global to make it printable

    // make sure both number are not sero, and upperLimit is always greater than lower limit
    if ((lowerLimit > 0) && (upperLimit != lowerLimit) && (upperLimit > lowerLimit)){
        print("sum of : ")

        for(i in lowerLimit..upperLimit){
            sum += i
            print("$i ")
        }

        println("\nis $sum")
    }
    else{
        // print this if either lowerLimit or upperLimit is 0, or upperLimit is not = lowerLimit
        println("Values do not meet requirement")
    }

}