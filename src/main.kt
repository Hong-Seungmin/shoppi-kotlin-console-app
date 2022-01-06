fun main() {
    println("안녕하세요")
    println("이름을 알려주세요")
    var name: String? = readLine()

    println("""
        안녕하세요 $name 님,
        반갑습니다.
    """.trimIndent())

    val categories = arrayOf("패션", "전자기기", "반려동물용품")
    for (category in categories) {
        println(category)
    }
    println("=> 장바구니로 이동하시려면 #을 입력해주세요.")

    var selectedCategory = readLine()
    while (selectedCategory.isNullOrBlank()) {
        println("값을 다시 입력해주세요.")
        selectedCategory = readLine()
    }

    if (selectedCategory == "#") {
        // TODO 1. 장바구니 이동

    } else {
        // TODO 2. 카테고리 상품 목록 보여주기
        // TODO 3. 카테고리 목록에 없는 값을 입력하는 경우

    }

}