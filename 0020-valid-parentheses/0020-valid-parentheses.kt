import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        var isBalanced = true

        for (c in s) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c)
            } else if (stack.isNotEmpty() && c == ')') {
                if (stack.peek() == '(') stack.pop() 
                else {
                    isBalanced = false
                    break
                }
            } else if (stack.isNotEmpty() && c == ']') {
                if (stack.peek() == '[') stack.pop() 
                else {
                    isBalanced = false
                    break
                }
            } else if (stack.isNotEmpty() && c == '}') {
                if (stack.peek() == '{') stack.pop() 
                else {
                    isBalanced = false
                    break
                }
            } else {
                isBalanced = false
                break
            }
        }

        return if (stack.isEmpty() && isBalanced) true else false
    }
}