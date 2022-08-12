package inheritence;

class dragons{
	void fly()
	{
		System.out.println("Soars through sky");
	}
}
class icedragon extends dragons{
	void breathes()
	{
		System.out.println("breathes ice");
	}
}
class firedragon extends icedragon{
	void wings()
	{
		System.out.println("have fire for wings");
	}
}
public class multilevel_inheritence {

	public static void main(String[] args) {
     firedragon f = new firedragon();
     f.wings();
     f.breathes();
     f.fly();
	}

}
