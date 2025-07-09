class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        var answer = mutableListOf<Int>()
        val hash = mutableMapOf<String, Pair<Int, String>>()
        
        for (record in records) {
            val (time, carNum, type) = record.split(" ")
            // type이 IN인 경우
            if (type == "IN") {
                val (count, _) = hash.getOrDefault(carNum, Pair(0, time))
                hash[carNum] = Pair(count, time)
            } else {
                val pair = hash[carNum]!!
                val (hour, min) = pair.second.split(":").map {it.toInt()}
                val (outHour, outMin) = time.split(":").map {it.toInt()}
                val acTime = (outHour - hour) * 60 + (outMin - min)
                hash[carNum] = Pair(pair.first + acTime, "")
            }
        }
        
        hash.forEach { key, value ->
            if (value.second.isNotEmpty()) {
                val (hour, min) = value.second.split(":").map {it.toInt()}
                val acTime = (23 - hour) * 60 + (59 - min)
                hash[key] = Pair(value.first + acTime, "")
            }
        }
        
        hash.entries.sortedBy { it.key }.forEach { (_, value) ->
            val fee = if (value.first > fees[0]) {
                fees[1] + ((value.first - fees[0]) / fees[2] + if ((value.first - fees[0]) % fees[2] == 0) 0 else 1) * fees[3]
            } else {
                fees[1]
            }
            answer.add(fee)
        }
        
        return answer.toIntArray()
    }
}