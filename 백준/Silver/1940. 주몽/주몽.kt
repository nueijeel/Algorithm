fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    val ingredients = br.readLine().split(" ").map() { it.toInt() }.sorted()
    
    var start = 0
    var end = n - 1
    var cnt = 0
    
    while (start < end) {
        var sum = ingredients[start] + ingredients[end]
        if (m < sum) end--
        else if (m > sum) start++
        else {
            cnt++
            end--
            start++
        }
    }
    print(cnt)
}