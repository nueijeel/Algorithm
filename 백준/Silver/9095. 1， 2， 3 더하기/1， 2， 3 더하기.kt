fun main(){
    val br = System.`in`.bufferedReader()
    val t = br.readLine().toInt()
    
    val countList: MutableList<Int> = MutableList(12) {0}
    countList[1] = 1
    countList[2] = 2
    countList[3] = 4
    
    for(i in 1..t){
        val n = br.readLine().toInt()
        for(i in 4..n){
            countList[i] = countList[i-1] + countList[i-2] + countList[i-3]
        }
        println(countList[n])
    }
}