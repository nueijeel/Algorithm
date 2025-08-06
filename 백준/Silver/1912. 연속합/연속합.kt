fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }
    val dp = MutableList(n) { 0 }
    dp[0] = numbers[0]
    var totalMax = dp[0]
    
    for (i in 1 until n) {
        dp[i] = maxOf(numbers[i], dp[i - 1] + numbers[i])
        totalMax = maxOf(totalMax, dp[i])
    }
    print(totalMax)
}