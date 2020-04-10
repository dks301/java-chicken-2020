package domain;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
class TableRepositoryTest {
	@DisplayName("기본 테이블을 정상적으로 반환하는지 확인")
	@Test
	void tables() {
		assertThat(TableRepository.tables().size()).isEqualTo(6);
	}
}