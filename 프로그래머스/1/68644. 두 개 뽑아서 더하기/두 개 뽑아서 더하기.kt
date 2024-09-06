class Solution {
    fun solution(numbers: IntArray): IntArray {
        var result = mutableSetOf<Int>()
        
        for (i in numbers.indices) {
            for (j in i+1 until numbers.size) {
                result.add(numbers[i] + numbers[j])
            }
        }
        
        return result.sorted().toIntArray()
    }
}