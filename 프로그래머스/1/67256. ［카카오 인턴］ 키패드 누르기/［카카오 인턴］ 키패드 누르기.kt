class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        var answer = StringBuilder()
        var leftP: Int = 10
        var rightP: Int = 12
        
        numbers.forEach { number ->
            when (number) {
                1, 4, 7 -> {
                    answer.append("L")
                    leftP = number
                }
                3, 6, 9 -> {
                    answer.append("R")
                    rightP = number
                }
                else -> {
                    var num = if (number == 0) 11 else number
                    val leftD = Math.abs(num - leftP) / 3 + Math.abs(num - leftP) % 3
                    val rightD = Math.abs(num - rightP) / 3 + Math.abs(num - rightP) % 3
                    if (leftD == rightD) {
                        if (hand == "right") {
                            answer.append("R")
                            rightP = num
                        } else {
                            answer.append("L")
                            leftP = num
                        }
                    } else if (leftD > rightD) {
                        answer.append("R")
                        rightP = num
                    } else {
                        answer.append("L")
                        leftP = num
                    }
                }
            }
        }
        
        
        return answer.toString()
    }
}