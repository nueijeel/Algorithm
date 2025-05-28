fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    var count = n
    
    for (i in 0..n-1) {
        val word = br.readLine()
        var alphabet = mutableSetOf(word[0])
        for (idx in 1..word.length-1) {
            val ch = word[idx]
            if (alphabet.contains(ch) && ch != word[idx-1]) {
                count--
                break
            } else {
                alphabet.add(ch)
            }
        }
    }
    print(count)
}