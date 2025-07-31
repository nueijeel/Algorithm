import kotlin.math.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var twoCnt = 0
    var fiveCnt = 0
    
    for (i in 2..n) {
        var num = i
        while (num % 2 == 0 || num % 5 == 0) {
            if (num % 2 == 0) {
                twoCnt++
                num /= 2
            } else if (num % 5 == 0) {
                fiveCnt++
                num /= 5
            }
        }
    }
    print(min(twoCnt, fiveCnt))
}