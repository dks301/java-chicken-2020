package domain;

/**
 *    class description
 *
 *    @author AnHyungJu
 */
public class Command {
	private static final int ORDER = 1;
	private static final int PAY = 2;
	private static final int EXIT = 3;

	private final int command;

	public Command(final int command) {
		validate(command);
		this.command = command;
	}

	private void validate(int command) {
		if (command != ORDER && command != PAY && command != EXIT) {
			throw new IllegalArgumentException("유효하지 않은 명령어입니다.");
		}
	}

	public boolean isOrder() {
		return this.command == ORDER;
	}

	public boolean isPay() {
		return this.command == PAY;
	}

	public boolean isExit() {
		return this.command == EXIT;
	}
}
