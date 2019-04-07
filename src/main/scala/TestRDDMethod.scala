import org.apache.spark.{SparkConf, SparkContext}

/**
* @author qujt
* @date 19-4-7
* @time 下午8:12
* @Description 测试RDD中的方法
* @email qujt@inspur.com
* @param
* @retuns
*/
object TestRDDMethod {
  def main(args:Array[String]): Unit ={

   // val conf = new SparkConf().setMaster("local")
   //   .setAppName(this.getClass.getSimpleName)
   // val sc = new SparkContext(conf)
   // val rdd = sc.parallelize(Array(1,2,3,4,5,6))
   // val result = rdd.aggregate(4)(Math.max(_,_),_ + _)
   // println(result)
    testRddMethod2()
  }
  def testRddMethod2(): Unit ={

    val conf = new SparkConf().setMaster("local")
      .setAppName(this.getClass.getSimpleName)
    val sc = new SparkContext(conf)
    val rdd = sc.parallelize(Array(1,2,3,4,5,6),2)
    val result = rdd.aggregate(0)(Math.max(_,_),_ + _)
    println(result)
  }

}

