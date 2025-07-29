fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val people = Array(n) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        x to y
    }
    
    val result = IntArray(n) { 1 }
    
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == j) continue
            if (people[j].first > people[i].first && people[j].second > people[i].second) {
                result[i]++
            }
        }
    }
    println(result.joinToString(" "))
}