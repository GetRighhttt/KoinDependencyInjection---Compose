/**
 * 1480. Running Sum of 1d Array
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.
 */

fun runningSum(nums: IntArray): IntArray {
    // calculate previous value than add
    // loop through array indices at base index of 0
    for (i in nums.indices) {
        // if index is greater than second index
        if (i >= 1) {
            // array index = nums[i - 1] = sum of previous indices + num[i] current index
            nums[i] = nums[i - 1] + nums[i]
        }
    }
    return nums
}
