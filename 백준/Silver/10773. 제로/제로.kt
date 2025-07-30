import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val k = readLine().toInt()
    val stack = Stack<Int>()
    var result: Long = 0
    
    repeat(k) {
        val n = readLine().toInt()
        if (n == 0) {
            stack.pop()
        } else {
            stack.add(n)
        }
    }
    
    repeat(stack.size) {
        result += stack.pop()
    }
    print(result)
}