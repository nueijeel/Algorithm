class Solution {
    fun solution(s: String, n: Int): String {
        var answer = StringBuilder()
        s.forEach { c ->
            val ascii = c.toInt()
            val num = when (ascii) {
                in 65..90 -> {
                    if (ascii + n > 90) {
                        65 + (ascii + n - 91)
                    } else {
                        ascii + n
                    }
                }
                in 97..122 -> {
                    if (ascii + n > 122) {
                        97 + (ascii + n - 123)
                    } else {
                        ascii + n
                    }
                }
                else -> {
                    32
                }
            }
            answer.append(num.toChar().toString())
        }
        return answer.toString()
    }
}