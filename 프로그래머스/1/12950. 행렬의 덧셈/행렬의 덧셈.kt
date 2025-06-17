class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arr1
        
        for (i in 0 until answer.size) {
            for (j in 0 until answer[0].size) {
                answer[i][j] += arr2[i][j]
            }
        }
        
        return answer
    }
}