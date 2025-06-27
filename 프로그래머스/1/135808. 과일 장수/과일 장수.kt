class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        val apples = score.sortedDescending()
        var cnt = 0
        for (idx in 0 until apples.size step(m)) {
            if (apples.size - idx < m) break
            cnt += (apples[idx + m - 1] * m)
        }
        return cnt
    }
}