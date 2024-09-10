class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val playerMap = players.withIndex().associate { it.value to it.index }.toMutableMap()
        
        callings.forEach { player ->
            val idx = playerMap[player]!!
            val playerName = players[idx - 1]
            players[idx - 1] = player
            players[idx] = playerName
            
            playerMap[playerName] = idx
            playerMap[player] = idx - 1
        }
        
        return players
    }
}