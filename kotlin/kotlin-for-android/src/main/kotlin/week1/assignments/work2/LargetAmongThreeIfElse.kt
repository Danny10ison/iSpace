package week1.assignments.work2

/**
 * Find Largest Among three numbers using if...else statement
 *
 * given numbers a, b, c,
 * the largest number -> if 'a' is greater than 'b' and 'a' is greater than 'c'
 *
 * check if 'a' is larger than both 'b' and 'c', assign 'a', to the largest
 * else
 * check if 'b' is greater than both 'a' and 'c', assign 'b' to the largest
 * else
 * the largest is 'c'
 */

fun main(){
    /* initialise variables */
    val a = 10
    val b = 9
    val c = 3

    /* make if else as expression assign result to largestAmongThree*/
    val largestAmongThree =

        if((a>b)&&(a>c)){            // check if 'a' is greater than both 'b' and 'c'
            a             // largest is 'a'
        } else if ((b>a)&&(b>c)){   // check if 'b' is greater than both 'a' and 'c'
            b            // largest is 'b'
        } else {
            c           // else the largest is 'c'
        }

    println("Largest Among $a, $b and $c is $largestAmongThree")

}