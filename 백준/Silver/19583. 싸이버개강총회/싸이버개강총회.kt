fun main() {
    val br = System.`in`.bufferedReader()
    val times = br.readLine().split(" ").map() { it.replace(":", "").toInt() }
    val participants = HashSet<String>()
    val validParticipants = HashSet<String>()
    
    while(true) {
        val record = br.readLine() ?: break
        val (time, nickname) = record.split(" ")
        val formattedTime = time.replace(":", "").toInt()
        
        if (formattedTime <= times[0]) {
            participants.add(nickname)
        } else if (formattedTime in times[1]..times[2]) {
            if (participants.contains(nickname) && !validParticipants.contains(nickname)) {
                validParticipants.add(nickname)
            }
        }
    }
    print(validParticipants.size)
}