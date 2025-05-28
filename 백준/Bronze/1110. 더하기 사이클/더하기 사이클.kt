fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    
    var newValue = 0
    var count = 0
    
    var plus = if (n > 9) {
        (n / 10) + (n % 10)
    } else {
        n
    }
    newValue = (n % 10) * 10 + (plus % 10)
    count++
    
    while(n != newValue) {
        var plus = if (newValue > 9) {
            (newValue / 10) + (newValue % 10)
        } else {
            newValue
        }
        newValue = (newValue % 10) * 10 + (plus % 10)
        count++
    }
    print(count)
}