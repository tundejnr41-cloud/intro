package com.niitlab.collections

fun Listz(){
    var fruits = listOf("Apple","Pear","Grapes","Strawberry","Pineapple")
    var mutableFruits = mutableListOf("Apple","Pear","Grapes","Strawberry")

    println(mutableFruits)

    for(fruit in fruits){
        println(fruit)
    }
}