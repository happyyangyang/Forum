package com.yhq.test;

public class Parent {
	public final  int age =20;
	public final String  name;
	
	/*public Parent(){
		
	}*/
	public Parent(String name ){
		this.name = name;
	}
	public final void run(){
		System.out.println("Parent的run");
	}
	
}
 class Child  extends Parent{
	Child(){
		super("我叫喵喵");
		System.out.println("child的构造函数");
	}
	public void eat(){
		System.out.println("child 的eat方法");
	}
}
