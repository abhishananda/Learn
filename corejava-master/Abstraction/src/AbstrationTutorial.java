
abstract class Dog{
	
	public void bark() {
		System.out.println("Bark");
	}
	
	public abstract void poop();
}

class Labrador extends Dog{
	public void poop() {
		System.out.println("Dog pooped!");
	}
}



public class AbstrationTutorial {

	public static void main(String[] args) {
		Labrador l = new Labrador();
		l.bark();
		l.poop();
	}

}
