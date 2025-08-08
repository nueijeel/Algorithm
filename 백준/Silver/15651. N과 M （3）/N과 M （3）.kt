fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    
    backtrack(sb, n, m, mutableListOf<Int>())
    
    print(sb)
}

fun backtrack(sb: StringBuilder, n: Int, m: Int, path: MutableList<Int>) {
    if (path.size == m) {
        for (i in path.indices) {
            sb.append(path[i])
            if (i != m - 1) sb.append(" ")
        }
        sb.appendLine()
        return
    }
    
    for (i in 1 .. n) {
        path.add(i)
        
        backtrack(sb, n, m, path)
        
        path.removeAt(path.lastIndex)
    }
}