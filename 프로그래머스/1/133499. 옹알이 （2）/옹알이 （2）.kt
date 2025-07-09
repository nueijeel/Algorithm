class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val regex = Regex("aya|ye|woo|ma")
        
        for (word in babbling) {
            if (Regex("(aya){2,}|(ye){2,}|(woo){2,}|(ma){2,}").containsMatchIn(word)) continue
            
            val newWord = word.replace(regex, "")
            if (newWord.isEmpty()) answer++
        }
        
        return answer
    }
}