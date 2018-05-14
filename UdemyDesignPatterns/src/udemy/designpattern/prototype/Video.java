package udemy.designpattern.prototype;

public class Video extends Graphic{
	
	private String url;
	
	@Override
	public Graphic clone() {
		Video clone=new Video();
		clone.setUrl(this.url);
		return clone;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String showState() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
