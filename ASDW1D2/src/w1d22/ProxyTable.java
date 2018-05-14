package w1d22;

public class ProxyTable implements ITable {

	private Table table;
	
	public ProxyTable(Table table) {
		this.table = table;
	}
	
	@Override
	public int numOfRows() {
		// TODO Auto-generated method stub
		return table.numOfRows();
	}

	@Override
	public IRow getRow(int rowNum) {
		// TODO Auto-generated method stub
		return table.getRow(rowNum);
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  void  modifyRow(int rowNum, IRow row) throws Exception {
		
		IRow foundRow = table.getRow(rowNum);
		synchronized(table.getRow(rowNum)) {
			table.modifyRow(rowNum, row);
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRow(int rowNum) {
		// TODO Auto-generated method stub
		
	}

}
