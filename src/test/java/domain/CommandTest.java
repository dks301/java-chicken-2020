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
	void 생성() {
		assertThatThrownBy(() -> new Command(0))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("유효하지");
	}
}
