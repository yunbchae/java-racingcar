package carracing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class PositionTest {

    @DisplayName("Position 객체는 음수 값을 가질 수 없다.")
    @Test
    public void invalidPositionTest() {
        int negativeValue = -1;
        assertThatIllegalArgumentException()
                .isThrownBy(() -> Position.of(negativeValue))
                .withMessageContaining("유효하지 않은 위치 값입니다.");
    }

    @ParameterizedTest(name = "Position 객체 생성 성공 테스트")
    @ValueSource(ints = {0, 1})
    public void positionCreateTest(int validPositionValue) {
        assertThat(Position.of(validPositionValue))
                .isExactlyInstanceOf(Position.class)
                .matches(position -> position.isAt(validPositionValue));
    }

    @DisplayName("값 객체 캐시 테스트")
    @Test
    public void cacheTest() {
        assertThat(Position.of(3) == Position.of(3)).isTrue();
        assertThat(Position.of(3) == Position.of(4)).isFalse();
    }

}