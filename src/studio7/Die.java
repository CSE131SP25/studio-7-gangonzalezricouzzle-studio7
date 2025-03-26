package studio7;

public class Die {
	private int n; 
	
	public Die(int sides) {
		n = sides; 
	}
	
	public int Throw() {
		int random = (int) ((Math.random()*n)) + 1 ;
		return random; 
	}

	public static void main(String[] args) {
		Die d1 = new Die(6); 
		System.out.print(d1.Throw());

	}

}
