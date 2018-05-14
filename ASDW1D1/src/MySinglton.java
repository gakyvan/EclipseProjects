
public class MySinglton extends Thread {
	public MySinglton(Runnable runnable) {
		super(runnable);
	}

	public static void main(String[] args) {
		// Myclass dd= Myclass.getInstance();
		// Myclass ee= Myclass.getInstance();

		Thread trade1 = new MySinglton(new Runnable() {
			public void run() {

				Myclass dd = Myclass.getInstance();
			}
		});

		Thread trade2 = new MySinglton(new Runnable() {
			public void run() {

				Myclass dd = Myclass.getInstance();
			}
		});

		trade1.start();
		trade2.start();
	}
}

class Myclass {
	public static volatile Myclass uniqueInstance = null;

	private Myclass() {
		System.out.println("Instance is created");
	}

	public synchronized static Myclass getInstance() {
		if (uniqueInstance == null) {
			synchronized (Myclass.class) {
				if (uniqueInstance == null)

					uniqueInstance = new Myclass();
			}
		}
		return uniqueInstance;
	}
}


//synchronized





//public class MySinglton extends Thread {
//	public MySinglton(Runnable runnable) {
//		super(runnable);
//	}
//
//	public static void main(String[] args) {
//		// Myclass dd= Myclass.getInstance();
//		// Myclass ee= Myclass.getInstance();
//
//		Thread trade1 = new MySinglton(new Runnable() {
//			public void run() {
//
//				Myclass dd = Myclass.getInstance();
//			}
//		});
//
//		Thread trade2 = new MySinglton(new Runnable() {
//			public void run() {
//
//				Myclass dd = Myclass.getInstance();
//			}
//		});
//
//		trade1.start();
//		trade2.start();
//	}
//}
//
//class Myclass {
//	public static Myclass uniqueInstance = null;
//
//	private Myclass() {
//		System.out.println("Instance is created");
//	}
//
//	public synchronized static Myclass getInstance() {
//		if (uniqueInstance == null) {
//
//			uniqueInstance = new Myclass();
//		}
//
//		return uniqueInstance;
//	}
//}