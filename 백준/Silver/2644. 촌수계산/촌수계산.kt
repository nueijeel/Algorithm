var graph = arrayOf<MutableList<Int>>()
var visited = booleanArrayOf()
var count = -1

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val (person1, person2) = br.readLine().split(" ").map { it.toInt() }
    val m = br.readLine().toInt()
    graph = Array(n + 1) { mutableListOf<Int>() }
    visited = BooleanArray(n + 1) { false }
    
    repeat(m) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        graph[x].add(y)
        graph[y].add(x)
    }
    
    dfs(person1, person2, 0)
    
    print(count)
}

fun dfs(start: Int, end: Int, depth: Int) {
    if (start == end) {
        count = depth
        return
    }
    visited[start] = true
    
    for (neighbor in graph[start]) {
        if (!visited[neighbor]) {
            dfs(neighbor, end, depth + 1)
        }
    }
}