fun main() {
    val br = System.`in`.bufferedReader()
    var (n, k) = br.readLine().split(" ").map() { it.toInt() }
    val arr = IntArray(n)
    
    for(i in 0 until n) {
        arr[i] = br.readLine().toInt()
    }
    
    var result = 0
    for (j in n-1 downTo 0) {
        if (arr[j] <= k) {
            result += k / arr[j]
            k %= arr[j]
        }
    }
    
    print(result)
}