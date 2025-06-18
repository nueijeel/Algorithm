import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        val divisors = IntArray(number) { 1 }
        
        for (i in 1..number) {
            val sqrt = sqrt(i.toDouble())
            var cnt = 0
            for (j in 1 .. sqrt.toInt()) {
                if (i % j == 0) {
                    cnt++
                    if (i / j != j) cnt++
                }
            }
            divisors[i-1] = cnt
        }
        
        for (divisor in divisors) {
            if (divisor > limit) answer += power
            else answer += divisor
        }
        
        return answer
    }
}