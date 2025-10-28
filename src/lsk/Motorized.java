package lsk;

public abstract class Motorized extends TransportationDevice {
	
	Engine engine;
	
	public void startEngine() {
		System.out.println("Engine started");
	}
}
