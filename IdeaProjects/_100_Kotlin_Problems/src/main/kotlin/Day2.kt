/**
 * 2011. Final Value of Variable After Performing Operations.
 */

/*
A programming language with only four operations and one variable 'x'.
++x and x++ increments the value of the variable x by 1, and --X or X-- decrements the value
by 1.
X starts at 0.
 */
fun finalValueAfterOperations(operations: Array<String>): Int {
    // keep track of value of X after reading from the array of strings
    var x = 0

    // loop through size of array starting from 0 since X = 0
    for (i in operations.indices) {

        // check if array index equals ++ or -- and either increment or decrement
        if (operations[i] == "++X" || operations[i] == "X++") {
            x++
        } else if (operations[i] == "--X" || operations[i] == "X--") {
            x--
        }
    }

    return x
}
