import scala.util.Random

@main
def main(): Unit = {
  val randomGenerator = new Random
  val sizeList = 10
  val upperLimitValue = 100
  val N = 3

  val listOfNumbers = List.fill(sizeList)(randomGenerator.nextInt(upperLimitValue))
  val sumLastElements = listOfNumbers.takeRight(N).sum

  println(s"List: $listOfNumbers")
  println(s"Sum of the last $N elements: $sumLastElements")
}

