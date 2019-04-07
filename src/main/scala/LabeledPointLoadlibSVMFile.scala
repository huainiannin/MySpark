import org.apache.spark.mllib.util.MLUtils
import org.apache.spark.{SparkConf, SparkContext}

/**
* @author qujt
* @date 19-4-7
* @time 下午3:25
* @Description 从文本中load带标签的数据
* @email qujt@inspur.com
* @param
* @retuns
*/
object LabeledPointLoadlibSVMFile {
  def main(args:Array[String]): Unit ={
    val conf = new SparkConf().setMaster("local").setAppName(this.getClass.getSimpleName.filter(!_.equals('$')))
    val sc = new SparkContext(conf)

    val mu = MLUtils.loadLibSVMFile(sc,"/mnt/hdata/sample_libsvm_data.txt")
    mu.foreach(println)
    println(mu.getClass)
    sc.stop
  }

}
