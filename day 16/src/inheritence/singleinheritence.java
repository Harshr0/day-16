package inheritence;

class color{
	void looks()
	{
		System.out.println("Seen by eyes");
	}
}
class blue extends color{
	void madeby()
	{
		System.out.println("mixing black and yellow");
	}
}
public class singleinheritence {

	public static void main(String[] args) {
	 blue b = new blue();
	 b.madeby();
	 b.looks();

	}

}
