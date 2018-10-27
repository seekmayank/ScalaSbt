package com.scala.example

class square {
    var length=0

    def funcArea = {
        println("Area of a square is : " + length*length)
    }
}

object ExampleClass {
  def main(args: Array[String]) {
    val c = new square
    c.funcArea
    c.length=5
    c.funcArea
  }
}
