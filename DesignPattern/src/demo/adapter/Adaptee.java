package demo.adapter;

public class Adaptee {

	private String[] data;
	private int start;
	private int end;

	public void addValue(String value) {
		data[end] = value;
		end++;
	}

	public void removeValue(int index) {
		for (int i = index; i < end; i++) {
			data[i] = data[i + 1];
		}
		end--;
	}
	
	public String get(int index) {
		return data[index];
	}

	public String startString() {
		return data[start];
	}

	public String endString() {
		return data[end-1];
	}
	
	public boolean isEmpty() {
		return end == 0;
	}

	public boolean isFull() {
		return data.length - 1 == end;
	}

	public Adaptee() {
		data = new String[10];
		start = 0;
		end = 0;
	}

	public String[] getData() {
		return data;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

}
