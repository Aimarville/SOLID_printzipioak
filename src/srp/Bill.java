package srp;

import java.util.*;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	
	//Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		//Dedukzioa kalkulatu
		DeductionCalculator dc = new DeductionCalculator();
		billDeduction = dc.calculateDeduction(billAmount, deductionPercentage);
		
		//VAT kalkulatu
		VATCalculator vc = new VATCalculator();
		VAT = vc.vatCalculator(billAmount);
		
		//Totala kalkulatu
		billTotal = (billAmount - billDeduction) + VAT;
	}
}
