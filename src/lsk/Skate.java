package lsk;

public class Skate extends TransportationDevice implements HasEngine {

	Engine engine;
	
	@Override
	public void startEngine() {
		System.out.println("Engine started");
	}
}
