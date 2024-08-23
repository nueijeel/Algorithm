import java.util.*
fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val a = br.readLine().split(" ")
    val deque = ArrayDeque<Int>()
    
    var card = 1
    for(i in a.size - 1 downTo 0) {
        when (a[i]) {
            "1" -> {
                deque.addFirst(card)
            }
            "2" -> {
                val first = deque.removeFirst()
                deque.addFirst(card)
                deque.addFirst(first)
            }
            else -> {
                deque.addLast(card)
            }
        }
        card++
    }
    
    print(deque.joinToString(" "))
}