import kotlin.math.*

class Solution {
    fun solution(citations: IntArray): Int {
        var len = citations.size
        citations.sortDescending()
        var result = 0
        for (i in len - 1 downTo 0) {
            if (citations[i] >= (i + 1)) result = max(result, i + 1)
        }
        return result
    }
}