import java.util.*
fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    
    var dp = Array(n, {IntArray(3)})
    
    for(i in 0 until n) {
        val rgb = br.readLine().split(" ").map { it.toInt() }
        dp[i][0] = rgb[0]
        dp[i][1] = rgb[1]
        dp[i][2] = rgb[2]
    }
    
    for(i in 1 until n) {
        dp[i][0] += minOf(dp[i-1][1], dp[i-1][2])
        dp[i][1] += minOf(dp[i-1][0], dp[i-1][2])
        dp[i][2] += minOf(dp[i-1][1], dp[i-1][0])
    }
    print(minOf(dp[n-1][0], dp[n-1][1], dp[n-1][2]))
}