import java.util.*

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        val q: Queue<Pair<Int, Int>> = LinkedList()
        
        for (i in priorities.indices) {
            q.add(i to priorities[i])
        }
        
        while (q.isNotEmpty()) {
            val (idx, priority) = q.poll()
            
            if (q.any { it.second > priority }) {
                q.offer(idx to priority)
            } else {
                answer++
                if (idx == location) {
                    return answer
                }
            }
        }
        
        
        return answer
    }
}