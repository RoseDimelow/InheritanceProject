
public class Gardener {

	public static void main(String[] args) 
	{
		//instantiating new plant
		Plants x = new Wildflowers();
		
		System.out.println();
		
		//calling the methods of the superclass
		x.giveIntroduction();
		
		//takes an argument
		x.giveIntroduction("lupin");
		
		System.out.println();

		//calls the subclass version of the overridden method
		x.beEaten();
		
		System.out.println();
		
		//calls a method in the subclass by abstraction
		x.getHabitat();
		
		System.out.println();

		//uses casting to call a subclass method that includes "super"
		((Wildflowers)x).callSuper();
	}
}
