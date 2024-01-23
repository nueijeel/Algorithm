fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    
    print(checkSubTotal(n))
}

fun checkSubTotal(n: Int): Int {
    for (i in 1..n) {
        var total = i
        var _i = i
        while(_i != 0) {
            total += (_i % 10)
            _i /= 10
        }
        if (total == n) {
            return i
        }
    }
    return 0
}