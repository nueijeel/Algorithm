import java.util.*

var graph = arrayOf<MutableList<Int>>()
var visited = booleanArrayOf()

fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m, v) = br.readLine().split(" ").map { it.toInt() }
    graph = Array(n + 1) { mutableListOf<Int>() }
    visited = BooleanArray(n + 1)
    
    // 그래프 정보 저장
    repeat(m) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        graph[x].add(y)
        graph[y].add(x)
    }

    for(i in 1..n) {
        graph[i].sort()
    }
    
    dfs(v)
    println()
    visited.fill(false)
    bfs(v)
}

fun dfs(v: Int) {
    visited[v] = true
    print("$v ")
    
    for(next in graph[v]) {
        if(!visited[next]) {
            dfs(next)
        }
    }
}

fun bfs(v: Int) {
    var q: Queue<Int> = LinkedList()
    q.offer(v)
    visited[v] = true
    print("$v ")
    
    while(q.isNotEmpty()) {
        val current = q.poll()
        for(next in graph[current]) {
            if (!visited[next]) {
                q.offer(next)
                visited[next] = true
                print("$next ")
            }
        }
    }
}