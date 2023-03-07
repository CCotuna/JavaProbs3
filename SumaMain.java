class Suma {
	
	public static int suma(int a, int b) {
		//System.out.println("metoda1: " + a +"+"+ b);
		return a+b;
	}
	
	public static int suma(int a, int b, int c) {
		//System.out.println("metoda2: " + suma(a,b)+"++"+c);
		return suma(a,b)+ c;
	}
	
	public static int suma(int a, int b, int c, int d) {
		//System.out.println("metoda3: "+ suma(a, b, c)+"+++"+ d);
		return suma(a, b, c)+ d;
	}
}

public class SumaMain {

	public static void main(String[] args) {
		int a=2,b=3,c=4,d=5;
		System.out.println(Suma.suma(a,b,c,d));
	}

}
