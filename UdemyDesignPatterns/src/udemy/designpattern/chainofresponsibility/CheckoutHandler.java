package udemy.designpattern.chainofresponsibility;

public abstract class CheckoutHandler {
	
	protected CheckoutHandler successor;
	
	public abstract void handlerCheckout();

	public CheckoutHandler getSuccessor() {
		return successor;
	}

	public void setSuccessor(CheckoutHandler successor) {
		this.successor = successor;
	}
	
	
}
