fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    val sortedList = list.sorted()
    val x = readLine().toInt()
    var cnt = 0
    var start = 0
    var end = n - 1
    
    while (start < end) {
        if (sortedList[start] + sortedList[end] == x) {
            cnt++
            start++
            end--
        } else if (sortedList[start] + sortedList[end] > x) {
            end--
        } else {
            start++
        }
    }
    print(cnt)
}