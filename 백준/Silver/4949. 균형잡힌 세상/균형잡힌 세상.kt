import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    
    while (true) {
        val input = readLine()
        val stack = Stack<Char>()
        var isBalance = true
        if (input == ".") break
        for (c in input) {
            if (c == '(') {
                stack.push(c)
            } else if (c == ')') {
                if (stack.isNotEmpty() && stack.peek() == '(') stack.pop()
                else {
                    isBalance = false
                    break
                }
            } else if (c == '[') {
                stack.push(c)
            } else if (c == ']') {
                if (stack.isNotEmpty() && stack.peek() == '[') stack.pop()
                else {
                    isBalance = false
                    break
                }
            }
        }
        if (stack.isEmpty() && isBalance) sb.appendLine("yes") else sb.appendLine("no")
    }
    print(sb)
}