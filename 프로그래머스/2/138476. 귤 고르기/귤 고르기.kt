import java.util.*

class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        tangerine.sort()
        
        var start = tangerine[0]
        var pq = PriorityQueue<Int>(Collections.reverseOrder())
        var cnt = 0
        
        for (t in tangerine) {
            if (t == start) {
                cnt++
            } else {
                start = t
                pq.add(cnt)
                cnt = 1
            }
        }
        pq.add(cnt)
        
        var result = 0
        var totalTangerine = k
        while (totalTangerine > 0) {
            var tang = pq.poll()
            totalTangerine -= tang
            result++
        }
        return result
    }
}