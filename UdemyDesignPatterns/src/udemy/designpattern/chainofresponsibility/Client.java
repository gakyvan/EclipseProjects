package udemy.designpattern.chainofresponsibility;

public class Client {
	public static void main(String[]args) {
		CheckoutHandler paymentHandler=new PaymentCheckoutHandler();
		CheckoutHandler customerInfoHandler=new CustomerInfoCheckout();
		paymentHandler.setSuccessor(customerInfoHandler);	
		paymentHandler.handlerCheckout();
	}
}
