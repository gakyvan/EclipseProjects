package udemy.designpattern.templatemethod;

public class CheapLoanCalculation extends LoanCalculationAlgorithm{

	@Override
	public double getBaseAmount() {
		return 100000;
	}

	@Override
	public double getInterest() {
		return 3;
	}

	@Override
	public double calculateDiscount() {
		return 100;
	}

}
