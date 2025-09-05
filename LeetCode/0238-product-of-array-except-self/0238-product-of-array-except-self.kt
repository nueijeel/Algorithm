class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        // 전체 곱을 구한 뒤
        // 해당 배열 요소로 나눈 값을 출력 -> 0이 있을 경우 불가능..

        // 그럼 0이 있는지 검사
        // 있으면 - 0을 뺀 전체 곱을 구한뒤 해당 요소가 0일때만 전체곱, 나머지는 0 출력
        // 없으면 - 전체 곱 구한뒤 해당 요소로 나눈 값 출력
        val answer = IntArray(nums.size)
        var num = 1
        val isArrayHasZero = if (nums.indexOf(0) == -1) false else true
        var zeroCnt = 0

        nums.forEach {
            if (it != 0) num *= it
            else zeroCnt++
        }

        nums.forEachIndexed { idx, value ->
            if (isArrayHasZero) {
                answer[idx] = 
                if (value == 0) {
                    if (zeroCnt > 1) 0 else num
                } else 0
            } else {
                answer[idx] = num / value
            }
        }
        
        return answer
    }
}