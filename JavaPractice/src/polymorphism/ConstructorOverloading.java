package polymorphism;

public class ConstructorOverloading {
	
  ConstructorOverloading(int a , int b) {   //1
  System.out.println(a+b);
	}

  ConstructorOverloading(int a , double b) {   //2
  System.out.println(a+b);
	}
  
  ConstructorOverloading(double a , int b) {    //3
  System.out.println(a+b);
	}
  
  ConstructorOverloading(int a , int b, int c) {  //4
  System.out.println(a+b+c);
	}
  
      public static void main(String[] args) {
		ConstructorOverloading co=new ConstructorOverloading(10, 20);   //1
		ConstructorOverloading co1=new ConstructorOverloading(100, 200, 300); //4k
	}
  
  
}
