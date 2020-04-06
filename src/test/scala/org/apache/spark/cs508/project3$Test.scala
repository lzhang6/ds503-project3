package org.apache.spark.cs508

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.scalatest.FunSuite

class project3$Test extends FunSuite {
  val conf = new SparkConf().setAppName("cs508")

  val spark = SparkSession
    .builder()
    .config(conf)
    .master("local[*]")
    .getOrCreate()

  test("testProblem_1 read json file") {
    project3.problem_1(spark)
  }

  test("testProblem_1 read csv file") {
    project3.problem_2(spark)
  }
}
