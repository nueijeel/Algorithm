fun main() = with(System.`in`.bufferedReader()) {
    val (n, type) = readLine().split(" ").map { it.toString() }
    val map = mutableMapOf<String, Int>()
    
    repeat(n.toInt()) {
        val name = readLine().toString()
        map[name] = map.getOrDefault(name, 0) + 1
    }
    
    val num = if (type == "Y") 1 else if (type == "F") 2 else 3

    print(map.size / num)
}