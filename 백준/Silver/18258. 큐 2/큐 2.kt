import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val queue = ArrayDeque<Int>()
    val sb = StringBuilder()
    
    repeat (n) {
        val str = readLine()
        
        when (str) {
            "pop" -> {
                if (queue.isEmpty()) sb.appendLine(-1) else sb.appendLine(queue.remove())
            }
            "size" -> {
                sb.appendLine(queue.size)
            }
            "empty" -> {
                if (queue.isEmpty()) sb.appendLine(1) else sb.appendLine(0)
            }
            "front" -> {
                if (queue.isEmpty()) sb.appendLine(-1) else sb.appendLine(queue.first)
            }
            "back" -> {
                if (queue.isEmpty()) sb.appendLine(-1) else sb.appendLine(queue.last)
            }
            else -> {
                val (cal, num) = str.split(" ")
                queue.add(num.toInt())
            }
        }
    }
    print(sb)
}