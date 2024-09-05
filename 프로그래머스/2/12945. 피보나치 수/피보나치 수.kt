class Solution {
    fun solution(n: Int): Int {
        val arr = Array(n+1) {0}
        return fibonacci(n, arr)
    }
    
    fun fibonacci(num: Int, arr: Array<Int>): Int {
        if (num <= 1) return num
        if (arr[num] > 0) return arr[num]
        arr[num] = (fibonacci(num - 1, arr) + fibonacci(num - 2, arr))%1234567
        return arr[num] % 1234567
    }
}