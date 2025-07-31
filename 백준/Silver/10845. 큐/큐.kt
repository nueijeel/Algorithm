import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val q: Deque<Int> = LinkedList()
    val sb = StringBuilder()
    val n = readLine().toInt()
    
    repeat (n) {
        val input = readLine().split(" ")
        
        when (input[0]) {
            "push" -> {
                val num = input[1].toInt()
                q.addLast(num)
            }
            "pop" -> {
                if (q.isEmpty()) sb.appendLine(-1) else sb.appendLine(q.removeFirst())
            }
            "size" -> {
                sb.appendLine(q.size)
            }
            "empty" -> {
                if (q.isEmpty()) sb.appendLine(1) else sb.appendLine(0)
            }
            "front" -> {
                if (q.isEmpty()) sb.appendLine(-1) else sb.appendLine(q.first)
            }
            "back" -> {
                if (q.isEmpty()) sb.appendLine(-1) else sb.appendLine(q.last)
            }
        }
    }
    print(sb)
}