package com.scala.example

object ExampleFileRead {
  def main(args: Array[String]) {

    val bufferedSource = io.Source.fromFile("src/main/resources/data/June13_data.csv")
    for (line <- bufferedSource.getLines) {
      val Array(month, revenue) = line.split(",").map(_.trim)
      val mon=month
      println(line)

    }
  }
}