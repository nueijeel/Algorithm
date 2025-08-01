fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var e: Long = 0
    val list = mutableListOf<Pair<Long, Long>>()
    
    var cnt = 0
    repeat (n) {
        val (start, end) = readLine().split(" ").map { it.toLong() }
        list.add(Pair(start, end))
    }
    
    var sortedList = list.sortedWith(compareBy({it.second}, {it.first}))
    
    for ((start, end) in sortedList) {
        if (e <= start) {
            e = end
            cnt++
        }
    }
    
    print(cnt)
}