// 引き算する

object Main extends App{
    val numbers = readLine().split(" ").toList.map(x => x.toInt)
    
    val whole = numbers(0)
    val now = numbers(1)

    println(whole - now)
}

/**
- なし
*/
