package superkey;

class Birds{
	int legslt = 2;
}
class swan extends Birds{
	int legslt = 4;
	void printlength() {
		System.out.println(legslt);
		System.out.println(super.legslt);
	}
}

public class first {

	public static void main(String[] args) {
     swan s = new swan();
     s.printlength();
	}

}
