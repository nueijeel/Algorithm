class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var cards1Idx = 0
        var cards2Idx = 0
        for (word in goal) {
            if (cards1Idx <= cards1.size - 1 && cards1[cards1Idx] == word) {
                cards1Idx++
            } else if (cards2Idx <= cards2.size - 1 && cards2[cards2Idx] == word) {
                cards2Idx++
            } else {
                return "No"
                break
            }
        }
        return "Yes"
    }
}