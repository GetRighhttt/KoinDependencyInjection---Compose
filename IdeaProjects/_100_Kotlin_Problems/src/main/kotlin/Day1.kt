/**
 * 1929. Concatenation of Array
 *
 * https://leetcode.com/problems/concatenation-of-array/description/
 */

fun getConcatenation(nums: IntArray): IntArray {
    // given array nums of n length, create ans of double the length

    // step 1 - declare array and set it equal to nums
    var ansArray = nums

    // step 2 - concatenate arrays
    ansArray += ansArray

    // step 3 - return array
    return ansArray
}


fun main() {
    val array = intArrayOf(1, 2, 3)
    val concat = getConcatenation(array)
    println(concat)
}