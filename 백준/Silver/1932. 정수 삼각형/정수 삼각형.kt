import java.io.*
import java.util.*
import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array(n) { Array(n) { 0 } }
    
    for (i in 0 until n) {
        val st = StringTokenizer(readLine())
        for (j in 0 .. i) {
            arr[i][j] = st.nextToken().toInt()
        }
    }
    
    for (i in 1 until n) {
        for (j in 0 .. i) {
            when (j) {
                0 -> arr[i][j] = arr[i][j] + arr[i-1][j]
                i -> arr[i][j] = arr[i][j] + arr[i-1][j-1]
                else -> arr[i][j] = arr[i][j] + max(arr[i-1][j], arr[i-1][j-1])
            }
        }
    }
    
    print(arr[n-1].maxOrNull())
}