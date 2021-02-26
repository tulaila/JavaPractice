package Inheritance;

class A           // Parent class
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A         // B is Child class of A  (Single Inheritance)
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}

class C extends B        // C is Child class of B (Multilevel Inheritance)
{ 
int c;
 	void show() { 
		System.out.println(c);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) {
		A aobj=new A();
		aobj.a=100;
		aobj.display();

		B bobj=new B();

		bobj.a=200;
		bobj.b=300;
		bobj.display();
		bobj.print();
		
		C cobj = new C();
		cobj.a=150;
		cobj.b=250;
		cobj.c=350;
		cobj.show();
		cobj.print();
		cobj.display(); 

	}
}
