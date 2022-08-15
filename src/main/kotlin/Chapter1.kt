class Chapter1 {


    fun chapter1() {

        //var : 변경 가능
        var number1 : Long = 5L

        //val : 변경 불가 (final)
        val number2 = 5L

        /**
         * 변수 선언
         */
        number1 = 20L

        //number2 = 20L

        /**
         * null 여부
         */
        var number3 : Long? = 0L

        number3 = null

        /**
         * 객체 인스턴스화 변수
         */
        var person = Person("hi")

    }

    class Person(s: String) {

    }


}