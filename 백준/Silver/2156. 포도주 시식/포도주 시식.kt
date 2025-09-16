fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array(n) {
        readLine().toInt()
    }
    if (n == 1) {
        print(arr[0])
        return
    }
    val dp = IntArray(n + 1) { 0 }
    dp[1] = arr[0]
    dp[2] = arr[0] + arr[1]
    
    for (i in 3 .. n) {
        val answerList = mutableListOf<Int>()
        answerList.add(dp[i - 1])
        answerList.add(arr[i - 1] + dp[i - 2])
        answerList.add(arr[i - 1] + dp[i - 3] + arr[i - 2])
        dp[i] = answerList.max()
    }
    print(dp[n])
}