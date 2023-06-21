public class Task4{

public static void main(String[] args){
//calling of Declared Methods
addition(); 
substraction();
multiplication();
student();
simpleInterest();
}
//Method 1 for addition
public static void addition()  //Method declaration
{
	int sum = 0;
	int num1[] = {1,2,3,3,4,5};
	System.out.println("Array Numbers");
	for (int i=0;i<num1.length;i++)
	{
	System.out.println(num1[i]);
	sum = sum + num1[i];
	}
	System.out.println("Sum of Numbers");
	System.out.println(sum);
}

//Method 2 for Substraction
public static void substraction()   //Method declaration
{
	int num2[] = {100,20,30};
	int sub = num2[0];
	System.out.println("Array numbers");
	for(int i=0;i<num2.length;i++)
	{
		System.out.println(num2[i]);
	}
	for(int i=1;i<num2.length;i++)
	{
     sub = sub - num2[i];		 
	}
	System.out.println("Substraction of array");
	System.out.println(sub);
	
}

//Method 3 for Multiplication
public static void multiplication(){    //Method declaration
	float[] num3 = {10f,3f,7f,5f,2f};
	float mul = 1;
	System.out.println("Array Numbers");
	for (int i=0;i<num3.length;i++)
	{
	System.out.println(num3[i]);
	mul = mul*num3[i];
	}
	System.out.println("Multiplication of Numbers");
	System.out.println(mul);
	
}

//Method 4 for Adding student Attendence
public static void student(){    //Method declaration
	int[] USN = new int[10];
	char[] attendence = {'P','A','P','P','P','A','P','P','P','A',};
	USN[0] = 101;
	USN[1] = 202;
	USN[2] = 103;
	USN[3] = 104;
	USN[4] = 105;
	USN[5] = 106;
	USN[6] = 107;
	USN[7] = 108;
	USN[8] = 109;
	USN[9] = 110;
	
	for (int i=0;i<USN.length;i++)
	{
		System.out.println("USN");
		System.out.println(USN[i]);
		System.out.println("Attendence");
		System.out.println(attendence[i]);
	}
	
}
//Method 5 for Simple Interest
public static void simpleInterest(){   //Method declaration
	float si = 1;
	float[] p = {1057.040f,20567.0560f,3045.0450f,400345.060f,50095.8f};
    int[] t ={2,3,1,9,4};
	float[] r ={12.4f,12.4f,13.7f,10.5f,13.7f};
	for(int i=0;i<p.length;i++)
	{
		System.out.println("Simple Interest of Person"+i);
		si = (p[i]*t[i]*r[i])/100;
		//System.out.println("Simple Interest");
		System.out.println(si);
	}
}
}