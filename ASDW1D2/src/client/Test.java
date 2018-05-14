package client;

import w1d22.*;

public class Test implements Runnable{

	private ITable table;
	private int something = 32;
	public Test(ITable table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		IRow row1 = new Row();
		row1.modifyValue(++something);
		
		try {
			table.modifyRow(0, row1);
			
			for(int i = 0; i<3; i++) {
				System.out.println(table.getRow(i).retrieveValue());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		ITable table = new ProxyTable(new Table());
		Test myTest = new Test(table);
		
		Thread thread1 = new Thread(myTest);
		Thread thread2 = new Thread(myTest);
		Thread thread3 = new Thread(myTest);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}
}
