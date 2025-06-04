import kotlin.math.max

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val scores = IntArray(n + 1) { 0 }
    val dp = IntArray(n + 1)
    
    for (i in 1..n) {
        scores[i] = br.readLine().toInt()
    }
    
    if (n == 1) {
        print(scores[1])
        return
    }
    
    dp[1] = scores[1]
    dp[2] = scores[1] + scores[2]
    
    for (i in 3 .. n) {
        dp[i] = max(scores[i] + dp[i - 2], scores[i] + scores[i-1] + dp[i - 3])
    }
    
    print(dp[n])
}