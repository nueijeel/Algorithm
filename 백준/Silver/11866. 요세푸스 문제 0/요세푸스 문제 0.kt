import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val q: Queue<Int> = LinkedList()
    var cnt = 0
    val sb = StringBuilder()
    
    for (i in 1 .. n) {
        q.offer(i)
    }
    
    sb.append("<")
    while (q.isNotEmpty()) {
        cnt++
        val num = q.poll()
        if (cnt == k) {
            sb.append(num)
            if (q.size > 0) sb.append(", ")
            cnt = 0
        } else {
            q.offer(num)
        }
    }
    sb.append(">")
    print(sb)
}