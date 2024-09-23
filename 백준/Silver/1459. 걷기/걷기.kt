import kotlin.math.abs

fun main() {
    val br = System.`in`.bufferedReader()
    val (X, Y, W, S) = br.readLine().split(" ").map { it.toLong() }
    print(solution(X, Y, W, S))
}

fun solution(x: Long, y: Long, w: Long, s: Long): Long {
    val min = minOf(x, y)
    val diff = abs(x - y)

    if (s >= 2 * w) {
        return (x + y) * w
    }

    return min * s + minOf(diff * w, (diff / 2) * 2 * s + (diff % 2) * w)
}