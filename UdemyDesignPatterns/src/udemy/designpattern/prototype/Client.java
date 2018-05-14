package udemy.designpattern.prototype;

public class Client {

	public static void main(String[] args) {
		Image image=new Image();
		image.setUrl("http://imagetest.com");
		Video video=new Video();
		video.setUrl("http://videotest.com");
		
		GraphicTool tool=new GraphicTool();
		tool.setPrototype(image);
		Graphic graphic=tool.createGraphic();
		System.out.println("Prototype instance address: -> "+image);
		System.out.println("Graphic instance address: -> "+graphic);
		
		tool.setPrototype(video);
		graphic=tool.createGraphic();
		System.out.println("Prototype instance address: -> "+video);
		System.out.println("Graphic instance address: -> "+graphic);
		
	}

}
