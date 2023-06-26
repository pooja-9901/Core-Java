public class Task6{
public static void main(String[] args){
int returnResult1 = interestcalculator(12000);
System.out.println(returnResult1);
char returnResult2 = Result(60);
System.out.println(returnResult2);	
boolean returnResult2 = MobileNumberValidation("9901999231");
System.out.println(returnResult2);
int returnResult4 = Addition(10,20);
System.out.println(returnResult4);
int returnResult5 = Substraction(2,7);
System.out.println(returnResult5);
int returnResult6 = Multiplication(10,20);
System.out.println(returnResult6);
boolean returnResult7 = laptop(10);
System.out.println(returnResult7);
char returnResult8 = weather(35);
System.out.println("G:Good weather\nB:Bad weather");
System.out.println(returnResult8);
float returnResult9 = percentage(100);
System.out.println(returnResult9);
float returnResult10 = percentage(10);
System.out.println(returnResult10);

}
public static int interestcalculator(int deposit) //method 1
{
	if(deposit<10000)
	{
		int total=deposit+100;
		return total;
	}
	else
	{
		int total=deposit+200;
		return total;
	}
}
public static char Result(int marks){  //method 2
	char res1 = 'P';
	char res2 = 'F';
	if(marks>35){
	return	res1;
	}
	else {
	return res2;
	}
}
public static boolean MobileNumberValidation(String num){  //method 3
	if(length.num > 10)
	{
		System.out.println("Number not valid");
		return false;
	}
	else 
	{
	System.out.println("Number is valid valid");
        return true;	
	}

	}
public static int Addition(int a , int b) //method 4
{
	if(a > b)
	{
		int c = a+b;
	return c;
	}
	else{
		int c = b+a;
		return c;
	}
}
public static int Substraction(int x , int y)  //method 5
{
	if(x > y)
	{
		int z = x-y;
	return z;
	}
	else{
		int z = y-x;
		return z;
	}
}
public static int Multiplication(int j , int k)  //method 6
{
	if(j > k)
	{
		int l = j*k;
	return l;
	}
	else{
		int l = j*k;
		return l;
	}
}
public static boolean laptop(int Date)  //method 7
{
	if(Date<30)
	{
		return true;
	}
	else{
		return false;
	}
}
public static char weather(float temprature)  //method 8
{
	if(temprature>32){
		char c = 'B';
		return c;
	}
    else
	{
		char c = 'G';
		return c;
	}
}
 public static float percentage(int Totalmarks){  //Method 9
	float perc; 
 if(Totalmarks>0)
 {
	  perc = (Totalmarks/100)*100;
	 return perc;
 }
	else 
	{
		 perc =0;
		return perc;
	}
 }

 public static float weightCheck(int weight){  //Method 10
 if(weight>70)
 {
	  return weight;
 }
	else 
	{
		 return weight;
	}
 }
}





