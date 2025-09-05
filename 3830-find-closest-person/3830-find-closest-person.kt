class Solution {
    fun findClosest(x: Int, y: Int, z: Int): Int {
        val dx = abs(z - x)
        val dy = abs(z - y)

        return if (dx > dy) 2 else if (dy > dx) 1 else 0
    }
}