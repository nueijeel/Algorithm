import kotlin.math.*

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val board = Array(n) {
        readLine().toCharArray()
    }
    var repaintSpace = n * m
    val patterns = arrayOf("WBWBWBWB", "BWBWBWBW")
    
    for (i in 0 .. (n - 8)) {
        for (j in 0 .. (m - 8)) {
            var b = 0
            var w = 0
            for (k in i until (8 + i)) {
                for (l in j until (8 + j)) {
                    if ((k + l) % 2 == 0) {
                        if (board[k][l] == 'W') w++
                        else b++
                    } else {
                        if (board[k][l] == 'W') b++
                        else w++
                    }
                }
            }
            val paint = min(b, w)
            repaintSpace = min(repaintSpace, paint)
        }
    }
    print(repaintSpace)
}