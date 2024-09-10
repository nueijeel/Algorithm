class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = IntArray(2, {0})
        
        for (height in 1 .. yellow) {
            val leftTile = brown - (height * 2)
            if (yellow % height != 0) continue
            if (leftTile / 2 - 2 == yellow / height) {
                answer[1] = leftTile / 2
                answer[0] = height + 2
            }
        }
        
        return answer
    }
}