package domain;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
public class CommandTest {
	@DisplayName("0을 받으면 예외처리하는지 확인")
	@Test
	void constructorTest() {
		assertThatThrownBy(() -> new Command(0))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("유효하지");
	}

	@DisplayName("명령어가 exit일 떄 true를 반환하는지 확인")
	@Test
	void isExitTest() {
		assertThat(new Command(3).isExit()).isEqualTo(true);
	}

	@DisplayName("명령어가 order일 떄 true를 반환하는지 확인")
	@Test
	void isOrderTest() {
		assertThat(new Command(1).isOrder()).isEqualTo(true);
	}

	@DisplayName("명령어가 pay일 떄 true를 반환하는지 확인")
	@Test
	void isPayTest() {
		assertThat(new Command(2).isPay()).isEqualTo(true);
	}
}
