package java_1;

public class funncational_interface {
public static void main(String args[]) {
	
//	
//	Calculator add = ( X , Y) -> {
//		return  X + Y;
//	};
//	Calculator sub = ( X , Y) -> {
//		return  X - Y;
//	};
//	Calculator multi = ( X , Y) -> {
//		return  X * Y;
//	};
//	Calculator div = ( X , Y) -> {
//		return  X / Y;
//	};
//	Calculator moduls = ( X , Y) -> {
//		return  X % Y;
//	};
//	
//	
//Calculator max = (X , Y) -> {
//		if(X > Y) {
//			return X;
//			
//		}else {
//			return Y;
//		}
//		
//	};
//	
	
//System.out.println("Addition = "+ add.math(12, 45));
//System.out.println("Subraction = "+sub.math(12, 45));
//System.out.println("Multiplication = "+multi.math(12, 45));
//System.out.println("Division = " +div.math(10, 5));
//System.out.println("Modulas = "+moduls.math(12, 45));
//System.out.println("my Age = "+add.myAge(25));
//System.out.println("Greater Number = " +max.math( 34 , 78));

//System.out.println(Calculator.myName("Amaresh"));
	
Calculator  aa = (X,U) -> {
	return X;
} ;
	
System.out.println(aa.myAge(45));
	
}	
}


@FunctionalInterface

interface Calculator {
public int math(int a, int b);

public static String  myName(String s1) {
	return "my name = "+s1;
}
public default int myAge(int age) {
	return age;
	}
}
