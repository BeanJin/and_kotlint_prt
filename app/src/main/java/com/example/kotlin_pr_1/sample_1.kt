package com.example.kotlin_pr_1

fun main() {

    // checkNum(90)
   // helloworld()

    // println(add(4, 5))

    // 3. String Template

    // val name = "홍진"
    // val lastName = " 이"
    // println("my name is ${name + lastName}") // <<<< 파이썬의 {}과 비슷함 / 항상 대괄호 넣는다고 생각하기
    // println("이건 2\$a다") // \넣으면 기호 사용할 수 있다

    // forAndWhile()

    nullcheck()
    ignoreNulls("lhj7234@naver.com")
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

// 4. 조건식

fun maxBy(a : Int, b : Int) : Int {
    if(a > b) {
        return a
    }
    else{
        return b
    }
}

fun maxBy2(a : Int, b : Int) = if(a > b) a else b

// 이부분은 Statement
fun checkNum(score : Int) {
    when(score) {
        0 -> println("이건 0")
        1 -> println("이건 1")
        2, 3-> println("이건 2 아님 3")
    }

    // 이부분은 Expression / 코틀린의 모든 함수는 Expression

    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("똑똑하네")
        in 10..80 -> println("적당하네")
        else -> println("큰일났네")
    }
}

// 5 Array / List

// Array

// List 1. Imutable << 수정X List 2. MutableList << 수정O

fun array(){
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    var result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20) // list a<<< 이걸 가르킴 list b
}

// 6. For / While

fun forAndWhile() {

    val students = arrayListOf("aaa", "bbb", "ccc", "ddd", "eee")

    for(name in students) {
        println("${name}")
    }

    var sum = 0 // a..b << a부터 b까지 더해준다 / a..b step c << c칸씩 이동 / b downTo a << 역순 / a until b << a부터 b전까지
    for ( i in 10 downTo 1){
        sum += i
    }
    println(sum)

    for ((index, name)in students.withIndex()) {
        println("${index + 1}번째 학생 : ${name}")
    }

    var index = 0
    while(index < 10){
        println("인덱스 값 : ${index}")
        index++
    }
}

// 7. Nullable / NonNull

fun nullcheck(){
    // NPE : NULL pointer Exception <<< 자바에선 실행해봐야 알수있는데 코틀린에서는 ?를 쓰면 확인이 가능함 << nullable타입이 됨

    var name : String = "홍진"

    var nullName : String? = null // << null타입을 만들고싶으면 타입을 생략하면 안됨

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpperCase = nullName?.toUpperCase()   // << null이 아니면 toUpperCase()이고 null이면 null을 반환함

    // ?: << 엘비스프리슨

    val lastName : String? = "이"

    val fullName = name + " " + (lastName?: "No lastName") // << null이면 No lastName을 출력, 아니면 그대로 출력

    println(fullName)

}

fun ignoreNulls(str : String?){    // !! << null이 아니라고 보증해준다 << 컴파일러에게 강제로 지정
    val mNotNull : String = str!!
    val upper= mNotNull.toUpperCase()

    val email : String? = "lhj7234@naver.com"
    email?.let{
        println("my email is ${email}")
    }
}