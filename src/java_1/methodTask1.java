package java_1;

public class methodTask1 {
public static void main(String args[]) {
	
///This are reference to functional_task1	
	int [] val1 = {56, -9, 67, 34, 78, -8, 5, -5, 4};
	minNumber m1 = new minNumber();
	Maths minimum = m1::findminNumber;
	
	
	System.out.println(minimum.Check(val1));
	
}

}
