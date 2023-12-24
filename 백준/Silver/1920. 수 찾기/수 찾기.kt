fun main(){
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val arrayN = br.readLine().split(" ").map { it.toInt() }.sorted()
    val m = br.readLine().toInt()
    val arrayM = br.readLine().split(" ").map { it.toInt() }
    
    arrayM.forEach{ num ->
        println("${binarySearch(0, n-1, num, arrayN)}")
    }
}

fun binarySearch(start: Int, end: Int, target: Int, array: List<Int>): Int {
    var idxStart = start
    var idxEnd = end

    while (idxStart <= idxEnd) {
        val mid = (idxStart + idxEnd) / 2

        when {
            array[mid] == target -> return 1
            array[mid] > target -> idxEnd = mid - 1
            else -> idxStart = mid + 1
        }
    }

    return 0
}