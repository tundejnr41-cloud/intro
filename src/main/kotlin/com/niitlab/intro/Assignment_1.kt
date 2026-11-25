package com.niitlab.intro

fun main(){
    print("Enter your full name:")
    val name = readln()
    print("Your Java score:")
    var javaScore = readln().toInt()
    print("Your Python score:")
    var pythonScore = readln().toInt()
    print("Your HTML5 score:")
    var html5Score = readln().toInt()

    val average = averageScore(javaScore, pythonScore, html5Score)

    val grade = grades(average)

    println("................Processing")

    println("Student:$name")
    println("Average:$average")
    println(grade)

}
fun averageScore(javaScore: Int, pythonScore: Int, html5Score: Int): Int {
    return (javaScore + pythonScore + html5Score) / 3
}

fun grades(average: Int): Any {
  return if(average in 90..<100){
       "Grade A"
   }else if(average in 75..<90){
       "Grade B"
   }else if(average in 50..<75){
       "Grade C"
   }else if(average < 50){
       "Grade F"
   }else println("Invalid Grade Score")
}