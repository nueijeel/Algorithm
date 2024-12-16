fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val paint = Array(n) { mutableListOf<Int>() }
    val visited = Array(n) { BooleanArray(m) { false } }
    
    var area = 0
    var maxArea = 0
    var count = 0
    
    val dir = listOf(
        Pair(1, 0),
        Pair(-1, 0),
        Pair(0, 1),
        Pair(0, -1),
    )
    
    repeat(n) { i ->
        val row = br.readLine().split(" ").map { it.toInt() }
        paint[i].addAll(row)
    }
    
    fun dfs(x: Int, y: Int) {
        visited[x][y] = true
        area++
        
        for ((dx, dy) in dir) {
            val cx = x + dx
            val cy = y + dy
            
            if (cx in 0 until n && cy in 0 until m && !visited[cx][cy] && paint[cx][cy] == 1) {
                dfs(cx, cy)
            }
        }
    }
    
    for(i in 0 until n) {
        for(j in 0 until m) {
            area = 0
            if (paint[i][j] == 1 && !visited[i][j]){
                dfs(i, j)
                maxArea = if (area > maxArea) area else maxArea
                count++
            }
        }
    }
    
    println(count)
    println(maxArea)
}