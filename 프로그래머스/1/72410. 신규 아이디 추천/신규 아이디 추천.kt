class Solution {
    fun solution(new_id: String): String {
        var str = new_id.toLowerCase()
        
        str = str.replace(Regex("[^a-z0-9-_.]"), "")
        str = str.replace(Regex("[.]{2,}"), ".")
        str = str.removePrefix(".").removeSuffix(".")
        if (str.isEmpty()) str = "a"
        if (str.length >= 16) str = str.substring(0,15).removeSuffix(".")
        
        while (str.length <= 2) {
            str += str.last()
        }
        
        return str
    }
}