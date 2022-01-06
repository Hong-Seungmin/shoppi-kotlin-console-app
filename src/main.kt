fun main() {
    println("안녕하세요")
    println("이름을 알려주세요")
    var name: String? = readLine()

    println("""
        안녕하세요 $name 님,
        반갑습니다.
    """.trimIndent())
}