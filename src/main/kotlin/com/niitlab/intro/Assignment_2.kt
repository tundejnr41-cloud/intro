package com.niitlab.intro

fun main(){
    print("Enter n1:")
    val n1 = readln().toInt()
    print("Enter n2:")
    val n2 = readln().toInt()
    print("Enter n3:")
    val n3 = readln().toInt()
    print("Enter n4:")
    val n4 = readln().toInt()
    print("Enter n5:")
    val n5 = readln().toInt()

    digitProcess(n1, n2, n3, n4, n5)
}

fun digitProcess(n1: Int, n2: Int, n3: Int, n4: Int, n5: Int){

    var digits = listOf(n1,n2,n3,n4,n5)
    println(digits)

    var sum = 0
    for(digit in digits){
        sum += digit
    }
    println("........processing SUM")
    println("Sum = $sum")

    var average = sum / 5
    println("........processing AVERAGE")
    println("Average = $average")
}




