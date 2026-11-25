package com.niitlab.intro

class Tesla :Vehicle() {

    override fun startEngine() {
        println("Starting Tesla")
    }
    override fun fuelUp() {
        println("Fueling up Tesla...")
    }
    override fun stopEngine() {
        println("Stopping Tesla")
    }


}