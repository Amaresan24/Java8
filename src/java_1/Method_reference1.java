package java_1;

public class Method_reference1 {
public static void main(String args[]) {
	
	
	
	//myClass n1 = new  myClass();
	
	//calculator1 max = n1::findMax;
	
	calculator1 max = myClass::findMax; /// find max number static class  in method reference 
	System.out.println(max.math(90, 12));
	
	
	
	
	
}
}
interface calculator1{
 public int math(int a , int b);
} 

class myClass {
	public static int findMax(int a , int b) {
		
		if(a > b) {
			return a;
		}else {
			
			return b;
		}
	}
}