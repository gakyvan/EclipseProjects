package udemy.designpattern.prototype;

public class GraphicTool {
	
	private Graphic prototype;
	
	public void setPrototype(Graphic prototype) {
		this.prototype=prototype;
	}
	
	protected Graphic createGraphic() {
		return prototype.clone();
	}
	
}
