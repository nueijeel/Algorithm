class Solution {
    fun solution(X: String, Y: String): String {
        var answer: String = ""
        var xMap = mutableMapOf<Char, Int>()
        var yMap = mutableMapOf<Char, Int>()
        
        for (x in X) {
            xMap[x] = xMap.getOrDefault(x, 0) + 1
        }
        for (y in Y) {
            yMap[y] = yMap.getOrDefault(y, 0) + 1
        }
        
        for (i in 9 downTo 0) {
            val key = i.toString()[0]
            val xCount = xMap[key] ?: continue
            val yCount = yMap[key] ?: continue
            if (answer.isEmpty() && key == '0') {
                return "0"
            }
            if (xCount >= yCount) {
                answer += i.toString().repeat(yCount)
            } else {
                answer += i.toString().repeat(xCount)
            }
        }
        return if (answer.isEmpty()) "-1" else answer
    }
}