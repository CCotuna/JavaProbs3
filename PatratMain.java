class Patrat {
	private int l;
	
	public Patrat() {
		l = 10;
	}
	public Patrat(int l) {
		this.l = l;
	}
	public String toString() {
		int a = l*l;
		return "Patrat " + l + " Aria " + a;
	}
}

public class PatratMain {

	public static void main(String[] args) {
		Patrat p1 = new Patrat();
		Patrat p2 = new Patrat(4);
		Patrat p3 = new Patrat();
		Patrat p4 = new Patrat(5);
		System.out.println("Primul patrat: " + p1 +"\nAl doilea patrat: "+p2+"\nAl treilea patrat: "+p3+"\nAl patrulea patrat: "+p4);
	}

}
