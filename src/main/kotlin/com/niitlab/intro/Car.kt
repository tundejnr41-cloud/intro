package com.niitlab.intro

class Car(var name: String) {

    var brand = ""
    var speed = 0.0

    fun drive() {
        println("$name is driving a $brand at $speed km/h")
    }
}

class Calc(var a: Int, var b: Int) {

    constructor(a: Int): this(a,b=10)

    constructor(): this(a = 30, b= 20)

    fun add() = a+b
}