package week2.assignments.work1

import java.util.Scanner

/**
 * given val list = listOf(2,3,4,5,6,7,8,9)
 * print the list to the console and ask a user to input one number from the list
 * write a function to receive the list of numbers and print the index of the input number by the user
 * if the entered number not found.it returns -1
 *
 */
/**
 * create a list of numbers
 * first print what is in the list
 * take user input
 * declare a function params: list, userInput; return index of number or -1 if element not found;
 */

/**
 * Program starting point
 */
fun main(args: Array<String>){
    /**
     * Instance of Scanner to be used
     */
    val userInput = Scanner(System.`in`)

    /**
     * List to be used - Immutable list
     * [2, 3, 4, 5, 6, 7, 8, 9]
     */
    val list = listOf(2, 3, 4, 5, 6, 7, 8, 9)
    // print the list
    println("List elements are $list")

    // prompt user for input
    println("Enter number from the list to get index")
    /**
     * input from keyboard
     */
    var userQuery: Int = userInput.nextInt()

    // Give response to user
    println("You entered: $userQuery, index: ${getIndex(list, userQuery)}")

}

// Function documentation
/**
 * getIndex(list: List, userQuery: Int)
 *
 * @param list List, hardcoded list
 * @param userQuery Int, keyboard entry
 *
 * @return index of correct element or -1 if element is not in list
 */
fun getIndex(list: List<Int>, userQuery: Int): Int =
    if (userQuery in list)  list.indexOf(userQuery) else -1