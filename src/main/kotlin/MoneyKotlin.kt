import javax.print.attribute.standard.MediaSize.Other

data class MoneyKotlin (
    val money: Long
) {
    /**
     * plus, minus, div.. 이미 명시적으로 선언된 함수명에 한에 operator를 붙여서 선언하게 되면
     * 연산자로 해당 함수를 호출할 수 있음, 또한 결과값은 함수 내부에 구현된 로직을 반환함
     *
     */
    operator fun plus(other: MoneyKotlin): MoneyKotlin {
        return MoneyKotlin(this.money + other.money)
    }

}

