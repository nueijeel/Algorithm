import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m) = br.readLine().split(" ").map() { it.toInt() }
    val members = TreeMap<String, String>()
    
    for (i in 0 until n) {
        val teamName = br.readLine()
        val memberCount = br.readLine().toInt()
        
        repeat(memberCount) {
            members[br.readLine()] = teamName
        }
    }
    
    repeat(m) {
        val answer = br.readLine()
        // 팀이름
        if (br.readLine().toInt() == 1) {
            println(members[answer])
        } else { // 멤버이름 사전순 출력
            members.forEach { key, value ->
                if (value == answer) {
                    println(key)
                }
            }
        }
    }
}