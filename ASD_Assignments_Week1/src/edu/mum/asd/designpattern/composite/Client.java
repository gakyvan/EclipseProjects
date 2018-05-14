package edu.mum.asd.designpattern.composite;

public class Client {
	public static void main(String[] args){
		Component head= new Head("This is Head..");
		Component html= new Html("This is Html..");
		Component body= new Head("This is body..");
		Component bComposite= new BComposit("This is A composite of B..");
		Component center= new Center("This is Center..", "The Image is clouds.jpg");
		Component h1= new H1("This is H1..", "This is Header");
		Component h2= new H2("This is H2..", "This is Header");
		Component i= new I("This is I..", "This is Italic font");
		Component title= new Title("This is H1..", "This is Header");
		Component a= new a("This is A..", "This is Anchor");
		Component b= new B("This is B..", "This is Bold");
		
		html.addChild(head);
		head.addChild(title);
		html.addChild(body);
		body.addChild(h1);
		body.addChild(h2);
		body.addChild(b);
		body.addChild(bComposite);
		body.addChild(a);
		body.addChild(center);
		bComposite.addChild(i);
		body.print();
		
		
		
		
		
	}

}
