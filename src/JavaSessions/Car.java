package JavaSessions;

public class Car {
	
	
	String name;
	String colour;
	int price;
	String Model;
	static int wheels=4;
	static final int Doors=4;
	public static void main(String [] args) {
		Car C1=new Car();
		Car C2=new Car();
		Car C3=new Car();
		
		C1.name="Audi";
		C1.colour="red";
		C1.price=500;
		C1.Model="Q7";
		
		C2.name="Jaguar";
		C2.colour="red";
		C2.price=90;
		C2.Model="F pace";
		
		
		
		C3.name="JEEP";
		C3.colour="Army";
		C3.price=78;
		C3.Model="Compass";
		wheels=5;
		//Car.Doors=5;  //not possible when final is used
		System.out.println(C1.name + C1.colour + C1.price +C1.Model +wheels+Doors);
		System.out.println(C2.name + C2.colour + C2.price +C2.Model + Car.wheels);
		System.out.println(C3.name + C3.colour + C3.price +C3.Model + Car.wheels);
		
	}

}
