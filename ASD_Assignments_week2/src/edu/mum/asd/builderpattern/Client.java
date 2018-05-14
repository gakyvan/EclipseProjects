package edu.mum.asd.builderpattern;

public class Client {

	public static void main(String[] args) {
		RequestDirector rd=new RequestDirector(new RequestPartBuilder());
		Call call=new Call(Agent.find(1));
		rd.constructRequestBuilder(call, "641-980-8978", "Request content here", "Here the request answer", true, false);
		Request request=rd.getRequst();
		System.out.println(request);
	}

}
