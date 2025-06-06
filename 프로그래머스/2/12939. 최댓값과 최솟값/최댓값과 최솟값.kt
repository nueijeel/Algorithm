class Solution {
    fun solution(s: String): String {
        var list = s.split(" ").map { it.toInt() }
        var newList = list.sorted()
        return "${newList[0]} ${newList[newList.size - 1]}"
    }
}