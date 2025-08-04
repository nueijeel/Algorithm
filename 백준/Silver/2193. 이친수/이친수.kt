fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = Array(n) { Pair(0L, 0L) }
    
    if (n == 1 || n == 2) {
        print(1)
        return
    }
    
    dp[0] = Pair(0L, 1L) // 해당 자릿수에 올수 있는 0의 개수, 1의 개수
    
    for (idx in 1 until n) {
        val (zero, one) = dp[idx - 1]
        
        // 0 - 이전 자리수 0일때 생기는 0 개수 + 이전 자리수 1일때 생기는 1 개수
        // 1 - 이전 자리수 0일때 생기는 1 개수
        dp[idx] = Pair(zero + one, zero)
    }
    
    print(dp[n - 1].first + dp[n - 1].second)
}