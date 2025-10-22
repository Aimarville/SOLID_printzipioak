package srp;

public class DeductionCalculator {
	public float calculateDeduction(float billAmount, int deductionPercentage) {
		return (billAmount * deductionPercentage) / 100;
	}
}
