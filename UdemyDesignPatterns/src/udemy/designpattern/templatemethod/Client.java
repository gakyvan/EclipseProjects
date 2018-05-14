package udemy.designpattern.templatemethod;

public class Client {

	public static void main(String[] args) {
		LoanCalculationAlgorithm expensiveCalculation=new ExpensiveLoanCalculation();
		System.out.printf("Expensive Loan Calculation= %,.0f RWF",expensiveCalculation.calculateLoan());
		LoanCalculationAlgorithm cheapLoanCalculation=new CheapLoanCalculation();
		System.out.println();
		System.out.printf("Cheap Loan Calculation=%,.0f RWF",cheapLoanCalculation.calculateLoan());

	}

}
