package udemy.designpattern.templatemethod;

public class ExpensiveLoanCalculation extends LoanCalculationAlgorithm{

	@Override
	public double getBaseAmount() {
		return 100000;
	}

	@Override
	public double getInterest() {
		return 4.5;
	}

	@Override
	public double calculateDiscount() {
		return 100;
	}

}
