//package com.behaviorOfAccessModifiersinJava;

  class BaseClass {
	private int x=30;
	protected int y = 50;
	private void m1(){
		System.out.println("private method");
	}
	protected void m2(){
		System.out.println("protected method");
	}
 }
  class Derivedclass extends BaseClass{
	
}
 public class Mainclass{
	public static void main(String[] args) {
		Derivedclass d = new Derivedclass();
		d.m2();
		System.out.println(d.y);
	}
}