package com.niitlab.intro

class Animal {
    var sound = ""
    var movement = ""
    var name = ""
    var habitat = ""

    fun identify(){
        println("The animal is a ${name} ,it $sound")
        println("The ${name}'s moves by ${movement}")
        println("${name}'s habitat is ${habitat}")
    }
}