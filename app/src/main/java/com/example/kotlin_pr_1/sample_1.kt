package com.example.kotlin_pr_1

fun main() {
   helloworld()

    println(add(4, 5))

    // 3. String Template

    val name = "홍진"
    val lastName = " 이"
    println("my name is ${name + lastName}") // <<<< 파이썬의 {}과 비슷함 / 항상 대괄호 넣는다고 생각하기
    println("이건 2\$a다") // \넣으면 기호 사용할 수 있다
}

// 1. 함수

fun helloworld(){
    println("Hello World")
}

fun add(a : Int, b : Int) : Int{
    return a + b
}

// 2. val vs var
// val =value ==> 알아서 Int로 해석 / var 랑 꼭 구분하기 / val은 값을 바꿀 수 없음
// var은 값을 바꿀 수 있음

fun hi(){
    val a : Int = 19

    var b : Int = 9

    b = 100

    val c = 100
    var d = 102

    var name = "홍진"
}