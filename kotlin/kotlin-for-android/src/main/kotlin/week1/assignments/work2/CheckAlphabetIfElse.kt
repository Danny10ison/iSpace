package week1.assignments.work2

/**
 * Kotlin Program to Check Alphabet using if else
 *
 * check if something is an alphabet
 * if 'A' then it is an Alphabet(English)
 */

fun main(){
    val alph = 'A'  // can be any character

    /* compare if character is small or capital English letter*/
    if((alph in 'a'..'z') || (alph in 'A'..'Z')) println("\"$alph\" is an alphabet")
    else println("Not an alphabet") // print this if not an english alphabet
}