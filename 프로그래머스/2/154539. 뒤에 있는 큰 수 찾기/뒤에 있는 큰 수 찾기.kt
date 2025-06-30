import java.util.*

class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = IntArray(numbers.size) { -1 }
        val dp = Stack<Int>()
        
        for (idx in numbers.indices.reversed()) {
            while (dp.isNotEmpty() && dp.peek() <= numbers[idx]) {
                dp.pop()
            }
            if (dp.isNotEmpty()) {
                answer[idx] = dp.peek()
            }
            dp.push(numbers[idx])
        }
        
        return answer
    }
}