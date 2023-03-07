class Carte {
	private int numarPagini;
	
	public Carte(int numarPagini) {
		this.numarPagini = numarPagini;
	}
	
	public boolean equals(Carte c2) {
		if(this.numarPagini == c2.numarPagini)
			return true;
		return false;
	}
}

public class CarteMain {

	public static void main(String[] args) {
		Carte c1 = new Carte(20);
		Carte c2 = new Carte(40);
		if(c1.equals(c2))
			System.out.println("Numarul de pagini corespunde");
		else
			System.out.println("Numarul de pagini nu corespunde");

	}

}
