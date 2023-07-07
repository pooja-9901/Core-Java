public class Chair{
	int a = 10;
	char b = 'A';
	float c = 7.0f;
	double d = 3.945496;
	byte e = 45;
	
public static void main(String[] args){
	
	new Chair();
	new Chair();  //Default Constructor
	Chair obj = new Chair(123,456);
}
public Chair()
{
	int p;
	char q;
	float r;
	double s;
	byte t;
	p=a;
	q=b;
    r=c;
	s=d;
	t=e;
	System.out.println(p);
	System.out.println(q);
	System.out.println(r);
	System.out.println(s);
	System.out.println(t);
System.out.println("Chair Constructor");
System.out.println("_________________");
}
//parameterised Constructor	
public Chair(int m , int n){
System.out.println(m);
System.out.println(n);	
System.out.println("Chair1 Constructor");
System.out.println("_________________");	
	
}
}
