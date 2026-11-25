package com.niitlab.inventory

fun getProducts(){

    val products = mutableMapOf<String, MutableMap<String, Double>>("name" to mutableMapOf("quantity" to 898.54, "price" to 850.4))

    print("How many products do you want to Enter:")
    val numberOfProducts = readln().toInt()

    for(i in 1..numberOfProducts){
        println("Enter details for Product $i")
        print("Product name:")
        val name = readln()

        print("Quantity:")
        val quantity = readln().toDouble()

        print("Unit Price: ")
        val price = readln().toDouble()

        products[name] = mutableMapOf(
            "quantity" to quantity,
            "price" to price

        )
    }

        // Calculate inventory cost
}