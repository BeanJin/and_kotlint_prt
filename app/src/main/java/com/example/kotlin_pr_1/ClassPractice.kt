package com.example.kotlin_pr_1

open class Human constructor(name : String = "이름이 읎어") { // constructor은 생략이 가능 / open을 해야 다른 class에서 사용할 수 있다

    constructor(name : String, age : Int ) : this(name) { // 부 생성자는 주 생성자에게 값을 받아와야함
        println("나의 이름은 ${name}, ${age}살 이다")
    }
    init {      // constructor가 많아도 init먼저 출력됨
        println("새로운 사람이 태어났어!!")
    }

    val name = name
    fun eatingCake() {
        println("이건 줜맛탱:)")
    }

    open fun singASong(){
        println("쉬즈고오오오온")
    }
}

class Korean : Human() {
    override  fun singASong(){
        super.singASong()
        println("그으대 기억이이이이이이")
        println("내 이름은 ${name}") // name을 쓸 수 있는 이유는 Human class에서 name : String을 받을 수 있기 때문
    }
}

fun main(){
    val human = Human("이르으음")

    val stranger = Human()

    val mom = Human("쿠리", 44)

    val korean = Korean()
    korean.singASong()

    human.eatingCake()

    println("이 사람의 이름은 ${human.name}")
    println("이 사람의 이름은 ${stranger.name}")
}