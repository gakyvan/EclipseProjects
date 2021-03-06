package com.asd.designpattern.proxy.lab;

public class ProxyTable implements ITable {
	
	private ITable table;
	private Integer [] locks;
	
	public ProxyTable(Table toBeLocked) {
		table=toBeLocked;
		locks=new Integer[numOfRows()];
		for(int row=0;row<locks.length;row++) {
			locks[row]=new Integer(row);
		}
	}
	
	
	@Override
	public int numOfRows() {
		return table.numOfRows();
	}

	@Override
	public IRow getRow(int rowNum) {
		synchronized (locks[rowNum]) {
			return table.getRow(rowNum);
		}
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		synchronized (locks[rowNum]) {
			table.addRow(row, rowNum);
		}

	}

	@Override
	public void deleteRow(int rowNum) {
		synchronized (locks[rowNum]) {
			table.deleteRow(rowNum);
		}

	}

}
