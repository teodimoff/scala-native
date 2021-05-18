final class TestAlloc(val l1: Long, val l2: Long)

object GCPrealloc {
  def main(args: Array[String]): Unit = {

    //val times = args.lift(0).getOrElse("10000000").toInt
    val times = 10000000

    val startTime = System.nanoTime()

    val testAlloc = (1 to times).map(i => new TestAlloc(i, i + 1))

    val stopTime = System.nanoTime()

    val initialHeap = System.getProperty("GC_INITIAL_HEAP_SIZE")

    System.out.println(
      s"Allocating $times with GC_INITIAL_HEAP_SIZE=$initialHeap TestAlloc objects takes: " + (stopTime - startTime) / 1000 / 1000 + " millis.")

  }

}
