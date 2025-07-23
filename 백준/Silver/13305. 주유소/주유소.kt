fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val roads = readLine().split(" ").map { it.toInt() }
    val prices = readLine().split(" ").map { it.toInt() }
    var minPrice = prices[0]
    var totalPrice = 0
    
    totalPrice += (minPrice * roads[0])
    for (idx in 1 until n - 1) {
        if (prices[idx] < minPrice) {     
            minPrice = prices[idx]
        }
        totalPrice += (minPrice * roads[idx])
    }
    print(totalPrice)
}