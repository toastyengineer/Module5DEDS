package general;

import java.util.Observable;

public class State extends Observable {
	boolean isNotRunning = true;
	int currentTime;
}
