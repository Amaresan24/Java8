package java_1;

public class static_default {
public static void main(String args[]) {
	
	
	SportsCar s1 = new SportsCar();
	   
	System.out.println(s1.netPrice(800000));
	System.out.println(s1.model());
	System.out.println(car.regNum("TN23J845789"));
	
	
	car c1 = (x) -> {
		return x;
	};
	System.out.println(c1.model());
	
}
}

/// interface

interface car{
	
public int netPrice(int p);	

public static String regNum(String a) {
	return a;
} 

public default String model() {
	return "model234";
}
	
	////// implements  of interface
}

class SportsCar implements car {
	public int netPrice(int p){
		return p+10;
	}	
	public  String model() {
		return "modle54746";
	}
}