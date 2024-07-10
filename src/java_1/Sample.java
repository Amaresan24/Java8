package java_1;

public class Sample {
// static varaiable 
static int a = 10;
public Sample() {
	a++;
	System.out.println(a);
	}
/// stati method
public static String get() {

return "Hello";
}	
/// Static block 

static {
System.out.println("hi");

}

	
public static void main(String args[]) {
	Sample s1 = new Sample();
	Sample s2 = new Sample();
	Sample s3 = new Sample();
System.out.println(Sample.get());
System.out.println(Sample.a);	
}	
}
