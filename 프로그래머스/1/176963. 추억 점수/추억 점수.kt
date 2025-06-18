class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val answer = IntArray(photo.size) { 0 }
        val scoreMap = mutableMapOf<String, Int>()
        
        for (idx in name.indices) {
            scoreMap.put(name[idx], yearning[idx])
        }
        
        for (i in 0 until photo.size) {
            var cnt = 0
            for (j in 0 until photo[i].size) {
                if (scoreMap.containsKey(photo[i][j])) {
                    cnt += scoreMap[photo[i][j]]!!
                }
            }
            answer[i] = cnt
        }
        
        return answer
    }
}