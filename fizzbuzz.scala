// FizzBuzz ver.1
object Main extends App{
    val count = readInt
    
    for (i <- 1 to count) {
        val str = i match {
            case i if i % 15 == 0 => "Fizz Buzz"
            case i if i % 3 == 0 => "Fizz"
            case i if i % 5 == 0 => "Buzz"
            case _ => i
        }
        
        println(str)
    }
}

/**
- http://www.ne.jp/asahi/hishidama/home/tech/scala/match.html
*/
