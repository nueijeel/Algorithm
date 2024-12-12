var graph = arrayOf<MutableList<Int>>()
var visited = arrayOf<BooleanArray>()
var apartmentCount = 0

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    graph = Array(n) { mutableListOf<Int>() }
    visited = Array(n) { BooleanArray(n) {false} }
    var complex = 0
    val apartment = mutableListOf<Int>()
    
    val direction = listOf(
        Pair(1, 0),
        Pair(-1, 0),
        Pair(0, 1),
        Pair(0, -1),
    )
    
    repeat(n) { i ->
        val houses = br.readLine().map { it.toString().toInt() }
        graph[i].addAll(houses)
    }
    
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (!visited[i][j] && graph[i][j] == 1) {
                complex++
                dfs(Pair(i,j), direction, n)
                apartment.add(apartmentCount)
                apartmentCount = 0
            }
            visited[i][j]
        }
    }
    println(complex)
    for (count in apartment.sorted()) {
        println(count)
    }
}

fun dfs(pos: Pair<Int, Int>, dir: List<Pair<Int, Int>>, n: Int) {
    val (x, y) = pos
    visited[x][y] = true
    apartmentCount++
    
    for ((dx, dy) in dir) {
        val cx = x + dx
        val cy = y + dy
        if (cx in 0 until n && cy in 0 until n && !visited[cx][cy] && graph[cx][cy] == 1) {
            dfs(Pair(cx, cy), dir, n)
        }
    }
}