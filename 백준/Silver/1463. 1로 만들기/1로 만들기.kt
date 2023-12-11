fun main(){
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    
    val numList : MutableList<Int> = MutableList(1000001) {0}
    numList[1] = 0
    numList[2] = 1
    numList[3] = 1
    
    if(n>=4){
        for(i in 4..n){
            numList[i] = numList[i-1] + 1
            if(i%3 == 0){
                numList[i] = minOf(numList[i/3] + 1, numList[i])
            }
            if(i%2 == 0){
                numList[i] = minOf(numList[i/2] + 1, numList[i])
            }
        }
    }
    
    print(numList[n])
}