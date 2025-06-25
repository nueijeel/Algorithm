class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): MutableList<Int> {
        var answer = mutableListOf<Int>()
        
        for (idx in 0 until commands.size) {
            val command = commands[idx]
            val newList = array.slice(command[0] - 1 until command[1]).sorted()
            answer.add(newList[command[2] - 1])
        }
        
        return answer
    }
}