// 平均点が与えられるボーダーよりも高ければpassを表示する奴

object Main extends App{
    val scoreList = readLine().split(' ').map(_.toInt)
    val scoreBorder = readLine().toInt
    
    var total = 0
    
    for (score <- scoreList) {
        total += score 
    }
    
    val average = total / scoreList.length
    
    if (average >= scoreBorder) {
        println("pass")
    } else {
        println("failure")
    }   
}

/**
- http://www.ne.jp/asahi/hishidama/home/tech/scala/array.html (Scalaの配列(添字ってどうやって取るんや？って思って))
- https://www.qoosky.io/techs/86c5883115 (文字列分割)
- https://qiita.com/ryoppy/items/1185b21a397b3b3e99d1 (splitの仕様確認（Stringを渡すと正規表現扱いになる）)
- http://www.mwsoft.jp/programming/scala/foreach.html (foreachメソッドについて)
*/
