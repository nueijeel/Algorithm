class Solution {
    fun solution(a: Int, b: Int): String {
        val dayOfTheWeek = mapOf<Int, String>(0 to "FRI", 1 to "SAT", 2 to "SUN", 3 to "MON", 4 to "TUE", 5 to "WED", 6 to "THU")
        val dayCount = mapOf<Int, Int>(1 to 31, 2 to 29, 3 to 31, 4 to 30, 5 to 31, 6 to 30, 7 to 31, 8 to 31, 9 to 30, 10 to 31, 11 to 30, 12 to 31)
        
        var days = 0
        for (i in 1 until a) {
            days += dayCount[i]!!
        }
        
        return dayOfTheWeek[(days + b - 1) % 7]!!
    }
}