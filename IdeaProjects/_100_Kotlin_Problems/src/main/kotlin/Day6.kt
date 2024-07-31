/**
 * 771. Jewels and Stones
 *
 * You're given strings jewels representing the types of stones that are jewels,
 * and stones representing the stones you have.
 * Each character in stones is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 *
 * Letters are case-sensitive, so "a" is considered a different type of stone from "A".
 */

fun numJewelsInStones(jewels: String, stones: String): Int {
    // declare variable to store count of
    var totalCount = 0

    // we want to know how many stones contains jewels, so we need to loop through each O(n2)
    for (i in stones.indices) {
        for (j in jewels.indices) {
            if (stones[i] == jewels[j]) totalCount++
        }
    }
    return totalCount
}
