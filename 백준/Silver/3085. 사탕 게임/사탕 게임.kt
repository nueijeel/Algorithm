fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val candies = Array(n) { CharArray(n) }
    var result = 0
    
    for(i in 0 until n) {
        candies[i] = br.readLine().toCharArray()
    }
    
    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, 1, 0, -1)

    for(i in 0 until n) {
        for(j in 0 until n) {
            for(k in 0 until 4) {
                val posX = j + dx[k]
                val posY = i + dy[k]
                
                // 좌표가 범위를 벗어나지 않을 때
                if (posX in 0 until n && posY in 0 until n) {
                    if (candies[i][j] != candies[posX][posY]) {
                        swapCandies(candies, i, j, posY, posX)
                        result = maxOf(result, checkMaxCandyCount(candies, i, j))
                        swapCandies(candies, posY, posX, i, j)
                    }
                }
            }
        }
    }
    print(result)
}

fun swapCandies(candies: Array<CharArray>, i: Int, j: Int, posX: Int, posY: Int) {
    val temp = candies[i][j]
    candies[i][j] = candies[posX][posY]
    candies[posX][posY] = temp
}

fun checkMaxCandyCount(candies: Array<CharArray>, i: Int, j: Int): Int {
    var maxRow = 1
    var maxCol = 1
    var count = 1
    
    for (a in 1 until candies.size) {
        if (candies[i][a-1] == candies[i][a]) {
            count++
            maxRow = maxOf(count, maxRow)
        } else {
            count = 1
        }
    }
    
    count = 1
    for (b in 1 until candies.size) {
        if (candies[b-1][j] == candies[b][j]) {
            count ++
            maxCol = maxOf(count, maxCol)
        } else {
            count = 1
        }
    }
    
    return maxOf(maxRow, maxCol)
}