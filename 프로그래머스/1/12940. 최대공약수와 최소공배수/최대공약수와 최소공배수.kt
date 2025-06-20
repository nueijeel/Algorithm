class Solution {
    fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a
    
    fun solution(n: Int, m: Int): IntArray {
        var answer = IntArray(2) { 0 }
        
        answer[0] = gcd(n, m)
        answer[1] = (n * m) / gcd(n, m)
        
        return answer
    }
}