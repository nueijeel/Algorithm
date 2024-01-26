fun main() {
    val br = System.`in`.bufferedReader()
    val heights: MutableList<Int> = mutableListOf()
    
    for(i in 0..8) {
        heights.add(br.readLine().toInt())
    }
    
    heights.sort()
    val sumHeights = heights.sum()
    
    for(i in 0..7) {
        for(j in (i+1)..8) {
            if (sumHeights - heights[i] - heights[j] == 100){
                heights.removeAt(j)
                heights.removeAt(i)
                
                heights.forEach { height ->
                    println(height)
                }
                return
            }
        }
    }
}