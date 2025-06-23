class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var num = n
        var sb = StringBuilder()
        
        while (num > 0) {
            sb.append(num % 3)
            num /= 3
        }
        
        return sb.toString().toInt(3)
    }
}