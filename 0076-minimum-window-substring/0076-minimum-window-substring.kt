class Solution {
    fun minWindow(s: String, t: String): String {
        val tMap = mutableMapOf<Char, Int>()
        val currentMap = mutableMapOf<Char, Int>()

        for (c in t) {
            tMap[c] = tMap.getOrDefault(c, 0) + 1
        }

        var result = ""
        var resultLen = Int.MAX_VALUE
        val tSize = tMap.size
        var cnt = 0 
        var start = 0

        for (end in s.indices) {
            val c = s[end]
            currentMap[c] = currentMap.getOrDefault(c, 0) + 1

            if (tMap.containsKey(c) && currentMap[c] == tMap[c]) cnt++

            while (cnt == tSize) {
                if ((end - start + 1) < resultLen) {
                    result = s.substring(start, end + 1)
                    resultLen = end - start + 1
                }

                val leftChar = s[start]
                currentMap[leftChar] = currentMap[leftChar]!! - 1
                
                if (tMap.containsKey(leftChar) && currentMap[leftChar]!! < tMap[leftChar]!!) cnt--
                start++
            }
        }
        return result
    }
}