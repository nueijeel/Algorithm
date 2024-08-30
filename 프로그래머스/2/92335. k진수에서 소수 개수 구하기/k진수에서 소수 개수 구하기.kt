class Solution {
    fun solution(n: Int, k: Int): Int {
        val str = convertNum(n,k)
        val numbers = str.split("0")
            .filter { it.isNotEmpty() }
            .map { it.toLong() }
        var cnt = 0
        numbers.forEach { num ->
            if (primeNumberTest(num)) cnt++
        }
        return cnt
    }
    
    fun convertNum(n: Int, k: Int): String {
        var num = n
        var str = ""
        
        while (num > 0) {
            str = (num % k).toString() + str
            num /= k
        }
        return str
    }
    
    fun primeNumberTest(num: Long): Boolean {
        if (num < 2) return false
        
        for (i in 2..Math.sqrt(num.toDouble()).toLong()) {
        	if (num % i == 0L) return false
        }
        return true
    }
}