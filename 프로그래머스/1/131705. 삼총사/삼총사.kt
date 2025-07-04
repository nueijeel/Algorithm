class Solution {
    fun solution(number: IntArray): Int {
        var answer: Int = 0
        val len = number.size
        
        for (i in 0 until len) {
            for (j in i + 1 until len) {
                for (k in j + 1 until len) {
                    if (number[i] + number[j] + number[k] == 0) answer++
                }
            }
        }
        
        return answer
    }
}