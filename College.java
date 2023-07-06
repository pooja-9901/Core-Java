import java.util.Locale; 
public class College{

public static void main(String[] args)
{
//string initialisation using literals method	
String firstName="Chris";
String lastName="Hemsworth";
String brandName="Chanel";
String USN="2LB19CS015";
String recipeName="Masal Puri";
String userName="pooja-9901";
String quote="In a world where you can be anything, be kind";
String showName="Shark Tank";
String maleLead="Tom holland";
String femaleLead="Zendaya";


//string initialisation using new keyword
String object = new String("Table");
String collegeName = new String("BGMIT");
String subject = new String("Deep Learning");
String topic = new String("Method Overloading");
String dress = new String("Kurta");
String city = new String("Banglore");
String country = new String("India");
String movieName = new String("Avengers End Game");
String processorName = new String("intel i5");
String graphicsCard = new String("NVIDIA");


//String to lower case
String word3 = firstName.toLowerCase();
System.out.println(word3);

//string to concatination
String word4 = firstName.concat(lastName); 
System.out.println(word4);

//string to uppercase
String english = quote.toUpperCase(Locale.forLanguageTag("en"));  
System.out.println(english);	

//char at string at given position
char ch=city.charAt(4);
System.out.println(ch);

//length of string
int num = movieName.length();
System.out.println(num);
}

}