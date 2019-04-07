import org.apache.spark.{SparkConf, SparkContext}

object MatrixRowLearning {
  def main(args:Array[String]): Unit ={
    val conf = new SparkConf().setMaster("local") .setAppName(this.getClass.getSimpleName.filter(!_.equals("$")))
    val sc = new SparkContext(conf)
    println("First:Matrix")
    val rdd = sc.textFile("")

  }
}
