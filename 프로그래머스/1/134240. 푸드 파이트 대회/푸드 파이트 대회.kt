class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        
        for (i in 1 until food.size) {
            val cnt = food[i] / 2
            answer += i.toString().repeat(cnt)
        }
        val reversed = answer.reversed()
        
        return answer + "0" + reversed
    }
}