package lsk;

public class Car extends TransportationDevice implements HasEngine, HasLicense {
	
	Engine engine;
	String plate;
	
	@Override
	public void startEngine() {
		System.out.println("Engine started");
	}
	
	@Override
	public void register(String plate) {
		this.plate = plate;
		System.out.println("Plate registered");
	}
}
