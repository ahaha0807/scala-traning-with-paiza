// 入力された文字が全て同じだったらNGを出す処理

object Main extends App{
    val line = readLine()
    
    if ((line.distinct).length == 1) {
        println("NG")
    } else {
        println("OK")
    }
}
