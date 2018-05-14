package w1d6_2;

public class ConcreateCommand implements Command {
	private Reciever re= new Reciever();
	private Square sq;
	ConcreateCommand(Square sq){
		this.sq= sq;
	}


	@Override
	public String create5() {
		// TODO Auto-generated method stub
		return re.create5(sq);
	}
	@Override
	public String Scale2() {
		// TODO Auto-generated method stub
		return re.Scale2(sq);
	}
	@Override
	public String Moveright3() {
		// TODO Auto-generated method stub
		return re.Moveright3(sq);
	}


	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return re.removeCreatedBox();
	}
}