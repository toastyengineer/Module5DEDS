package Lab5.general;

abstract public class Event {
	EventQueue queue;
	double occurenceTime;
	
	abstract public void execute(State state);
}