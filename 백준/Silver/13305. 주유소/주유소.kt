fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val roads = readLine().split(" ").map { it.toLong() }
    val prices = readLine().split(" ").map { it.toLong() }
    var minPrice: Long = prices[0]
    var totalPrice: Long = 0
    
    for (idx in 0 until n - 1) {
        if (prices[idx] < minPrice) {     
            minPrice = prices[idx]
        }
        totalPrice += (minPrice * roads[idx])
    }
    print(totalPrice)
}