fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    var (r, c, d) = readLine().split(" ").map { it.toInt() }
    val room = Array(n) {
        readLine().split(" ").map { it.toInt() }.toIntArray()
    }
    
    // 북동남서 - idx 0, 1, 2, 3
    val dx = arrayOf(-1, 0, 1, 0)
    val dy = arrayOf(0, 1, 0, -1)
    var result = 0
    
    outer@ while (true) {
        if (room[r][c] == 0) {
            room[r][c] = 2
            result++
        } else if (room[r][c] == 1) {
            break
        }
        
        for (i in 0 until 4) {
            d = (d + 3) % 4
            val nx = r + dx[d]
            val ny = c + dy[d]
            if (nx in 0 until n && ny in 0 until m && room[nx][ny] == 0) {
                r = nx
                c = ny
                continue@outer
            }
        }
        
        r -= dx[d]
        c -= dy[d]
    }
    
    print(result)
}