import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import scala.collection.mutable.ListBuffer
import archery._

object Main {
  def main(args: Array[String]): Unit = {

	val carPoints = sc.textFile("car.csv")
	val K = 5
    val carRDD = carPoints.map {
      line =>
      {
        val arr = line.split(",")
        (arr(0).toLong,arr(2).toFloat,arr(3).toFloat)
      }
    }
	var finalTree:RTree[Double] = RTree(Entry(Point(-1,-1),-1.0))
	val carMap = carRDD.collect
	for(i <- 0 to carMap.length-1)
	{
	finalTree = finalTree.insert(Entry(Point(carMap(i)._2,carMap(i)._3),carMap(i)._1))
	}
	
  var nearestKCars = carRDD.map{case(carID,carX,carY) => {
	var nearCarID = new ListBuffer[Long]()
    var nearestK = finalTree.nearestK(Point(carX,carY),K+1).foreach{case(Entry(Point(x,y),id)) => {nearCarID += id.toLong}}
    (carID,nearCarID)
  }}
	
	nearestKCars.foreach(println)
  }
}
