class Chapter3 {

    fun fun3() {

        val number1 = 3

        /**
         * 코틀린에서는 명시적으로 바꿔줘야함
         */
        val number2: Long = number1.toLong()

    }

    fun printAgeIfPersonKotlin(obj: Any) {
        if (obj is Person) {
            //val person = obj as Person // as 변수 == java의 instanceOf -> as 는 생략할 수 있음
            //println(person.age)
            println(obj.age) // -> as 생략해도 코틀린이 obj가 Person이라고 인식됨
        }

        if (obj !is Person) { // -> ! 붙임으로써 Person이 아니라고 선언할 수도 있음
            println(obj)
        }
    }

    /**
     * Any뒤에 물음표가 붙음으로써 Null이 올 수 있다면 -> safe call로 호출함
     */
    fun printAgeIfPersonKotlinAny(obj: Any?) {
        val person = obj as? Person
        println(person?.age)
    }

    /**
     * $로 변수 바로 출력이 가능하다
     */
    fun printTest() {
        val person = Person("hi", 20)
        println("이름 : $person.name")
    }

    /**
     * string builder 대신 사용
     * indentation 을 삭제해서 """ """ 안에 쓰인 문자열을 출력할 수 있음
     */
    fun string() {
        val name = "종빈"
        val str = """
            ABC
            EFG
            ${name}
        """.trimIndent()
        println(str)
    }

    /**
     * 문자열의 문자를 배열처럼 갖고올 수 있음
     */
    fun getChar() {
        val str = "ABCDE"
        val ch = str[1]
    }


}