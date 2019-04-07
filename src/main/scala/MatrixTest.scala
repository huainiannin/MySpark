import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.mllib.regression.LabeledPoint

object MatrixTest {
  def main(args:Array[String]): Unit ={
    println("建立矩阵")
    println("Hello World");
    val vd = Vectors.dense(2,0,6)
    println(vd(2))
    println(vd)

    val vd1 = Vectors.sparse(4,Array(0,1,2,3),Array(9,5,2,7))
    println(vd1(2))
    println(vd1)
    val vd2 = Vectors.sparse(4,Array(0,2,1,3),Array(9,5,2,7))
    println(vd2(2))
    println(vd2)

    println("给向量打标签")

    //val vd = Vectors.dense(2,0,6)
    val pos = LabeledPoint(1,vd);
    println(pos.features)
    println(pos.label)
    println(pos)

    val vs = Vectors.sparse(4,Array(0,1,2,3),Array(9,5,2,7))
    val neg = LabeledPoint(2,vs)
    println(neg.features)
    println(neg.label)
    println(neg)

  }
}
