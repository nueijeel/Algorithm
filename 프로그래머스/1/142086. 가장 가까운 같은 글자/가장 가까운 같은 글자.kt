class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = IntArray(s.length) { -1 }
        val map: HashMap<Char, Int> = HashMap()
        
        for (idx in s.indices) {
            if (map.containsKey(s[idx])) {
                answer[idx] = idx - map[s[idx]]!!
            }
            map[s[idx]] = idx
        }
        
        return answer
    }
}