fun main() {
    val br = System.`in`.bufferedReader()
    val (E, S, M) = br.readLine().split(" ").map() { it.toInt() }
    var cnt = 1
    
    while(true) {
        val e = if (E == 15) 0 else E
        val s = if (S == 28) 0 else S
        val m = if (M == 19) 0 else M
        if(cnt % 15 == e && cnt % 28 == s && cnt % 19 == m) {
            print(cnt)
            break
        }
        cnt ++
    }
}