import kotlin.math.*

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val sb = StringBuilder()
    
    repeat (t) {
        val n = readLine().toInt()
        val stickers = Array(2) {
            readLine().split(" ").map { it.toInt() }
        }
        val dp = Array(2) { IntArray(n) }
        dp[0][0] = stickers[0][0]
        dp[1][0] = stickers[1][0]
        
        if (n > 1) {
            dp[0][1] = dp[1][0] + stickers[0][1]
            dp[1][1] = dp[0][0] + stickers[1][1]
        }
        
        for (idx in 2 until n) {
            dp[0][idx] = max(dp[1][idx - 1], dp[1][idx - 2]) + stickers[0][idx]
            dp[1][idx] = max(dp[0][idx - 1], dp[0][idx - 2]) + stickers[1][idx]
        }
        sb.appendLine(max(dp[0][n-1], dp[1][n-1]))
    }
    
    print(sb)
}