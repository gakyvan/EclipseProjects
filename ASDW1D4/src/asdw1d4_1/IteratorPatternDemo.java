package asdw1d4_1;


public class IteratorPatternDemo {

	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();)
	      {
	         String name = (String) iter.next();
	         System.out.println("Name : " + name);
	      } 
//*/	      Iterator iterator = namesRepository.getIterator();
//	      while(iterator.hasNext()) {
//	    	  System.out.println(iterator.next());
//	      }
//	}

}
}