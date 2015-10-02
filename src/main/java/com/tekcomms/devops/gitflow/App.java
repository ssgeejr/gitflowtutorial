package com.tekcomms.devops.gitflow;


public class App {
	private String message = "Hello world!";
	
	public App(){}
	public App(String msg){message = msg;}	
	public void speak(){System.out.println(message);	}
	public String getMessage(){ return message; }
	public String setMessage(String msg){ message = msg; }
	
	public static void main(String[] args) {
		App app = new App();
		app.speak();
	}
}
