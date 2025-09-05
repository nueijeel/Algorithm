/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    // node : 현재 노드가 가진 값
    // next : 다음 노드를 가리키는 참조(없으면 null)
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val result = ListNode(0)
        var tail = result

        var l1 = list1
        var l2 = list2

        while (l1 != null && l2 != null) {
            if (l1.`val` < l2.`val`) {
                tail.next = l1
                l1 = l1.next
            } else {
                tail.next = l2
                l2 = l2.next
            }
            tail = tail.next!!
        }

        if (l1 != null) tail.next = l1
        if (l2 != null) tail.next = l2

        return result.next
    }
}