package racingcar

class Car(
    val carName: String,
    val position: Int = 0
) {

    private val name: String = carName

    fun move(value: Int): Car {
        if (isMove(value)) return Car(name, position + 1)
        return this
    }

    private fun isMove(random: Int): Boolean {
        return random >= 4
    }
}
