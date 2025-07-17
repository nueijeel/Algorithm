fun main() = with(System.`in`.bufferedReader()) {
    val m = readLine().toInt()
    var s = 0
    val sb = StringBuilder()
    
    repeat (m) {
        val input = readLine().split(" ")
        when (input[0]) {
            "add" -> {
                val num = input[1].toInt()
                s = s or (1 shl num)
            }
            "remove" -> {
                val num = input[1].toInt()
                s = s and (1 shl num).inv()
            }
            "check" -> {
                val num = input[1].toInt()
                sb.appendLine(if (s and (1 shl num) != 0) 1 else 0)
            }
            "toggle" -> {
                val num = input[1].toInt()
                s = s xor (1 shl num)
            }
            "all" -> s = (1 shl 21) - 1
            "empty" -> s = 0
        }
    }
    print(sb)
}