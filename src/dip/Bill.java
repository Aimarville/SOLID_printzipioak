package dip;

import java.util.Date;

public class Bill {
	
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	
	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc(IDeductionCalculator deduCalc, IVATCalculator vatCalc) {
		// Dedukzioa kalkulatu
		billDeduction = deduCalc.calculateDeduction(billAmount ,deductionPercentage);
		// VAT kalkulatzen dugu
		VAT = vatCalc.vatCalculator(billAmount);
		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VAT;
	}
}
