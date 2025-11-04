package dip;

public class DeductionCalculator implements IDeductionCalculator {
	public float calculateDeduction(float billAmount, int deductionPercentage) {
		return (billAmount * deductionPercentage) / 100;
	}
}
