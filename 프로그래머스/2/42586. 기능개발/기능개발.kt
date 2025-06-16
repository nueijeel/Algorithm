import java.util.*
import kotlin.math.*

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        var cnt = 0
        var x = 0
        val queue = LinkedList<Int>()
        
        for (idx in progresses.indices) {
            queue.offer(ceil((100 - progresses[idx]) / speeds[idx].toDouble()).toInt())
        }
        x = queue.peek()
        
        while (queue.isNotEmpty()) {
            if (queue.peek() <= x) {
                queue.poll()
                cnt ++
            } else {
                answer.add(cnt)
                cnt = 0
                x = queue.peek()
            }
        }
        answer.add(cnt)
        
        return answer.toIntArray()
    }
}