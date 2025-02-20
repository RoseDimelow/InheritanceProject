
public abstract class Plants
{
	protected String species = "random plant";
	
	public Plants()
	{
		super();
		System.out.println("Now entering the first constructor of the superclass!");	
	}
	
	public abstract void getHabitat();
	
	public void giveIntroduction()
	{
		System.out.println("Hi, I'm a little "+species+" growing in your yard!");
	}
	
	public void giveIntroduction(String species)
	{
		System.out.println("Hi, I'm a little "+species+" growing in your yard!");
	}
	
	public void beEaten()
	{
		System.out.println("Munch, munch, munch! A caterpillar is munching your leaves!");
	}

}
