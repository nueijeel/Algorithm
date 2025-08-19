import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<Pair<Int, Int>>()
    val dp = Array(n + 1) { Array(k + 1) { 0 } }
    repeat (n) {
        val (w, v) = readLine().split(" ").map { it.toInt() }
        list.add(Pair(w, v))
    }
    
    for (i in 1 .. n) {
        for (j in 1 .. k) {
            // 현재 물건의 무게와 가치
            val (w, v) = list[i - 1]
            
            if (w > j) {
                dp[i][j] = dp[i - 1][j]
            } else {
                dp[i][j] = max(v + dp[i - 1][j - w], dp[i - 1][j])
            }
        }
    }
    println(dp[n][k])
}