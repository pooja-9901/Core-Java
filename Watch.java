public class Watch{
	
//Static Variables
static String WatchType;
static String DisplayType1;
static String DisplayType2;
static String For1;
static String For2;
static String occation;

//instance variables
int Warranty; 
String strapType; 
String Color;
int price;
String brand;

//Static Block
static{
	 DisplayType1="Digital";
	 DisplayType2="Analog";
	 WatchType="Wrist Watch";
	 For1="Boys";
	 For2="Girls";
	 occation="Casual";
}
//Constructor
public Watch(int Warranty, String strapType, String Color, int price, String brand){
	//
	this.Warranty=Warranty;
	this.strapType=strapType;
	this.Color=Color;
	this.brand=brand;
	this.price=price;
}


public static void main(String[] args)
{
	
Watch watch1 = new Watch(1,"Leather","Black",2000,"Casio");
System.out.println(watch1.Warranty);
System.out.println(watch1.strapType);
System.out.println(watch1.Color);
System.out.println(watch1.price);
System.out.println(watch1.brand);
System.out.println(watch1.DisplayType1);
System.out.println(watch1.WatchType);
System.out.println(watch1.For1);
System.out.println(watch1.occation);
System.out.println("----------");


Watch watch2 = new Watch(2,"Leather","Pink",5000,"Titan");
System.out.println(watch2.Warranty);
System.out.println(watch2.strapType);
System.out.println(watch2.Color);
System.out.println(watch2.price);
System.out.println(watch2.brand);
System.out.println(watch2.DisplayType2);
System.out.println(watch2.WatchType);
System.out.println(watch2.For2);
System.out.println(watch2.occation);
System.out.println("----------");


Watch watch3 = new Watch(5,"Leather","Blue",15000,"Titan");
System.out.println(watch3.Warranty);
System.out.println(watch3.strapType);
System.out.println(watch3.Color);
System.out.println(watch3.price);
System.out.println(watch3.brand);
System.out.println(watch3.DisplayType2);
System.out.println(watch3.WatchType);
System.out.println(watch3.For2);
System.out.println(watch3.occation);
System.out.println("----------");


Watch watch4 = new Watch(5,"Chain","Golden",10000,"Titan RAGA");
System.out.println(watch4.Warranty);
System.out.println(watch4.strapType);
System.out.println(watch4.Color);
System.out.println(watch4.price);
System.out.println(watch4.brand);
System.out.println(watch4.DisplayType1);
System.out.println(watch4.WatchType);
System.out.println(watch4.For2);
System.out.println(watch4.occation);
System.out.println("----------");


Watch watch5 = new Watch(2,"Plastic","Matt Green",2000,"Fastrack");
System.out.println(watch5.Warranty);
System.out.println(watch5.strapType);
System.out.println(watch5.Color);
System.out.println(watch5.price);
System.out.println(watch5.brand);
System.out.println(watch5.DisplayType1);
System.out.println(watch5.WatchType);
System.out.println(watch5.For1);
System.out.println(watch5.occation);
System.out.println("----------");




}
}
