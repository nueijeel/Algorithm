fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, Int>()
    val sb = StringBuilder()
    
    for (i in 1 .. n) {
        val word = readLine().toString()
        if (word.length < m) continue
        map[word] = map.getOrDefault(word, 0) + 1
    }
    
    val sortedMap = map.entries.sortedWith(
        compareByDescending<Map.Entry<String, Int>> { it.value }
            .thenByDescending { it.key.length }
            .thenBy { it.key }
    )
    
    sortedMap.forEach { entry ->
        sb.appendLine(entry.key)
    }
    print(sb)
}