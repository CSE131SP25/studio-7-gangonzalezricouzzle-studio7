package studio7;

public class Fraction {
	public int num;
	public int den; 
	
	public Fraction(int numerator, int denominator) {
		num = numerator;
		den = denominator; 
	}
	
	public int getDen() {
		return den; 
	}
	
	public int getNum() {
		return num; 
	}
	
	public void Add(Fraction f1, Fraction f2) {
		if (f1.getDen() == f2.getDen()) {
			int sumNum = f1.getNum() + f2.getNum(); 
			System.out.println (sumNum + "/" + f1.getDen()); 
		}else {
			int sumNumTwo = (f1.getNum()*f2.getDen())+(f2.getNum()*f1.getDen()); 
			int sumDen = f1.getDen()*f2.getDen(); 
			System.out.println(sumNumTwo + "/" + sumDen); 	
		}
	}
	public void Multi(Fraction f1, Fraction f2) {
		int multiNum = f1.getNum() * f2.getNum();
		int multiDen = f1.getDen() * f2.getDen(); 
		System.out.println(multiNum + "/" + multiDen); 
	}
	
	public void Recip(Fraction f1) {
		int newNum = f1.getDen(); 
		int newDen = f1.getNum();
		System.out.println(newNum + "/" + newDen); 
	}
	
//	public void Simpl(Fraction f1) {
	//	if (f1.getDen() == f1.getNum()) {
	//		System.out.print("1");
	//	}else {
	//	if(f1.getDen() > f1.getNum()) {
	//		int larger = f1.getDen();
	//	}else{
	//		int larger = f1.getNum(); 
			//	}
		
	//	for (int i = 1; i < larger; i++) {
			
	//	}
	//}

	public static void main(String[] args) {
		Fraction f1 = new Fraction (1,4); 
		Fraction f2 = new Fraction (1,2); 
		f1.Add(f1,f2);
		f1.Multi(f1, f2);
		f1.Recip(f1);
		
		// TODO Auto-generated method stub

	}

}
