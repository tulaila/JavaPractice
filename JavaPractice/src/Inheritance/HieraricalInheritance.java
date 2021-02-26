package Inheritance;
	
	class Parent{
		//int a;
		void display(int a)
		{
			System.out.println(a);
		}
 	}
	
	class Child1 extends Parent
	{
		//int x;
		void show(int x)
		{
			System.out.println(x);
		}
	}
	
	class Child2 extends Parent
	{
		//int y;
		void view(int y)
		{
			System.out.println(y);
		}
	}
	
	
public class HieraricalInheritance {	
	
	
		public static void main(String[] args) {
			Child1 c1=new Child1();
//			c1.a=101;
//			c1.x=202;
			c1.display(505);
			c1.show(606);
			
			Child2 c2=new Child2();
//			c2.a=303;
//			c2.y=404;
        	c2.display(707);
 			c2.view(808);
		
		}

}
