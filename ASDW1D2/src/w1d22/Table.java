package w1d22;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Table implements ITable {


	private List<IRow> rows = new ArrayList<>();

	
	public Table() {
		IRow row1 = new Row();
		IRow row2 = new Row();
		IRow row3 = new Row();
		
		this.rows.add(row1);
		this.rows.add(row2);
		this.rows.add(row3);
	}
	public int numOfRows() {
		// TODO Auto-generated method stub
		return rows.size();
	}

	@Override
	public IRow getRow(int rowNum) {
		//return this.rows.get(rowNum);
		return this.rows.get(rowNum);
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		// TODO Auto-generated method stub
		this.rows.add(row);
	}

	@Override
	public void modifyRow(int rowNum, IRow row) throws Exception{
		IRow foundRow = this.rows.get(rowNum);
		
		if(foundRow == null) {
			throw new Exception();
		}
		foundRow.modifyValue(row.retrieveValue());
	}

	@Override
	public void deleteRow(int rowNum) {
		// TODO Auto-generated method stub
		this.rows.remove(rowNum);
	}

}
