class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val hashMap = HashMap<String, Int>()
        
        for (i in 0 until clothes.size) {
            hashMap[clothes[i][1]] = hashMap.getOrDefault(clothes[i][1], 0) + 1
        }
        
        var result = 1
        for (num in hashMap.values) {
            result *= (num + 1)
        }
        return --result
    }
}