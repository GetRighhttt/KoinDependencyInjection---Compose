import java.lang.StringBuilder

/**
 * 1844. Replace All Digits with Characters
 *
 * You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.
 *
 * There is a function shift(c, x), where c is a character and x is a digit, that returns the xth character after c.
 *
 * For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.
 * For every odd index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).
 *
 * Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.
 */

/*
Observations: only replacing odd digits;
We are working with ascii value of digits and return as char.
 */


fun replaceDigits(s: String): String {
    val ansString = StringBuilder()

    for (i in s.indices) {
        if (s[i].isDigit()) {
            ansString.append(s[i - 1] + s[i].code - '0'.code)
        } else {
            ansString.append(s[i])
        }
    }
    return ansString.toString()
}
