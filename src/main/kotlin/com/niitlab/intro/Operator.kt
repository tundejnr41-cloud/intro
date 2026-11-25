package com.niitlab.intro

class Operator {
    var num1 = readln().toInt()
    var num2 = readln().toInt()

    var operator = readln()
    init {
        if(num1 <= 0 || num2 <= 0){
            throw IllegalArgumentException("Values must be greater than 0.")
        }
    }


    fun add() {
        var sum = num1 + num2
        println("sum = $sum")
    }
    fun minus() {
        var difference = num1 - num2
        println("difference = $difference")

    }
    fun multiply() {
        var product = num1 * num2
        println("product = $product")
    }
    fun divide() {
        var quotient = num1 / num2
        println("quotient = $quotient")
    }
    fun greater(num1: Int,num2: Int){
        if(num1 > num2){
            println("num1 $num1 is greater")
        }else if(num2 > num1){
            println("num2 $num2 is greater")
        }else println("They are equal")
    }
    fun lessThan(num1: Int,num2: Int){
        if(num1 < num2){
            println("num1 $num1 is less than")
        }else if(num2 < num1){
            println("num2 $num2 is less than")
        }else println("They are equal")
    }

    fun calculate(){
         when(operator){
            "+" -> add()
            "-" -> minus()
            "*" -> multiply()
            "/" -> divide()
            ">" -> greater(num1, num2)
            "<" -> lessThan(num1, num2)
            else -> println("Invalid operator")
        }
        return calculate()

    }




}