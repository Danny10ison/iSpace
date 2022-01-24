package week2.assignments.work1

/**
 * 2. write a program to sum up the values from 1 to 5
 */

fun main() {
    var lowerLimit = 1
    var upperLimit = 5  // upper limit should always be 5 to get desired result

    print("The sum of $upperLimit to $lowerLimit = ${sumNums(upperLimit)}")
}

/**
 * sumNums - Add numbers using recursion
 *
 * @param upperLimit Assuming all values are upper limit
 *
 * @return sum from upper limit to 1, using recursion
 */
fun sumNums(upperLimit: Int): Int {  // assume the first number is always the upper limit

    return if (upperLimit != 0) {
        upperLimit + sumNums(upperLimit - 1)  // recursive call
    }
    else{
        return upperLimit  // in case the number is 1
    }
}