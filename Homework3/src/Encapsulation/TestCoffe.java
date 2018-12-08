package Encapsulation;

public class TestCoffe {

	public static void main(String[] args) {
		Coffe c1 = new Coffe();
		c1.setcName("Latte");
		c1.setcColor("Brown");
		c1.setcType("CaffeLatte");
		System.out.println(c1.getcName()+  " "+c1.getcColor()+  " "+c1.getcType());
		 
		Coffe c2 = new Coffe();
		c2.setcName("mocha");
		c2.setcColor("white");
		c2.setcType("MilkChocolate");
		System.out.println(c2.getcName()+  " "+c2.getcColor()+  " "+c2.getcType());
		
	}

}
