import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val computer = br.readLine().toInt()
    val network = br.readLine().toInt()
    val graph = Array(computer + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(computer + 1)
    var result = 0
    
    repeat(network) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        graph[x].add(y)
        graph[y].add(x)
    }
    
    var q: Queue<Int> = LinkedList()
    q.offer(1)
    visited[1] = true
    while(q.isNotEmpty()) {
        var current = q.poll()
        for (next in graph[current]) {
            if (!visited[next]) {
                q.offer(next)
                visited[next] = true
                result++
            }
        }
    }
    print(result)
}