fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val sb = StringBuilder()
    
    repeat(t) {
        val (h, w, n) = readLine().split(" ").map { it.toInt() }
        val y = n % h
        val x = n / h
        if (y == 0) {
            sb.appendLine(h * 100 + x)
        } else {
            sb.appendLine(y * 100 + x + 1)
        }
    }
    print(sb)
}