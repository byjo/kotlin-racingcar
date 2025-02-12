package calculator

import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.NullAndEmptySource

class StringCalculatorTest {
    @ParameterizedTest
    @NullAndEmptySource
    fun `입력 값이 null이거나 빈 공백 문자일 경우 예외가 발생한다`(input: String?) {
        assertThatThrownBy {
            StringCalculator().calculate(input)
        }.isInstanceOf(IllegalArgumentException::class.java)
    }
}
