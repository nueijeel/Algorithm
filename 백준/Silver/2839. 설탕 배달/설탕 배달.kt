fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    
    val sugar: MutableList<Int> = MutableList(5001) { 0 }
    
    sugar[3] = 1
    sugar[4] = -1
    sugar[5] = 1
    
    if(n>=6){
        for(i in 6..n){
            if(sugar[i-5] != -1 && sugar[i-5] != 0){
                sugar[i] = sugar[i-5] + 1
            }
            else if(sugar[i-3] != -1 && sugar[i-3] != 0){
                sugar[i] = sugar[i-3] + 1
            }
            else{
                sugar[i] = -1
            }
        }
    }
    
    print(sugar[n])
}