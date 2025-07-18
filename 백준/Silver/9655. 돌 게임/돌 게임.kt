fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    var cnt = 0
    
    while (n > 0) {
        if (n >= 3) {
            n -= 3
            cnt++
        } else {
            n -= 1
            cnt++
        }
    }
    print(if (cnt % 2 == 0) "CY" else "SK")
}