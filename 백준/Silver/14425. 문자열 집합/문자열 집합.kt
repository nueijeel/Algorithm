fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m) = br.readLine().split(" ").map() { it.toInt() }
    val setStr = mutableListOf<String>()
    
    repeat(n) {
        setStr.add(br.readLine())
    }
    
    var result = 0
    repeat(m) {
        if (setStr.contains(br.readLine())) {
            result++
        }
    }

    print(result)
}