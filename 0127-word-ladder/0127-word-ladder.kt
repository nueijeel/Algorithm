import java.util.*

class Solution {
    fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
        val wordSet = wordList.toHashSet()

        if (endWord !in wordSet) return 0

        val queue: Queue<Pair<String, Int>> = LinkedList()
        queue.offer(beginWord to 1)

        while (queue.isNotEmpty()) {
            val (word, steps) = queue.poll()

            if (word == endWord) return steps

            val chars = word.toCharArray()
            // 현재 단어에서 한 글자씩 바꿔서 인접 단어 만들기
            for (i in chars.indices) {
                val original = chars[i]
                for (ch in 'a'..'z') {
                    if (ch == original) continue
                    chars[i] = ch
                    val newWord = String(chars)
                    // 새로 만든 단어가 해쉬셋에 있고 아직 방문하지 않았다면
                    if (newWord in wordSet) {
                        // 방문처리
                        queue.offer(newWord to steps + 1)
                        wordSet.remove(newWord)
                    }
                }
                chars[i] = original
            }
        }
        return 0
    }
}