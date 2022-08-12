package inheritence;
class dragons1{
	void fly()
	{
		System.out.println("Soars through sky");
	}
}
class icedragon1 extends dragons1{
	void breathes()
	{
		System.out.println("breathes ice");
	}
}
class firedragon1 extends dragons1{
	void wings()
	{
		System.out.println("have fire for wings");
	}
}

public class hierarchical_inheritence {

	public static void main(String[] args) {
		firedragon1 f = new firedragon1();
	     f.wings();
	    
	     f.fly();
	}

}
