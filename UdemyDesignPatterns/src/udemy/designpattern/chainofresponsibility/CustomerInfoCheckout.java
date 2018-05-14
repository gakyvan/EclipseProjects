package udemy.designpattern.chainofresponsibility;

public class CustomerInfoCheckout extends CheckoutHandler{

	@Override
	public void handlerCheckout() {
		System.out.println("Adding extra info to the checkout of the customer");
		if(successor!=null) {
			successor.handlerCheckout();
		}
	}

}
