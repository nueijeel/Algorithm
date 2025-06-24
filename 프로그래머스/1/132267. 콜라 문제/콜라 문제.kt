class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var coke = 0
        var emptyCoke = n
        
        while (emptyCoke + coke >= a) {
            emptyCoke += coke
            coke = 0
            coke += (emptyCoke / a) * b
            emptyCoke %= a
            answer += coke
        }
        
        return answer
    }
}