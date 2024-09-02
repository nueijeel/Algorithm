class Solution {
    fun solution(left: Int, right: Int): Int {
        var result = 0

        for (num in left..right) {
            val sqrt = Math.sqrt(num.toDouble())
            if (sqrt == sqrt.toInt().toDouble()) {
                // 약수의 개수가 홀수인 경우 (제곱근이 정수일 때)
                result -= num
            } else {
                // 약수의 개수가 짝수인 경우
                result += num
            }
        }

        return result
    }
}