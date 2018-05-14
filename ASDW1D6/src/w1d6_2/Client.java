package w1d6_2;

public class Client {
	public static void main(String[] args){

	Square sq= new Square();
	Invoker in= new Invoker();
	String st= in.createSquare(sq);
	System.out.println(st);
}
}