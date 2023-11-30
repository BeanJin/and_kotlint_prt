package com.example.kotlin_pr_1

// 1. Lamda
// 람다식은 우리가 마치 value 처럼 다를 수 있는 익명함수.
// 익명함수 :
// value처럼 다룰 수 있다 :
// 1) 메소드의 파라미터로 념겨줄 수 있다. fun maxBy(a : Int)
// 2) return 값으로 사용할 수 있다.

// Lamda 기본정의
// val lamdaName : Type = {argumentList -> codeBody}


val square : (Int) -> (Int) = {number -> number * number}

val nameAge = {name : String, age : Int ->
    "내 이름은 ${name} 나이는 ${age}"
}

fun main() {
    println(square(12))
    println(nameAge("홍진", 25))

    val a = "내가 말한다 "
    val b = "네가 말한다 "

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("김철수", 26))

    println(calculateGrade(97))

    val lamda = {number : Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))

    println(invokeLamda { it > 3.22 })

}

// 확장함수

val pizzaIsGreat : String.() -> String = {
    this + "피자는 최고야!"
}

fun extendString(name : String, age : Int) : String{
    val introduceMyself : String.(Int) -> String = {"나는 ${this} 그리고 ${it}살 이다"}
    return  name.introduceMyself(age)
}

// 람다의 Return

val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "실패"
        in 41..70 -> "통과"
        in 71..100 -> "완벽"
        else -> "에러"
    }
}

// 람다를 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}

