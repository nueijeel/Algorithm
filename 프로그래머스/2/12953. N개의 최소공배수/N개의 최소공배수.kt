class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 0
        val list = arr.sorted()
        answer = list[list.size - 1]
        
        while (true) {
            var cnt = 0
            for (idx in 0 until list.size - 1) {
                if (answer % list[idx] != 0) {
                    cnt++
                }
            }
            if (cnt != 0) answer += list[list.size - 1] else break
        }
        
        return answer
    }
}