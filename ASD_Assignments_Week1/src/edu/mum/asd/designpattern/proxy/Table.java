package edu.mum.asd.designpattern.proxy;

public class Table implements ITable {
	
	private IRow rows[];
	private int size;
	
	public Table() {
		rows=new Row[10];
		size=0;
	}
	
	@Override
	public int numOfRows() {
		return size;
	}

	@Override
	public IRow getRow(int rowNum) {
		return rows[rowNum];
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		rows[rowNum]=row;
	}

	@Override
	public void deleteRow(int rowNum) {
		for(int i=rowNum; i<size; i++) {
			rows[i]=rows[i+1];
		}
		size--;
	}

}
