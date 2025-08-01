fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = readLine().split(" ").map { it.toInt() }
    val dp = mutableListOf<Int>()
    
    dp.add(arr[0])
    
    for (i in 0 until n) {
        if (dp[dp.lastIndex] < arr[i]) {
            dp.add(arr[i])
        } else {
            // dp에서 현재 arr[i]를 이진탐색
            val idx = lowerBound(dp, arr[i])
            dp[idx] = arr[i]
        }
    }
    
    print(dp.size)
}

fun lowerBound(dp: MutableList<Int>, target: Int): Int {
    var low = 0
    var high = dp.size - 1
    var result = dp.size
    
    while (low <= high) {
        val mid = (low + high) / 2
        
        if (dp[mid] >= target) {
            result = mid
            high = mid - 1
        } else {
            low = mid + 1
        }
    }
    return result
}