package Inheritance;


public class Animal {
	String color = "Brown";

	   void eating() {
		System.out.println("Eating something...");
	}
}

class Dog extends Animal
{
    String color = "Black";
	
    void eating() {
 		System.out.println("Eating Bread...");  // Regular
 		super.eating();         // Super will call immediate Parent - Method
    }
    
    void display() { 
	 
	 System.out.println(color);   // Override the parent class
	 System.out.println(super.color);  //Super Keyword will call immediate Parent class variable
    
	 
	 
	 }
}

	 