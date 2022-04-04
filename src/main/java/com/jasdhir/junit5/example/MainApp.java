package com.jasdhir.junit5.example;

public class MainApp {
public static void main(String[] args) {
	Calculator c=new Calculator();
	
	System.out.println("Adding Two Numbers : " +c.add(2, 2));
	
	System.out.println("Subtracting 2 Numbers : "+ c.subtract(4, 2));
}
}
