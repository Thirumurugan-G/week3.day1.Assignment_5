package org.Abstraction;

public class Automation extends Multiple_Language implements Language,Test_Tool
{
	

	public void ruby() 
	{
		System.out.println("ruby()");
		System.out.println("using final keyword"+str);
		System.out.println("Get value super keyword "+super.num);   // super
		
	}
	public void java()
	{
		System.out.println(this.st1+this.st2+"\n");   // this
		this.ruby();
	}
	public void selenium()
	{
		System.out.println("\n"+str1);  
	}
	public static void main(String[] args) 
	{
		Automation auto= new Automation();
		auto.java();
		auto.selenium();
	}
}
