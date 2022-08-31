class Chapter4 {

    fun test() {

        val money1 = Chapter4_1.Money(2000)
        val money2 = Chapter4_1.Money(3000)

        /**
         * 비교 연산자를 누르게 되면 위에서 갖고온 자바 객체에서 구현한 compareTo로 이동하게됨
         */
        if (money1 < money2) {
            println("money2 가 더 큼")
        }

    }

    fun equalityAndIdentity() {

        val money1 = Chapter4_1.Money(2000)
        val money2 = money1
        val money3 = Chapter4_1.Money(3000)

        /**
         * 동등성 : 주소, 값도 같음
         */
        println(money1 === money2) // true
        println(money1 === money3) //false

        /**
         * 동일성 : 주소는 다르지만 값은 같음
         */
        println(money1 == money2)
        println(money2 == money3)

    }

}