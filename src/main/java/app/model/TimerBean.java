package app.model;

import org.springframework.stereotype.Component;

@Component
public class TimerBean extends Timer {
	private Long time = new Timer().getTime();

	@Override
	public Long getTime() {
		return time;
	}
}
