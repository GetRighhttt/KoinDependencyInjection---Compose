/**
 * 1512. Number of Good Pairs
 *
 * Given an array of integers nums, return the number of good pairs.
 *
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j. (j indices + 1 > i )
 */

fun numIdenticalPairs(nums: IntArray): Int {
    // need a variable to store the count
    var count = 0
    // pointer for j value
    var j = 0

    // nums[i] == nums[j] && indices of i < j

    // loop through array for i
    for (i in nums.indices) {
        // loop through array for j and increment indices
        for (k in (i + 1)..<nums.size) {
            // check conditional and increment
            if (nums[i] == nums[k]) {
                count++
            }
        }
    }
    return count
}
