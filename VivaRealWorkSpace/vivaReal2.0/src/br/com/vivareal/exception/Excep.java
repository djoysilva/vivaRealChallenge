package br.com.vivareal.exception;

public class Excep extends Exception{
	private static final long serialVersionUID = 1L;
	public Excep(String msg, Exception e){
		super(msg, e);
		this.print();
		e.printStackTrace();
	}
	public void print(){
		System.out.println("Look the stack trace of the error.");
	}
	public Excep(String msg){
		super(msg);
	}
}
