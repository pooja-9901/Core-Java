public class ReturnType{
	public static void main(String[] args){
		byte daysInAWeek=byteDatatype();
		short year=shortDatatype();
		int pages=intDatatype();
		long worldPopulation=longDatatype();
		float cgpa=floatDatatype();
		double pi=doubleDatatype();
		boolean amIAlive=booleanDatatype();
		char gender=charDatatype();
		String fruit=stringDatatype();
		String[] animals=arrayDatatype();
		System.out.println("daysInAWeek="+daysInAWeek);
		System.out.println("year="+year);
		System.out.println("pages="+pages);
		System.out.println("worldPopulation="+worldPopulation);
		System.out.println("cgpa="+cgpa);
		System.out.println("pi="+pi);
		System.out.println("amIAlive="+amIAlive);
		System.out.println("gender="+gender);
		System.out.println("fruit="+fruit);
		for(int i=0;i<animals.length;i++)
		System.out.println("animals="+animals[i]);
	}
	public static byte byteDatatype(){
		byte x=9;
		return x;
	}
	public static short shortDatatype(){
		short y=2021;
		return y;
	}
	public static int intDatatype(){
		int z=768;
		return z;
	}
	public static long longDatatype(){
		long a=7800000000L;
		return a;
	}
	public static float floatDatatype(){
		float b=3.68f;
		return b;
	}
	public static double doubleDatatype(){
		double c=1.4568;
		return c;
	}
	public static boolean booleanDatatype(){
		boolean d=true;
		return d;
	}
	public static char charDatatype(){
		char m='M';
		return m;
	}
	public static String stringDatatype(){
		String p="apple";
		return p;
	}
	public static String[] arrayDatatype(){
		String[] t={"dog","snake","shark"};
		return t;
	}
	
}