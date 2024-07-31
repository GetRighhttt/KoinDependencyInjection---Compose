/**
 * 1470. Shuffle the array
 *
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */

fun shuffle(nums: IntArray, n: Int): IntArray {

    // declare new array
    val newArr = mutableListOf<Int>()

    // loop through n since that's the end of the array
    for (i in 0..n) {

        // we want (Xn, Yn) so add Xn(nums[i]) then add Yn(nums[i + n])
        newArr.add(nums[i])
        newArr.add(nums[i + n])
    }
    return newArr.toIntArray()
}
