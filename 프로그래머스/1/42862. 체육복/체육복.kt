class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val lostList = lost.toMutableList()
        val reserveList = reserve.toMutableList()
        
        val intersection = lostList.intersect(reserveList)
        lostList.removeAll(intersection)
        reserveList.removeAll(intersection)
        
        lostList.sort()
        reserveList.sort()
        
        for (r in reserveList) {
            when {
                lostList.contains(r - 1) -> lostList.remove(r - 1)
                lostList.contains(r + 1) -> lostList.remove(r + 1)
            }
        }
        
        return n - lostList.size
    }
}