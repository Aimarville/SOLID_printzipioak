package dip;

public class VATCalculator implements IVATCalculator{
	public float vatCalculator(float billAmount) {
		return (float)(billAmount * 0.16);
	}
}
