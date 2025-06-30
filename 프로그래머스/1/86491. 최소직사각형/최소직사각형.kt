import kotlin.math.*

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxX = 0
        var maxY = 0
        
        for (idx in 0 until sizes.size) {
            val cx = sizes[idx][0]
            val cy = sizes[idx][1]
            if (cx >= cy) {
                if (maxX < cx) maxX = cx
                if (maxY < cy) maxY = cy
            } else {
                if (maxX < cy) maxX = cy
                if (maxY < cx) maxY = cx
            }
        }
        return maxX * maxY
    }
}