class Piramida{
	private int numarRanduri;
	public Piramida() {
		numarRanduri = 8;
	}
	
	public Piramida(int numarRanduri) {
		this.numarRanduri = numarRanduri;
	}
	
//	public void tiparire() {
//		for(int i=0; i<=numarRanduri;i++)
//		{
//			for(int j=0;j<=numarRanduri-i-1;j++)
//				System.out.print(i+1+" ");
//			System.out.println();
//		}
//		
//	}
	
	public String toString() {
		String reprezentare = "";
		for(int i=0; i<=numarRanduri; i++) {
			for(int j=0; j<=numarRanduri-i-1; j++)
				reprezentare += i+1+" ";
			reprezentare += "\n";
		}
		return reprezentare;
		
	}
}


public class PiramidaMain {

	public static void main(String[] args) {
		Piramida pir1, pir2, pir3, pir4;
		pir1 = new Piramida(4);
		pir2 = new Piramida();
		pir3 = new Piramida(6);
		pir4 = new Piramida();
		
		System.out.println(pir1);
		System.out.println(pir2);
		System.out.println(pir3);
		System.out.println(pir4);
	}

}
