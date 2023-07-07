public class Institute{
public static void main(String[] args){
	
	//Area calculator
	area(3);  //int parameter for square 
	area(5,6); 	//int int parameter for Rectangle
	area(7f);  //float parameter for circle area
	area(12,10f); //int float parameter for Trianlge
	area(13f,14f);  //float float parameter for Parallelogram
	area (122384(double),4744657(double)); //double double for Rhombus
	
	//Electricity bill
	ElectricityBill(10);  //int parameter value for electricity bill 
	ElectricityBill(23.45(double));  //double value for electricity bill
	ElectricityBill(234(short));  //short value for electricity bill
    ElectricityBill(23(byte));  //byte value for electricity bill
	ElectricityBill(2(short));  //short value for electricity bill
    ElectricityBill();   //passing nothing as parameter
	    
	//add method
	double sum1 = add(5, 7);
    System.out.println("Sum: " + sum1); //add method with int int datatypes 
		
    double sum2 = add(2.5, 3.8);
    System.out.println("Sum: " + sum2);  //add method with double double datatypes 
		
    double sum3 = add(5, 7, 9);
    System.out.println("Sum: " + sum3);  //add method with int int int datatypes
		
    double sum4 = add(2.5f, 3.8f, 4.2f);  //add method with float float float datatypes
    System.out.println("Sum: " + sum4);
		
    double sum5 = add(5, 7, 4.5);
    System.out.println("Sum: " + sum5);  //add method with int int float datatypes
		
    double sum6 = add(2.5f, 3.8f);
    System.out.println("Sum: " + sum6);  //add method with float float datatypes
	
	}	
	
//Area calculator
public static int area(int a){
	System.out.println("Area of Square");
	return a*a;
} 
public static int area(int a,int b){
	System.out.println("Area of Rectangle");
	return a*b;
}
public static float area(float a){
	System.out.println("Area of Circle");
	return 3.142*a*;
}
public static float area(int b,float h){
	int AreaOfTriangle=(b*h)/2;
	System.out.println("Area of Trianlge");
	return AreaOfTriangle;
}
public static float area(float b,float h){
	int AreaOfParallelogram=b*h;
	System.out.println("Area of Parallelogram");
	return AreaOfParallelogram;
}
public static double area(double d1,double d2){
	int AreaOfRhombus=(d1*d2)/2;
	System.out.println("Area of Rhombus");
	return AreaOfRhombus;
}

//Electricity bill generator
public static int ElectricityBill(int unit){
return unit*20;
}
public static int ElectricityBill(double unit){
return unit*30;
}
public static int ElectricityBill(short unit){
return unit*30;
}
public static int ElectricityBill(byte unit){
return unit*10;
}
public static void ElectricityBill(){
System.out.println("Electrircity bill free");
}
public static int ElectricityBill(unit=0){
System.out.println("Electrircity bill is invalid");
}

//add method
public static int add(int a, int b) {
    if (a >= 0 && b >= 0) {
        return a + b;
    } else {
        return 0;
    }
}

public static double add(double a, double b) {
    if (a >= 0 && b >= 0) {
        return a + b;
    } else {
        return 0.0;
    }
}
public static double add(int a, int b,int c) {
    if (a >= 0 && b >= 0 && c>=0) {
        return a + b + c;
    } else {
        return 0.0;
    }
}
public static double add(float a, float b, float c) {
    if (a >= 0 && b >= 0 && c >= 0) {
        return a + b + c;
    } else {
        return 0.0;
    }
}
public static double add(int a, int b, double c) {
    if (a >= 0 && b >= 0 && c >= 0) {
        return a + b + c;
    } else {
        return 0.0;
    }
}
public static double add(float a, float b) {
    if (a >= 0 && b >= 0 ) {
        return a + b;
    } else {
        return 0.0;
    }
}
}
