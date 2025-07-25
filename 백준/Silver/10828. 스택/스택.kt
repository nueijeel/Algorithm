import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val stack = Stack<Int>()
    val sb = StringBuilder()
    
    repeat(n) {
        val input = readLine().split(" ").map { it.toString() }
        when (input[0]) {
            "push" -> {
                val n = input[1].toInt()
                stack.push(n)
            }
            "pop" -> {
                if (stack.isEmpty()) sb.appendLine(-1) else sb.appendLine(stack.pop())
            }
            "size" -> {
                sb.appendLine(stack.size)
            }
            "empty" -> {
                if (stack.isEmpty()) sb.appendLine(1) else sb.appendLine(0)
            }
            "top" -> {
                if (stack.isEmpty()) sb.appendLine(-1) else sb.appendLine(stack.peek())
            }
        }
    }
    print(sb)
}