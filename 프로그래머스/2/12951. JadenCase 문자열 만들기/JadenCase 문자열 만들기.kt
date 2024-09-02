class Solution {
    fun solution(s: String): String {
        var answer = s.toLowerCase().split(" ").map { word ->
            if (word.isNotEmpty() && word[0].isLetter()) {
                word[0].toUpperCase() + word.substring(1)
            } else {
                word
            }
        }.joinToString(" ")
    
        return answer
    }
}