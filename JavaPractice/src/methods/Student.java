package methods;

public class Student {
	
	int sid;
	String sname;
	int sub1, sub2, sub3;
	
	 void getStuData(int id, String name)    // Method taking Parameters and not returning Values
	 {
		 sid=id;
		 sname=name;
	 }
	 
	 void getStuMarks(int a, int b, int c)  // Method taking Parameters and not returning Values
	 {
		 sub1=a;
		 sub2=b;
		 sub3=c;
	 }
     
	 void totalMarks()                    // Method Not taking any Parameters and Not returning Values
	 {
		 double total = sub1+sub2+sub3 ;
		 System.out.println("Student details " + sid +" , " +  sname);
		 System.out.println("Total marks :" +total);
	 }
	 
	 public static void main(String[] args) {
		Student Stu1 = new Student();
		 Stu1.getStuData(03, "Ramesh");
		 Stu1.getStuMarks(98, 99, 96);
		 Stu1.totalMarks();
		
				
	}
}
