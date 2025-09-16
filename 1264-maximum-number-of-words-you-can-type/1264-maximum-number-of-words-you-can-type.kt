class Solution {
    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        val words = text.split(" ")
        var cnt = 0

        words.forEach { word ->
            for (i in 0 until brokenLetters.length) {
                val idx = word.indexOf(brokenLetters[i].toString())
                if (idx != -1) {
                    cnt++
                    break
                }
            }
        }
        return words.size - cnt
    }
}