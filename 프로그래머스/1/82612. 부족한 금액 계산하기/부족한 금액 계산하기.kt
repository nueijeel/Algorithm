import kotlin.math.*

class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var totalPrice: Long = 0
        
        for (i in 1..count) {
            totalPrice += price * i
        }
        
        return if (money >= totalPrice) 0 else totalPrice - money
    }
}