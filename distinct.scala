// 入力された文字が全て同じだったらNGを出す処理

object Main extends App{
    val line = readLine()
    
    if ((line.distinct).length == 1) {
        println("NG")
    } else {
        println("OK")
    }
}

/**
- http://www.mwsoft.jp/programming/scala/scala_string.html（Stringクラスに便利なメソッドがないか探した => 重複削除メソッドを発見）
- http://blog.sarabande.jp/post/61557140715（文字数カウント）
*/
