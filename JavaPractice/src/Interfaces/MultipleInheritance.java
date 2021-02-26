package Interfaces;

interface ABC           // Parent A
{
	int x=100;
	void m1();
}

interface xyz            // Parent B
{
	int y=200;
	void m2();
}


public class MultipleInheritance implements ABC, xyz          // Child C
{
   public void m1()
   {
	   System.out.println(x+100);
   }
	
   public void m2()
   {
	   System.out.println(y+200);
   }
	
	
	public static void main(String[] args) {
		MultipleInheritance mi= new MultipleInheritance();
		mi.m1();
		mi.m2();
	}

}
