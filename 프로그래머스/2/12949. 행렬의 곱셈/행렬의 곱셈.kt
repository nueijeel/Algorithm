class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): MutableList<MutableList<Int>> {
        var answer = mutableListOf<MutableList<Int>>()
        
        for (i in 0 until arr1.size) {
            var list = mutableListOf<Int>()
            for (j in 0 until arr2[0].size) {
                var sum = 0
                for (k in 0 until arr2.size) {
                    sum += arr1[i][k] * arr2[k][j]
                }
                list.add(sum)
            }
            answer.add(list)
        }
        
        return answer
    }
}