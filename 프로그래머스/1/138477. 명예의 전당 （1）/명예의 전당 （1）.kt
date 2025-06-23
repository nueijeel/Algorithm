class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        
        for (idx in score.indices) {
            var slicedList = score.slice(0..idx).sortedDescending()
            if (slicedList.size > k) {
                answer.add(slicedList[k - 1])
            } else {
                answer.add(slicedList[slicedList.size - 1])
            }
        }
        
        return answer.toIntArray()
    }
}