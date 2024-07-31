/**
 * 2413. Smallest Even Multiple
 *
 * Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
 */


fun smallestEvenMultiple(n: Int): Int = if (n % 2 == 0) n else n * 2
