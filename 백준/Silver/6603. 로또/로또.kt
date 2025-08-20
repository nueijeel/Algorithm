fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    while (true) {
        val lottoSet = readLine().split(" ").map { it.toInt() }
        val k = lottoSet[0]
        if (k == 0) break
        
        backtrack(sb, lottoSet.slice(1..k), mutableListOf<Int>(), 0)
        sb.appendLine()
    }
    print(sb)
}

fun backtrack(sb: StringBuilder, s: List<Int>, path: MutableList<Int>, start: Int) {
    if (path.size == 6) {
        sb.appendLine(path.joinToString(" "))
        return
    }
    
    for (i in start until s.size) {
        path.add(s[i])
        backtrack(sb, s, path, i + 1)
        path.removeAt(path.lastIndex)
    }
}