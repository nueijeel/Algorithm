fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val sb = StringBuilder()
    val list = mutableListOf<Int>()
    
    repeat (n) {
        list.add(readLine().toInt())
    }
    val sortedList = list.sorted()
    
    sortedList.forEach {
        sb.appendLine(it)
    }
    print(sb)
}