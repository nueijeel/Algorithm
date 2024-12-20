fun main() {
    val br = System.`in`.bufferedReader()
    val t = br.readLine().toInt()
    
    val dir = listOf(
        Pair(0, 1), Pair(1, 0), Pair(-1, 0), Pair(0, -1),
    )
    
    repeat(t) {
        val (m, n, k) = br.readLine().split(" ").map { it.toInt() }
        val farm = Array(n) { IntArray(m) { 0 } }
        val visited = Array(n) { BooleanArray(m) { false } }
        
        repeat(k) {
            val (x, y) = br.readLine().split(" ").map { it.toInt() }
            farm[y][x] = 1
        }
        
        fun dfs(x: Int, y:Int) {
            visited[y][x] = true
            
            for ((dx, dy) in dir) {
                val cx = x + dx
                val cy = y + dy
                if (cx in 0 until m && cy in 0 until n && !visited[cy][cx] && farm[cy][cx] == 1) {
                    dfs(cx, cy)
                }
            }
        }
        
        var result = 0
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (farm[i][j] == 1 && !visited[i][j]) {
                    dfs(j, i)
                    result++
                }
            }
        }
        println(result)
    }
}