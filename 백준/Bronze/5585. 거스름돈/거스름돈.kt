fun main() {
    val br = System.`in`.bufferedReader()
    var change = 1000 - br.readLine().toInt()
    val coins = intArrayOf(500, 100, 50, 10, 5, 1)
    
    var changeCount = 0
    coins.forEach { coin ->
        while (change >= coin) {
            change -= coin
            changeCount++
        }
    }
    print(changeCount)
}