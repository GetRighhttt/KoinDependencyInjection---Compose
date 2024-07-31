/**
 * 1528. Shuffle String
 *
 * You are given a string s and an integer array indices of the same length.
 * The string s will be shuffled such that the character at the ith position
 * moves to indices[i] in the shuffled string.
 *
 * Return the shuffled string.
 */

/*
We are given a string that matches the length of an array.
We are not concerned with the array per se, but instead with the indices of the array.
We want to sort the array and equate its position to the string character.

Algorithm:
1. Create new string to store new char array to store values.
2. Loop through the new array
3. Assign the values of newArray[indices[i]] to s[i].
4. Return string.
 */


fun restoreString(s: String, indices: IntArray): String {

    // create new variable to store char array and equate it to length of indices array
    val newString = CharArray(indices.size)

    // loop through char array and assign indices of newString to string s indices
    for (i in indices.indices) {
        newString[indices[i]] = s[i]
    }
    // join char array to a string and don't forget the quotes
    return newString.joinToString("")
}
