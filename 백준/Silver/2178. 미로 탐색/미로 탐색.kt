import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val graph = Array (n) { mutableListOf<Int>() }
    val visited = Array(n) { BooleanArray(m) { false } }
    
    repeat(n) { i ->
        val maze = br.readLine().map { it.toString().toInt() }
        graph[i].addAll(maze)
    }
    
    val directions = listOf(
        Pair(-1, 0),
        Pair(1, 0),
        Pair(0, -1),
        Pair(0, 1),
    )
    
    val queue: Queue<Triple<Int, Int, Int>> = LinkedList()
    queue.offer(Triple(0, 0, 1))
    visited[0][0] = true
    
    while(queue.isNotEmpty()) {
        val (x, y, dist) = queue.poll()
        
        if (x == n - 1 && y == m - 1) {
            print(dist)
            break
        }
        
        for ((dx, dy) in directions) {
            val cx = x + dx
            val cy = y + dy
            
            if (cx in 0 until n && cy in 0 until m && graph[cx][cy] == 1 && !visited[cx][cy]) {
                visited[cx][cy] = true
                queue.offer(Triple(cx, cy, dist + 1))
            }
        }
    }
}