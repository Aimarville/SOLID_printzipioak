package lsk;

public class Trailer extends TransportationDevice implements HasLicense {
	
	String plate;
	
	@Override
	public void register(String plate) {
		this.plate = plate;
		System.out.println("Plate registered");
	}
}
