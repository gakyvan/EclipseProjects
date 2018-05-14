package edu.mum.asd.designpattern.iterator;

public class NameRepository implements Aggregate {
	
	private String names[][] = {{"Rob","Jon","Jul","Lor","Pat","Ken"},
			{"Eyob","Daniel","Solomon","Kalkidan","Dave","Matias"}};

	@Override
	public Iterator getIterator() {
		
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {		
		int index;
		@Override
		public boolean hasNext() {
			if(index< names.length*names[0].length){
				return true ;
			}
			
			return false;		
		}

		@Override
		public Object next() {			
			String stri= "";
			for(int i=0; i< names.length; i++){
				for(int j=0; j< names[0].length; j++){
					if(this.hasNext() && names[i][j]!="-"){
						stri+= names[i][j] + " ";
						index++;
					}
					
				}
			}
			return stri;		
		}
		
	}

}
