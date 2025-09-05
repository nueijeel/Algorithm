import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val q: Queue<Int> = LinkedList()
    val n = readLine().toInt()
    for (i in 1 .. n) q.offer(i)
    val sb = StringBuilder()
    var cnt = 1
    
    while (q.size > 1) {
        if (cnt % 2 == 1) {
            sb.append("${q.poll()} ")
        } else {
            q.offer(q.poll())
        }
        cnt++
    }
    sb.append(q.poll())
    print(sb)
}