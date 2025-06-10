class Solution {
    fun solution(t: String, p: String): Int {
        var len = p.length
        var cnt = 0
        for (i in 0..(t.length - len)) {
            val tNum = t.substring(i,i + len).toLong()
            val pNum = p.toLong()
            if (tNum <= pNum) cnt++
        }
        return cnt
    }
}