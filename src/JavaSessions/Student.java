package JavaSessions;



public class Student {
	
	String abc;
	
	public void getCity() {
	System.out.println("This is City");	
	
	}
	
	public void geAddress() {
		System.out.println("This is the address");
		getCity();
		getbuilding();
		GetFloors();
		abc="test";
			} 
	
	
	//non static methods can call other static/non static  methods within themselves
	public static void getbuilding() {
		System.out.println("This is the building");
		GetFloors();
		
		
	}
	//static methods can call other static methods within themselves
	public static void GetFloors() {
		System.out.println("This is the floors");
		Student obj =new Student();
		obj.abc="test3";
	}
	
	
	
	public static void main(String [] args) {
		getbuilding();
		Student obj =new Student();
		obj.geAddress();
	obj.abc="test2";
	 
		System.out.println(obj.abc);
	}
}
