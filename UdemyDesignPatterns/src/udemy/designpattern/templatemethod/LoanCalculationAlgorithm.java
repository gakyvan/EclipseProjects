package udemy.designpattern.templatemethod;

public abstract class LoanCalculationAlgorithm {
	
	public double calculateLoan() {
		return getBaseAmount()*getInterest()- calculateDiscount();
	}
	
	/*Extension point*/
	public abstract double getBaseAmount();
	public abstract double getInterest();
	public abstract double calculateDiscount();
}
