class Solution {
    fun solution(topping: IntArray): Int {
        var answer: Int = 0
        val bro = mutableMapOf<Int, Int>()
        val younger = mutableMapOf<Int, Int>()
        
        for (t in topping) {
            younger[t] = younger.getOrDefault(t, 0) + 1
        }
        
        for (i in topping.indices) {
            val t = topping[i]
            
            bro[t] = bro.getOrDefault(t, 0) + 1
            
            younger[t] = younger[t]!! - 1
            if (younger[t] == 0) younger.remove(t)
            
            if (bro.size == younger.size) answer++
        }
        
        return answer
    }
}