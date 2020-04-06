package org.apache.spark.cs508

import org.apache.spark.sql.SparkSession

object project3 {
  def problem_1(spark: SparkSession): Unit ={
    val df = spark.read
      .json("./people.json")

    df.show(5)
  }

  def problem_2(spark: SparkSession): Unit ={
    val df = spark.read
      .csv("./people.csv")

    df.show(5)
  }
}
