package udemy.designpattern.chainofresponsibility;

public class PaymentCheckoutHandler extends CheckoutHandler{

	@Override
	public void handlerCheckout() {
		System.out.println("Handling payments of the customer");
		if(successor!=null) {
			successor.handlerCheckout();
		}
	}

}
