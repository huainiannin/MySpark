import org.apache.spark.mllib.linalg.Matrices

/**
* @author qujt
* @date 19-4-7
* @time 下午4:42
* @Description分布式矩阵
* @email qujt@inspur.com
* @param
* @retuns
*/
object MatrixLearning {
  def main(args:Array[String]): Unit ={
    val mx = Matrices.dense(2,3,Array(1,2,3,4,5,6))
    println(mx)
    val arr2 = (1 to 6).toArray.map(_.toDouble)
    val mx2 = Matrices.dense(2,3,arr2)
    println(mx2)
    val arr3 = (1 to 20).toArray.map(_.toDouble)
    val mx3 = Matrices.dense(4,5,arr3)
    println(mx3)
    println(mx3(0,0))
    println(mx3(1,1))
    println(mx3(2,2))
  }

}
