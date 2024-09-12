class Solution {
    var zero = 0
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        
        var newString = s
        var cnt = 0
        
        while (newString.length > 1) {
            newString = convertToBinary(newString)
            cnt++
        }
        
        answer = intArrayOf(cnt, zero)
        
        return answer
    }
    
    fun convertToBinary(str: String): String {
        // 0제거
        var newString = str.replace("0", "")
        var len = newString.length
        zero += str.length - len
        
        // 이진변환
        var binaryResult = ""
        while (len > 1) {
            binaryResult = (len % 2).toString() + binaryResult
            len /= 2
        }
        return "1" + binaryResult
    }
}