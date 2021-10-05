fun main() {
    var n = 0
    var z = 0
    val s = readLine()
    if (s != null) {
        var count = s.toIntOrNull()
        if (count != null) {
            while (count>0) {
                z++
                if (count % 10 % 3 == 0){
                    n = z
                }
                count/=10
            }
        } else println("Incorrect count")
    } else println("Error write")
    println(n)
}