class Chapter2 {

    fun startsWithA1(str: String?): Boolean {
        if (str == null) {
            throw IllegalArgumentException("null 이 들어옴")
        }
        return str.startsWith("A")
    }

    fun startsWithA2(str: String?): Boolean? {
        if (str == null) {
            return null
        }
        return str.startsWith("A")
    }

    fun startsWithA3(str: String?): Boolean {
        if (str == null) {
            return false
        }
        return str.startsWith("A")
    }

    /**
     * safe Call
     */

    fun safeCall() {
        val str: String? = null

        print(str?.length)
    }

    /**
     * Elvis 연산자
     */

    fun Elvis() {

        val str: String? = null

        print(str?.length ?: 0)

    }

    /**
     * 위의 메서드를 코틀린 스럽게 변환
     */

    fun startA1(str : String?) : Boolean {
        return str?.startsWith("A") ?: throw IllegalArgumentException("null 이다")
    }

    fun startA2(str : String?) : Boolean? {
        return str?.startsWith("A")
    }

    fun startA3(str : String?) : Boolean {
        return str?.startsWith("A") ?: false
    }

    /**
     * null 단언
     */
    fun startA4(str : String?) : Boolean {
        return str!!.startsWith("A")
    }

    /**
     * 자바에서 갖고온 인스턴스의 null 체크
     */
    fun javaToKotlin() {
        var person = Person("널 확인!")
        startsWithA(person.name)
    }

    fun startsWithA(str: String) : Boolean {
        return str.startsWith("A")
    }
}