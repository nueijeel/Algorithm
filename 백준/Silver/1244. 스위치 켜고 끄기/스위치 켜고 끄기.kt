fun main() = with(System.`in`.bufferedReader()) {
    val cnt = readLine().toInt()
    val switches = readLine().split(" ").map { it.toInt() }.toMutableList()
    val people = readLine().toInt()
    val sb = StringBuilder()
    
    repeat(people) {
        val (gender, num) = readLine().split(" ").map { it.toInt() }
        if (gender == 1) {
            for (idx in num .. cnt step num) {
                switches[idx - 1] = switches[idx - 1].xor(1)
            }
        } else {
            val idx = num - 1
            switches[idx] = switches[idx].xor(1)
            var lidx = idx - 1
            var ridx = idx + 1
            
            while (lidx >= 0 && ridx < cnt) {
                if (switches[lidx] == switches[ridx]) {
                    switches[lidx] = switches[lidx].xor(1)
                    switches[ridx] = switches[ridx].xor(1)
                    lidx--
                    ridx++
                } else break
            }
        }
    }
    for (i in switches.indices) {
        sb.append(switches[i]).append(" ")
        if ((i + 1) % 20 == 0) sb.appendLine()
    }
    if (switches.size % 20 != 0) sb.appendLine()
    print(sb)
}