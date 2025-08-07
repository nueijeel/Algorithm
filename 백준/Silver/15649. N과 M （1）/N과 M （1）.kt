fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    
    backtrack(sb, n, m, mutableListOf<Int>(), BooleanArray(n + 1))
    
    print(sb)
}

fun backtrack(sb: StringBuilder, n: Int, m: Int, path: MutableList<Int>, used: BooleanArray) {
    if (path.size == m) {
        for (i in path.indices) {
            sb.append(path[i])
            if (i != m - 1) sb.append(" ")
        }
        sb.appendLine()
        return
    }
    for (i in 1 .. n) {
        if (!used[i]) {
            path.add(i)
            used[i] = true
            
            backtrack(sb, n, m, path, used)
            
            path.removeAt(path.lastIndex)
            used[i] = false
        }
    }
}